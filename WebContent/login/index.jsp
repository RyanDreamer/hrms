<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人事管理系统后台登录界面</title>
<style type="text/css">
	
*{padding:0px;margin:0px;}

body{
	font-family:Arial, Helvetica, sans-serif;
	background:url(images/joinus.jpg) no-repeat ;
	background-position: center 0;
    background-size: cover;
 text-align:center;
   
	}
img{border:0;}
.lg{
	width:468px;height:468px;margin-top:10px auto;
	margin-left:368px;
background:url(images/login_bg.png) no-repeat;
background-origin:content-box;
}
.p{
	font-size:5900px;
	color: gray;
}

.lg_top{
	 height:200px;
	 width:468px;}
.lg_main{
	width:400px;
	height:180px;
	margin:0 25px;}
.lg_m_1{
	width:290px;
	height:100px;
	padding:60px 55px 20px 55px;}
.ur{
	height:37px;
	line-height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/user.png) no-repeat;
	padding-left:10px;
	font-size:12px;
	font-family:Arial, Helvetica, sans-serif;}
.pw{
	height:37px;
	line-height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/password.png) no-repeat;
	padding-left:10px;
	font-size:12px;
	font-family:Arial, Helvetica, sans-serif;}
.bn{
	width:330px;
	height:72px;
	background:url(images/enter.png) no-repeat;
	
	border:30px;
	display:block;
	font-size:20px;
	color:#FFF;
	font-family:Arial, Helvetica, sans-serif;
	font-weight:bolder;
	cursor:pointer;}
.lg_foot{
	height:80px;width:330px;padding: 6px 68px 0 68px;}
</style>

</head>
<body>
<div class="lg">
<form action="/hrms/LoginServlet" method="POST">
    <div class="lg_top"></div>
    <div class="lg_main">
        <div class="lg_m_1">
        <div id="h1">
        	<p style="color:black;font-size:30px;">人事管理系统</p></div>
        <input name="eid" placeholder="工号" value="" class="ur" />
        <input name="password" placeholder="密码" type="password" value="" class="pw" />
        
        </div>
    </div>
    <div class="lg_foot">
    <input type="submit" value="登录" class="bn" /></div>
</form>
</div>
</body>
</html>