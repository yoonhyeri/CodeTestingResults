SELECT ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O LEFT JOIN ANIMAL_INS USING(ANIMAL_ID) 
WHERE INTAKE_CONDITION IS NULL
ORDER BY ANIMAL_ID, NAME

/*
ANIMAL_ID	NAME
A349480	Daisy
A349733	Allie
A349990	Spice
A362137	*Darcy
*/