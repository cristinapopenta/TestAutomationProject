function clickMe(){
    //var var1 = "abc";
    //var var2 = 5;
    //var var3 = false;
    //alert("hello!!!"); //existing fc in JS; alert, prompt and confirm
    hitButton();
}

function hitButton(){
    //alert("test alert");
    //prompt("test prompt");
    confirm("test confirm");
}

function readInputText(){
    var usernameText=document.getElementById("username").value; //username e id ul din html
    //alert(usernameText);
    document.getElementById("result").innerHTML = "the username is " + usernameText;
    if (usernameText.length > 10) {
        alert("max size of 10 has been exceeded; try again with less than 10 characters");
        document.getElementById("username").style.color="red";
        //document.getElementById("username").value='';
        usernameText=document.getElementById("username").value;
    };
}

function readPassword(){
    var usernamePass=document.getElementById("pass").value;
    if (usernamePass.length < 6){
        alert("password too short; try again with more than 6 characters");
    }
}  // function was written in case it is used separatley; read and repeat password are tested together

function repeatPassword(){
    var usernamePassRepeat=document.getElementById("passrepeat").value;
} //function was written in case it is used separatley; read and repeat password are tested together


function validateUserPass()
{
    var usernamePass=document.getElementById("pass").value;
    var usernamePassRepeat=document.getElementById("passrepeat").value;
    if (usernamePass.length < 6){
            alert("password too short");
    }
    if (usernamePass != usernamePassRepeat ){
            alert("password mismatch!!!!!");
    }
}   // fct displays proper messages individually in case one test fails, and both messages in case both tests fail


//tema: validari pe campuri cu js; si pagina mai frumoasa, cu css