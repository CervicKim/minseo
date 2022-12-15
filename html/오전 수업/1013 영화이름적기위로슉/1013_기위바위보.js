// 실행부
userInput();
// 정의부
function userInput(){//사용자
    var user = parseInt(prompt("1.가위 2.바위 3.보"));
    var cpu = cpu();
    result(user,cpu);
}
function cpu(){//컴퓨터
    var cpu = Math.floor(Math.random()*3)+1;
    return cpu;
}
function result(user, cpu){
    if(user == cpu) alert("비겼다!");
    else if((user == 1 && cpu ==3)||(user == 1 && cpu ==3)||(user == 1 && cpu ==3))alert("이겼다! *^ㅡ^*//");
    else alert("졌다 ㅠㅡㅠ");
}