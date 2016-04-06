<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="row-fluid">
	<form id="PageRoll">
		<div class="col-sm-4"
			style="margin: 20px 0; display: inline-block; padding: 6px 12px;"
			align="right">
			第${PageRoll.currentPage}页/共${PageRoll.sumPage}页 <input id="totalRows"
				name="totalRows" type="hidden" value="${PageRoll.totalRows}">
			<input id="currentPage" name="currentPage" type="hidden"
				value="${PageRoll.currentPage}"> <input id="sumPage"
				name="sumPage" type="hidden" value="${PageRoll.sumPage}">
			&nbsp; &nbsp; 每页显示： <select name="pageSize"
				onchange="selecPageSize()">
				<option value='10' ${PageRoll.pageSize=='10'?'selected':''}>10</option>
				<option value='20' ${PageRoll.pageSize=='20'?'selected':''}>20</option>
				<option value='50' ${PageRoll.pageSize=='50'?'selected':''}>50</option>
			</select> 条 /共${PageRoll.totalRows}条
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