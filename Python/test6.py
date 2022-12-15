test6.py

# 딕셔너리  - 사전 
#  파이썬 딕셔너리,  자바에서는  Map
#  key : value 
"""
dic = { '이름':'이순신' , '나이':24, '직업':'군인'}
print(dic)
print(dic['이름'])
# 키 로 사용가능 - 문자열 , 정수, 실수, 불(True,False)
#  키 사용 불가  - 리스트, set, 딕셔너리
# value 사용 - 아무거나 다 

dic = {}  # 이거는 set 아니고  딕셔너리로 인식
dic = dict()  # 딕셔너리 생성

dic1 = dict(이름='김지연', 나이=29, 직업='마이쥬판매원')
print( dic1 )

dic2=dict( [('이름','이지현'), ('age',26), ('특징','알면서')])
print(dic2)

dic3 = dict(  zip(['이름','나이','관심분야'] ,['윤재영',25,'컴퓨터선생님'] )  )
print(dic3)

print(dic3['이름'])
dic3['관심분야'] = '지연이누나'
print( dic3)

dic3['싫어하는것'] = '옆반선생님'
print( dic3)

if '이름' in dic3 :
    print("너의 이름은 : {0}".format(dic3['이름']))
else:
    print("존재 하지 않는 키입니다.")

#딕셔너리 키 몇개??
print( len(dic3)  )


title = ["캐릭터명","생명력","코딩기술","잔머리","수학능력","공간능력","지능지수"]
data =[]
for x in title:
    data.append(input(x+" : "))

#print(data)

info = dict( zip(title ,data) )
print( info )

for x in info:
    print( x )  # 딕셔너리의 키 출력

for x in info:
    print(info[x])  #딕셔너리의 value 출력

for x in info.values():
    print(x)  # 딕셔너리의 value 출력

for key in info.keys():
    print(key)  # 딕셔너리의 key 출력

for k, v in info.items():
    print(k,v)  # 딕셔너리의 key, value 출력

    """

# title=["이름","키","몸무게","관심분야"]

# # 5명의 정보를 입력 한다.
# info =[]
# for i in range(5):
#     data=[]
#     for t in title:
#         data.append(input(t+" : "))
#     info.append(data)

# # 이름을 키로 사용 하여  딕셔너리에  5명의 정보를 저장하시오

# dic_info = dict()
# for data in info:
#     dic_info[data[0]] = dict( zip(title,data) )

# print(dic_info)

# 이름, 번호, C언어성적, java 성적, react성적, DB성적, 지적수준
# 10명의 성적을 딕셔너리에 저장하시오

keys = ["이름","번호","c언어성적","java성적","react성적","DB성적","지적수준"]
value=list() #입력한 값을 리스트에 저장하고, 그 리스트를 저장할 리스트
for i in range(10):
    temp=list() #입력한 값이 저장될 리스트
    for k in keys: #한 명에 대한 정보를 입력하는 for문
        temp.append(input(k))
    values.append( temp )


class501 = dict()
for v in values:
    class501[v[0]] = dict(zip(keys,v)) #딕셔너리 이름을 key로 주고, 모든 데이터를 value

#잘 저장됐는지 확인하도록 출력해보자(for문으로)
for k,v in class501:
    print("{0} : {1}".format(k,class501))