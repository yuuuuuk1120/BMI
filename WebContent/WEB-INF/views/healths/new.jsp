<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>BMIの計算</title>
</head>

<body>
    <h2>入力ページ</h2>

    <form method="POST" action="BMICheck">
        <label for="height">身長</label> <br />
        <input type="text" name="height" size="4" /> (cm) <br /> <br />

         <label for="weight">体重</label> <br />
         <input type="text" name="weight" size="4" /> (kg)

         <input type="submit" value="計算する" />

    </form>

</body>
</html>