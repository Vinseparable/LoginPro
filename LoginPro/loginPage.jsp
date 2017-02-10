<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page.</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		账号：<input type="text" name="username" placeholder="请输入账号" /><br/><br/>
		密码：<input type="password" name="password" placeholder="请输入密码" /><br/><br/>
		<input type="submit" value="Login" />
	</form>
</body>
</html>
