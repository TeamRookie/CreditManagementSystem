<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>项目信息管理</title>

    <meta name="description" content="Common form elements and layouts"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>

<%--    <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/logo/favicon.ico"
          type="image/x-icon"/>--%>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/assets/font-awesome/4.5.0/css/font-awesome.min.css"/>

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jquery-ui.custom.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/chosen.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap-datepicker3.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap-timepicker.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/daterangepicker.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap-datetimepicker.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap-colorpicker.min.css"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/fonts.googleapis.com.css"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace.min.css" class="ace-main-stylesheet"
          id="main-ace-style"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-part2.min.css"
          class="ace-main-stylesheet"/>
    <![endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-rtl.min.css"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-ie.min.css"/>
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->
    <script src="${pageContext.request.contextPath}/assets/js/ace-extra.min.js"></script>

    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath}/assets/js/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="no-skin">
${message}
<div id="navbar" class="navbar navbar-default          ace-save-state">
    <div class="navbar-container ace-save-state" id="navbar-container">
        <button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
            <span class="sr-only">Toggle sidebar</span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>

            <span class="icon-bar"></span>
        </button>

        <div class="navbar-header pull-left">
            <a href="${pageContext.request.contextPath}/student/index.html" class="navbar-brand">
                <small>
                    <i class="fa fa-leaf"></i>
                    创新楼教室预约系统
                </small>
            </a>
        </div>

        <div class="navbar-buttons navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav" style="text-align: right;">
                <li class="light-blue dropdown-modal">
                    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
                        <img class="nav-user-photo"
                             src="${pageContext.request.contextPath}/assets/images/avatars/用户1.png"
                             alt="User's Photo"/>
                        <span class="user-info">
									<small>Welcome,</small>
									${student.sname}
								</span>

                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="${pageContext.request.contextPath}/student/passwordChange.html">
                                <i class="ace-icon fa fa-cog"></i>
                                修改密码
                            </a>
                        </li>

                        <li>
                            <a href="${pageContext.request.contextPath}/student/userInfo.html">
                                <i class="ace-icon fa fa-user"></i>
                                个人详情
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="${pageContext.request.contextPath}/student/logout.html">
                                <i class="ace-icon fa fa-power-off"></i>
                                退出
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>

    </div><!-- /.navbar-container -->
</div>

