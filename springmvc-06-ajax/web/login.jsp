<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>

    <script>
        function a1() {
            $.ajax({
                url:"${pageContext.request.contextPath}/a3",
                type:"POST",
                data:{"name":$("#name").val()},
                success(data){
                    // console.log(data.pwd);
                    if (data.userName != undefined){
                        if (data.userName == "ok"){
                            $("#userInfo").css("color", "green");
                        } else {
                            $("#userInfo").css("color", "red");
                        }
                        $("#userInfo").text(data.userName)
                    }
                }
            })
        };

        function a2() {
            $.ajax({
                url:"${pageContext.request.contextPath}/a3",
                type:"POST",
                data:{"pwd":$("#pwd").val()},
                success(data){
                    // console.log(data.pwd);
                    if (data.pwd != undefined){
                        if (data.pwd == "ok"){
                            $("#pwdInfo").css("color", "green");
                        } else {
                            $("#pwdInfo").css("color", "red");
                        }
                        $("#pwdInfo").text(data.pwd)
                    }
                }
            })
        }
    </script>
</head>
<body>

<p>
    用户名：<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>

<p>
    密码：<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>

</body>
</html>
