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
            <a href="${pageContext.request.contextPath}/getStudent.action" class="navbar-brand">
                <small>
                    <i class="fa fa-leaf"></i>
                    创新创业学分系统
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
									${admin.adminname}
								</span>

                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="${pageContext.request.contextPath}/changePassword.action">
                                <i class="ace-icon fa fa-cog"></i>
                                修改密码
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="${pageContext.request.contextPath}/exist.action">
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
                    <li class="active">     <a href="#">创办企业</a></li>
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
                        <a  class="white" href="${pageContext.request.contextPath}/enterprise.action">
                            <button type="button" class="btn btn-sm btn-primary"  name="addButton" id="back">
                                <span class="ace-icon fa fa-backward icon-on-right bigger-110">返回</span>
                            </button></a>
                    </div>
                    <div class="col-sm-1">
                        <button type="button" onclick="importInformation();" class="btn btn-sm btn-primary" id="importButton">
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
                              action="${pageContext.request.contextPath}/enterprise.action">
                            <div class="form-group">
                                <label class="col-sm-1 control-label no-padding-right"  for="faculty">
                                    学院
                                </label>
                                <div class="col-sm-2">
                                    <select id="faculty" class="form-control"  onchange="getMajor();" name="faculty" readonly>
                                    </select>
                                </div>
                                <label class="col-sm-1 control-label no-padding-right"  for="major">
                                    专业
                                </label>
                                <div class="col-sm-2">
                                    <select id="major" class="form-control" onchange="getGrade();"  name="major" readonly>
                                    </select>
                                </div>
                                <label class="col-sm-1 control-label no-padding-right"  for="grade">
                                    班级
                                </label>
                                <div class="col-sm-1">
                                    <select id="grade" class="form-control"   name="grade" readonly>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">

                                <label class="col-sm-1 control-label no-padding-right " for="date">成立日期</label>
                                <div class="col-sm-1">
                                    <select id="date" class="form-control"   name="enterpriseTime" readonly>
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

                        </form>
                    </div>
                </div>

            </div>

            <div class="table-responsive">
                <table id="dynamic-table" class="table table-striped table-bordered table-hover text-nowrap">
                    <thead>
                    <tr>
                        <th class="center">学号</th>
                        <th class="center">姓名</th>
                        <th class="center">学院</th>
                        <th class="center">专业</th>
                        <th class="center">班级</th>
                        <th class="center">统一社会信用代码</th>
                        <th class="center">企业名称</th>
                        <th class="center">企业类型</th>
                        <th class="center">等级</th>
                        <th class="center">住所</th>
                        <th class="center">法定代表人</th>
                        <th class="center">成立日期</th>
                        <th class="center">经营范围</th>
                        <th class="center">股东名称</th>
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
                                <td class="center">${item.facultyname}</td>
                                <td class="center">${item.majorname}</td>
                                <td class="center">${item.gradename}</td>
                                <td class="center">${item.enterpriseid}</td>
                                <td class="center">${item.enterprisename}</td>
                                <td class="center">${item.enterprisetype}</td>
                                <td class="center">${item.rank}</td>
                                <td class="center">${item.residence}</td>
                                <td class="center">${item.representative}</td>
                                <td class="center">${item.enterprisetime}</td>
                                <td class="center">${item.businessscope}</td>
                                <td class="center">${item.shareholder}</td>
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
                                <a href="${pageContext.request.contextPath}/enterprise.action?currentPage=1&studentNumber=${studentNumber}&enterpriseType=${enterpriseType}&enterpriseTime=${enterpriseTime}"><i class="ace-icon fa fa-step-backward middle"></i></a>
                            </li>

                            <li >

                                <a href="${pageContext.request.contextPath}/enterprise.action?currentPage=${pageBean.currentPage-1}&studentNumber=${studentNumber}&enterpriseType=${enterpriseType}&enterpriseTime=${enterpriseTime}"> <i class="ace-icon fa fa-caret-left bigger-140 middle"></i> </a>

                            </li>

                            <li>
													<span>
														<input value="${pageBean.currentPage}" maxlength="3" type="text" readonly="readonly" />
													</span>
                            </li>

                            <li>
                                <a href="${pageContext.request.contextPath}/enterprise.action?currentPage=${pageBean.currentPage+1}&studentNumber=${studentNumber}&enterpriseType=${enterpriseType}&enterpriseTime=${enterpriseTime}">
                                    <i class="ace-icon fa fa-caret-right bigger-140 middle"></i>
                                </a>
                            </li>

                            <li>
                                <a href="${pageContext.request.contextPath}/enterprise.action?currentPage=${pageBean.totalPage}&studentNumber=${studentNumber}&enterpriseType=${enterpriseType}&enterpriseTime=${enterpriseTime}">
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
            error:function () {
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
            error:function () {
                alert("获取年份列表失败!");
            }
        });
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/getFaculty.action",
            success: function(data)
            {
                var content="";
                content="<option  value=''>请选择</option>";
                for (var i=0;i<data.length;i++)
                {
                    content+="<option  value='"+data[i].facultyname+"'>"+data[i].facultyname+"</option>";
                }
                $("#faculty").html(content);
            },
            error:function () {
                alert("获取学院列表失败!");
            }
        });
    });
    function  searchButtonClick() {
        $("#searchForm").toggle();
    }
    function  getMajor() {
        var faculty=$("#faculty").val();

        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/getMajor.action",
            data:"faculty="+faculty,
            success: function(data)
            {

                var content="";
                content="<option  value=''>请选择</option>";
                for (var i=0;i<data.length;i++)
                {
                    content+="<option  value='"+data[i].majorname+"'>"+data[i].majorname+"</option>";
                }
                $("#major").html(content);
            },
            error:function () {
                alert("获取班级列表失败!");
            }
        });
    }
    function  getGrade() {
        var major=$("#major").val();
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/getGrade.action",
            data:"major="+major,
            success: function(data)
            {
                var content="";
                content="<option  value=''>请选择</option>";
                for (var i=0;i<data.length;i++)
                {
                    content+="<option  value='"+data[i].gradename+"'>"+data[i].gradename+"</option>";
                }
                $("#grade").html(content);
            },
            error:function () {
                alert("获取专业列表失败!");
            }
        });
    }
    function importInformation()
    {
        var faculty=$("#faculty").val();
        var  major=$("#major").val();
        if (major==null)
        {
            major="";
        }
        var grade=$("#grade").val();
        if(grade==null)
        {
            grade="";
        }
        var  date=$("#date").val();
        var url="enterpriseDownload.action?"+"faculty="+faculty+"&"+"major="+major+"&"+"grade="+grade+"&"+"date="+date+"&"+"name=创办企业";
        window.open(url);
    }
</script>
</body>
</html>
