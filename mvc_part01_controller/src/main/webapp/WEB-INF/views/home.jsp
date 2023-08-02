<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  - ${sessionScope.test }
</h1>
<h2>
	model : ${requestScope.modelTest }
</h2>
<a href="doA">doA</a><br/>
<a href="doB">doB</a><br/>
<a href="doC">doC</a><br/>
<a href="doD?msg=helloSpring">doD</a><br/>
<a href="doD">non-param doD</a><br/>
<a href="doE">non-param doE</a><br/>
<hr/>
<form action="doF" method="POST">
	<input type ="text" name="msg" required="required"/><br/>
	<input type ="number" name="age" required="required"/><br/>
	<input type ="submit" value="doF POST"/><br/>
</form>
<hr/>
<form action="productWrite" method="POST">
	<input type ="text" name="name" required="required"/><br/>
	<input type ="number" name="price" required="required"/><br/>
	<input type ="submit" value="Product Write"/><br/>
</form>

<h2>product submit</h2>
<form action="productWriteSubmit" method="POST">
	<input type="text" name="name" required/>
	<input type="number" name="price" required/>
	<input type="submit" value="PRODUCT WRITE"/>
</form>
<hr/>
<a href="redirect">redirect</a>
</body>
</html>
