<%@ page contentType="text/html; charset=gb2312" language="java" %>
<html>
<head>
<style type="text/css">
body{ margin:10px auto; text-align:center;font-family:微软雅黑;padding-top: 10px}.text-field {margin:0 auto;padding: 10px 0px;background-color:#262626;color:white;width:800px;}
label {display: inline-table; width: 90px; margin: 0px 0px 10px 20px; }
input {display: inline-table; width: 150px; margin: 0px 20px 10px 0px;}
h2 {margin: 20px 20px 20px 40px;}
button {margin: 20px 20px 10px 180px;width: 80px;height: 30px;font-size: 10pt;}
#login{margin-top:20px;}
</style>
</head>
<body>

<div class="text-field">
<h1>GreatOps DevOps Pipeline Demo</h1>
<h2>Login Page</h2>
<img src="http://www.greatops.net/zb_users/theme/we_media/include/logo.png">
<form id="login" name="login" action="login" method="post">
<label>Account</label><input type="text" name="id"></input><br/>
<label>Password</label><input type="password" name="password"></input><br/>
<button>Login</button>
</form>
<div style="display: block;">
<hr/>
<img width=280px height=280px src="http://code.greatops.net/jingyun/public/raw/79cb7fe4af01429c8ccbdca9f9a46340389703db/wechat.png" style="margin-right: 20px">
<img width=280px height=280px src="http://code.greatops.net/jingyun/public/raw/583cadef2a5e0522e06be240fd150aec282fbf78/link.png">
</div>
</div>
</body>
</html>
