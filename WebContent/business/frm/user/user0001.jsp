<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
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
                        <form class="form-horizontal"  id="frmEdit">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="usercode"><em>*</em>用户编码:</label>
                                <div class="col-sm-4">
                                     <input id="usercode" name="usercode"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.usercode}">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*	</em>用户名称:</label>
                                <div class="col-sm-4">
                                    <input id="username" name="username"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.usercode}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*	</em>密码:</label>
                                <div class="col-sm-4">
                                    <input id="password" name="password"  type="password" class="form-control" placeholder="新密码" required data-msg-required="不能为空" >
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>确认密码:</label>
                                <div class="col-sm-4">
                                    <input id="confirm_password" name="confirm_password"  type="password" class="form-control" placeholder="确认新密码" required equalTo="#password" data-msg-required="不能为空">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*</em>用户类型:</label>
                                <div class="col-sm-4">
                                    <select name="type" class="form-control m-b" required data-msg-required="不能为空">
								    					<option value='' > 请选择...</option>
														<option value='1'
															${frmvo.type=='1'?'selected':''}>普通用户</option>
														<option value='0'
															${frmvo.type=='0'?'selected':''}>管理员</option>
									</select>
                                </div>
                                 <label class="col-sm-2 control-label">性别:</label>
                                <div class="col-sm-4">
                                    <select name="gender" class="form-control m-b"  >
								    					<option value='' > 请选择...</option>
														<option value='1'
															${frmvo.gender=='1'?'selected':''}>男</option>
														<option value='0'
															${frmvo.gender=='0'?'selected':''}>女</option>
									</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">出生年月日:</label>
                                <div class="col-sm-4">
                                   <input type="date" name="birth" class="form-control" value="${frmvo.birth}"/>
                                </div>
                                 <label class="col-sm-2 control-label">身份证号:</label>
                                <div class="col-sm-4">
                                    <input id="cradnum" name="cradnum"  type="text" class="form-control" value="${frmvo.cradnum}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">联系方式:</label>
                                <div class="col-sm-4">
                                    <input id="tel" name="tel"  type="text" class="form-control" value="${frmvo.tel}">
                                </div>
                                 <label class="col-sm-2 control-label">联系地址:</label>
                                <div class="col-sm-4">
                                    <input id="user_name" name="user_name"  type="text" class="form-control" >
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">邮箱：</label>
                                <div class="col-sm-10">
                                    <input id="mail" type="email" class="form-control" name="mail" value="${frmvo.mail}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">备注：</label>
                                <div class="col-sm-10">
                                    <input id="remark"  class="form-control" name="remark" value="${frmvo.remark}">
                                </div>
                            </div>
							<div class="row-fluid">
								<div class="span12 col-sm-offset-10">
									 <button class="btn" type="submit" >保存</button>
									 <button class="btn" type="button" onclick="doBack()">返回</button>
								</div>
							</div>
						</form>
                    </div>
                </div>
                
                
                
            </div>
        </div>
    </div>
    <%@include file="/common/commonjs.jsp" %>
     <script type="text/javascript" src="${pageContext.request.contextPath}/business/frm/user/user0001.js"></script>
</body>

</html>