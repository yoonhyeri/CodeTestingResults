SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE MONTH(DATE_OF_BIRTH) = 3 AND GENDER = 'W' AND TLNO IS NOT NULL;

/*
MEMBER_ID	MEMBER_NAME	GENDER	DATE_OF_BIRTH
seoyeons@naver.com	박서연	W	1992-03-16
*/