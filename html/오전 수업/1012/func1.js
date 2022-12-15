// func1.js

/*
html 작업
    1. input 2개 생성 - 너비150, 높이35, 둥근모서리
    2. 버튼 1개 생성 - text- 입력, 너비80, 높이35
        검정바탕 흰글씨, 글씨크기 15px
    3. div 생성 -> id-output, 너비300, 화면 가운데표시

자바스크립트 작업
    1. 입력 버튼 클릭시, 이벤트 생성. - 함수명 input
    2. input 함수 -> 두 input value값 가져오기
    3. list-push 함수 -> 두 개value값 input 함수로부터 
        받아서 배열 list에 저장
    4. output_list함수 -> 배열list의 값 div#output에 출력
*/

window.onload = function(){
    document.getElementById('bt').addEventListener('click', input);
};

function input(){
    var name = document.getElementById('name');
    var job = document.getElementById('job');
// input 엘리먼트 객체로 가져오기 
    list_push( name.value , job.value);
// input value값을 list_push에 넘기기
    name.value=''; //name input 초기화
    job.value=''; // job input 초기화
    name.focus(); //name input에 커서 이동
}
var list=new Array();
function list_push(name, job){
    var out = '<span>'+name+'</span><span>'+job+'</span>';
    list.push(out);
    
    //배열은 하나인데 저장할 데이터가 2개일 때는?!
    //list.push( [name, job] );
    //list.push({n : name, j : job }); //객체형태
    output_list();
}
function output_list(){
    var div = document.getElementById('output');
    var out = '';
    for(var i in list){
        out+= list[i];
    }
    div.innerHTML=out;
}