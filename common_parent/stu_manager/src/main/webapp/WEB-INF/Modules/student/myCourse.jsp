<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>用户信息</title>
    <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
    <script type="text/javascript">
        function search() {
           /* $("#searchUserForm1").attr("action", "");
            $("#searchUserForm1").submit();*/
        }


    </script>
</head>
<body>
<form id="searchUserForm1" action="" method="post">
    <!--这里是表格数据-->
    <div class="total_table rel" style="margin-top: 20px">
        <table border="0" cellspacing="0" cellpadding="0"
               style="width: 100%;">
            <thead>
            <tr>
                <td style="width: 15px; text-align: center;"><p>课程编号</p></td>
                <td style="width: 50px"><p>课程名称</p></td>
            </tr>
            </thead>
        </table>
        <div style="height: 200px; overflow-y: auto; overflow-x: hidden;">
            <table cellpadding="0" cellspacing="0" border="1"
                   style="width: 100%; background-color: #FFF;">
                <tbody>
                <c:forEach items="${mycourses}" var="course">
                    <tr onclick="Common.switchLine(this,event);">
                        <td style="width: 15px; text-align: center;"><p><span>${course.cno}</span></p></td>
                        <td style="width: 50px; text-align: center;"><p><span>${course.name}</span></p></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


    <div class="specific_page tal dn" id="popupLayer">
        <!--这里删除了style属性-->
        <iframe id="childform" frameborder="0" border="0" class="iframe_layer" name="layer_iframe"></iframe>
    </div>
</form>
</body>
</html>
