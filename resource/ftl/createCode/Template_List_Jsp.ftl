<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>H+ 后台主题UI框架 - 主页</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">
	<script type="text/javascript" src="${r"${pageContext.request.contextPath}"}/business/frm/${objectNameLower}/${objectNameLower}0000.js"></script>
</head>

<body class="gray-bg">
    <div class="container-fluid" style="padding: 15px;">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>用户查询</h5> 
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form class="form-horizontal" id="frmQry">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">用户编码:</label>
                                <div class="col-sm-4">
                                    <input id="user_code" name="user_code"  type="text" class="form-control" required="11" aria-required="true">
                                </div>
                                 <label class="col-sm-2 control-label">用户名称:</label>
                                <div class="col-sm-4">
                                    <input id="user_name" name="user_name"  type="text" class="form-control" required="11" aria-required="true">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">备注：</label>
                                <div class="col-sm-10">
                                    <input id="cemail" type="email" class="form-control" name="remark" required="" aria-required="true">
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
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
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
						<th>
							序号
						</th>
						<#list fieldList as var>
							<th>${var[2]}</th>
						</#list>
					</tr>
				</thead>
				<tbody>
					<core:forEach items="${r"${frmList}"}" var="frmList">
						<tr>
							<td><input type="checkbox" class="i-checks"
								name="input[]" value=""></td>
								<#list fieldList as var>
										<td>${r"${frmList."}${var[0]}${r"}"}</td>
								</#list>
						</tr>
					</core:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <script src="${r"${pageContext.request.contextPath}"}/assets/js/content.min.js?v=1.0.0"></script>
    <script src="${r"${pageContext.request.contextPath}"}/assets/js/plugins/validate/jquery.validate.min.js"></script>
    <script src="${r"${pageContext.request.contextPath}"}/assets/js/plugins/validate/messages_zh.min.js"></script>
    <script src="${r"${pageContext.request.contextPath}"}/assets/js/demo/form-validate-demo.min.js"></script>
    <script>
    </script>
</body>

</html>