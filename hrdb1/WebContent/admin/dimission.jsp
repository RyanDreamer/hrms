<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="人力资源管理平台" />
<title>离职管理</title>
<link type="text/css" rel="stylesheet" href="css/css.css" />
</head>
<body>

	<div id="main">
	
<div class="header">
  <div class="top"> <img class="logo" src="images/logo.jpg" />
    <ul class="nav">
    
      <li><form action="" method="post">
      		<input type="submit" value="首页" name="empoyee" />
      		</form>
      </li>
      <li><form action="/hrdb1/DeptServlet" method="post">
      		<input type="submit" value="部门管理" name="empoyee" />
      		</form>
      </li>
      <li><form action="" method="post">
      		<input type="submit" value="岗位管理" name="empoyee" />
      		</form>
      </li>
      <li><form action="" method="post">
      		<input type="submit" value="人员信息管理" name="empoyee" />
      		</form>
      </li>
      <li><form action="" method="post">
      		<input type="submit" value="调动管理" name="empoyee" />
      		</form>
      </li>
      <li><form action="" method="post">
      		<input type="submit" value="入职管理" name="empoyee" />
      		</form>
      </li>
      <li><form action="/hrdb1/DimissionServlet" method="post">
      		<input type="submit" value="离职管理" name="empoyee" />
      		</form>
      </li>
     
        
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
     <a href="https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=92564395_hao_pg&wd=%E6%97%A5%E5%8E%862018&oq=%25E5%25A4%25A9%25E6%25B0%2594%25E9%25A2%2584%25E6%258A%25A5&rsv_pq=883e84af0007f603&rsv_t=cc1bqku2Ri%2BWixMClFv%2BEr5sQFkAoBWIQ51unXq1GuQTXJDWKrUOwLkCd50Bb0HnduLrbmmp&rqlang=cn&rsv_enter=1&inputT=5927&rsv_sug3=23&rsv_sug1=20&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%2597%25A5%25E5%258E%2586&rsp=1&rsv_sug4=6934">日历</a>
    </div>
    
    <div class="lm03">
      <div class="title"><img style="padding-right:5px;" class="icon" src="images/weaicon.jpg" />
        <h2>天气</h2>
      </div>
      <a href="http://www.weather.com.cn/weather/101120201.shtml">天气查询</a>
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
        <h2>员工主要资料</h2>
      </div>
      <div class="detail">
        <div class="inner03">
          <div id="tabCot_product" class="zhutitab">
          
            <div id="tabCot_product_0" class="tabCot">


									<table class="tabindex" width="100%" border="0" cellpadding="0"
										cellspacing="0" id="myTable">
										<form action="/hrdb1/ShowDimission" method="post">
											<input type="submit" value="显示所有离职的信息" align="top"/>
										</form>
										<thead>
											<tr>
												<th width="5%" bgcolor="#f8f8f8" scope="col"><span
													class="titlab">员工号</span><span class="xila">&or;</span></th>
												<th width="10%" bgcolor="#f8f8f8" scope="col"><span
													class="titlab">入职时间</span><span class="xila">&or;</span></th>
												<th width="5%" bgcolor="#f8f8f8" scope="col"><span
													class="titlab">岗位号</span><span class="xila">&or;</span></th>
													<th width="10%" bgcolor="#f8f8f8" scope="col"><span
													class="titlab">入职部门</span><span class="xila">&or;</span></th>
												
											</tr>
										</thead>
										<tbody>
											<c:choose>
												<c:when test="${not empty requestScope.info}">
													<c:forEach var="staff" items="${requestScope.info}">
														<tr>

															<td>${staff.eid }</td>
															<td>${staff.date }</td>
															<td>${staff.jid }</td>
															<td>${staff.reason  }</td>
														

														</tr>
													</c:forEach>
												</c:when>
												<c:otherwise>
													<tr>
														<td colspan="3">对不起，没有你要找的数据</td>
													</tr>
												</c:otherwise>
											</c:choose>
										</tbody>
									</table>        
            </div>
            
            
        <div id="tabCot_product_1" class="tabCot" >、
            <form action="/hrdb1/DimissionServlet" method="post">
              <table class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">员工号</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">离职时间</span><span class="xila">&or;</span></th>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">岗位号</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">原因</span><span class="xila">&or;</span></th>
                 
                </tr>
                <tr>
                   <td bgcolor="#FFFFFF"><input type="text" value="" name="eid"/></td>
                  <td class="datacol" bgcolor="#FFFFFF"><input type="text" value="" name="date"/></td>
                  <td bgcolor="#FFFFFF"><input type="text" value="" name="jid"/></td>
                  <td bgcolor="#FFFFFF"><input type="text" value="" name="reason"/></td>
                
                </tr>
              </table>
              <input type="submit" value="提交"/>
              
          	  </form>
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