<div class="main-container ace-save-state" id="main-container">
    <script type="text/javascript">
        try {
            ace.settings.loadState('main-container')
        } catch (e) {
        }
    </script>

    <div id="sidebar" class="sidebar                  responsive                    ace-save-state">
        <script type="text/javascript">
            try {
                ace.settings.loadState('sidebar')
            } catch (e) {
            }
        </script>

        <ul class="nav nav-list">
            <li class="">
                <a href="${pageContext.request.contextPath}/index.action">
                    <i class="menu-icon fa fa-tachometer"></i>
                    <span class="menu-text"> 首页 </span>
                </a>

                <b class="arrow"></b>
            </li>
            <li class="">

                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-list-alt"></i>
                    <span class="menu-text">
                                项目信息管理
                    </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>
                <ul class="submenu" id="typeListInformationUrl">
                </ul>
            </li>
            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-list"></i>
                    <span class="menu-text"> 学分规则管理 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu" id="typeListRulesUrl">

                </ul>
            </li>
            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-calendar"></i>
                    <span class="menu-text">
                               项目信息导入
                    </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu" id="typeImport">

                </ul>
            </li>
            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-desktop"></i>
                    <span class="menu-text">
                                用户管理
                    </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">


                    <li class="">
                        <a href="${pageContext.request.contextPath}/getStudent.action">
                            <i class="menu-icon fa fa-caret-right"></i> 学生信息管理
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="${pageContext.request.contextPath}/getFaculty.action.html">
                            <i class="menu-icon fa fa-caret-right"></i> 学院信息管理
                        </a>

                        <b class="arrow"></b>
                    </li>
                </ul>
            </li>
            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-pencil-square-o"></i>
                    <span class="menu-text"> 个人信息管理</span>
                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">

                    <li class="">
                        <a href="${pageContext.request.contextPath}/changePassword.action">
                            <i class="menu-icon fa fa-caret-right"></i> 修改密码
                        </a>

                        <b class="arrow"></b>
                    </li>

                </ul>
            </li>

        </ul>

        <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
            <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state"
               data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
        </div>
    </div>

    <div class="main-content">
        <div class="main-content-inner">
            <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                <ul class="breadcrumb">
                    <li>
                        <i class="ace-icon fa fa-home home-icon"></i>
                        <a href="#">首页</a>
                    </li>

                    <li>
                        <a href="#">项目信息管理</a>
                    </li>
                    <li>
                        <a href="#">优秀安全员</a>
                    </li>
                </ul>

            </div>


            <div class="page-content">

                <div class="col-xs-12">

                    <div class="col-sm-1">
                        <button type="button" class="btn btn-sm btn-primary" onclick="searchButtonClick();" id="searchButton">
                            <span class="ace-icon fa fa-search icon-on-right bigger-110">
                                搜索
                            </span>
                        </button>
                    </div>
                    <div class="col-sm-1 no-padding-right">
                        <a  class="white" href="${pageContext.request.contextPath}/safety.action">
                            <button type="button" class="btn btn-sm btn-primary"  name="addButton" id="back">
                                <span class="ace-icon fa fa-backward icon-on-right bigger-110">返回</span>
                            </button></a>
                    </div>
                    <div class="col-sm-1">
                        <button type="button" class="btn btn-sm btn-primary" id="importButton">
                            <span class="ace-icon fa fa-outdent icon-on-right bigger-110">
                                项目信息导出
                            </span>
                        </button>
                    </div>

                </div>


                <div class="row">
                    <div class="col-xs-12" id="searchForm" style="display: none">
                        <h4 class="pink" style="height: 20px"></h4>
                        <form class="form-horizontal" role="form"
                              action="${pageContext.request.contextPath}/safety.action">
                            <div class="form-group">
                                <label class="col-sm-1 control-label no-padding-right"  for="number">
                                    学号
                                </label>
                                <div class="col-sm-2">
                                    <input onkeyup="value=value.replace(/[^\d]/g,'')" class="form-control"  name="studentNumber" id="number" type="text" placeholder="学号" />
                                </div>

                                <label class="col-sm-1 control-label no-padding-right " for="date">获得称号时间</label>
                                <div class="col-sm-1">
                                    <select id="date" class="form-control"   name="safetyTime" readonly>
                                    </select>
                                </div>


                                <div class="col-sm-1"></div>
                                <div class="col-sm-2 no-padding-top">
                                    <button type="submit" class="btn btn-sm btn-primary ">
                                        <span class="ace-icon fa fa-search icon-on-right bigger-150 "></span>
                                        搜索
                                    </button>
                                </div>

                            </div>
                         <%--   <div class="form-group">
                                <label class="col-sm-1 control-label no-padding-right " for="date">竞赛时间</label>
                                <div class="col-sm-1">
                                    <select id="date" class="form-control"   name="contestDate" readonly>
                                    </select>
                                </div>
                                <label class="col-sm-1 control-label no-padding-right " for="contestLevel">竞赛级别</label>
                                <div class="col-sm-1">
                                    <select id="contestLevel" class="form-control"   name="contestLevel" readonly>
                                        <option value="">请选择</option>
                                        <option value="国际">国际</option>
                                        <option value="国家">国家</option>
                                        <option value="省级">省级</option>
                                        <option value="市级">市级</option>
                                        <option value="校级">校级</option>
                                    </select>
                                </div>
                                <label class="col-sm-1 control-label no-padding-right " for="contestRank">竞赛级别</label>
                                <div class="col-sm-2">
                                    <select id="contestRank" class="form-control"   name="contestRank" readonly>
                                        <option value="">请选择</option>
                                        <option value="特等奖">特等奖</option>
                                        <option value="一等奖,金奖">一等奖,金奖</option>
                                        <option value="二等奖,银奖">二等奖,银奖</option>
                                        <option value="三等奖,铜奖">三等奖,铜奖</option>
                                        <option value="优秀奖">优秀奖</option>
                                        <option value="成功参与奖">成功参与奖</option>
                                        <option value="其他奖">其他奖</option>
                                    </select>
                                </div>

                            </div>--%>
                        </form>
                    </div>
                </div>

            </div>
            <!-- div.table-responsive

            <!-- div.dataTables_borderWrap -->
            <div class="table-responsive">
                <table id="dynamic-table" class="table table-striped table-bordered table-hover text-nowrap">
                    <thead>
                    <tr>
                        <th class="center">学号</th>
                        <th class="center">姓名</th>
                        <th class="center">获得称号时间</th>
                        <th class="center">指导教师</th>
                        <th class="center">称号级别</th>
                        <th class="center">学分</th>

                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${pageBean.pageList}" var="item">
                            <tr>
                                <td class="center">
                                        ${item.stunum}
                                </td>
                                <td class="center">${item.stuname}</td>
                                <td class="center">${item.safetytime}</td>
                                <td class="center">${item.teachername}</td>
                                <td class="center">${item.safetylevel}</td>

                                <td class="center">${item.credit}</td>
                            </tr>
                    </c:forEach>
                    </tbody>

                </table>

            </div>
            <div class="message-footer clearfix">
                <%--<div class="pull-left"> ${orderCount} messages total</div>--%>

                    <div class="pull-right">


                        &nbsp; &nbsp;
                        <ul class="pagination middle">
                            <li>
                                <a href="${pageContext.request.contextPath}/safety.action?currentPage=1&safetyTime=${safetyTime}&studentNumber=${studentNumber}"><i class="ace-icon fa fa-step-backward middle"></i></a>
                            </li>

                            <li >

                                <a href="${pageContext.request.contextPath}/safety.action?currentPage=${pageBean.currentPage-1}&safetyTime=${safetyTime}&studentNumber=${studentNumber}"> <i class="ace-icon fa fa-caret-left bigger-140 middle"></i> </a>

                            </li>

                            <li>
													<span>
														<input value="${pageBean.currentPage}" maxlength="3" type="text" readonly="readonly" />
													</span>
                            </li>

                            <li>
                                <a href="${pageContext.request.contextPath}/safety.action?currentPage=${pageBean.currentPage+1}&safetyTime=${safetyTime}&studentNumber=${studentNumber}">
                                    <i class="ace-icon fa fa-caret-right bigger-140 middle"></i>
                                </a>
                            </li>

                            <li>
                                <a href="${pageContext.request.contextPath}/safety.action?currentPage=${pageBean.totalPage}&safetyTime=${safetyTime}&studentNumber=${studentNumber}">
                                    <i class="ace-icon fa fa-step-forward middle"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
            </div>
        </div>
    </div>
