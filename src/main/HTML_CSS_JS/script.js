function clickMe(){
    var var1 = "abc";
    var var2 = 5;
    var var3 = false;
    //alert("hello!!!"); //existing fc in JS; alert, prompt and confirm
    readInputText();
}

function readInputText(){
    var usernameText=document.getElementById("username").value; //username e id ul din html
    //alert(usernameText);
    document.getElementById("result").innerHTML = "the username is " + usernameText;
    if (usernameText.length > 10){
        alert("max size of 10 has been exceeded");
        document.getElementById("result").style.color="red";
    }
}

//validari pe campuri 5 cu js; si pagina mai frumoasa, cu css