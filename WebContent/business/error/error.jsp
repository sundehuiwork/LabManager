<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>故障分析</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>故障分析查询</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="frmQry">
							<div class="form-group">
								<label class="col-sm-2 control-label">故障类型:</label>
								<div class="col-sm-4">
									<select name="equinorg" class="form-control m-b" >
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmQry.equinorg=='1'?'selected':''}>网络设备</option>
										<option value='2' ${frmQry.equinorg=='2'?'selected':''}>硬件设备</option>
									</select>
								</div>
								<label class="col-sm-2 control-label">故障优先级:</label>
								<div class="col-sm-4">
									<select name="equinorg" class="form-control m-b" >
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmQry.equinorg=='1'?'selected':''}>错误</option>
										<option value='2' ${frmQry.equinorg=='2'?'selected':''}>警告</option>
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
						<h5>故障分析列表</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<div class="container-fluid">

							<div class="row-fluid">
								<div class="span12">
									<table class="table table-hover">
										<thead>
											<tr>
											<th></th>
												<th>故障类别</th>
												<th>设备类别</th>
												<th>故障时间</th>
												<th>故障描述</th>
												<th>故障分析</th>
												<th>故障源</th>
											</tr>
										</thead>
										<tbody>
										<tr>
											<td></td>
											<td><span class="pie">错误</span></td>
											<td><span class="pie">网络设备</span></td>
											<td><span class="pie">2015-01-30 23:00:12</span></td>
											<td><span class="pie">ping失败</span></td>
											<td><span class="pie">网络故障</span></td>
											<td><span class="pie">交换机</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">警告</span></td>
											<td><span class="pie">硬件设备</span></td>
											<td><span class="pie">2016-03-30 01:30:10</span></td>
											<td><span class="pie">io读写缓慢</span></td>
											<td><span class="pie">硬件过热</span></td>
											<td><span class="pie">was服务器</span></td>
										</tr>
										
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
	<script>
    </script>
</body>
</html>