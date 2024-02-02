# # MEMBER_PROFILE와 REST_REVIEW 테이블에서 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하는 SQL문을 작성해주세요. 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 작성해주시고, 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬해주세요
# SELECT MEMBER_NAME, REVIEW_TEXT, REVIEW_DATE
# FROM MEMBER_PROFILE JOIN REST_REVIEW USING (MEMBER_ID)


# WHERE MEMBER_ID IN (
#     SELECT MEMBER_ID
#     FROM REST_REVIEW
#     GROUP BY MEMBER_ID
#     ORDER BY COUNT(*) DESC
# )

SELECT *
FROM(
    SELECT *, COUNT(*) AS CNT
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY COUNT(*) DESC
    ) INLINE