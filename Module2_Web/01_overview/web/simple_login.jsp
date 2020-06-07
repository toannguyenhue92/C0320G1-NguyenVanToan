<!DOCTYPE HTML>
<html>
<style type="text/css">
    .login {
        height: 180px;
        width: 280px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px
    }
</style>
<body>
<form method="post" action="login">
    <div class="login">
        <h2>Login</h2>
        <input name="username" placeholder="username" size="30" type="text"/>
        <input name="password" placeholder="password" size="30" type="password"/>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>