<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details Portal</title>
</head>
<body>
	
	<div align="center">
		<h1>WELCOME</h1>
		<h2>Insert the Product Details</h2>
		<form action="productDetails" method="post">
		Product Id : <input style="margin-left: 35px" type = "text" name=productId><br><br>
		Product Name : <input style="margin-left: 5px" type = "text" name=productName><br><br>
		Product Type : <input style="margin-left: 15px" type = "text" name=productType><br><br>
		Product Price : <input style="margin-left: 15px" type = "text" name=productPrice><br><br>
		<input type = "submit" value = "Submit">
		</form>
	</div>
	
</body>
</html>