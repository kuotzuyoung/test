<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登入頁面</title>
<link rel="stylesheet" href="css/inti.css" type="text/css" />
<link rel="stylesheet" href="css/login.css" type="text/css" />


</head>

<body>


	<!--absolute 绝对定位相对于父元素 不占空间 z-index属性-->
	<div id="bg">
		<div class='div_logo'>
			<p>登入頁面</p>
		</div>

		<div class='div_form'>

			<form name='login' action='Login' onsubmit='return validation()'
				method='post'>
				<div class='div_login_input' id='user'>
					<div id='icon_user'></div>
					<input class='login' id='username' type='text' name='username'
						placeholder='帳號'></input> <span class='hint' id='hint_user'></span>
				</div>

				<div class='div_login_input' id='pwd'>
					<div id='icon_pwd'></div>
					<input class='login' id='password' type='password' name='password'
						placeholder='請輸入密碼'></input> <span class='hint' id='hint_pwd'></span>
				</div>

				<div class='div_btn'>
					<input id='login_submit' type='submit' value='登入'></input>
				</div>
				
				<div class='div_btn'>
					<input id='login_add' type='submit' value='新增'></input>
				</div>
				
			</form>

		</div>

		<script src='js/login.js'></script>
</body>

</html>