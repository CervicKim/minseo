//func.js//
/* 
함수와 메소드의 차이점!
ㅁ 귀속여부!! 
    1.함수는 독립적인 코드 2. 매서드는 귀속 돼서 사용되는 코드.


함수 : 코드를 모듈화한 것으로, 재사용성, 유지보수
    효율성이 좋아지는 특징을 가짐.
    => 모듈에는 이름을 지정해야 하며, 
    모듈 삽입을하게 되는 사항과 모듈이 사용되었을 때
    출력되는 사항을 확인하는 것이 필요하다.
    
    //아라폰! @ㅇ@ 원하는 걸 꼈다 뺐다!
    이 함수를 다른 html 페이지에서도 쓸 수 있게 ?ㅇ?!
    재사용성 좋아지고, 관리하기 편해짐! 분할해서 쓰니까~
    ex) 일기를 한 통으로 쓰지 않고, 월별로 나눠서 쓰면 ]
    나중에 빠르게 찾을 수 있다!

    // a input 태그로부터 데이터 입력받아서

    1. 데이터가 유효한 데이터인지 검사하고,
    저장하는 위치에 공간 확보가 되었는지 확인하고
    2. 파일을 저장하기 위해 파일이 생성됐는지 확인.
    3. 생성됐다면? 파일에 저장한다.
    
    b input 태그로부터 데이터 입력받는 경우.
        1. 함수 2. 함수 3. 함수 실행만 하면된다. <=
        새로 또할 필요없이, 본 과정을 퍼오면 됨. 시간절약!
    
    여러 html이 한 함수만 쓴다면 수정할 때도 한번만 해도 되니까 이득!


    함수의 구성 : 선언부 및 정의부, 실행부 선언부 및 정의부
                -> 함수모듈의 출력형태와 이름, 실행부 선언부 및 정의부
                -> 함수 모듈의 출력형태와 이름, 삽입되는 사항과 
                코드블럭이 추가되어 있는 부분
        function func1(obj1, obj2){
            res = obj1 + obj2;
                return res;
        }
    addEventListner('click',function(){

    })
    실행부 : 1️⃣함수의 이름과 2️⃣데이터를 삽입하여 함수모듈을 실행하게 해주는 부분
        1️⃣func1(2️⃣10,20); //함수 실행 첫부분
    
    함수 실행순서
    브라우저 실행 -> HTML엘리먼트 호출 -> 코드해석 -> 함수발견
    -> 함수실행 -> 함수실행완료후 호출한 위치로 복귀. -> 원래 코드 실행.

    변수의 존속성 
    변수의 지역성 : 변수는 기본적으로 코드블럭 내에서만 존재. - (코드블럭 - {})
    변수 선언 후, 코드블럭이 종료될 때까지, 메모리상에 존재.(지역변수)
    함수 실행시 현재까지 실행되었던 내역은 모두 스택이란 메모리 영역에
    보관 후, 실행함수로 제어를 이동하여 초기화 -> 함수 실행이 완료되면
    초기화 된 변수들은 메모리 영역에서 삭제.

    함수 간 통신방법(데이터 이동)
    함수는 기본적으로 폐쇄적 구조 형태. 즉, 함수 간 데이터 공유 X
    함수간 통신을 위한 방법 : 데이터 삽입부와 출력부를 이용하여 통신!
    데이터삽입 (인수 (파라미터,매개변수) ) 실행함수에 데이터 전달
    sum(10,20, 30, 40); 
    => 10과 20데이터를 매개변수 a와 b에게 전달.
    a=10. b=20 저장.
                    만약 매개변수가 4개면? 데이터도 4개가 된다!
    function sum( a,b){
            return (a+b);
    }
    result = sum(23, 12);
    변수 result는 35의 값을 가지게 된다.

    */

    // function total(5, 20);
    // Document.write( res + '<bar>');
    // 또는 function (13, 56);
    //     var sum=0;
    //     for(var i= 13; i<=66; i++){
    //         sum = sum + i;
    //     }
    // }

    // 함수의 4가지 형태
/*
    // 1. 입력 X, 출력 X
    function func1(){
        document.write("매개변수 없음, 반환도 없음.");
    }

    // 2. 입력 O, 출력 X
    function func2(birth){
        var age = 2022 - parseInt(birth.substring(0,4));
        document.write("나이는"+age+"살 먹었다.");
    }

    // 3. 입력 X, 출력 O
    function func3(){
        var num = document.querySelector("#number");
        num = parseInt(num);

        return num + "번 입니다.";
    }

    // 4. 입력 O, 출력 O
    function func4(point, multi, state){
        if(state >0) multi = 1;

        return (point * multi);
    }
    */

    var number= 0;
    var oldnumber =0;
    var opd= null;
    var result= 0;
    var flag = false;

    window.onload=function(){
        var num =document.querySelectorAll(".num");
        var op = document.querySelectorAll(".op");

        for(var i=0; i<num.length; i++){
            num[i].addEventListener("click", function(){
                number = parseInt(this.dataset.value);
                calc();
            });
        }
        for(var i=0; i<op.length; i++){
            op[i].addEventListener("click", function(){
                opd = this.dataset.value; //연산자 버튼들을 클릭했을 때 값을 갖는다.
                flag=true;
                calc();
            });
        }
    };

    function calc(){
        if(flag){
            oldnumber = number;
            flag = false;
            number = 0;
                }
            if(opd=="="){
            selectop();
            document.querySelector("#result").innerHTML = result;
            }
        }
        function selectop(){
            switch(odp){
                case "+" :
                    result = oldnumber + number;
                    break;
                case "-" :
                    result = oldnumber - number;
                    break;
                case "*" :
                    result = oldnumber * number;
                    break;
                case "/" :
                    result = oldnumber / number;
                    break;
        }
    }