SELECT MONTH(start_date) MONTH,	CAR_ID,	COUNT(*) RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
AND CAR_ID IN (
SELECT CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
GROUP BY CAR_ID
HAVING  COUNT(*)>=5) 
GROUP BY MONTH(start_date), CAR_ID
ORDER BY MONTH, CAR_ID DESC