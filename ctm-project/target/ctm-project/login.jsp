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
    <style>
        body{font-family:"微软雅黑"; font-size:14px;}
        body{background:url(images/bg.jpg)}
        .wrap1{position:absolute; top:0; right:0; bottom:0; left:0; margin:auto }/*把整个屏幕真正撑开--而且能自己实现居中*/
        .main_content{background:url(images/main_bg.png) repeat; margin-left:auto; margin-right:auto; text-align:left; float:none; border-radius:8px;}
        .form-group{position:relative;}
        .login_btn{display:block; background: #280d10; color: #280f13; font-size:15px; width:100%; line-height:50px; border-radius:3px; border:none; }
        .login_input{width:100%; border:1px solid #3872f6; border-radius:3px; line-height:40px; padding:2px 5px 2px 30px; background:none;}
        .icon_font{position:absolute; bottom:15px; left:10px; font-size:18px; color:#3872f6;}
        .font16{font-size:16px;}
        .mg-t20{margin-top:20px;}
        .mg-t21{position:absolute; right:60px;top:170px;color:#3872f6;}
        .mg-t22{position:absolute; right:14px;top:170px;color:#3872f6;}
        background: -webkit-linear-gradient(#4990c1, #52a3d2, #6186a3); /* Safari 5.1 - 6.0 */
        background: -o-linear-gradient(#4990c1, #52a3d2, #6186a3); /* Opera 11.1 - 12.0 */
        background: -moz-linear-gradient(#4990c1, #52a3d2, #6186a3); /* Firefox 3.6 - 15 */
        background: linear-gradient(#4990c1, #52a3d2, #6186a3); /* 标准的语法 */
        }
    </style>

</head>
<body>
    <form action="user/login" method="post">
    <div class="container wrap1" style="height:450px;">
        <img src="image/download.png" class="img-rounded">
        <h2 class="mg-b20 text-center">吉农登录页面</h2>
        <div class="col-sm-8 col-md-5 center-auto pd-sm-50 pd-xs-20 main_content">
            <p class="text-center font16">用户登录</p>
            <form>
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
                        <input type="checkbox" />记住密码
                    </label>
                </div>
                <button style="button" class="mg-t21">忘记密码</button>
                <button style="button" class="mg-t22"><a href="zhuce.html">注册</a></button>
                <button style="submit" class="login_btn"><a href="https://www.baidu.com"> 登 录</a></button>
            </form>
        </div><!--row end-->

    </div><!--container end-->
    </form>
</body>
</html>