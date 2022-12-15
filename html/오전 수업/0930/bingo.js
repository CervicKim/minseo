
var bingo =new Array();
while( bingo.length !=25){ //빙고 길이인 25가 될떄까지 반복하겠다
    let num = Math.floor(Math.random()*100) + 1;
    if( bingo.indexOf(num) == -1){ //값이없으면 -1이래.
        bingo.push(num);
    }
}

window.onload = function(){//fun시작
    var td = document.querySelectorAll(".box");

    for(var i=0; i<td.length; i++){//하늘에뿌릴거에요 ??
        //td안쪽에 숫자가 나오도록.
        td[i].innerHTML = bingo[i];
        td[i].addEventListener('click', function () {
            this.style.background = "green";
            check(this.innerHTML);
        });
    }
};//fun끝

function check(n){
    //체크한 숫자를 빙고배열에서 제외시키기.
    for(let i in bingo){
        if (bingo[i] == n){ //선택한 숫자를 배열에서 찾고 0대입시킴.
            bingo[i] = 0;
            break;
        }
    }
    //5줄 빙고 확인
    var wd = 0, hg = 0, cr1 = 0, cr2 = 0, end = 0;
    for(var i=0; i <5; i++){ //i는 줄!
        for(var k =0; k <5; k++){ //k는 칸!
            if( bingo[i * 5 + k] == 0)wd++; //줄에 0이 몇개냐 ////01234 
            if( bingo[k * 5 + i] == 0)hg++; //90도로 꺾어서 반대로보는 걸로 가로와 세로줄을 샌다(움..)
        }
        if(bingo[i*6] == 0) cr1++;//왼쪽 위 첫시작 대각선
        if(bingo[i *4 +4] == 0) cr2++;
        if(cr2 == 5)end++;
        if(cr1 == 5)end++;
        if(wd == 5)end++; //한줄에 5칸이면 1줄빙고!
        if(hg == 5)end++;
        wd = 0; //다음줄 0 갯수를 확인하기 위해 다시 0으로 초기화.
        hg = 0;
    }
    if(end == 5) alert("빙고!!!!!!!!");
}