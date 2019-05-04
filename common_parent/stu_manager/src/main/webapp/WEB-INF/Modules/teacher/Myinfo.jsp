<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>老师信息</title>
    <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
</head>
<body>
<form id="searchUserForm1" action="${pageContext.request.contextPath}/teacher/search.do" method="post">

    <!--这里是表格数据-->
    <div class="total_table rel" style="margin-top: 20px">
        <table border="0" cellspacing="0" cellpadding="0" style="width: 100%;">
            <thead>
            <tr>
                <td style="width: 80px; text-align: center;"><p>姓名</p></td>
                <td style="width: 100px"><p>性别</p></td>
                <td style="width: 80px"><p>年龄</p></td>
                <td style="width: 80px"><p>职称</p></td>
                <td style="width: 80px; text-align: center;"><p>用户名</p></td>
                <td class="total_table_contral" style="width: 210px"><p>操作</p></td>
            </tr>
            </thead>
        </table>
        <div style="height: 200px; overflow-y: auto; overflow-x: hidden;">
            <table cellpadding="0" cellspacing="0"
                   style="width: 100%; background-color: #FFF;">
                <tbody>

                    <tr onclick="Common.switchLine(this,event);">
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.name}</span></p></td>
                        <td style="width: 100px; text-align: center;"><p><span>${teacher.sex}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.age}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.jobtitle}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.username}</span></p></td>
                        <td class="delete" style="width: 210px; text-align: center;">
                            <p>
                                <a href="${pageContext.request.contextPath}/teacher/toUpdate.do?id=${teacher.id}">编辑</a>
                            </p>
                        </td>
                    </tr>

                </tbody>
            </table>
        </div>
    </div>
    <div class="page">

    </div>
    <div class="specific_page tal dn" id="popupLayer">
        <!--这里删除了style属性-->
        <iframe id="childform" frameborder="0" border="0" class="iframe_layer" name="layer_iframe"></iframe>
    </div>
</form>
</body>
</html>
