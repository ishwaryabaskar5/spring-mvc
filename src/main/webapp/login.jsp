<html>
<body>
<p> <%= request.getAttribute("result") %>

<form action = "greet" method = "post">
<label>Username: </label>
<input type="text" name="username">
<label>Password: </label>
<input type="password" name="password">
<button type="submit">Submit</button>
</form>
</body>
</html>