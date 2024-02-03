SELECT PRODUCT_CODE, SUM(SALES_AMOUNT*PRICE) AS SALES
FROM PRODUCT JOIN OFFLINE_SALE USING(PRODUCT_ID)
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE
 
/*
PRODUCT_CODE	SALES
D1000000	504000
D3000001	425000
C2000000	360000
C3000003	330000
C3000001	305000
B2000001	288000
C2000001	279000
B1000000	260000
C1000000	255000
D1000001	248000
B2000002	240000
D2000001	230000
B2000000	210000
C3000000	184000
D3000000	164000
D2000000	140000
A3000002	128000
A3000000	120000
C4000002	105000
C1000001	102000
D1000002	102000
A2000001	84000
A2000002	66000
C4000001	65000
C3000002	57000
A2000000	54000
C4000000	54000
A3000001	45000
*/