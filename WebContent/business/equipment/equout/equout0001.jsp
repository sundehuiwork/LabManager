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
                        <h5>设备入库</h5> 
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form class="form-horizontal"  id="frmEdit">
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equnum"><em>*</em>设备编号:</label>
                                <div class="col-sm-4">
                                     <input id="equnum" name="equnum"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equnum}">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*	</em>设备名称:</label>
                                <div class="col-sm-4">
                                    <input id="equname" name="equname"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equname}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equmodel"><em>*</em>设备型号:</label>
                                <div class="col-sm-4">
                                     <input id="equmodel" name="equmodel"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equmodel}">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>设备规格:</label>
                                <div class="col-sm-4">
                                    <input id="equspec" name="equspec"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equspec}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equcountry">设备国别:</label>
                                <div class="col-sm-4">
                                     <input id="equcountry" name="equcountry"  type="text" class="form-control"   value="${frmvo.equcountry}">
                                </div>
                                 <label class="col-sm-2 control-label">设备单价:</label>
                                <div class="col-sm-4">
                                    <input id="equamount" name="equamount"  type="text" class="form-control" class="form-control"   value="${frmvo.equamount}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">出厂日期:</label>
                                <div class="col-sm-4">
                                   <input type="date" name="outdate" class="form-control" value="${frmvo.outdate}"/>
                                </div>
                                 <label class="col-sm-2 control-label">出厂号:</label>
                                <div class="col-sm-4">
                                    <input id="outnum" name="outnum"  type="text" class="form-control" value="${frmvo.outnum}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*</em>入库日期:</label>
                                <div class="col-sm-4">
                                   <input type="date" name="equindate" class="form-control" value="${frmvo.equindate}"  placeholder="必填" required data-msg-required="不能为空"/>
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>入库人:</label>
                                <div class="col-sm-4">
                                    <input id="equinperson" name="equinperson"  type="text" class="form-control" value="${frmvo.equinperson}"  placeholder="必填" required data-msg-required="不能为空">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*</em>设备入库实验室:</label>
                                <div class="col-sm-4">
                                    <select name="equinorg" class="form-control m-b"  placeholder="必填" required data-msg-required="不能为空">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmvo.equinorg=='1'?'selected':''}>实验室一</option>
										<option value='2' ${frmvo.equinorg=='2'?'selected':''}>实验室二</option>
										<option value='3' ${frmvo.equinorg=='3'?'selected':''}>实验室三</option>
										<option value='4' ${frmvo.equinorg=='4'?'selected':''}>实验室四</option>
										<option value='5' ${frmvo.equinorg=='5'?'selected':''}>实验室五</option>
									</select>
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
     <script type="text/javascript" src="${pageContext.request.contextPath}/business/equipment/equout/equout0001.js"></script>
</body>

</html>