# SELECT CAR_ID, C.CAR_TYPE, 
#        FLOOR(30*DAILY_FEE*(1-DISCOUNT_RATE/100)) AS FEE 
# FROM CAR_RENTAL_COMPANY_CAR C 
#      JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P USING(CAR_TYPE) 
# WHERE C.CAR_TYPE IN ('세단', 'SUV') 
#       AND CAR_ID NOT IN (SELECT CAR_ID
#                          FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
#                          WHERE END_DATE >= '2022-11-1' AND START_DATE <= '2022-11-30')
#       AND DURATION_TYPE = '30일 이상'
#       AND 30*DAILY_FEE*(1-DISCOUNT_RATE/100) >= 500000 
#       AND 30*DAILY_FEE*(1-DISCOUNT_RATE/100) < 2000000 
# ORDER BY FEE DESC, CAR_TYPE ASC, CAR_ID DESC 

/*
CAR_ID	CAR_TYPE	FEE
3	세단	1518000
23	세단	1380000
*/


# 11월간 대여불가능한 차량 확인
WITH not_available AS (
    SELECT DISTINCT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE START_DATE <= '2022-11-01'
    AND END_DATE >= '2022-11-01'
)

# 특정차량 30일 할인율 확인
, sub_discount AS (
    SELECT *
    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
    WHERE CAR_TYPE IN ('세단','SUV')
    AND DURATION_TYPE = '30일 이상'
)

SELECT CAR_ID, c.CAR_TYPE
    , ROUND (DAILY_FEE * 30 * (1-DISCOUNT_RATE/100),0) FEE
FROM CAR_RENTAL_COMPANY_CAR c
JOIN sub_discount d ON c.CAR_TYPE = d.CAR_TYPE
WHERE c.CAR_TYPE IN ('세단','SUV')
AND CAR_ID NOT IN (SELECT CAR_ID FROM not_available) #11월간 대여 가능
HAVING FEE BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, CAR_TYPE ASC, CAR_ID DESC