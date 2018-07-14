<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="人力资源管理平台" />
<title>入职管理</title>
<link type="text/css" rel="stylesheet" href="css/css.css" />
</head>
<body>
	
	<div id="main">
	
<div class="header">
  <div class="top"> <img class="logo" src="images/logo.jpg" />
    <ul class="nav">
     <li><a href="首页.html">首页</a></li>
      <li><a href="部门管理.html">部门管理</a></li>
      <li><a href="岗位管理.html">岗位管理</a></li>
      <li><a href="员工信息管理.html">员工信息管理</a></li>
       <li><a href="调动管理.html">调动管理</a></li>
        <li class="seleli"><a href="#">入职管理</a></li>
        <li><a href="离职管理.html">离职管理</a></li>
        
    </ul>
  </div>
</div>



<div class="container">
	
	
	
  <div class="leftbar">
  	
    <div class="lm01"> <img class="peptx" src="images/b.jpg" />
      <div class="pepdet">
        <p class="pepname">周云瑞</p>
        <p>周云瑞</p>
        <p>火柴人董事会</p>
        <a href="www.baidu.com">修改个人信息</a>
      </div>
      <div class="clear"></div>
    </div>
    
    <div class="lm02">
      <div class="title"><img class="icon" src="images/dataicon.jpg" />
        <h2>日历</h2>
      </div>
     <a href="https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=92564395_hao_pg&wd=%E6%97%A5%E5%8E%862018&oq=%25E5%25A4%25A9%25E6%25B0%2594%25E9%25A2%2584%25E6%258A%25A5&rsv_pq=883e84af0007f603&rsv_t=cc1bqku2Ri%2BWixMClFv%2BEr5sQFkAoBWIQ51unXq1GuQTXJDWKrUOwLkCd50Bb0HnduLrbmmp&rqlang=cn&rsv_enter=1&inputT=5927&rsv_sug3=23&rsv_sug1=20&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%2597%25A5%25E5%258E%2586&rsp=1&rsv_sug4=6934">点击查看日历</a>
    </div>
    
    <div class="lm03">
      <div class="title"><img style="padding-right:5px;" class="icon" src="images/weaicon.jpg" />
        <h2>天气</h2>
      </div>
      <a href="http://www.weather.com.cn/weather/101120201.shtml">点击查看天气</a>
         </div>
    
  </div>
  
  
  
  <div class="mainbody">
  	
    
      
    
    <div class="adtip">
      <div class="tip">
        <p class="goom">早上好，周云瑞！</p>
       </div>
    </div>
    
    
    <div class="rig_lm03">
    	<div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
    	<h2>企业介绍</h2>
    	</div>
    	<p>火柴人公司建于二零一八年七月，位于山东省青岛市黄岛区中国石油大学</p>
    </div>
    <div class="rig_lm03">
      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
        <h2>员工入职</h2>
      </div>
      <div class="detail">
        <div class="inner03">
          <div id="tabCot_product" class="zhutitab">
          
            <div id="tabCot_product_1" class="tabCot" >、
            <form action="/hrms/EntryServlet" method="post">
              <table class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">工号</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">所属部门</span><span class="xila">&or;</span></th>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">职位</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">入职时间</span><span class="xila">&or;</span></th>
                  <th width="7%" bgcolor="#f8f8f8" scope="col"><span class="titlab">评分</span><span class="xila">&or;</span></th>
                  <th width="19%" bgcolor="#f8f8f8" scope="col">操作</th>
                </tr>
                <tr>
                   <td bgcolor="#FFFFFF"><input type="text" value="" name="eid"/></td>
                  <td class="datacol" bgcolor="#FFFFFF"><input type="text" value="" name="dept"/></td>
                  <td bgcolor="#FFFFFF"><input type="text" value="" name="jid"/></td>
                  <td bgcolor="#FFFFFF"><input type="text" value="" name="date"/></td>
                  <td class="yccol" bgcolor="#FFFFFF">100</td>
                  <td class="czcol" bgcolor="#FFFFFF"><a href="#">修改信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">查看</a></td>
                </tr>
              </table>
              <input type="submit" value="提交"/>
              
          	  </form>
              <div class="fanye">
                <p class="fytip">Showing 1 to 10 of 12 entries</p>
                <div class="yem">
                  <ul>
                    <li><a href="#">First</a></li>
                    <li><a href="#">&lt;</a></li>
                    <li class="sellify"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">&gt;</a></li>
                    <li><a href="#">Last</a></li>
                  </ul>
                </div>
              </div>
            </div>
            <script language="JavaScript" type="text/javascript" src="js/tab.js"></script> 
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="footer"></div>
</div>
</body>
</html>