# 3개 과목 점수를 입력받아서 총점과 평균을 구하라


def score_input(s):
    scr=[] # 함수 내부에서 입력한 점수를, 리스트에 저장해야하니 때문에 만들어진.... 함수의 것이다.?
    for sub in range(len(s)):
        score.append( int(input(s[sub])))
    return scr # for문으로 입력한 점수가 저장된 리스트scr를 돌려 보내야 한다.
    # 그래야 실제로 사용하고자 하는 곳에 값을 사용하게 되니까.

def total(점수들): # 총 점 계산하기용 함수
    tot=0
    for i in 점수들: tot += i # 입력한 점수를 다 더해주게 된다.
    return tot


def avg(): # 평균 계산하기용 함수
    평균 = 총점 /3
    print("총점 : {0}, 평균 : {1}".format 총점, 평균)


score=[]
subj=("국어 점수 : ","영어 점수 : ","물리 점수 : ")

score = score_input(subj) # 튜플로 만든 subj를 함수에 보낸다. subj의 주소를 보내는 것.
tot = total(score)
avg(tot)




# 장영순, 김지언, 이지형의 키를 입력하여 총점과 평균을 구하시오
# 총 평균보다 작은 사람은 누구인지 출력
# 키 입력하는 함수
# 평균 키 계산하는 함수
# 작은 키는 누구야? 묻는 함수.

def tall_input