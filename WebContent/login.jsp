<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>凡客网登录</title>
<link rel="stylesheet" type="text/css" href="css/fanke_css.css"/>
	</head>
	<body>
		<div class="top">
			<dic class="topLeft">
				<img src="img/fkw_logo.png" alt="" />
			</dic>
			<div class="topRight">
				<a style="color: gray;font-size: 15px;">免费注册&nbsp;|&nbsp;招商加盟</a>
			</div>
		</div>
		
		<div class="bottom">
			<div class="bottomLeft">
				<img src="img/big_bg.png" alt="" />
			</div>
			<div class="bottomRight">
				<div class="bottomRightLogin">
					<p>
						<span style="color: lightseagreen;font-size: 20px;">登录</span>&nbsp;&nbsp;<span style="color: grey;font-size: 17px;">/&nbsp;注册</span>
					</p>
					<form action="user" method="post">
						<p><input type="text" name="name" id="FormInput1" value="" placeholder="凡客网账号"/></p>
						<p><input type="password" name="pwd" id="FormInput2" value="" placeholder="密码"/></p>
						<p><input type="checkbox" name="" id="FormInput3" value=""/>使用员工账号登录</p>
						<p><input type="checkbox" name="" id="FormInput4" value="" />两周内自动登录</p>
						<p><input type="submit" name="" id="FormInput5" value="登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录" /></p>
						
					</form>
					<p ><span class="bottomRightLoginP">其他账号登录</span>
						<img src="img/weixin.png" alt="" />
					</p>
				</div>
				<div class="bottomRightEnd">
					<p>&nbsp;</p>
					<p style="font-size: 12px;line-height: 50px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Copyright&copy;2010-2018凡科互联网科技股份有限公司</p>
					<p style="font-size: 12px;color: gray;">
						<img src="img/beianIcon.png" alt="" />
						粤公网备案&nbsp;44010502000715&nbsp;&nbsp;粤ICP备10235580号
					</p>
				</div>
			</div>
		</div>
	</body>
</html>