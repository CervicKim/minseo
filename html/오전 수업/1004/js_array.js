//array.js

//window.onload : html문서의 모든 내용이 브라우저에 표시된 이후에 동작.
//window 객체: 브라우저 실행을 위한 프로그램 틀.
//window에만 onload가 있는 게 아님! 모든 객체(html 태그를 포함)에 존재한다.
//load -> 불러오기. 즉 onload는 불러오는 작업이 끝났을 때 동작한다.

//html에 없는 아이템 목록을 여기서 가져다 놓는다!!!!!!!!!!

var item_list = ["핸드폰거치대", "급속충전기","C타입 케이블","강화유리", "스마트링", "스마트 커버"];


window.onload = function (){
    //var li = document.getElementsByClassName("item"); //클래스를 불러오는 2가지 방법! 1번째. *엘리먼트에s붙는거 주의! 중복허용이 되어서!!
    // var li = document.querySelectorAll(".item"); //. <- 클래스를 의미함. 알지?>< 2번째.
    //li[0] //li = 배열 //li 배열 속의 [n]번째 배열을 의미.

        //for( var i=0; i>li.length; i++) //두 가지 방법 1번째
        for (var i in li) { // for (in) : 배열구조에서 사용. 2번째
        li[i].innerHTML = item_list[i]; 
    }
};

var item = new Array();
function enroll() {
    var name = document.getElementById("item_name");
    // var name = document.querySelector("#item_name");

    var prop = name.value;
    var html = "<li>" + prop + "</li>";
    ul.appendChild; // ul 태식을 자식으로 li추가

    item.push(html);
    var ul = document.querySelector("#item_list");
    // ul.innerHTML = item[0]; //0번 인덱스만 들어가라고해서 하나밖에 안됨!. 
    //전부다 하고싶으면 1,2,3..인덱스도 만들던가
    for(let i in item){ //for문으로 반복문을 만들고 +
        //ul.innerHTML = item[i];// [0]번을 [i] 변수로 바꿔라. 그럼에도 얘는 안될건데 이유는?
        //*innerHTML 이걸로 하면 기존 걸 지우고 새로 넣어지는 거라서 안된다!!!!
    // ul.appendChild = item[i]; 쓰이는 방법1
    ul.appendChild(item[i]) //방법2
    // 새 태그 (엘리먼트, 요소, 객체 )만든 방법: crateElement() 함수.
    
    // **태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTML ** (계속 새걸로 바뀐다 ㅠㅠ)
    // **태그(엘리먼트) 내부에 새로운 내용을 추가하는 방법 : appendChild **
    // **태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendChild(textnode) **
    li.appendChild("/li"); //ul 태그 자식으로 il 추가
    var li = document.createElement('li') //li태그 새로 추가하기!
    var bt = document.createtElement('botton'); //내용삭제하는 2가지 방법 1
    //방법 2. innerHTML은 기존내용 날아가고 새ㅔ로 들어갖는 거라 분위기를 잘 살펴야9한다ㅠㄸ
    bt.innerHTML = "삭제"; 
    }   
   function del(obj){
        //alert(this.parentNode);//삭제시 삭제 알람인데 이상할구야!()를 채우고 아래걸로 한다!
        var parent_li = obj.parentNode;
            var parent_ul = parent_li.parentNode;
            parent_ul.removeChild(parent_li); //삭제! 부모가 자식을 호적에서 판다.<ㅋㅋ
   }

   /*

    document.createElemant : 새 태그 생성
        예시) document.createElement("div"); -> div 생성

    appendChild : 자식 태그로 추가
        예시) p = document.createElement("p");
        body.appendChild(p); -> body에 p태그 추가

    setAttribute : 태그에 새 속성 추가
        예시) p.setAttribute("id","ppp");  -> 해당 태그에 id =ppp 삽입.

    removeChild : 자식 태그 삭제(호적에서 판다..ㅋㅋ)
        예시) body.removeChild(p); : body 태그에서 헤당 태그 삭제.

   */

        
}
