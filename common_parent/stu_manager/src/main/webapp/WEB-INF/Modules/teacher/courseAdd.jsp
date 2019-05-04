<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
    <script type="text/javascript">
        function courseSave() {
            $("#userForm").attr("action", "${pageContext.request.contextPath}/teacher/courseAdd.do");
            $("#userForm").submit();
        }
        function editClose() {
            location.href="${pageContext.request.contextPath}/user/info.do";
        }
    </script>
</head>
<body>
<form method="post" id="userForm" action="">
    <div class="specificPageEdit" style="*position: static;">
        <div class="form">
            <div class="specificPage_header fix">
                <h4 class="specificPage_title l">
                    <span id="MainContent_lbTitle">编辑</span>
                </h4>
                <span class="closePage r" onclick="editClose();">关闭</span>
            </div>
            <div id="MainContent_divTitleTab" class="activeEdite_tab_list"
                 style="margin-bottom: 3px;">
                <p>
                    <span class="tab_list_current" data-tab="tab_1" onclick="Common.switchTab(this);">添加课程</span>
                </p>
            </div>

            <div class="hide_tab fix" data-tab="tab_1" id="tab_1">
                <div id="MainContent_UpdatePanel1">
                    <table border="0" cellpadding="0" cellspacing="6" style="width: 100%">
                        <tr>
                            <td class="input_text tar">课程编号：</td>
                            <td>
                                <p>
                                    <input name="cno" type="text" value="" id="payAccountNa" placeholder="格式：c000"
                                           style="width: 150px;"/>
                                </p>
                            </td>
                            <td class="input_text tar">课程名称：</td>
                            <td>
                                <p>
                                    <input name="name" type="text" value="" id="payAccountName"
                                           style="width: 150px;"/>
                                </p>
                            </td>

                        </tr>
                        <tr>
                            <td class="input_text tar">课程简介：</td>
                            <td>
                                <p>
                                    <textarea name="detail" rows="6" cols="30"></textarea>
                                </p>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="form_btn form_btn_static">
                <ul>
                    <li><input type="button" value="保存" onclick="courseSave();"/></li>
                    <li><input type="button" value="关闭" onclick="editClose();"/></li>
                </ul>
            </div>
        </div>
    </div>
</form>
</body>
</html>
