<html>
<%@ include file="header.jsp"%>
<body>

<div class="card">
<div class="card-header">LOGIN</div>
<div class="card-body">
<form action="AuthenicatorServlet" method="post">
<div class="table">
USERNAME:<br>
<input type="text" name="username" placeholder="enter Username" class="form-control"/><br>
PASSWORD:<br>
<input type="password" name="password" placeholder="enter Password" class="form-control"/><br>
<input type="submit" class="btn btn-primary"/><br>
</div>
</form>
</div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>