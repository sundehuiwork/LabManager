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
                        <h5>网络设备配置管理</h5> 
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
                                 <label class="col-sm-2 control-label"><em>*	</em>设备名称:</label>
                                <div class="col-sm-4">
                                    <input id="equname" name="equname"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equname}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equmodel"><em>*</em>设备类型:</label>
                                <div class="col-sm-4">
                                     <input id="equmodel" name="equmodel"  type="text" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equmodel}">
                                </div>
                                 <label class="col-sm-2 control-label"><em>*</em>采集间隔:</label>
                                <div class="col-sm-4">
                                    <input id="equspec" name="equspec"  type="text" class="form-control" class="form-control"  placeholder="必填" required data-msg-required="不能为空" value="${frmvo.equspec}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label" for="equcountry">差异告警:</label>
                                <div class="col-sm-4">
                                     <input id="equcountry" name="equcountry"  type="text" class="form-control"   value="${frmvo.equcountry}">
                                </div>
                                 <label class="col-sm-2 control-label">备份文件数:</label>
                                <div class="col-sm-4">
                                    <input id="equamount" name="equamount"  type="text" class="form-control" class="form-control"   value="${frmvo.equamount}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">首次备份时间:</label>
                                <div class="col-sm-4">
                                   <input type="date" name="outdate" class="form-control" value="${frmvo.outdate}"/>
                                </div>
                                 <label class="col-sm-2 control-label">最后备份时间:</label>
                                <div class="col-sm-4">
                                    <input type="date" name="outdate1" class="form-control" value="${frmvo.outdate1}"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label"><em>*</em>最后一次备份状态:</label>
                                <div class="col-sm-4">
                                    <select name="equinorg" class="form-control m-b"  placeholder="必填" required data-msg-required="不能为空">
								    	<option value='' > 请选择...</option>
										<option value='1' ${frmvo.equinorg=='1'?'selected':''}>正常</option>
										<option value='2' ${frmvo.equinorg=='2'?'selected':''}>失败</option>
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
     <script type="text/javascript" src="${pageContext.request.contextPath}/business/special/network/network0001.js"></script>
</body>

</html>