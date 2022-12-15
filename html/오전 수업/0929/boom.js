/*boom.js*/

var board = new Array(400);
board.fill(0); //배열에 채우기

for(var i=0; i<200;){ //확률이 반반이라 400개 중에 200개를 폭탄으로 넣는데 ㄷ..
    let pos = Math.floor(Math.random()*400); //400개 배열 안에 랜덤으로 넣는다.
    if(board[pos] != 1){
        board[pos] = 1;
        i++;
    }
}

window.onload = function(){
    var table = "<table>";
    for(var i =0; i<20; i++){
        table += "<tr>";
        for(var k =0; k <20; k++){
            if(board[] == 1)//폭탄있
               table+="<td class='bm'></td></td>"
            else 
            table += "<td> <\td>";
        }
        table += "</tr>";
    }
    table += "</table>";
}