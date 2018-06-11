<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录界面</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="iconfont/style.css" type="text/css" rel="stylesheet">
    <link href="css/new.css" type="text/css" rel="stylesheet">

</head>
<body>
    <form >
    <div class="container wrap1" style="height:450px;">
        <h2 class="mg-b20 text-center">吉农登录页面</h2>
        <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content">

            <form action="/user/login" method="post" >
                <tr>
                    <td><input type="radio" name="user" id="user"checked="checked"/> 普通用户</td>
                    <td><input type="radio" name="manager" id="manager"/> 管理员</td>
                </tr>
                <div class="form-group mg-t20">
                    <i class="icon-user icon_font"></i>

                    <input type="email" class="login_input" id="email" placeholder="请输入用户登录邮箱" />
                </div>
                <div class="form-group mg-t20">
                    <i class="icon-lock icon_font"></i>
                    <input type="password" class="login_input" id="password" placeholder="请输入密码" />
                </div>
                <div class="checkbox mg-b25">
                    <label>
                        <input type="checkbox" id="remember"/>记住密码
                    </label>
                </div>


                <a href="forgetPassword.jsp" class="mg-t21">忘记密码</a>
                <button style="button" class="mg-t22 register"><a href="register.jsp">注册</a></button>
                <button style="submit" class="login_btn" id="login" >登 录</button>
            </form>
        </div><!--row end-->

    </div><!--container end-->
    </form>




    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            //alert("测试jQuery是否能用");
            $("#login").click(function(){
                var email=$("#email").val();//获取提交的值
                var password=$("#password").val();//获取提交的密码的值

//                alert(username);
                if(email.length==0){//进行判断，如果获取的值为0那么提示账号不能为空
//                    alert("aa");//测试使用
                    alert("注册邮箱不能为空");
                    return false;
                }

                //密码进行验证不能为空
                if(password.length==0){
                    alert("密码不能为空");
                    return false;
                }


                $.ajax({
                    type : "POST", //提交方式
                    dataType : "json",
                    url : "/user/login",//路径
                    data : {
                        "email" : email,
                        "password" : password
                    },//数据，这里使用的是Json格式进行传输
                    success : function(result) {//返回数据根据结果进行相应的处理
                       alert(result) ; // 还需继续完善
                    }
                });
            });

        });



        <%--记住密码js判断--%>
        window.onload = function(){
            var oForm = document.getElementById('login');
            var oUser = document.getElementById('email');
            var oPswd = document.getElementById('password');
            var oRemember = document.getElementById('remember');
            //页面初始化时，如果帐号密码cookie存在则填充
            if(getCookie('email') && getCookie('password')){
                oUser.value = getCookie('email');
                oPswd.value = getCookie('password');
                oRemember.checked = true;
            }
            //复选框勾选状态发生改变时，如果未勾选则清除cookie
            oRemember.onchange = function(){
                if(!this.checked){
                    delCookie('email');
                    delCookie('password');
                }
            };
            //表单提交事件触发时，如果复选框是勾选状态则保存cookie
            oForm.onsubmit = function(){
                if(remember.checked){
                    setCookie('email',oUser.value,7); //保存帐号到cookie，有效期7天
                    setCookie('password',oPswd.value,7); //保存密码到cookie，有效期7天
                }
            };
        };
        //设置cookie
        function setCookie(name,value,day){
            var date = new Date();
            date.setDate(date.getDate() + day);
            document.cookie = name + '=' + value + ';expires='+ date;
        };
        //获取cookie
        function getCookie(name){
            var reg = RegExp(name+'=([^;]+)');
            var arr = document.cookie.match(reg);
            if(arr){
                return arr[1];
            }else{
                return '';
            }
        };
        //删除cookie
        function delCookie(name){
            setCookie(name,null,-1);
        };
    </script>

</body>
</html>