<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>网络设备配置管理</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>网络设备配置管理查询</h5>
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
								<label class="col-sm-2 control-label">IP:</label>
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
						<h5>网络设备配置管理查询结果列表</h5>
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
												<th>IP地址</th>
												<th>设备名称</th>
												<th>设备类型</th>
												<th>采集间隔</th>
												<th>差异告警</th>
												<th>备份文件数</th>
												<th>首次备份时间</th>
												<th>最后备份时间</th>
												<th>最后一次备份状态</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<core:forEach items="${frmList}" var="frmList">
												<tr>
												<td></td>
													<td><span class="pie">${frmList.ip}</span></td>
													<td><span class="pie">${frmList.equname}</span></td>
													<td><span class="pie">${frmList.equmodel}</span></td>
													<td><span class="pie">${frmList.equspec}</span></td>
													<td><span class="pie">${frmList.equcountry}</span></td>
													<td><span class="pie">${frmList.equamount}</span></td>
													<td><span class="pie">${frmList.outdate}</span></td>
													<td><span class="pie">${frmList.outdate1}</span></td>
													<td><select name="type" disabled="disabled" >
															<option value='' > 请选择...</option>
															<option value='1' ${frmList.equinorg=='1'?'selected':''}>成功</option>
															<option value='2' ${frmList.equinorg=='2'?'selected':''}>失败</option>
													</select></td>
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/business/special/network/network0000.js"></script>
	<script>
    </script>
</body>
</html>