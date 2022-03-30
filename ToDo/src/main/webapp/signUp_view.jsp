<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>
<style type="text/css">
html{
	height: 100%;
}
body{
	margin: 0;
	padding: 0;
	height: 100%;
}
.signIn__wrap{
	width: 100%;
	height: 100%;
	display:flex;
	justify-content: center;
	align-items: center;
	background-color: #DADEFD
}
.signIn__content{
	width: 280px;
	height: 500px;
	padding: 30px;
	background-color: white;
	border-radius: 16px;
}
.signIn__title{
	margin: 12px 0 16px;
}
.signIn__description{
	color: #555;
	margin: 0 0 24px;
}
.signIn__subTitle{
	font-size: 14px;
	font-weight: bold;
	margin: 4px 0;
}
.signIn__liner{
	margin-bottom: 16px;
}
.signIn__input{
	width: 280px;
	height: 40px;
	box-sizing: border-box;
	border-radius: 32px;
	border: 1px solid #aaa;
	padding: 8px 16px;
	line-height: 24px;
}
.signIn__submit{
	width: 280px;
	background-color:royalblue;
	color: white;
	height: 44px;
	margin: 24px 0;
	border-radius: 32px;
	cursor: pointer;
}
.signIn__info{
	margin: 0;
	font-size: 14px;
}
</style>
</head>

<script type="text/javascript">
function checkLogin() {
	var form = document.loginForm
	var regExpEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
	var regExpName = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]+$/;
	var email = form.uId.value
	var name = form.uName.value
	var pw1 = form.uPw1.value
	var pw2 = form.uPw2.value
	
	if(form.uId.value == ""){
		alert("아이디를 입력해 주세요.")
		form.uId.focus()
		return false
		
	}else if(form.uId.value.length < 5 || form.uId.value.length > 50){
		alert("아이디는 5~50자 이내로 입력 가능합니다.")
		form.uId.focus()
		return false
	}else if(!regExpEmail.test(email)){
		alert("입력하신 아이디가 이메일 형식이 아닙니다.")
		form.uId.focus()
		return false
	}else if(form.uPw1.value == ""){
		alert("비밀번호를 입력해 주세요.")
		form.uPw1.focus()
		return false
	}else if (form.uPw1.value.length < 4 || form.uPw1.value.length > 12){
		alert("비밀번호는 4~12자 이내로 입력 가능합니다.")
		form.uPw1.select()
		return false
	}else if(form.uPw2.value == ""){
		alert("비밀번호 확인을 입력해 주세요.")
		form.uPw2.focus()
		return false
	}else if (form.uPw2.value.length < 4 || form.uPw2.value.length > 12){
		alert("비밀번호 확인은 4~12자 이내로 입력 가능합니다.")
		form.uPw2.select()
		return false
	}else if (pw1 != pw2){
		alert("비밀번호가 일치하지 않습니다.")
		form.uPw1.select()
		return false
	}else if(form.uName.value ==""){
		alert("이름을 입력해 주세요.")
		form.uName.focus()
		return false
	}else if (form.uName.value.length < 2 || form.uName.value.length > 20){
		alert("이름은 2~20자 이내로 입력 가능합니다.")
		form.uName.select()
		return false
	}else if(!regExpName.test(name)){
		alert("이름은 문자만 입력해주세요.")
		form.uName.focus()
		return false
	}
	alert("회원가입이 완료되었습니다.")
	form.submit()
}

</script>


<body>

	<div class="signIn__wrap">
		<div class="signIn__content">
			<h1 class="signIn__title">회원가입</h1>
			<form name="loginForm"  action="signUp.do" method="post">
				<div class="signIn__liner">
					<p class="signIn__subTitle">아이디</p>
					<input class="signIn__input" type="text" name="uId"  placeholder="example@mail.com">
				</div>
				<div class="signIn__liner">
					<p class="signIn__subTitle">패스워드</p>
					<input class="signIn__input" type="password" name="uPw1" placeholder="비밀번호는 4~12자 이내로 입력">
				</div>
				<div class="signIn__liner">
					<p class="signIn__subTitle">패스워드 확인</p>
					<input class="signIn__input" type="password" name="uPw2">
				</div>
				<div class="signIn__liner">
					<p class="signIn__subTitle">이름</p>
					<input class="signIn__input" type="text" name="uName" placeholder="이름은 2~20 이내로 입력">
				</div>

				<input class="signIn__submit"  type="button" value="가입하기" onclick="checkLogin()">
			</form>
			<div class="signIn__infoBox">
				<a href="signIn.jsp">← 이전 페이지</a></p>
				
			</div>
		</div>
	</div>

</body>
</html>