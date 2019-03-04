<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<style type="text/css">
body {
	/* margin-left: 45px;
	margin-right: 45px; */
	font-family: Arial Unicode MS;
	font-size: 10px;
}

table {
	margin: auto;
	width: 600px;
	border-collapse: collapse;
	border: 1px solid #444444;
	text-align: center;
	table-layout: fixed;
}

th, td {
	border: 1px solid #444444;
	font-size: 10px;
	margin-left: 5px;
	white-space:nowrap;
	overflow:auto;
}
</style>
</head>
<div class="main-content-inner">
	<div class="breadcrumbs ace-save-state" id="breadcrumbs">

		<!-- /.breadcrumb -->
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                    <script type="text/javascript">
                    	$('#downloadId').click(function(){
                    		window.open("${pageContext.request.contextPath}/student/download.action");
                    	});
                    </script>
					<div class="error-container">
						<div class="well">
							<h3 style="text-align: center;">大连大学创新创业学分成绩单</h3>
							<table id="tfhover" class="tftable" border="1" style="margin: auto;border-collapse: collapse;	border: 1px solid #444444;	text-align: center;">

								<tr>
									<td colspan="3">姓名</td>
									<td colspan="5">${student.stuname}</td>
									<td colspan="3">学院</td>
									<td colspan="5">${student.facultyname}</td>
								</tr>
								<tr>
									<td colspan="3">学号</td>
									<td colspan="5">${student.num}</td>
									<td colspan="3">专业</td>
									<td colspan="5">${student.majorname}</td>
								</tr>
								<tr>
									<td colspan="3">班级</td>
									<td colspan="5">${student.gradename}</td>
									<td colspan="3">联系方式</td>
									<td colspan="5">${student.telphone}</td>
								</tr>
								<tr>
									<td colspan="8" style="font-size: 16px"><b>总成绩</b></td>
									<td colspan="8" style="font-size: 16px"><b>${totalCredit}</b></td>
								</tr>
								<tr>
									<th colspan="1" style="font-size: 15px; text-align: center; with: 37.5px;">序号</th>
									<th colspan="3" style="font-size: 15px; text-align: center; with: 112.5px;">成绩类别</th>
									<th colspan="3" style="font-size: 15px; text-align: center; with: 112.5px;">时间</th>
									<th colspan="4" style="font-size: 15px; text-align: center; with: 150px;">名称</th>
									<th colspan="2" style="font-size: 15px; text-align: center; with: 75px;">获得学分</th>
									<th colspan="3" style="font-size: 15px; text-align: center; with: 112.5px;">该类得分</th>
								</tr>
								<c:forEach items="${creditList}" var="credit" varStatus="i">
									<c:forEach items="${credit.creditItem}" var="item" varStatus="k">
										<c:if test="${k.count == 1 }">
										<tr>
											<td style="with: 37.5px;" colspan="1" rowspan="${fn:length(credit.creditItem)}">${i.count }</td><!-- 序号 -->
											<td style="with: 112.5px;" colspan="3" rowspan="${fn:length(credit.creditItem)}">${credit.typename}</td><!-- 成绩类别 -->
											<td style="with: 112.5px;" colspan="3">${item.itemtime}</td><!-- item.时间 -->
											<td style="with: 150px;" colspan="4">${item.itemname}</td><!-- item.名称 -->
											<td style="with: 75px;" colspan="2">${item.itemscore}</td><!-- item.获得学分 -->
											<td style="with: 112.5px;" colspan="3" rowspan="${fn:length(credit.creditItem)}">${credit.credit}</td><!-- 该类得分 -->
										</tr>
										</c:if>
										<c:if test="${k.count != 1 }">
										<tr>
											<td style="with: 112.5px;" colspan="3">${item.itemtime}</td><!-- item.时间 -->
											<td style="with: 150px;" colspan="4">${item.itemname}</td><!-- item.名称 -->
											<td style="with: 75px;" colspan="2">${item.itemscore}</td><!-- item.获得学分 -->
										</tr>
										</c:if>
									</c:forEach>
								</c:forEach>
								
								<tr>
									<td colspan="8" style="font-size: 16px"><b>综合评定</b></td>
									<td colspan="8" style="font-size: 16px"><b>优秀</b></td>
								</tr>
								<tr>
									<td colspan="8"
										style="text-align: right; border-style: none; font-size: 13px;"></td>
									<td colspan="8"
										style="text-align: right; border-style: none; font-size: 13px; text-align: center; line-height:20px;">
										2019年1月20日<br />
										大连大学教务处 大连大学创新学院
									</td>
								</tr>
							</table>
						</div>
						<!-- PAGE CONTENT ENDS -->
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
		</div>
	</div>



	<a href="#" id="btn-scroll-up"
		class="btn-scroll-up btn btn-sm btn-inverse"> <i
		class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
	</a>
</div>