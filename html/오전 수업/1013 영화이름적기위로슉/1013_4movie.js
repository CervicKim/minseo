//*1013movie.js*//

// 1. focus,Event로 글씨 쓰는 곳 생성.  (click event는 너무 어려울 가능성이 높다 ㅠ)
// 2. class가 힌트
function movie(title, dir, year, genre){
        this.movie_title=title;
        this.movie_dir=dir;
        this.movie_year=year;
        this.movie_genre=genre;
}
movie.prototype.out=function(){
        return this.movie_title+' '+this.movie_dir+' '+
        this.movie_year+' '+this.movie_genre;
}
var movie_list = new Array(); //movie 객체가 저장될 배열


window.onload = function(){
        var input = document.getElementsByClassName('movie');
        for(var i in input){
            input[i].addEventListener('focus',function(){
                this.classList.add('active');
            });
            input[i].addEventListener('blur',function(){
                if(this.value.== ' '){
                this.classList.remove('active');
                                        } //커서가 아예 떠났을 때 사라지기 액티브.
            });
        }
    };
    
    function enroll(){ //실행시킬 것들은 같은 class로 묶어야 부르기도 편하다. id는 각자 다 이름줘야하니까 ㄷ
        var val_temp = document.getElementsByClassName('movie');

        var data = new movie(val_temp[0].value, val_temp[1].value, val_temp[2].value, val_temp[3].value);
    movie_list.push(data);
    print();
}
function print(){
        var li = document.createElement('li');
        li.innerText = movie_list[movie_list.length-1].out();

        document.getElementById('movie_list').append(li);
}
/* 221014
        객체 : 사물, 사람, 동물등 대표성을 지닌 독립적인 존재
        */

        /* 
        
        모든 객체는 자신만의 속성(특징)을 가지며, 자신만의 행동을 갖는다.
        객체는 자신만의 속성을 가짐. == 변수
        객체는 자신만의 행동을 갖는다. == 함수

        객체정의 : 추상화시켜 놓은 것.
        추상화의 기본 : 속성과 행동을 나열하고 구성한다. (복잡한 와중에 중요한 것만 간결하게 정리하는 것?)
        멤버변수 : 객체의 속성을 구성
        멤버함수 : 객체의 속성을 기반으로 행동을 구현해놓은 코드

        객체생성 : new 연산을 통해서 생성
        생성된 객체는 변수에 저장해서 사용하는데, 이때 변수를 참조변수라고 한다.
        참조변수는 ram(컴퓨터 메모리)의 주소를 저장하는 변수이다.

        */

//  ↓ 얘가 참조변수
// var obj = new Object(); //객체를 담을 객체그릇을 만들어야한다.

// 내일10/14도 객체 마저!
/*
        도형 객체
        도형.모양 = 사각형
        도형.위치x축 = 120
        도형.위치y축 = 50 <- 이런 변수는 넣는 값에 따라 달라지지만!
        도형.그리기(함수) <- 함수는 그렇지 않다.
        도형.지우기(함수) <- 중간의 점(.)은 연산자이다. 꼭 붙여야 함!

        도형.모양 = 삼각형
        도형.위치x축 = 200
        도형.위치y축 = 120
        도형.그리기
        도형.지우기

        객체의 멤버(변수/함수)로 접근하기 위한 연산자(.) - access 연산자 = 접근연산자
        접근연산자는 + ,- ,++ ,&& ,|| 등 보다 우선순위가 높음 @ㅇ@
        도형.위치x축 + 10; 접근연산자 순위 - 약 4위.
                                        1순위 : () 소괄호 // 2순위: []대괄호 // 3순위 → 화살표 @@??




                                        

*/ // 객체 생성 방법.
/*
var shape = {
        모양: '사각형', //shape라는 객체를 만들고, 중괄호를 열고 형태의 단위(key)와 값(value)을 넣는다.
        x축: 120, // x축, y축 == key
        y축: 23, // 120, 23 == value
        draw: function(){ //이 함수가 shape라는 객체 안에서 만들어가눈거임을 명심.
                return 'x축 :'+ x축 + 'y축 : ' + this.y축 + '위치에'+ this.모양+ '그리기';
        }
};                              key는 문자형태로만 삽입 가능.
// 객체 내부에서 함수 생성시, 변수(key)의 사용은 this로 접근한다.!!!! ?
// 객체의 값 출력 -> 객체.key
        document.write('모양' + shape.모양);

        document.write( shape.draw());

        // 객체 생성 방법 1. 객체 리터럴 방식 : 변수처럼 객체를 생성하는 방식.

// 학생 객체 생성 (학년,반,번호,이름)       
// var 뒤에 이름을 지으시고~  중괄호 안에 들어갈 데이터를 삽입.) 위 예시..를 참고하여 무얼 할지도 적으면 좋다. */
// var name = '서태지';
// var student = { //key와 value를 정해서 만든다!
//         학년 : 1,
//         반 : 3, //
//         번호: 19920222,
//         이름: name //중앙에 선 그어지는 건 권장하지 ㅇ낳는 방식이란 뜻.
// }; //한글 지원 안될 가능성이 높으니 대체로 영어를 쓰는 게 바람직함. 변수 이름이라도~!!!!

// document.write('<br>'+ name); //외부 변수를 가져오는 건 권장하지 않는 방식임. 뜨더라도 줄 그어진다!!!
//                                 // student 그룹 바깥에 잇는 외부변수(name)를 객체 안으로 끌어오는 건 비추!!

// // 객체생성 방법 2. 생성자 방식 -> new 연산자로 생성하는 방식
// // 생성자 방식 1) Object 객체로 생성
// // 생성자 방식 2) 함수를 통한 생성

// var music = new Objact(); 
// //키와 벨류 없이 시작한다!
// music.title='라이언'; //방법 1. 즉석으로 key와 value를 만든다 오~ 
// music['가수'] = '여자아이들'; // 방법 2. key와 value를 대괄호로 만든다
// music.link = 'https://<iframe width="1280" height="720" src="https://www.youtube.com/embed/95Geohd311Q" title="사회생활, 대인관계 ‘이것’만 알아도 인생이 바뀝니다[오은영의 버킷리스트]" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>youtu.be/HLppb8A5830';

// document.write("<a hraf ="+ music.link+" target = '#play'>"+music['title']+' '+ music.가수+'</a>');

// function open(link){
//         document.getElementById('play').innerHTML=link;
// }
// var 제목 = 'Gaia';
// var 가수 = '노라조';
// music.title = 제목;
// music.가수 = 가수;
// document.write( music['title']+' '+ music.가수);

// // ----
// function movie(제목,감독,년도,장르){
//         this.영화제목 = 제목; //key만들때 this.를 붙여야 한다!
//         this.감독 =감독;
//         this.개봉년도=년도;
//         this.장르=장르;
//         this.view = function(){
//                 return this.영화제목 + ' ' + this.감독;
//         };
// }
// Number.p                                                                                                                                            rototype
// var m1 =new movie('변신자동차 또봇','차도운',2017,'가족의 사랑');
// document.write(m1.영화제목);

// var m2 = new movie('정직한 후보2','라미란',2022,'사회풍자 코미디');
// document.write(m2.view());