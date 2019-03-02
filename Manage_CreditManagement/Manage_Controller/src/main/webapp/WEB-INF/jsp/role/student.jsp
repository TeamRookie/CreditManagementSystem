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
									${admin.sname}
								</span>

                        <i class="ace-icon fa fa-caret-down"></i>
                    </a>

                    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="${pageContext.request.contextPath}/changePasswordById.action">
                                <i class="ace-icon fa fa-cog"></i>
                                修改密码
                            </a>
                        </li>
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
                    <li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">首页</a>
                    </li>
                    <li><a href="#">查看</a></li>
                    <li class="active"><a href="#">查看学生填写情况 </a></li>
                </ul>
                <!-- /.breadcrumb -->
            </div>

            <div class="page-content">

                <div class="col-xs-12">
                    <div class="clearfix">
                        <div class="pull-right tableTools-container"></div>
                    </div>
                    <div class="page-header">
                        <h1>学生填写情况</h1>
                    </div>
                </div>
                <!-- /.page-header -->

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                        <form id="conditionFrom" class="form-horizontal" role="form"method="post">

                            <div class="row">

                                <div class="form-group">
                                    <label class="col-sm-1 control-label no-padding-right">班级</label><!-- 自填  -->
                                    <div class="col-sm-3">
                                        <select name="undertake" id="undertake" required>
                                            <option value="">请选择</option>
                                        </select>
                                        <span id="undertakeError"></span>
                                    </div>

                                    <label class="col-sm-1 control-label no-padding-right">学号</label><!-- 自填 -->
                                    <div class="col-sm-3">
                                        <div class="clearfix">
                                            <input type="text" name="amount" id="amount"
                                                   style="width: auto;" required />
                                            <span id="amountError"></span>
                                        </div>
                                        <span id="amountError"></span>
                                    </div>

                                    <label class="col-sm-1 control-label no-padding-right">姓名</label><!-- 自填 -->
                                    <div class="col-sm-3">
                                        <div class="clearfix">
                                            <input type="text" name="amount" id="amount"
                                                   style="width: auto;" required />
                                            <span id="amountError"></span>
                                        </div>
                                        <span id="amountError"></span>
                                    </div>
                                </div>

                                <div class="space-4"></div>

                                <div class="col-xs-12">
                                    <!--右-->

                                    <div class="clearfix form-actions">
                                        <div class="col-md-offset-3 col-md-9">
                                            <button class="btn btn-info" type="submit" id="academicButton">
                                                <i class="ace-icon fa fa-check bigger-110"></i> 搜索
                                            </button>

                                            &nbsp; &nbsp; &nbsp;
                                            <button class="btn" type="reset">
                                                <i class="ace-icon fa fa-undo bigger-110"></i> 重置
                                            </button>
                                        </div>
                                    </div>

                                </div>
                                <script type="text/javascript">
                                    $("#conditionFrom").submit(function () {
                                        var form = new FormData(document.getElementById("academicFrom"));
                                        $.ajax({
                                            url:"${pageContext.request.contextPath}/faculty/condition.action",
                                            type: "POST",   //提交的方法
                                            async:true,
                                            contentType: false,
                                            processData: false,
                                            data:form,// 序列化表单值
                                            success:function(result){
                                                if(result == 'success'){
                                                    alert('添加成功');
                                                    $("#centerBody").load("${pageContext.request.contextPath}/student/conditionUI.action");
                                                }else{
                                                    alert('添加失败');
                                                }
                                            },
                                            error:function(){
                                                alert('请求失败');
                                                $("#centerBody").load("${pageContext.request.contextPath}/student/academicUI.action");
                                            },
                                            dataType:"text"
                                        });
                                        return false;
                                    });
                                </script>
                            </div>
                        </form>
                    </div>

                    <div>
                        <table id="dynamic-table"
                               class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <th class="center">学号</th>
                                <th class="center">姓名</th>
                                <th class="center">班级</th>
                                <th class="center">学分</th>
                                <th class="center" style="width:100px;">查看成绩单</th>
                            </tr>
                            </thead>

                            <tbody>

                             <C:forEach items="${pageBean.pageList}" var="item">
                                <tr>
                                    <td class="center">${academic.academictime}</td>
                                    <td class="center">${academic.theme }</td>
                                    <td class="center">${academic.address }</td>
                                    <td class="center">${academic.undertake }</td>
                                    <td class="center">${academic.amount }</td>
                                    <td class="center">${academic.teachername }</td>
                                    <td class="center">
                                        <div class="action-buttons">
                                            <a class="blue" href="#"onclick="delContest(${academic.id})">
                                                <span class="label label-sm label-danger arrowed-in">删除</span>
                                            </a>
                                        </div>
                                    </td>
                                </tr>
                            </C:forEach>
                            </tbody>
                        </table>
                        <script type="text/javascript">
                            function delContest(num){
                                $.ajax({
                                    url:"${pageContext.request.contextPath}/student/academicDel.action",
                                    type: "POST",   //提交的方法
                                    async:true,
                                    data:{"num":num},
                                    success:function(result){
                                        if(result == 'success'){
                                            alert('删除成功');
                                            $("#centerBody").load("${pageContext.request.contextPath}/student/academicUI.action");
                                        }else{
                                            alert('违法操作警告!');
                                        }
                                    },
                                    error:function(){
                                        alert("请求失败");
                                        $("#centerBody").load("${pageContext.request.contextPath}/student/academicUI.action");
                                    },
                                    dataType:"text"
                                });
                            }
                        </script>
                        <div class="message-footer clearfix">
                            <div class="pull-right">

                                &nbsp; &nbsp;
                                <ul class="pagination middle">
                                    <li><a
                                            href="#">
                                        <i class="ace-icon fa fa-step-backward middle"></i>
                                    </a></li>

                                    <li><a
                                            href="#">
                                        <i class="ace-icon fa fa-caret-left bigger-140 middle"></i>
                                    </a></li>

                                    <li><span> <input readonly="readonly"
                                                      value="1" maxlength="3" type="text" />
							</span></li>

                                    <li><a
                                            href="#">
                                        <i class="ace-icon fa fa-caret-right bigger-140 middle"></i>
                                    </a></li>

                                    <li><a
                                            href="#">
                                        <i class="ace-icon fa fa-step-forward middle"></i>
                                    </a></li>
                                </ul>
                            </div>
                        </div>
                    </div>

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
            url: "${pageContext.request.contextPath}/getAllDepartment.action",
            success: function(data)
            {
                var content="";
                content="<option  value=''>请选择</option>";
                for (var i=0;i<data.length;i++)
                {
                    content+="<option  value='"+data[i].department+"'>"+data[i].department+"</option>";
                }
                $("#academicDepartment").html(content);
            },
            error:function () {
                alert("获取组织单位列表失败!");
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
        var  department=$("#academicDepartment").val();
        var  date=$("#date").val();
        var url="academicDownload.action?"+"faculty="+faculty+"&"+"major="+major+"&"+"grade="+grade+"&"+"department="+department+"&"+"date="+date+"&"+"name=主持学术活动";
        alert(url);
        window.open(url);
    }
</script>
</body>
</html>
