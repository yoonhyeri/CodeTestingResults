SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
       CASE
          WHEN FREEZER_YN IS NULL THEN 'N' 
          ELSE FREEZER_YN 
       END AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE WAREHOUSE_NAME LIKE "%경기%"
ORDER BY WAREHOUSE_ID 

/*
WAREHOUSE_ID	WAREHOUSE_NAME	ADDRESS	FREEZER_YN
WH0001	창고_경기1	경기도 안산시 상록구 용담로 141	Y
WH0003	창고_경기2	경기도 이천시 마장면 덕평로 811	N
WH0004	창고_경기3	경기도 김포시 대곶면 율생중앙로205번길	N
WH0012	창고_경기7	경기도 수원시 권선구 오목천로152번길 40	N
WH0032	창고_경기9	경기도 안양시 만안구 전파로 3	N
*/