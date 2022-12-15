//func2.js

window.onload = function(){
    document.getElementById('bt').addEventListener('click', input);
};

function input(){
    var birth = document.getElementById('birth').value;
    
    var birth_Year = getYear(birth);
    var birth_Mounth = getMounth(birth);
    var age = getAge(birth_year); //생년을 알면 나이도 알게되니까..
    
    var info = document.getElementsByClassName('info');
    info[0].innerHTML=birth_year;
    info[1].inneerHTML=birth_month;
    info[2].innerHTML=age;
}
function getYear(birth){
    year = birth.split('.')[0];
    return year;
}
function getMonth(birth){
    month = birth.split('.')[1];
    return year;
}
function getAge(birth){
    year = birth.split('.');
    age = 2022 - parseInt(year)+1; //한국나이는 나자마자 1살이니까..
    return Month;
}
