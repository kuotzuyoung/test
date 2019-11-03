var radiostate = 0;
document.forms["login"].reset();  //回退到页面时清空输入框

function hiddenPasswordErr(){
	document.getElementById("hint_pwd").innerHTML="";
	document.getElementById("top_hint").innerHTML="";
	
}

function checkOpt(){
	var x = document.getElementById("opt");
	if(radiostate == 0){
		x.checked = true;
		radiostate =1;
	}
	else{
		x.checked = false;
		radiostate =0;
	}
	

}

function validation(){
	var inputUser = document.forms["login"]["username"].value;  
	var inputPassword = document.forms["login"]["password"].value; 				
	if(inputUser==null || inputUser==""){
		//alert("错误：用户名");
		document.getElementById("hint_user").innerHTML="x 用户名不能为空";
		document.getElementById("hint_user").style.color="red";
		return false;
	}
	if(inputPassword==null || inputPassword==""){
		//alert("错误：密码");
		document.getElementById("hint_pwd").innerHTML="x 密码不能为空";
		document.getElementById("hint_pwd").style.color="red";
		document.getElementById("username").focus();
		return false;
	}
	
	var patt= /^[a-zA-Z0-9]+$/;  /*正则表达式无需加引号 str.search(/Hello/i)*/
	if(patt.test(inputUser) != true){
		document.getElementById("hint_user").innerHTML="x 用户名格式错误";
		document.getElementById("hint_user").style.color="red";
		return false;
	}

    return true;
   				
}
