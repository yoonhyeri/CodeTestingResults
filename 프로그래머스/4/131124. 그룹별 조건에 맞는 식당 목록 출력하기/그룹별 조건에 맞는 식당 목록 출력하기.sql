SELECT *, COUNT(*),
    DENSE_RANK() OVER (ORDER BY COUNT(*) DESC) AS ReviewRank
FROM REST_REVIEW
GROUP BY MEMBER_ID


# SELECT MEMBER_NAME, REVIEW_TEXT, 
#        DATE_FORMAT(REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE
# FROM MEMBER_PROFILE JOIN REST_REVIEW USING (MEMBER_ID)
# WHERE MEMBER_ID IN (SELECT MEMBER_ID
#                     FROM REST_REVIEW
#                     GROUP BY MEMBER_ID
#                     HAVING COUNT(*) = (SELECT MAX(CNT) AS MAX_CNT
#                                        FROM(SELECT *, COUNT(*) AS CNT
#                                             FROM REST_REVIEW
#                                             GROUP BY MEMBER_ID
#                                             ORDER BY COUNT(*) DESC
#                                             ) INLINE
#                                       )
#                    )
# ORDER BY REVIEW_DATE, REVIEW_TEXT


/*
MEMBER_NAME	REVIEW_TEXT	REVIEW_DATE
정소율 쫄깃하면서도··· 2022-01-14
김민재 안에 찰밥이···  2022-02-18
김민재 사람들이 왜···  2022-02-21
정소율	순대국은 얼··· 2022-03-11
김민재 삼겹보다 목··· 2022-03-15
정소율 쟁반국수와··· 2022-03-22
김서준 끝도 없이 주··· 2022-04-11
김서준 우리가 흔히··· 2022-04-16
김서준	바삭바삭해요··· 2022-05-23
*/