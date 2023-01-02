import requests
import bs4
import urllib
from urllib.request import urlopen

conn = pymysql.connect(host='127.0.0.1', user='host', password='1234', db='minseo', charset='utf-8')
#데이터 베이스 연결 후에 커서 생성. 커서는 파이썬과 DB사이를 연결해주는 드라이버의 형태이다.
cur = conn.vursor()


url = "https://www.graychic.co.kr/product/list.html?cate_no=4"
#res = requests.get(url =url)
html = urlopen(url)

bsp = bs4.BeautifulSoup(html,"html.parser") #한글을 인코딩
href_list= []
items = bsp.findAll("div",{"class","sp-product__thumb"})
for item in items:
    href_list.append( item.find("a")['href'])

site="https://www.graychic.co.kr"


#print( href_list )

# names = bsp.findAll("p",{"class","name"})

# price = bsp.findAll("span",{"class","p_value"})

# item=[]
# for i in range(len(names)):
#     name = names[i].find("a").text
#     p = price[i].find("strong").text
#     item.append( [name,p])

# print( item )

#================================


href= urllib.parse.quote(href_list[0]) #한글을 인코딩
item_link = site + href  #제품 상세페이지 주소

item_html = urlopen(item_link)  # 제품 상세페이지 html
#============================================
item_bsp = bs4.BeautifulSoup(item_html,"html.parser") #제품 상세 페이지를 파서?

item_list = dict() #제품의 상세정보 저장 딕셔너리 (key- 상품명, value- 정보)
item_name = '' #제품명이 들어갈 함수 하나 만들었슴
info_t = item_bsp.select_one("#gc_de_sizeinfo")

# find => html tag로 찾기, select => css 선택자
# find => 태그 1개 찾기, findAll => 태그 여러개 찾기, select => 선택자에 해당하는 모든 태그 찾기
# selectOne => 1개 태그 

# info_tr = info_t.select_one("tr")
# th_list=[], td_list=[]
# for tr in info_tr:
#     th = tr.select_one("th").text
#     td = tr.select_one("td").text
#     if '상품명' ==th:
#         item_name=td
#     else:
#         th_list.append(th)
#         td_list.append(td)

# size_t = item_bsp.select_one("#gc_de_sizecm")
# size_tr = size_t.select("th")
# for th in size_th:
#     th_list.append(th.text)
# size_td in size_td:


# item_list[item_name] = dict(zip(th_list))

# print( item_list)

#print (info_t)

#파이썬으로도 db 테이블 만들 수 있는데, 매번 새거 만들고 하다버ㅗ면 오류나기 일쑤라 그냥 디비버에서 임의로 만든거에 연결하는 것이 낫다.
#====================================
item_name='' #제품명
    info_t = item_bsp.select_one("#gc_de_sizeinfo")

    info_tr = info_t.select("tr")
    th_list=[]  
    td_list=[]
    try:
        for tr in info_tr:
            try:
                th=tr.select_one("th").text
                td = tr.select_one("td").text
            except Exception as e:  #오류가 있다면 오류정보 E에 저장
                continue
            else:  # 오류가 없다면
                if '상품명'==th:
                    item_name=td
                else:
                    th_list.append(th)
                    td_list.append(td)
    except Exception as e:
        print("몇번 째 제품 오류 :"+ str(i))

    size_t = item_bsp.select_one("#gc_de_sizecm")
    size_th = size_t.select("th")
    for th in size_th:
        th_list.append(th.text)
    size_td = size_t.select("td")
    for td in size_td:
        td_list.append(td.text)

    item_list[item_name] = dict(zip(th_list,td_list))


cur.execute( "insert into outers values('"+word+"')" )
print( item_list)

#find -> html tag로 찾기 , select -> css 선택자
# find ->태그 1개 , findAll ->태그 여러개 , select-> 선택자에 해당하는 모든태그
# selectOne -> 1개 태그






# names = bsp.findAll("p",{"class","name"})

# price = bsp.findAll("span",{"class","p_value"})

# item=[]
# for i in range(len(names)):
#     name = names[i].find("a").text
#     p = price[i].find("strong").text
#     item.append( [name,p])

# print( item )

