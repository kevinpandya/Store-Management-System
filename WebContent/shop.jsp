
<html>
<%@ include file="header.jsp"%>

<body>
	<div class="card">
		<div class="card-header">SHOP</div>
		<div class="card-body">
			<form action="BillgenerationServlet" method="post">
				<table class="table">
				<tr>
						<td>Item id:<br></td>
						<td><input type="text" name="item_id"
							 class="form-control" /><br></td>
					</tr>
					<tr>
						<td>Item name:</td>
						<td><input type="text" name="item_name"
							 class="form-control" /></td>
					</tr>

					
					<tr>
						<td>Item price:<br></td>
						
						<td><input type="text" name="item_price" 
							class="form-control" /><br></td>
					</tr>
					<tr>
						<td>Item quantity:</td>
						<td><input type="text" name="item_quantity" 
							class="form-control" /><br></td>
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