<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="人力资源管理平台" />
<title>岗位管理</title>
<link type="text/css" rel="stylesheet" href="/hrms/admin/css/css.css" />
<style>
	.adtip{
		height: 57px;
	}
</style>
</head>
<body>
	
	<div id="main">
	
<div class="header">
  <div class="top"> <img class="logo" src="/hrms/admin/images/logo.jpg" />
    <ul class="nav">
    	<li><a href="/hrms/admin/main.jsp">首页</a></li>
		<li><a href="/hrms/admin/dept.jsp">部门管理</a></li>
		<li class="seleli"><a href="#">岗位管理</a></li>
		<li><a href="/hrms/admin/employee.jsp">员工信息管理</a></li>
		<li><a href="/hrms/admin/ptrans.jsp">调动管理</a></li>
		<li><a href="/hrms/admin/entry.jsp">入职管理</a></li>
		<li><a href="/hrms/admin/dimission.jsp">离职管理</a></li>
        <li><a href="/hrms/admin/pcon.jsp">试用期合同</a></li>
    </ul>
  </div>
</div>



<div class="container">
	
	
	
  <div class="leftbar">
  	
    <div class="lm01"> <img class="peptx" src="/hrms/admin/images/b.jpg" />
      <div class="pepdet">
        <p class="pepname">
        ${uname }  
		</p>
        
      </div>
      <div class="clear"></div>
    </div>
    
    <div class="lm03">
    	<div class="title"><img src="/hrms/admin/images/listicon.jpg" class="icon" style="padding-top:13px;">
    	<h2>企业介绍</h2>
    	</div>
    	<p>火柴人公司建于二零一八年七月，位于山东省青岛市黄岛区中国石油大学</p>
    </div>
    
    <div class="lm02">
      <div class="title"><img class="icon" src="/hrms/admin/images/dataicon.jpg" />
        <h2>日历</h2>
      </div>
     <a href="https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=92564395_hao_pg&wd=%E6%97%A5%E5%8E%862018&oq=%25E5%25A4%25A9%25E6%25B0%2594%25E9%25A2%2584%25E6%258A%25A5&rsv_pq=883e84af0007f603&rsv_t=cc1bqku2Ri%2BWixMClFv%2BEr5sQFkAoBWIQ51unXq1GuQTXJDWKrUOwLkCd50Bb0HnduLrbmmp&rqlang=cn&rsv_enter=1&inputT=5927&rsv_sug3=23&rsv_sug1=20&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%2597%25A5%25E5%258E%2586&rsp=1&rsv_sug4=6934">日历</a>
    </div>
    
    <div class="lm03">
      <div class="title"><img style="padding-right:5px;" class="icon" src="/hrms/admin/images/weaicon.jpg" />
        <h2>天气</h2>
      </div>
      <a href="http://www.weather.com.cn/weather/101120201.shtml">天气查询</a>
         </div>
    
  </div>
  
  
  
  <div class="mainbody">
  	
    
    <div class="adtip" width:"1000px" height:"2000px">
      <div class="tip">
        <p class="goom">你好！${uname } </p>
      </div>
     
    </div>
      
    
  
    <div class="rig_lm03">
      
      <div class="detail">
        <div class="inner03">
          <div id="tabCot_product" class="zhutitab">
            <div class="tabContainer">
              
              
              <div class="clear"></div>
            </div>
            <div id="tabCot_product_1" class="tabCot" >
              <form action="/hrms/JobServlet" method="post">
					<input type="submit" value="显示所有岗位的信息" align="left" />
					<table class="tabindex" width="80%" border="0"
						cellpadding="0" cellspacing="0">
						<thead>
							<tr>
								<th width="15%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">岗位代号</span><span class="xila">&or;</span></th>
								<th width="15%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">岗位名称</span><span class="xila">&or;</span></th>
								<th width="15%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">所属部门</span><span class="xila">&or;</span></th>
								<th width="15%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">岗位所需人数</span><span class="xila">&or;</span></th>
								<th width="10%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">岗位实际人数</span><span class="xila">&or;</span></th>
								<th width="10%" bgcolor="#f8f8f8" scope="col"><span
									class="titlab">薪酬</span><span class="xila">&or;</span></th>
							</tr>
						</thead>
						<tbody>

							<c:choose>
								<c:when test="${not empty requestScope.info}">
									<c:forEach var="staff" items="${requestScope.info}">
										<tr>

											<td>${staff.jid }</td>
											<td>${staff.title }</td>
											<td>${staff.dept}</td>
											<td>${staff.countDemand}</td>
											<td>${staff.countReal}</td>
											<td>${staff.salary}</td>

										</tr>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<tr>
										<td colspan="3"></td>
									</tr>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</form>
				<form action="/hrms/AddJobServlet" method="post">
					 添加岗位：   <input type="text" placeholder="岗位号" name="jid" />
							 <input type="text" placeholder="岗位名称" name="title" />
							 <input type="text" placeholder="所属部门" name="dept" /> 
							 <input type="text" placeholder="所需人数" name="countDemand" /> 
							 <input type="text" placeholder="实际人数" name="countReal" /> 
							 <input type="text" placeholder="薪酬" name="salary" /> 
							 <input type="submit" value="提交" />
							 <c:choose>
							 	<c:when test="${not empty successA }">
							 		<c:out value="提交成功！点击“显示所有岗位的信息”可查看"/>
							 	</c:when>
							 	<c:otherwise></c:otherwise>
							 </c:choose>
				</form>
				<form action="/hrms/UpJobServlet" method="post">
					 修改岗位：   <input type="text" placeholder="岗位号" name="jid" />
							 <input type="text" placeholder="岗位名称" name="title" />
							 <input type="text" placeholder="所属部门" name="dept" /> 
							 <input type="text" placeholder="所需人数" name="countDemand" /> 
							 <input type="text" placeholder="实际人数" name="countReal" /> 
							 <input type="text" placeholder="薪酬" name="salary" /> 
							 <input type="submit" value="提交" />
							 <c:choose>
							 	<c:when test="${not empty successU }">
							 		<c:out value="提交成功！点击“显示所有岗位的信息”可查看"/>
							 	</c:when>
							 	<c:otherwise></c:otherwise>
							 </c:choose>
				</form>
				<form action="/hrms/RmJobServlet" method="post">
					 删除岗位：   <input type="text" placeholder="岗位号" name="jid" />
							 <input type="submit" value="提交" />
							 <c:choose>
							 	<c:when test="${not empty successR }">
							 		<c:out value="提交成功！点击“显示所有岗位的信息”可查看"/>
							 	</c:when>
							 	<c:otherwise></c:otherwise>
							 </c:choose>
				</form>
              
            </div>
            <div id="tabCot_product_2" class="tabCot"  style="display: none;"> 2222222222 </div>
            <div id="tabCot_product_3" class="tabCot"  style="display: none;"> 3333333333 </div>
            <script language="JavaScript" type="text/javascript" src="/hrms/admin/js/tab.js"></script> 
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