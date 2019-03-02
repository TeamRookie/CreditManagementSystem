<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<style type="text/css">
body {
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
	white-space: normal;
}
</style>
</head>
<body>
	<div>

		<div>
			<h2 style="text-align: center;">大连大学创新创业学分成绩单</h2>
			<table id="tfhover" class="tftable" border="1" style="margin: auto;width: 600px;	border-collapse: collapse;	border: 1px solid #444444;	text-align: center;">
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
					<td colspan="8" style="font-size: 12px"><b>总成绩</b></td>
					<td colspan="8" style="font-size: 12px"><b>${totalCredit}</b></td>
				</tr>
				<tr>
					<th colspan="1" style="font-size: 10px; text-align: center; with: 37.5px;">序号</th>
					<th colspan="3" style="font-size: 10px; text-align: center; with: 112.5px;">成绩类别</th>
					<th colspan="3" style="font-size: 10px; text-align: center; with: 112.5px;">时间</th>
					<th colspan="4" style="font-size: 10px; text-align: center; with: 150px;">名称</th>
					<th colspan="2" style="font-size: 10px; text-align: center; with: 75px;">获得学分</th>
					<th colspan="3" style="font-size: 10px; text-align: center; with: 112.5px;">该类得分</th>
				</tr>
				<#list creditList as credit>
					<#list credit.creditItem as item>
						<#if item_index+1 == 1 >
						<tr>
							<td style="with: 37.5px;" colspan="1" rowspan="${credit.creditItem?size}">${credit_index+1 }</td>
							<td style="with: 112.5px;" colspan="3" rowspan="${credit.creditItem?size}">${credit.typename}</td>
							<td style="with: 112.5px;" colspan="3">${item.itemtime}</td>
							<td style="with: 150px;" colspan="4">${item.itemname}
							</td>
							<td style="with: 75px;" colspan="2">${item.itemscore}</td>
							<td style="with: 112.5px;" colspan="3" rowspan="${credit.creditItem?size}">${credit.credit}</td>
						</tr>
						</#if>
						<#if item_index+1 != 1 >
						<tr>
							<td style="with: 112.5px;" colspan="3">${item.itemtime}</td>
							<td style="with: 150px;" colspan="4">${item.itemname}</td>
							<td style="with: 75px;" colspan="2">${item.itemscore}</td>
						</tr>
						</#if>
					</#list>
				</#list>
				<tr>
					<td colspan="8" style="font-size: 12px"><b>综合评定</b></td>
					<td colspan="8" style="font-size: 12px"><b>优秀</b></td>
				</tr>
				<tr>
					<td colspan="8"
						style="text-align: right; border-style: none; font-size: 12px;"></td>
					<td colspan="8"
						style="text-align: right; border-style: none; font-size: 12px; text-align: center">
						${.now?string("yyyy年MM月dd日")}<br />
						大连大学教务处 大连大学创新学院
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
