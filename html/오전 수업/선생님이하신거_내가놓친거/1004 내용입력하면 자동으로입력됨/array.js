//array.js

// window.onload : html문서의 모든내용이 브라우저에 표시된 이후에 동작
// window 객체 : 브라우저실행시키기 위한 프로그램 틀
// window 에만 onload 있는거 아님, 모든 객체 (html태그포함)에 존재
// load -> 불러오기 즉 onload는 불러오는 작입이 끝났을 때 동작 


var item_list = ["핸드폰거치대", "급속충전기", "C타입케이블", "강화유리", "스마트폰 링", "스마트폰 커버"];


window.onload = function () {
  var li = document.getElementsByClassName("item");
  // var li = document.querySelectorAll(".item");

  for (var i in li) {
    li[i].innerHTML = item_list[i];
  }
}
var item = new Array();

function enroll() {
  var name = document.getElementById("item_name");

  var prop = name.value;
  item.push(prop);
 


  var ul = document.getElementById("item_list");
    var li = document.createElement("li");
    li.innerHTML = item[item.length-1];
    ul.appendChild(li);
  
  // 새 태그 (엘리먼트,요소,객체)를 생성 하는 방법 : create;
  
  // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTML;
  // 태그(엘리먼트) 내부에 새로운 내용을 추가 하는 방법 : appendchild;
  // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendchild(textnode);
  // #a div
}