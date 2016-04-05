<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>H+ 后台主题UI框架 - 主页</title>
</head>
<body class="gray-bg">
	<div class="container-fluid" style="padding: 15px;">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>用户查询</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="frmQry">
							<div class="form-group">
								<label class="col-sm-2 control-label">用户编码:</label>
								<div class="col-sm-4">
									<input id="user_code" name="user_code" type="text"
										class="form-control" required="11" aria-required="true">
								</div>
								<label class="col-sm-2 control-label">用户名称:</label>
								<div class="col-sm-4">
									<input id="user_name" name="user_name" type="text"
										class="form-control" required="11" aria-required="true">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">备注：</label>
								<div class="col-sm-10">
									<input id="cemail" type="email" class="form-control"
										name="remark" required="" aria-required="true">
								</div>
							</div>
							<div class="row-fluid">
								<div class="span12 col-sm-offset-10">
									<button class="btn" type="button" onclick="doQry()">查询</button>
									<button class="btn" type="reset">清空</button>
								</div>
							</div>
						</form>
					</div>
				</div>


				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>用户查询结果列表</h5>
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
									<button class="btn" type="button" onclick="doEdit()">修改</button>
									<button class="btn" type="button" onclick="doDel()">删除</button>
									<button class="btn" type="button" onclick="doShow()">查看</button>
									<table class="table">
										<thead>
											<tr>
												<th>序号</th>
												<th>用户编码</th>
												<th>用户名称</th>
												<th>用户级别</th>
												<th>状态</th>
											</tr>
										</thead>
										<tbody>
											<core:forEach items="${frmList}" var="frmList">
												<tr>
													<td><input type="checkbox" class="i-checks"
														name="input[]" value="${frmList.id}"></td>
													<td><span class="pie">${frmList.user_code}</span></td>
													<td><span class="pie">${frmList.user_name}</span></td>
													<td><select name="user_status"
														value="${frmList.operate_status}" disabled="disabled">
															<option value=''></option>
															<option value='0'
																${frmList.operate_status=='0'?'selected':''}>管理员</option>
															<option value='1'
																${frmList.operate_status=='1'?'selected':''}>普通用户</option>
													</select></td>
													<td><select name="user_status"
														value="${frmList.user_status}" disabled="disabled">
															<option value=''></option>
															<option value='0'
																${frmList.user_status=='0'?'selected':''}>正常</option>
															<option value='1'
																${frmList.user_status=='1'?'selected':''}>停用</option>
													</select></td>

												</tr>
											</core:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<div class="row-fluid">
								<form id="PageRoll">
									<div class="col-sm-4"
										style="margin: 20px 0; display: inline-block; padding: 6px 12px;"
										align="right">
										第${PageRoll.currpage}页/共${PageRoll.sumpage}页 <input
											id="sumsize" name="sumsize" type="hidden"
											value="${PageRoll.sumsize}"> <input id="currpage"
											name="currpage" type="hidden" value="${PageRoll.currpage}">
										<input id="sumpage" name="sumpage" type="hidden"
											value="${PageRoll.sumpage}"> &nbsp; &nbsp; 每页显示： <select
											name="pagesize" onchange="selecPageSize()">
											<option value='10' ${PageRoll.pagesize=='10'?'selected':''}>10</option>
											<option value='20' ${PageRoll.pagesize=='20'?'selected':''}>20</option>
											<option value='50' ${PageRoll.pagesize=='50'?'selected':''}>50</option>
										</select> 条 /共${PageRoll.sumsize}条
									</div>
									<div class="col-sm-8">
										<ul class="pagination">
											<li><a onclick="FirstPage()">&laquo;</a></li>
											<li><a onclick="PreviPage()">&lsaquo;</a></li>
											<li><span>......</span></li>
											<li><a onclick="NextPage()">&rsaquo;</a></li>
											<li><a onclick="EndPage()">&raquo;</a></li>

										</ul>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="/common/commonjs.jsp"%>
	<script type="text/javascript" src="${pageContext.request.contextPath}/business/frm/user/user0000.js"></script>
	<script>
    </script>
</body>
</html>