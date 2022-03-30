<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
<title>ToDoList작성</title>
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
	height: 400px;
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
<body>
<div class="signIn__wrap">
<div class="signIn_content">
<h1 class="signIn__title">ToDoList</h1>
<p class="signIn__description">해야할 일을 입력해주세요!</p>
	<form action="create_list.do" method="post">
			<div class="signIn_liner">
		해야할일 <input type="text" name="content" size="30">
			</div>
		<div class="signIn_liner">
		진행여부 - <input type="radio" name="isDone" value = "진행중" checked/>진행중
		 <input type="radio" name="isDone" value = "완료" />완료 <br>
		 중  요  도  - <input type="radio" name="isImportant" value = "중요" checked/>중요
		 <input type="radio" name="isImportant" value = "" />중요하지않음
		</div>

	
			<input type="submit" value="확인">
		</form>
</div>
</div>
	



</body>
</html>