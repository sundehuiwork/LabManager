<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="/common/common.jsp" %>
<%
	//String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<base target='_self'>
		<title></title>
		<meta charset="utf-8" />
		<meta name="description" content="overview & stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	</head>
<body>
		
	<!-- 添加属性  -->
	<input type="hidden" name="hcdname" id="hcdname" value="" />
	<input type="hidden" name="msgIndex" id="msgIndex" value="" />
	<input type="hidden" name="dtype" id="dtype" value="String" />
	<input type="hidden" name="isQian" id="isQian" value="是" />
	<div id="dialog-add">
		<div class="commitopacity"></div>
	  	<div class="commitbox">
		  	<div class="commitbox_inner">
		        <div class="commitbox_top">
		        	<br/>
		        	<table>
		        		<tr>
		        			<td style="padding-left: 16px;text-align: right;">属性名：</td><td><input name="dname" id="dname" type="text" value="" placeholder="首字母必须为字母或下划线" title="属性名" /></td>
		        			<td style="padding-left: 16px;text-align: right;">属性类型：</td>
		        			<td style="padding-bottom: 6px;">
		        				<label style="float:left;padding-left: 20px;"><input name="form-field-radiot" id="form-field-radio1" onclick="setType('String');" type="radio" value="icon-edit" checked="checked"><span class="lbl">String</span></label>
								<label style="float:left;padding-left: 20px;"><input name="form-field-radiot" id="form-field-radio2" onclick="setType('Integer');" type="radio" value="icon-edit"><span class="lbl">Integer</span></label>
								<label style="float:left;padding-left: 20px;"><input name="form-field-radiot" id="form-field-radio3" onclick="setType('Date');" type="radio" value="icon-edit"><span class="lbl">Date</span></label>
							</td>
		        		</tr>
		        		<tr>
		        			<td style="padding-left: 16px;text-align: right;">其备注：</td><td><input name="dbz" id="dbz" type="text" value="" placeholder="例如 name的备注为 '姓名'" title="备注"/></td>
		        			<td style="padding-left: 16px;text-align: right;">前台录入：</td>
		        			<td style="padding-bottom: 6px;">
		        				<label style="float:left;padding-left: 20px;"><input name="form-field-radioq" id="form-field-radio4" onclick="isQian('是');" type="radio" value="icon-edit" checked="checked"><span class="lbl">是</span></label>
								<label style="float:left;padding-left: 20px;"><input name="form-field-radioq" id="form-field-radio5" onclick="isQian('否');" type="radio" value="icon-edit"><span class="lbl">否</span></label>
							</td>
		        		</tr>
		        		<tr>
		        			<td style="padding-left: 16px;text-align: right;">默认值：</td><td><input name="ddefault" id="ddefault" type="text" value="" disabled="disabled" placeholder="后台附加值时生效" title="默认值"/></td>
		        			<td style="padding-left: 16px;text-align: right;"></td>
		        			<td>
		        			<div class="commitbox_cen">
				                <div class="left" id="cityname"></div>
				                <div class="right"><button  onClick="saveD()">保存</button>&nbsp;&nbsp;<span class="quxiao" onClick="cancel_pl()">取消</span></div>
				            </div>
		        			</td>
		        		</tr>
		        		<tr>
		        			<td style="padding-left: 16px;" colspan="100">
		        				<font color="red" style="font-weight: bold;">
		        					注意：<br/>
		        					  1. 请不要添加  XX_ID 的主键，系统自动生成一个32位无序不重复字符序列作为主键<br/>
		        					  2. 主键为  类名_ID 格式，所有字段的字母均用大写
		        				</font>
							</td>
		        		</tr>
		        	</table>
		        </div>
		  	</div>
	  	</div>
	</div>

	<form action="createCode/proCode.action" name="Form" id="Form" method="post">
		<input type="hidden" name="zindex" id="zindex" value="0">
		<div id="zhongxin">
		<table style="margin-top: 10px;" border="0">
			<tr>
				<td style="width:76px;text-align: right;">上级包名：</td>
				<td colspan="1"><input type="text" name="packageName" id="packageName" value="" placeholder="这里输入包名  (请不要输入特殊字符,请用纯字母)" style="width:370px" title="包名称"/></td>
				<td>&nbsp;&nbsp;例如:com.fh.controller.<font color="red" style="font-weight: bold;">system</font>&nbsp;&nbsp;红色部分</td>
			</tr>
		</table>
		<table border="0">
			<tr>
				<td style="width:76px;text-align: right;">处理类名：</td>
				<td><input type="text" name="objectName" id="objectName" value="" placeholder="这里输入处理类名称" style="width:200px" title="类名称"/></td>
				<td>&nbsp;&nbsp;<font color="red" style="font-weight: bold;">类名首字母必须为大写字母或下划线</font></td>
				<td style="width:76px;text-align: right;">表前缀：</td>
				<td><input type="text" name="tabletop" id="tabletop" value="TB_" placeholder="这里输入表前缀" style="width:60px" title="表前缀"/></td>
			</tr>
		</table>
		
		
		<table id="table_report" class="table table-striped table-bordered table-hover">
				
				<thead>
					<tr>
						<th class="center">属性名</th>
						<th class="center">类型</th>
						<th class="center">备注</th>
						<th class="center" style="width:59px;">前台录入</th>
						<th class="center">默认值</th>
						<th class="center" style="width:69px;">操作</th>
					</tr>
				</thead>
										
				<tbody id="fields"></tbody>
				
		</table>
		
		
		<table id="table_report" class="table table-striped table-bordered table-hover">
			<tr>
				<td style="text-align: center;" colspan="100">
					<a class="btn btn-app btn-success btn-mini" onclick="dialog_open();"><i class="icon-ok"></i>新增</a>
					<a class="btn btn-app btn-success btn-mini" onclick="save();" id="productc"><i class="icon-print"></i>生成</a>
					<a class="btn btn-app btn-danger btn-mini" onclick="top.Dialog.close();"><i class="icon-share-alt"></i>取消</a>
				</td>
			</tr>
		</table>
		</div>
		
		<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green"></h4></div>
		
	</form>
		 <script type="text/javascript" src="${pageContext.request.contextPath}/business/frm/autocode/productCode.js"></script>
		<script type="text/javascript">
		
		</script>
	
</body>
</html>