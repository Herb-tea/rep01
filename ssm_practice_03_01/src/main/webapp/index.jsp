<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/save">测试查询</a>

<%--<form action="account/save" method="post">--%>
    <%--姓名：<input type="text" name="name" /><br/>--%>
    <%--金额：<input type="text" name="money" /><br/>--%>
    <%--<input type="submit" value="保存"/><br/>--%>

    <form action="account/login" method="post">
        账户：<input type="text" name="username">
        密码：<input type="text" name="password">
        <input type="submit" value="登录">
    </form>
</form>
</body>
</html>
