<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
</head>
<body>

<!-- 失去焦点的时候，发起一个请求（携带信息）到后台 -->
用户名：<input type="text" id="userName" onblur="a()">

</body>

<script>
    function a(){
        $.ajax({
            url:"${pageContext.request.contextPath}/a1",
            type:"POST",
            data:{"name":$("#userName").val()},
            success:function (data, status){
                console.log("data=:" + data);
                console.log("status=:" + status);
            }
        })
    }
</script>
</html>