</div><!-- /.main-container -->

<!-- basic scripts -->

<!--[if !IE]> -->
<script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.4.min.js"></script>

<!-- <![endif]-->

<!--[if IE]>
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
<script type="text/javascript">
    if ('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath}/assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
</script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->

<!--[if lte IE 8]>
<script src="${pageContext.request.contextPath}/assets/js/excanvas.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath}/assets/js/jquery-ui.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.ui.touch-punch.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/chosen.jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/spinbox.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-timepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/daterangepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.knob.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/autosize.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.inputlimiter.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.maskedinput.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap-tag.min.js"></script>

<!-- ace scripts -->
<script src="${pageContext.request.contextPath}/assets/js/ace-elements.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/ace.min.js"></script>

<!-- inline scripts related to this page -->
<script type="text/javascript">
    $(function(){
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/getType.action",
            success: function(data)
            {
                var contentRules="";
                var  contentInformation="";
                var contentImport="";

                for (var i=0;i<data.length;i++)
                {
                    contentRules+="      <li>" +
                        "                            <a href=\"${pageContext.request.contextPath}/"+data[i].rulesurl+".action\">" +
                        "                                <i class=\"menu-icon fa fa-caret-right\"></i>"+data[i].typename+"" +
                        "                            </a>" +
                        "                            <b class=\"arrow\"></b>" +
                        "                        </li>";
                    contentInformation+="       <li>" +
                        "                        <a href=\"${pageContext.request.contextPath}/"+data[i].informationurl+".action\">" +
                        "                            <i class=\"menu-icon fa fa-caret-right\"></i> "+data[i].typename+"" +
                        "                        </a>" +
                        "                        <b class=\"arrow\"></b>" +
                        "                    </li>";
                    if(data[i].importtype!=""&&data[i].importtype!=null)
                    {
                        contentImport+="     <li>" +
                            "                        <a href=\"${pageContext.request.contextPath}/"+data[i].importtype+".action\">" +
                            "                            <i class=\"menu-icon fa fa-caret-right\"></i> "+data[i].typename+"" +
                            "                        </a>" +
                            "" +
                            "                        <b class=\"arrow\"></b>" +
                            "                    </li>";
                    }
                }
                $("#typeListInformationUrl").html(contentInformation);
                $("#typeListRulesUrl").html(contentRules);
                $("#typeImport").html(contentImport);
            },
            fail:function () {
                alert("获取信息列表失败!");
            }
        });
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/getYears.action",
            success: function(data)
            {
                var content="";
                content="<option  value=''>请选择</option>";
                for (var i=0;i<data.length;i++)
                {
                    content+="<option  value='"+data[i].schoolyear+"'>"+data[i].schoolyear+"</option>";
                }
                $("#date").html(content);
            },
            fail:function () {
                alert("获取年份列表失败!");
            }
        });
    });
    function  searchButtonClick() {
        $("#searchForm").toggle();
    }
</script>
</body>
</html>
