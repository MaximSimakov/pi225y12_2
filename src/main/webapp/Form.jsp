%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - площадь прямоугольника</title>
</head>
<body>
<h1>Калькулятор - площадь прямоугольника</h1>
 <form action="${pageContext.request.contextPath}/Calc" method="post">
 <label for="first">Длина прямоугольника:</label>
 <input type="text" name="first" id="first" value="${first}">
 <label for="second">Ширина прямоугольника:</label>
 <input type="text" name="second" id="second" value="${second}">
 <input type="submit" name="sign" value="Calculate ">
 </form>
</body>
</html>