<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
<title> To Do List 수정 및 삭제 </title>
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
	<div class="signIn__wrap">
		<div class="signIn_content">
			<h1 class="signIn__title">ToDoList</h1>
			<form action="modify.do" method="post">
				<div class="signIn_liner">
					<input type="hidden" name="lCode" value="${content.lCode}">
				</div>
				<div class="signIn_liner">
					내용 :
					<input type="text" name="lContent" value="${content.lContent}" size ="35">
				</div>
				<div class="signIn_liner">
					실행 완료 여부 : <input type="radio" name="lisdone" value="진행중" checked="checked"> 진행중 
									<input type="radio" name="lisdone" value="완료"> 완료
				</div>
				<div class="signIn_liner">
					중요도 여부 : <input type="radio" name="lisimportant" value="중요" checked="checked"> 중요 
							<input type="radio" name="lisimportant" value=""> 중요하지않음
				</div>
				<div class="signIn_liner">
					<input type="submit" value="수정하기">
					
				</div>
			</form>
			<form action="delete.do">
				<input type="hidden" name="lCode" value="${content.lCode}">
				<input type="submit" value="삭제하기">
			</form>
		</div>
	</div>
</body>
</html>