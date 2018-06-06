<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>sign in</title>
    <style>
        .main_content{
            background:url(images/bg.jpg) repeat;
            margin-left:auto; margin-right:auto;
            text-align:left;
            float:none;
            border-radius:8px;
        }
        div{
            background:#009FCC;
            font-size:24px;
            padding:5px;
            color:white;
        }
        form{
            background: #F8F8FF ;
            border:#357FC4 solid 1px;
            color:#575454;
            width:400px;
            margin:20px auto;
            font-size:15px;
        }
        table{
            margin:10px auto;
        }
        a{
            text-decoration:none;
        }
        input[type="button"]{
            background:#228B22;
            color:white;
            font-size:15px;
            font-weight:bold;
            width:120px;
            height:40px;
        }
        td:first-child{
            text-align:right;
            padding:0 5px;
        }
        td:only-child{
            text-align:center;
            font-size:12px;
        }
        span:before{
            content:"* ";
            color:red;
        }
        input[type="text"]:read-only{
            border:#888484 solid 2px;
            background:#888484;
            font-weight:bold;
        }
        input[type="text"]:hover{
            background:#EFD9AC;
        }
    </style>

    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            alert("测试jQuery是否能用");
            $("#form1").submit(function(){
                var name=$("#name").val();//获取提交的值
                if(name.length==0){//进行判断，如果获取的值为0那么提示账号不能为空
                    //alert("aa");//测试使用
                    $("#nameError").html("账号不能为空");
                    return false;
                }

                //密码进行验证不能为空
                var password=$("#password").val();//获取提交的密码的值
                if(password.length==0){
                    $("#passwordError").html("密码不能为空");
                    return false;
                }

                //确认密码进行验证
                var relpassword=$("#relpassword").val();//获取提交的确认密码的值
                if(relpassword.length==0){
                    $("#relpasswordError").html("确认密码不能为空哦");
                    return false;
                }

                if(password!=relpassword){
                    $("#relpasswordError").html("确认密码输入不正确，请重新输入");
                    return false;
                }
            });

        });
    </script>
</head>
<body>
<div class="main_content">
<form action="/user/register" method="post" id="form1">
            <div>注册账号</div>
            <table>
                <tr><td><span>用户名</span></td><td><input type="text" name="username" /></td></tr>
                <tr><td><span>邮箱</span></td><td><input type="text" name="email" /></td></tr>
                <tr><td><span>密码</span></td><td><input type="password" name="user_password" /></td></tr>
                <tr><td><span>确认密码</span></td><td><input type="password" name="user_confirm_password" /></td></tr>
                </tr>><td>手机号码</td><td><input type="text" name="user_phone1" /></td></tr>
                <a href="https://www.baidu.com"> <tr><td colspan="2"><input type="button" name="submit" value="立即注册" /></td></tr></a>
            </table>
        </form>
    </div>>
</body>

</html>
