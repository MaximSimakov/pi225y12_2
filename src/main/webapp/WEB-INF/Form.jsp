<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - площадь прямоугольника</title>
</head>
<body>
<h1>Калькулятор - площадь прямоугольника</h1>
    <form action="http://localhost:8080/Calculate4/Calc" method="post">
        <label for="length">Длина прямоугольника:</label>
        <input type="text" name="length" id="length" value="длина">
        <label for="width">Ширина прямоугольника:</label>
        <input type="text" name="width" id="width" value="ширина">
        <input type="submit" name="sign" value="Calculate ">
    </form>
</body>
</html>