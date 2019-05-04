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
            $("#searchUserForm1").attr("action", "${pageContext.request.contextPath}/student/search.do");
            $("#searchUserForm1").submit();
        }

        $(document).ready(function () {

            $("#birthday").datepicker({
                dateFormat: 'yy-mm-dd',
            });

        })

    </script>
</head>
<body>
<form id="searchUserForm1" action="" method="post">
    <!--这里是表格数据-->
    <div class="total_table rel" style="margin-top: 30px">
        <table border="0" cellspacing="0" cellpadding="0"
               style="width: 100%;">
            <thead>
            <tr>
                <td style="width: 60px; text-align: center;"><p>姓名</p></td>
                <td style="width: 50px"><p>性别</p></td>
                <td style="width: 30px"><p>年龄</p></td>
                <td style="width: 60px"><p>班级</p></td>
                <td style="width: 100px"><p>院系</p></td>
                <td style="width: 150px"><p>邮箱</p></td>
                <td style="width: 100px"><p>QQ</p></td>
                <td style="width: 100px"><p>手机号码</p></td>
                <td style="width: 90px"><p>寝室</p></td>
                <td style="width: 100px"><p>入学日期</p></td>
                <td class="total_table_contral" style="width: 210px"><p>操作</p></td>
            </tr>
            </thead>
        </table>
        <div style="height: 200px; overflow-y: auto; overflow-x: hidden;">
            <table cellpadding="0" cellspacing="0"
                   style="width: 100%; background-color: #FFF;">
                <tbody>

                    <tr onclick="Common.switchLine(this,event);">
                        <td style="width: 60px; text-align: center;"><p><span>${student.name}</span></p></td>
                        <td style="width: 50px; text-align: center;"><p><span>${student.sex}</span></p></td>
                        <td style="width: 30px; text-align: center;"><p><span>${student.age}</span></p></td>
                        <td style="width: 60px; text-align: center;"><p><span>${student.classno}</span></p></td>
                        <td style="width: 100px; text-align: center;"><p><span>${student.department.name}</span></p>
                        </td>
                        <td style="width: 150px; text-align: center;"><p><span>${student.email}</span></p></td>
                        <td style="width: 100px; text-align: center;"><p><span>${student.qq}</span></p></td>
                        <td style="width: 100px; text-align: center;"><p><span>${student.phone}</span></p></td>

                        <td style="width: 90px; text-align: center;"><p><span>${student.dormno}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>
                                <fmt:formatDate value="${student.jointime}" pattern="yyyy-MM-dd"/>
                            </span></p></td>

                        <td class="delete" style="width: 210px; text-align: center;">
                            <p>
                                <a href="${pageContext.request.contextPath}/student/toUpdate.do?sno=${student.sno}">编辑</a>
                            </p>
                        </td>
                    </tr>

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
