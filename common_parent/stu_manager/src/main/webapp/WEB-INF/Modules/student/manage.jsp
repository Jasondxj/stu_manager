﻿<!DOCTYPE html>
<html>
<head>
	<link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
</head>
<body>
    <form id="form1">
    <div class="main">
        <div class="sidbar" id="sidbar">
            <div class="sub_nav">
                <h2><p class="systemIcon">基本功能</p></h2>
                <div class="switch_subNav">
                    <ul id="show_iframe" class="switch_nav">
						<li class="nav_current">
							<a href="#" class="subNavigation" id="A001010"
                               data-name="common_iframe" onclick="Common.switchNavigation(this);"
							   data-url="${pageContext.request.contextPath}/student/Myinfo.do?sno=${student.sno}">个人信息修改</a>
						</li>
                        <li class="nav_current">
                            <a href="#" class="subNavigation" id="A0012010"
                               data-name="common_iframe" onclick="Common.switchNavigation(this);"
                               data-url="${pageContext.request.contextPath}/student/courseInfo.do">选课</a>
                        </li>
                        <li class="nav_current">
                            <a href="#" class="subNavigation" id="A0010"
                               data-name="common_iframe" onclick="Common.switchNavigation(this);"
                               data-url="${pageContext.request.contextPath}/student/myCourse.do?sno=${student.sno}">已选课程</a>
                        </li>
                        <li class="nav_current">
                            <a href="#" class="subNavigation" id="A00120120"
                               data-name="common_iframe" onclick="Common.switchNavigation(this);"
                               data-url="${pageContext.request.contextPath}/student/coreInfo.do?sno=${student.sno}">成绩查询</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!--====这里是弹出层的内容====-->
		<div id="common_iframe" class="maincontent">
			<iframe class="common_iframe" id="A001010_iframe" frameborder="0" border="0" src="${pageContext.request.contextPath}/student/Myinfo.do?sno=${student.sno}"></iframe>
		</div>
    </div>
    </form>
</body>
</html>

