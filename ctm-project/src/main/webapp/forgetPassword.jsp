
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码</title>
</head>
<body>
<form action="/user/forget" id='forgetForm' method="post">
    <p>
        <input name="usernmame" type="text" required="required" placeholder="请输入用户名">
    </p>
    <p>
        <input name="email" type="email" required="required" placeholder="请输入邮箱地址">

    </p>
    <p><button>找回密码</button></p>

</form>

</body>
</html>
