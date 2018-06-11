
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码</title>
    <link href="css/register.css" type="text/css" rel="stylesheet">
</head>
<body class="main_content">
<h2 style="color: #280f13;height: 50px;text-align: center" >
    找回密码</h2>
<form action="/user/resetPassword" id='forgetForm' method="post">


    <p>
        <input name="email" type="email" required="required" placeholder="请输入邮箱地址">

    </p>
    <p><button>找回密码</button></p>

</form>

</body>
</html>
