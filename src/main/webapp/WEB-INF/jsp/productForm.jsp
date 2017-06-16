<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品录入页面</title>
</head>
<body>
	<div id="global">
		<form action="product_save.action" method="post">
			<fieldset>
				<legend>录入一个产品</legend>
				<label for="name">产品名称</label><input id="name" name="name"
					type="text" value="" tabindex="1"></input> <label for="description">产品描述</label><input
					id="description" name="description" type="text" tabindex="2"></input>
				<label for="price">产品价格</label><input id="price" name="price"
					type="text" tabindex="3"></input>
					<div id="buttons">
						<input id="reset" type="reset" tabindex="4"/>
						<input id="submit" type="submit" tabindex="5" value="添加产品"/>
					</div>
			</fieldset>
		</form>
	</div>
</body>
</html>