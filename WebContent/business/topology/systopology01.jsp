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
                        <h5>添加主机</h5> 
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form class="form-horizontal"  id="frmEdit">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equnum"><em>*</em>IP地址:</label>
                                <div class="col-sm-4">
                                     <input id="ip" name="ip"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.ip}">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>名称:</label>
                                <div class="col-sm-4">
                                    <input id="equname" name="equname"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equname}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equmodel"><em>*</em>操作系统:</label>
                                <div class="col-sm-4">
                                	<select name="equmodel" class="form-control m-b"  placeholder="必填" required data-msg-required="不能为空">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmvo.equmodel=='1'?'selected':''}>Linux</option>
										<option value='2' ${frmvo.equmodel=='2'?'selected':''}>Aix</option>
									</select>
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>等级管理:</label>
                                <div class="col-sm-4">
                                	<select name="equspec" class="form-control m-b"  placeholder="必填" required data-msg-required="不能为空">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmvo.equspec=='1'?'selected':''}>优先</option>
										<option value='2' ${frmvo.equspec=='2'?'selected':''}>劣后</option>
									</select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equcountry">硬件厂商:</label>
                                <div class="col-sm-4">
                                	<select name="equcountry" class="form-control m-b"  placeholder="必填" required data-msg-required="不能为空">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmvo.equcountry=='1'?'selected':''}>英特尔</option>
										<option value='2' ${frmvo.equcountry=='2'?'selected':''}>IBM</option>
										<option value='3' ${frmvo.equcountry=='2'?'selected':''}>微软</option>
										<option value='4' ${frmvo.equcountry=='2'?'selected':''}>浪潮</option>
									</select>
                                </div>
                                 <label class="col-sm-2 control-label">购买批次:</label>
                                <div class="col-sm-4">
                                    <input id="equamount" name="equamount"  type="text" class="form-control" class="form-control"   value="${frmvo.equamount}">
                                </div>
                            </div>
						</form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>访问参数</h5> 
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form class="form-horizontal"  id="frmEdit11">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equnum"><em>*</em>SSH用户名:</label>
                                <div class="col-sm-4">
                                     <input id="ip" name="ip"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="root">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equmodel"><em>*</em>SSH密码:</label>
                                <div class="col-sm-4">
                                     <input id="equmodel" name="equmodel"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equspec">SSH端口:</label>
                                <div class="col-sm-4">
                                     <input id="equspec" name="equspec"  type="text" class="form-control"   value="22">
                                </div>
                            </div>
                            <div class="row-fluid">
								<div class="span12 col-sm-offset-10">
									 <button class="btn" type="button" onclick="doTest()">保存</button>
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
     <script type="text/javascript" src="${pageContext.request.contextPath}/business/topology/systopology01.js"></script>
</body>

</html>