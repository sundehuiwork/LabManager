<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>虚拟网络分析</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>虚拟网络分析查询</h5>
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
								<label class="col-sm-2 control-label">设备类型:</label>
								<div class="col-sm-4">
									<select name="equinorg" class="form-control m-b" >
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmQry.equinorg=='1'?'selected':''}>交换机</option>
										<option value='2' ${frmQry.equinorg=='2'?'selected':''}>交换路由</option>
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
						<h5>虚拟网络分析列表</h5>
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
												<th>虚拟机名称</th>
												<th>状况</th>
												<th>当前流量</th>
												<th>平均流量</th>
												<th>流量峰值</th>
												<th>当前丢包数</th>
												<th>平均丢包数</th>
											</tr>
										</thead>
										<tbody>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机一</span></td>
											<td><span class="pie">正常</span></td>
											<td><span class="pie">5002 kb/s</span></td>
											<td><span class="pie">5000 kb/s</span></td>
											<td><span class="pie">9000 kb/s</span></td>
											<td><span class="pie">1 个/s</span></td>
											<td><span class="pie">12 个/s</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机二</span></td>
											<td><span class="pie">正常</span></td>
											<td><span class="pie">1231 kb/s</span></td>
											<td><span class="pie">3001 kb/s</span></td>
											<td><span class="pie">5293 kb/s</span></td>
											<td><span class="pie">10个/s</span></td>
											<td><span class="pie">3 个/s</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机三</span></td>
											<td><span class="pie">停用</span></td>
											<td><span class="pie">0 kb/s</span></td>
											<td><span class="pie">0 kb/s</span></td>
											<td><span class="pie">0 kb/s</span></td>
											<td><span class="pie">0 个/s</span></td>
											<td><span class="pie">0 个/s</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机四</span></td>
											<td><span class="pie">正常</span></td>
											<td><span class="pie">202 kb/s</span></td>
											<td><span class="pie">899 kb/s</span></td>
											<td><span class="pie">524 kb/s</span></td>
											<td><span class="pie">0 个/s</span></td>
											<td><span class="pie">9 个/s</span></td>
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