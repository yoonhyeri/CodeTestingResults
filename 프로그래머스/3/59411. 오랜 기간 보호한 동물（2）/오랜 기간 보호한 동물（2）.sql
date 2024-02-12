SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS I JOIN ANIMAL_OUTS O USING(ANIMAL_ID, ANIMAL_TYPE, NAME)
ORDER BY DATEDIFF(O.DATETIME, I.DATETIME) DESC
LIMIT 2