<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>\
<%@ include file="../include/header.jsp" %>

<!-- main content -->
<section class="content">
	<div class="row">
		<!-- left colum -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">SUCCESS PAGE</h3>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">BNO</th>
							<th>TITLE</th>
							<th>WRITER</th>
							<th>REGDATE</th>
							<th style="width: 40px">VIEWCNT</th>
						</tr>
					</table>
				</div>
				<!--  /.box-body -->
				<div class="box-footer">Footer</div>
				<!-- /.box-footer -->
			</div>
		</div><!-- /.col (left) -->
	</div><!-- /.row -->
</section><!-- /.content -->

<%@ include file="../include/footer.jsp" %>