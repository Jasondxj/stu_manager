﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>老师信息</title>
    <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
    <script>

    </script>
</head>
<body>
<form id="searchUserForm1" action="${pageContext.request.contextPath}/teacher/search.do" method="post">
    <div class="condition_search">
        <div class="search_title">
            <h3 class="total_title">条件查询</h3>
            <span class="clickToReflesh" onclick="window.location.reload()">点击刷新</span>
            <div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="MainContent_labAllTotal"></span></div>
        </div>

        <div class="search_detail" style="height: 80px;">
            <table cellpadding="0" cellspacing="0" style="width: 900px">
                <tr>
                    <td class="input_text tar">姓名：</td>
                    <td>
                        <p><input type="text" style="width: 120px;" name="name"></p>
                    </td>
                    <td class="input_text tar">职称：</td>
                    <td>
                        <p><input type="jobtitle" style="width: 120px;" name="jobtitle"></p>
                    </td>
                    <td class="input_text tar">用户名：</td>
                    <td>
                        <p><input type="text" id="username" name="username" style="width: 120px;"></p>
                    </td>
                </tr>
            </table>
            <input type="submit" value="" class="search_btn"/>

            <!---------------------------------------------------------------------------------------->


            <%--</div>--%>
        </div>
        <div class="edit">
            <h3 class="total_title">查询结果</h3>
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/teacher/edit.do">新增</a>
                </li>
            </ul>
        </div>
    </div>

    <!--这里是表格数据-->
    <div class="total_table rel">
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
                <c:forEach items="${teachers}" var="teacher">
                    <tr onclick="Common.switchLine(this,event);">
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.name}</span></p></td>
                        <td style="width: 100px; text-align: center;"><p><span>${teacher.sex}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.age}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.jobtitle}</span></p></td>
                        <td style="width: 80px; text-align: center;"><p><span>${teacher.username}</span></p></td>
                        <td class="delete" style="width: 210px; text-align: center;">
                            <p>
                                <a href="${pageContext.request.contextPath}/user/toTeaUpdate.do?id=${teacher.id}">编辑</a>
                                <a href="${pageContext.request.contextPath}/teacher/delete.do?id=${teacher.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <script>
       var nextPage=${currentPage}+1;
       if (nextPage>=${pb.totalPage}){
           nextPage=${pb.totalPage}
       }
        var perPage=${currentPage}-1;
        if (perPage<=1){
            perPage=1;
        }
    </script>
    <div class="page">
        <p class="page_number">
            <a href="javascript:void(0)" onclick="this.href='${pageContext.request.contextPath}/teacher/pageQuery.do?currentPage=1'">[第一页]</a>
            <a href="javascript:void(0)" onclick="this.href='${pageContext.request.contextPath}/teacher/pageQuery.do?currentPage='+perPage+''">[上一页]</a>
            <a href="javascript:void(0)" onclick="this.href='${pageContext.request.contextPath}/teacher/pageQuery.do?currentPage='+nextPage+''">[下一页]</a>
            <a href="javascript:void(0)" onclick="this.href='${pageContext.request.contextPath}/teacher/pageQuery.do?currentPage=${pb.totalPage}'">[最后一页]</a>
            <span>${pb.currentPage}/${pb.totalPage}</span>
            <span>每页显示</span>${pb.pageSize}条记录 共${pb.totalCount}条记录
        </p>
    </div>
    <div class="specific_page tal dn" id="popupLayer">
        <!--这里删除了style属性-->
        <iframe id="childform" frameborder="0" border="0" class="iframe_layer" name="layer_iframe"></iframe>
    </div>
</form>
</body>
</html>
