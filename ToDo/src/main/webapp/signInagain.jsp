<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
html {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	height: 100%;
}

.signIn__wrap {
	width: 100%;
	height: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #DADEFD
}

.signIn__content {
	width: 280px;
	height: 400px;
	padding: 30px;
	background-color: white;
	border-radius: 16px;
}

.signIn__title {
	margin: 12px 0 16px;
}

.signIn__description {
	color: #555;
	margin: 0 0 24px;
}

.signIn__subTitle {
	font-size: 14px;
	font-weight: bold;
	margin: 4px 0;
}

.signIn__liner {
	margin-bottom: 16px;
}

.signIn__input {
	width: 280px;
	height: 40px;
	box-sizing: border-box;
	border-radius: 32px;
	border: 1px solid #aaa;
	padding: 8px 16px;
	line-height: 24px;
}

.signIn__submit {
	width: 280px;
	background-color: royalblue;
	color: white;
	height: 44px;
	margin: 24px 0;
	border-radius: 32px;
	cursor: pointer;
}

.signIn__info {
	margin: 0;
	font-size: 14px;
}
</style>
</head>
<body>
	<script>
		alert("아이디 혹은 비밀번호가 틀렸습니다. \n다시 확인해주세요.")
	</script>
	<script type="text/javascript">
		function checklogin() {
			var regExpuId = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
			var regExpuPw = /^[0-9]*$/

			var form = document.signIn
			var uId = form.uId.value
			var uPw = form.uPw.value

			if (uId == "") {
				alert("아이디를 입력하세요.")
				form.uId.select()
				return;
			}

			else if (!regExpuId.test(uId)) {
				alert("아이디는 이메일 형식입니다. \n아이디 입력을 확인해주세요")
				form.uId.select()
				return;
			}

			if (uPw == "") {
				alert("비밀번호를 입력하세요.")
				form.uPw.select()
				return;
			} else if (!regExpuPw.test(uPw)) {
				alert("비밀번호는 숫자만 입력해주세요.")
				form.uPw.select()
				return

			}
			form.submit();

		}
	</script>
	<div class="signIn__wrap">
		<div class="signIn__content">
			<h1 class="signIn__title">로그인</h1>
			<p class="signIn__description">계획적인 삶을 시작하세요!</p>
			<form name="signIn" action="signIn.do" method="post">
				<div class="signIn__liner">
					<p class="signIn__subTitle">아이디</p>
					<input class="signIn__input" name="uId"
						placeholder="example@mail.com">
				</div>
				<div class="signIn__liner">
					<p class="signIn__subTitle">패스워드</p>
					<input class="signIn__input" type="password" name="uPw">
				</div>
				<div class="signIn__rememberLiner">
					<input type="checkbox" name="rememberMe"> <label
						for="rememberMe">아이디 저장</label>
				</div>
				<input class="signIn__submit" type="button" value="로그인"
					onclick="checklogin()">
			</form>
			<div class="signIn__infoBox">
				<p class="signIn__info">
					아직 가입하지 않으셨나요? <a href="signUp.jsp">가입하러 가기</a>
				</p>

			</div>
		</div>
	</div>

</body>
</html>