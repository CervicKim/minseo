# # 텍스트파일 이용하기
# f = open("c:/test/question.txt","r",encoding="utf-8") #### 쓰기 - w, 읽기 -r, 추가 - a ####
# #씨드라이브...의경로로, 파일을 r읽을거고, 형식은utf-8이다. 이 행위를 f라는 변수에 저장한다.

# #line = f.readlines() #파일 전체 다 읽기 // 한 줄씩 가져와서 리스트에 저장해줌. (반복문안돌려도됨!)
# # line = f.readline() #파일 한 줄 읽기
# # print(line)
# # line = f.readline() #파일 한 줄 읽기
# # print(line)
# # line = f.read() #파일 전체 다 읽기. //lines랑 다른 점은? : 얘는 통채로!
# # print(line)

# # f.close() #파일을 열어서 다 읽었으니 닫아야한다~

# with open("c:/test/question.txt","r",encoding="utf-8") as f:
#    file=f.readlines()

# for i in range(len(file)):
#     file[i] = file[i][:len(file[i])-1] #문자열 슬라이싱 "banana"[2:] => "nana" / "banana"[2:4] => "na" 
#                                         # "banana" [:4]
#     file[i] = file[i].split(" ")


# # print(file)
# #     작성자 또는 제품명으로 검색하여 해당 문의글의 전체 출력하기.
# # 출력예시:
# #         작성자: 윤재명
# #         제목: 출마 선언합니다.
# #         작성일: 2027-03-10
# #         문의글: 대선 줄정하고 싶습니다. 도와주세요
# #         =========================
# #         답변: 1억 있어요?
# #         답변일: 2027-02-05

# search = input('작성자 또는 제품명 : ')


# for qus in file:
#     print (qus) 

#     # for i in range(len(qus)):
#     #     if search in qus: #찾고자하는 키워드가 서치한 것중에 있다면
#     #         print("작성자 : {0} \n제목: {1} \n작성일 : {2}\n문의글 : {3}".format(qus[0], qus[1], qus[3], qus[2]))
#     #         print("=============================================")
#     #         print("답변 : {0}\n답변일 : {1}\n".format(qus[4], qus[5]))
#     #         break



# 튜플 배우기 - 리스트처럼 데이터를 저장해두는 구조이다.
#               리스트처럼 여러 데이터를 복합적으로 저장 가능하다.
#               하지만 튜플은 리스트와 다르게 변경!이 안된다!!!!
#               데이터 변경이 안 될 뿐... 나머지는 리스트와 동일하다.

# 리스트의 표현태그는 []이고, 튜플은 ()이다.
#   튜플은 데이터의 갯수가 고정적으로 제한되어 있는 경우. 또는 데이터가 변경되지 않아야하는 경우에 사용한다.

#튜플 생성
tu = "새신발","밟혔다."
print(tu) #자동으로 소괄호로 나옴... ㄷㄷ @ㅇ@
print(type(tu))
tu2 = ("그래서","주먹으로쳤다")
print(tu2)
tu3 = ("아프다")
print(type (tu3)) #하나만 있는 경우에는 튜플 프린트가 안됨... 반점으로 나눈..최소 2개 이상부터만 출력된다.

tu4=("강아지복장",)
print( type(tu4))

tu5 =("그리고","난","발목을채였다.","...초등학생일지라도말이지")
a,b,c,d = tu5
print(a,b,c,d) 
print( tu5[2]) #튜플은 인덱스 사용.
print( tu5[1:]) #튜플 슬라이싱 1번 인덱스부터 끝까지 출력.
#tu5.append("추가")
#tu5[0]= "엘레에서??!!!" #데이터 변경 안됨.
print( tu5.count("난" ) #지정데이터가 ㅈ\몇 개ㅔ나