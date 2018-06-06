<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<body>
    <h2>Hello World!</h2>
    <img src="<%=basePath%>/images/bg.jpg" alt="图片"/>
</body>
</html>
