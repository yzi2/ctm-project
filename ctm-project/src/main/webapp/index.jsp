
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html >

<head class="ui semantic">
    <meta charset="UTF-8">

    <title>baidu</title>
    <link href="http://ox6yf62u0.bkt.clouddn.com/semantic-ui/2.2.13/semantic.min.css" rel="stylesheet">
    <script src="http://ox6yf62u0.bkt.clouddn.com/jquery-2.1.4.min.js"></script>
    <script src="http://ox6yf62u0.bkt.clouddn.com/semantic-ui/2.2.13/semantic.min.js"></script>
    <link href="css/index1.css" type="text/css" rel="stylesheet">
</head>

<body>
<!-- top link start -->
<div class="ui right aligned  topheader fluid container" style="padding: 30px">
    <a href="https://www.zhzyw.com/zyxx/zyxw/">资讯</a>
    <a href="http://www.zyyspwlpt.com/">视频</a>
    <a href="www.baidu.com">百度一下</a>
    <a href="http://tieba.baidu.com/f?kw=%D6%D0%D2%A9&fr=ala0&tpl=5">贴吧</a>
    <a href="register.jsp">注册</a>
    <a href="login.jsp">登录</a>
    <a href="#">设置</a> <!--设置需完善 -->
    <div href="#" class="bri" style1="background-color: rgba(7, 28, 219, 0.952);text-decoration: none;color:white;padding-right: 0;display:inline-block;width:70px;height:15px;">更多</div>
</div>
<!-- top link end -->
<div class="ui centered aligned grid container ">
    <div class="row">
        <div class="column" style="width: 270px;height: 129px;">
            <img class="ui image" src="images/bg2.jpg" style="width:120px; height:101px; margin:43px" alt="">
        </div>
    </div>
    <div class="row">
        <form class="column" style="width:640px;" method="GET" action="https://www.baidu.com/s" name="search">
            <div class="ui fluid  input action">
                <input type="text" name="wd" placeholder="搜索...">
                <button class="medium ui blue button" onclick="document.forms['search'].submit();">搜索一下</button>
            </div>
        </form>
    </div>
</div>
<div class="ui one column center aligned stackable grid ">
    <div class="column" style="padding-top: 140px;font-weight: bold;color:rgba(71, 66, 66, 0.822)">
        <img src="https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/static/protocol/https/home/img/qrcode/zbios_efde696.png" alt="">
        </br>药品官网
    </div>
    <div class="column" style="color:rgba(109, 99, 99, 0.76);font-size:10px">

        <a href="http://jiaowu.jlau.edu.cn/portal.php">关于产品</a> <%--jlau 教务处页面--%>
        <a href="http://202.198.0.54/jwweb/default.aspx">产品推广</a>  <%-- 教务网络管理系统--%>
        </br>
        ©2018 medicial

        <a href="WEB-INF/views/note.html" style="text-decoration-line: underline">意见反馈</a>>
        <i class="marker icon"></i> 燕子
        <p><a href="WEB-INF/views/attention.html" style="text-decoration-line:underline">使用产品前必读</a></p>
    </div>
</div>
</body>

</html>