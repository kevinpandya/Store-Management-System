<html>
<%@ include file="header.jsp"%>
<body>
	
	<div class="card">
		<div class="card-header">UPDATE QUANTITY ITEM</div>
		<div class="card-body">
			<form action="UpdateItemquantityServlet" method="post">
				<table class="table">
				<tr>
						<td>Item id:<br></td>
						<td><input type="text" name="item_id"
							 class="form-control" /><br></td>
					</tr>
					<tr>
						<td>Item quantity:</td>
						<td><input type="text" name="item_quantity"
							 class="form-control" /></td>
					</tr>
					<tr>
						<td><input type="submit" class="btn btn-primary" /></td>
					</tr>
					
					
				</table>
			</form>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>