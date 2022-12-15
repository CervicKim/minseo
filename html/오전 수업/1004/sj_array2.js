//js_array2.js
    /*실습 
        제품 등록하면서 제품 가격과 함께 등록할 수 있게 만들기.
        제품 가격 입력하는 input 만들어서 등록.
        예시) 거치대 3000원 [삭제] */


    var price = document.querySelector("#item_price");
    li.innerHTML = item[item.length -1] + " "+ price.value+ "원";

    var b = document.createElement("b"); //그냥 만든 b태그. 의미업음!
    b.innerHTML= price.value + "원";
    li.appendChild(b);

    var bt = document.createElement("button");
    bt.setAttribute("class","doe_bt"); //bt=버튼?
    bt.setAttribute("onclick",)
// window.onload = function(){}
// function enroll(){//엔롤시작
//     var name = document.getElementById("item_name");

//     var prop = name.value;
//     var html = "<li>"+ prop + "</li>";
//     ul.appendChild; 

//     item.push(html);
//     var ul = document.querySelector("item_list");
//     for(let i in item){//for시작
//         ul.appendChild(item[i]);
//     }//for끝
//     li.appendChild("/li");
//     var li = document.createElement('li');
//     var bt = document.createElement('button');
//     bt.innerHTML = "삭제"
// }//엔롤끝