<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>设备借用</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>设备借用查询</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="frmQry">
							<div class="form-group">
								<label class="col-sm-2 control-label">设备名称:</label>
								<div class="col-sm-4">
									<input id="equname" name="equname" type="text"
										class="form-control" required aria-required="true" value="${frmQry.equname}">
								</div>
								<label class="col-sm-2 control-label">借用时间:</label>
								<div class="col-sm-4">
									<input id="equindate" name="equindate" type="text"
										class="form-control" required aria-required="true" value="${frmQry.equindate}">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">设备所属实验室:</label>
								<div class="col-sm-4">
									<select name="equinorg" class="form-control m-b" >
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmQry.equinorg=='1'?'selected':''}>实验室一</option>
										<option value='2' ${frmQry.equinorg=='2'?'selected':''}>实验室二</option>
										<option value='3' ${frmQry.equinorg=='3'?'selected':''}>实验室三</option>
										<option value='4' ${frmQry.equinorg=='4'?'selected':''}>实验室四</option>
										<option value='5' ${frmQry.equinorg=='5'?'selected':''}>实验室五</option>
									</select>
								</div>
								<label class="col-sm-2 control-label">设备状态:</label>
								<div class="col-sm-4">
									<select name="status" class="form-control m-b" >
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmQry.status=='1'?'selected':''}>可借用</option>
										<option value='2' ${frmQry.status=='2'?'selected':''}>已借用</option>
									</select>
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
						<h5>设备借用查询结果列表</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="container-fluid">

							<div class="row-fluid">
								<div class="span12">
									<button class="btn" type="button" onclick="doAdd()">新增</button>
									<table class="table table-hover">
										<thead>
											<tr>
											<th></th>
												<th>设备编码</th>
												<th>设备名称</th>
												<th>设备型号</th>
												<th>设备规格</th>
												<th>入库时间</th>
												<th>设备所属实验室</th>
												<th>设备状态</th>
												<th>借用时间</th>
												<th>借用人</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<core:forEach items="${frmList}" var="frmList">
												<tr>
												<td></td>
													<td><span class="pie">${frmList.equnum}</span></td>
													<td><span class="pie">${frmList.equname}</span></td>
													<td><span class="pie">${frmList.equmodel}</span></td>
													<td><span class="pie">${frmList.equspec}</span></td>
													<td><span class="pie">${frmList.equindate}</span></td>
													<td><select name="type" disabled="disabled" >
															<option value='' > 请选择...</option>
															<option value='1' ${frmList.equinorg=='1'?'selected':''}>实验室一</option>
															<option value='2' ${frmList.equinorg=='2'?'selected':''}>实验室二</option>
															<option value='3' ${frmList.equinorg=='3'?'selected':''}>实验室三</option>
															<option value='4' ${frmList.equinorg=='4'?'selected':''}>实验室四</option>
															<option value='5' ${frmList.equinorg=='5'?'selected':''}>实验室五</option>
													</select></td>
													<td><select name="status" disabled="disabled" >
															<option value='' > 请选择...</option>
															<option value='1' ${frmList.status=='1'?'selected':''}>可借用</option>
															<option value='2' ${frmList.status=='2'?'selected':''}>已借用</option>
													</select></td>
													<td><span class="pie">${frmList.equoutdate}</span></td>
													<td><span class="pie">${frmList.equoutperson}</span></td>
													<td><c:if  test="${frmList.status==1}"> <a onclick="doEdit('${frmList.id}','2')">借用</a></c:if></td>
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/business/equipment/equout/equout0000.js"></script>
	<script>
    </script>
</body>
</html>