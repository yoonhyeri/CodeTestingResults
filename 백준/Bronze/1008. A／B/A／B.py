try:
    num1, num2 = map(int, input().split())
    if num2==0:
        print("분모에 숫자 0올 수 없음")
    else:
        print(f"{num1 / num2:.9f}")
except ValueError:
    print("정수 아님")