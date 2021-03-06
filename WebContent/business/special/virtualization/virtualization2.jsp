<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--公用样式开始  -->
<%@include file="/common/common.jsp"%>
<!-- 公共样式结束 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>虚拟机磁盘性能分析</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>虚拟机磁盘性能分析查询</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="frmQry">
							<div class="form-group">
								<label class="col-sm-2 control-label">虚拟机名称:</label>
								<div class="col-sm-4">
									<input id="equname" name="equname" type="text"
										class="form-control" required aria-required="true" value="${frmQry.equname}">
								</div>
								<label class="col-sm-2 control-label">虚拟机状态:</label>
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
						<h5>虚拟机磁盘性能分析结果列表</h5>
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
												<th>虚拟机磁盘名称</th>
												<th>位置</th>
												<th>当前读写速度</th>
												<th>平均读写速度</th>
												<th>读写峰值速度</th>
												<th>当前读写IO数</th>
												<th>平均每秒IO数</th>
												<th>每秒IO峰值数</th>
												<th>当前读写延迟</th>
												<th>平均读写延迟</th>
												<th>读写延迟峰值</th>
											</tr>
										</thead>
										<tbody>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机一</span></td>
											<td><span class="pie">Q</span></td>
											<td><span class="pie"></span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">22 ms</span></td>
											<td><span class="pie">21 ms</span></td>
											<td><span class="pie">22ms</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机一</span></td>
											<td><span class="pie">Q</span></td>
											<td><span class="pie"></span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">22 ms</span></td>
											<td><span class="pie">21 ms</span></td>
											<td><span class="pie">22ms</span></td>
										</tr>
										<tr>
											<td></td>
											<td><span class="pie">虚拟机一</span></td>
											<td><span class="pie">Q</span></td>
											<td><span class="pie"></span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">12341 KB/s</span></td>
											<td><span class="pie">22 ms</span></td>
											<td><span class="pie">21 ms</span></td>
											<td><span class="pie">22ms</span></td>
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