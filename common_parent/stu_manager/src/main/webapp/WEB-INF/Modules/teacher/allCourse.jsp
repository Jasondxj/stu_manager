<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>所有课程</title>
    <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
    <script type="text/javascript">
        function search() {
            $("#searchUserForm1").attr("action", "${pageContext.request.contextPath}/teacher/courseSearch.do");
            $("#searchUserForm1").submit();
        }
        $(function () {
            if ("${courseMsg}"=="添加课程成功"){
                alert("${courseMsg}")
            }
        })


    </script>
</head>
<body>
<form id="searchUserForm1" action="" method="post">
    <div class="condition_search">
        <div class="search_title">
            <h3 class="total_title">条件查询</h3>
            <span class="clickToReflesh" onclick="window.location.href = window.location.href;">点击刷新</span>
            <div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="MainContent_labAllTotal"></span></div>
        </div>

        <div class="search_detail" style="height: 80px;">
            <div class="search_table">
                <table cellpadding="0" cellspacing="0" style="width: 900px">
                    <tr>
                        <td class="input_text tar">课程编号：</td>
                        <td>
                            <p><input type="text" id="username" name="cno" style="width: 120px;"></p>
                        </td>
                        <td class="input_text tar">课程名称：</td>
                        <td>
                            <p>
                                <input type="text" id="" name="name" style="width: 120px;">
                            </p>
                        </td>
                    </tr>
                </table>
            </div>
            <input type="button" onclick="search();" class="search_btn"/>
        </div>
        <div class="edit">
            <h3 class="total_title">查询结果</h3>
            <ul>
                <li>
                </li>
            </ul>
        </div>
    </div>

    <!--这里是表格数据-->
    <div class="total_table rel">
        <table border="0" cellspacing="0" cellpadding="0"
               style="width: 100%;">
            <thead>
            <tr>
                <td style="width: 20px; text-align: center;"><p>课程编号</p></td>
                <td style="width: 40px; text-align: center"><p>课程名称</p></td>
                <td style="width: 200px"><p>课程简介</p></td>
            </tr>
            </thead>
        </table>
        <div style="height: 200px; overflow-y: auto; overflow-x: hidden;">
            <table cellpadding="0" cellspacing="0"
                   style="width: 100%; background-color: #FFF;">
                <tbody>
                <c:forEach items="${courses}" var="course">
                    <tr onclick="Common.switchLine(this,event);">
                        <td style="width: 30px; text-align: center;"><p><span>${course.cno}</span></p></td>
                        <td style="width: 90px; text-align: center;"><p><span>${course.name}</span></p></td>
                        <td style="width: 200px; text-align: center;"><p><span>
                            <textarea cols="70" rows="3">${course.detail}</textarea>
                        </span></p></td>
                        <td class="delete" style="width: 30px; text-align: center;">
                            <p>

                            </p>
                        </td>
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
