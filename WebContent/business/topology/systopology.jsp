<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>系统拓扑管理</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>系统拓扑管理查询</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="frmQry">
							<div class="form-group">
								<label class="col-sm-2 control-label">设备IP:</label>
								<div class="col-sm-4">
									<input id="equname" name="equname" type="text"
										class="form-control" required aria-required="true" value="${frmQry.equname}">
								</div>
								<label class="col-sm-2 control-label">设备描述:</label>
								<div class="col-sm-4">
									<input id="equindate" name="equindate" type="text"
										class="form-control" required aria-required="true" value="${frmQry.ip}">
								</div>
							</div>
							<div class="row-fluid">
								<div class="span12 col-sm-offset-10">
									<button class="btn" type="button" onclick="doQry()">查询</button>
									<button class="btn" type="button" onclick="doReset()">清空</button>
								</div>
							</div>
						</form>
					</div>
				</div>


				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>系统拓扑管理结果列表</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="container-fluid">

							<div class="row-fluid">
								<div class="span12">
									<button class="btn" type="button" onclick="doAdd()">新增设备</button>
									<table class="table table-hover">
										<thead>
											<tr>
											<th></th>
												<th>IP地址</th>
												<th>名称</th>
												<th>操作系统</th>
												<th>等级管理</th>
												<th>硬件厂商</th>
												<th>购买此批</th>
												<th>设备标识</th>
												<th>标识</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<core:forEach items="${frmList}" var="frmList">
												<tr>
												<td></td>
													<td><span class="pie">${frmList.ip}</span></td>
													<td><span class="pie">${frmList.equname}</span></td>
													<td>
											<select name="equmodel" disabled="disabled"  >
										<option value='1' ${frmList.equmodel=='1'?'selected':''}>Linux</option>
										<option value='2' ${frmList.equmodel=='2'?'selected':''}>Aix</option>
											</select>
													</td>
													<td><select name="equspec" disabled="disabled">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmList.equspec=='1'?'selected':''}>优先</option>
										<option value='2' ${frmList.equspec=='2'?'selected':''}>劣后</option>
									</select></td>
													<td><select name="equcountry" disabled="disabled">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmList.equcountry=='1'?'selected':''}>英特尔</option>
										<option value='2' ${frmList.equcountry=='2'?'selected':''}>IBM</option>
										<option value='3' ${frmList.equcountry=='2'?'selected':''}>微软</option>
										<option value='4' ${frmList.equcountry=='2'?'selected':''}>浪潮</option>
									</select></td>
													<td><span class="pie">${frmList.equamount}</span></td>
													<td><span class="pie">${frmList.equcountry}</span></td>
													<td><span class="pie">${frmList.equamount}</span></td>
													<td><a onclick="doEdit('${frmList.id}')">修改</a>&nbsp;&nbsp;<a onclick="doDel('${frmList.id}')">删除</a></td>
												</tr>
											</core:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!-- 分页栏开始 -->
							<%@include file="/common/PageRoll.jsp"%>
							<!-- 分页栏结束 -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 公用js开始 -->
	<%@include file="/common/commonjs.jsp"%>
	<!-- 公用js结束 -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/business/topology/systopology.js"></script>
	<script>
    </script>
</body>
</html>