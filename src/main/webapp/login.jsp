<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登陆页面</title>
    <script type="text/javascript" src="static/js/md5.js"></script>
</head>

<body>
<h1>登录页面----<span style="color: red;">${message }</span></h1>
<form action="/login.html" name="user" method="post">
    用户名：<input type="text" name="username"/> <br/>
    密&nbsp;&nbsp;码：<input type="password" id="password" name="password"/> <br/>
    <input type="button" onclick="submitform()" value="登陆"/>
    <input type="reset" value="重置"/>
</form>
</body>
<script type="text/javascript">
    function submitform(){
        var password = document.getElementById("password");
        document.getElementById("password").value = hex_md5(password.value);
        document.user.submit();
    }
</script>
</html>  