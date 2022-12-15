//js_control.js

//addeventlistener : 태그에 이벤터를 설정하는 함수.
window.onload = function () {//window start
    var add = document.querySelector('#add');
    add.addEventListener("click",tag_add)
};// window End

var add_check = false;

function tag_add(){//func시작
    if(add_check){// if
        return;
    }//if END
    add_check = true;
    var Pdiv = document.querySelector('#score_wrap');
    var div = document.createElement('div');
                    

        var course = [
        ['국어', 'kor' ],
        ['수학', 'mat'],
        ['영어', 'eng'],
                        ];
    for(let i=0; i<3; i++){//for
        ipt = document.createElement('input');
        ipt.setAttribute('type','number');
        ipt.setAttribute('id', course[i][1]);
        ipt.setAttribute('placeholder', course[i][0]);
        div.appendChild(ipt);
                            }//for끝
    
    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode("등록");
    bt.appendChild(text);

    div.appendChild(bt); 
    // input 태그들을 새 div에 넣고 score_wrap에 추가하기

    Pdiv.appendChild(div); //score_wrap div에 추가
    
                }//func끝

    function enroll(){//enroll
        var name = document.querySelector('#name').value;
        var kor = document.querySelector('#kor').value;
        var mat = document.querySelector('#mat').value;
        var eng = document.querySelector('#eng').value;

        var Pdiv = document.querySelector('#score_wrap');
    //score_wrap div에 추가하는 작업
    var div = document.createElement('div');
    div.setAttribute('class','score');

    var data = [name, kor, mat, eng];
    for (let i in data){ //for
        //input 태그에 입력된 값을 h3태그에 삽입!
        let h = document.createElement('h3');
        let text = document.createTextNode(data[i]);
        h. appendChild(text);
        div.appendChild(h);
    } //for end
    var input = Pdiv.lastChild;
    Pdiv.removeChild(input); //input태그 삭제

    Pdiv.appendChild(div); // input 태그값 div에 삽입
                    }//enroll끝