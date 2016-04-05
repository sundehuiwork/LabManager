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
    <script type="text/javascript" src="${pageContext.request.contextPath}/business/frm/user/user0000.js"></script>

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
                        <form class="form-horizontal" action="${pageContext.request.contextPath}/sysuser/saveorupdate.action" id="frmEdit">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="user_code"><em>*	</em>用户编码:</label>
                                <div class="col-sm-4">
                                     <input id="user_code" name="user_code"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*	</em>用户名称:</label>
                                <div class="col-sm-4">
                                    <input id="user_name" name="user_name"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*	</em>密码:</label>
                                <div class="col-sm-4">
                                    <input id="password" name="password"  type="password" class="form-control" placeholder="新密码" required data-msg-required="不能为空">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*	</em>确认密码:</label>
                                <div class="col-sm-4">
                                    <input id="confirm_password" name="confirm_password"  type="password" class="form-control" placeholder="确认新密码" required equalTo="#password" data-msg-required="不能为空">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">用户类型:</label>
                                <div class="col-sm-4">
                                    <select name="operate_status" class="form-control m-b" >
								    					<option value='' > 请选择...</option>
														<option value='1'
															${frmQry.operate_status=='1'?'selected':''}>普通用户</option>
														<option value='0'
															${frmQry.operate_status=='0'?'selected':''}>管理员</option>
									</select>
                                </div>
                                 <label class="col-sm-2 control-label">性别:</label>
                                <div class="col-sm-4">
                                    <select name="operate_status" class="form-control m-b"  >
								    					<option value='' > 请选择...</option>
														<option value='1'
															${frmQry.operate_status=='1'?'selected':''}>男</option>
														<option value='0'
															${frmQry.operate_status=='0'?'selected':''}>女</option>
									</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">出生年月日:</label>
                                <div class="col-sm-4">
                                   <input type="date" name="user_date" class="form-control"/>
                                </div>
                                 <label class="col-sm-2 control-label">身份证号:</label>
                                <div class="col-sm-4">
                                    <input id="user_name" name="user_name"  type="text" class="form-control" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">联系方式:</label>
                                <div class="col-sm-4">
                                    <input id="user_code" name="user_code"  type="text" class="form-control" >
                                </div>
                                 <label class="col-sm-2 control-label">联系地址:</label>
                                <div class="col-sm-4">
                                    <input id="user_name" name="user_name"  type="text" class="form-control" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">用户单位：</label>
                                <div class="col-sm-10">
                                    <input id="cemail" type="email" class="form-control" name="email" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">备注：</label>
                                <div class="col-sm-10">
                                    <input id="cemail" type="email" class="form-control" name="email" >
                                </div>
                            </div>
							<div class="row-fluid">
								<div class="span12 col-sm-offset-10">
									 <button class="btn" type="button" onclick="doSave()">保存</button>
									 <button class="btn" type="button" onclick="doBack()">返回</button>
								</div>
							</div>
						</form>
                    </div>
                </div>
                
                
                
            </div>
        </div>
    </div>
    
    
    <script>
    </script>
</body>

</html>