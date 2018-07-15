<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf8"%>
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
<title>离职信息管理</title>
<link type="text/css" rel="stylesheet" href="/hrdb1/admin/css/css.css" />
<link rel="stylesheet" type="text/css"
	href="https://cdn.bootcss.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/1.4.0/jquery.js"></script>
</head>
<body>

	<div id="main">

		<div class="header">
			<div class="top">
				<img class="logo" src="/hrdb1/admin/images/logo.jpg" />
				<ul class="nav">
					<li><a href="/hrdb1/admin/main.jsp">首页</a></li>
					<li><a href="/hrdb1/admin/dept.jsp">部门管理</a></li>
					<li><a href="/hrdb1/admin/job.jsp">岗位管理</a></li>
					<li><a href="/hrdb1/admin/dimission.jsp">员工信息管理</a></li>
					<li><a href="/hrdb1/admin/ptrans.jsp">调动管理</a></li>
					<li><a href="/hrdb1/admin/entry.jsp">入职管理</a></li>
					<li class="seleli"><a href="#">离职管理</a></li>
				</ul>
			</div>
		</div>



		<div class="container">



			<div class="leftbar">

				<div class="lm01">
					<img class="peptx" src="/hrdb1/admin/images/b.jpg" />
					<div class="pepdet">
						<p class="pepname">周云瑞</p>
						<p>周云瑞</p>
						<p>火柴人董事会</p>
						<a href="www.baidu.com">修改个人信息</a>
					</div>
					<div class="clear"></div>
				</div>

				<div class="lm02">
					<div class="title">
						<img class="icon" src="/hrdb1/admin/images/dataicon.jpg" />
						<h2>日历</h2>
					</div>
					<a
						href="https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=92564395_hao_pg&wd=%E6%97%A5%E5%8E%862018&oq=%25E5%25A4%25A9%25E6%25B0%2594%25E9%25A2%2584%25E6%258A%25A5&rsv_pq=883e84af0007f603&rsv_t=cc1bqku2Ri%2BWixMClFv%2BEr5sQFkAoBWIQ51unXq1GuQTXJDWKrUOwLkCd50Bb0HnduLrbmmp&rqlang=cn&rsv_enter=1&inputT=5927&rsv_sug3=23&rsv_sug1=20&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%2597%25A5%25E5%258E%2586&rsp=1&rsv_sug4=6934">日历</a>
				</div>

				<div class="lm03">
					<div class="title">
						<img style="padding-right: 5px;" class="icon"
							src="/hrdb1/admin/images/weaicon.jpg" />
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

					<div class="detail">
						<div class="inner03">
							<div id="tabCot_product" class="zhutitab">


								<div id="tabCot_product_1" class="tabCot">
									<form action="/hrdb1/ShowDimissionServlet" method="post">
										<input type="submit" value="显示所有离职的信息" align="left" />
										<table class="tabindex" width="100%" border="0"
											cellpadding="0" cellspacing="0">
											<thead>
												<tr>
													<th width="22%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">员工号</span><span class="xila">&or;</span></th>
													<th width="21%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">离职时间</span><span class="xila">&or;</span></th>
													<th width="22%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位号</span><span class="xila">&or;</span></th>
													<th width="21%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">原因</span><span class="xila">&or;</span></th>

												</tr>
											</thead>
											<tbody>

												<c:choose>
													<c:when test="${not empty requestScope.info}">
														<c:forEach var="staff" items="${requestScope.info}">
															<tr>

																<td>${staff.eid }</td>
																<td>${staff.date }</td>
																<td>${staff.jid}</td>
																<td>${staff.reason}</td>


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
									<form action="/hrdb1/AddDimissionServlet" method="post">
										添加离职信息： <input type="text" placeholder="员工号" name="eid" /> <input
											type="text" placeholder="离职时间" name="date" /> <input
											type="text" placeholder="岗位号" name="jid" /> <input
											type="text" placeholder="原因" name="reason" /> <input
											type="submit" value="提交" />
										<c:choose>
											<c:when test="${success ==1}">
												<c:out value="提交成功！点击“显示所有离职的信息”可查看" />
											</c:when>
											<c:when test="${success==2 }">
												<c:out value="提交失败！点击“显示所有离职的信息”可查看" />
											</c:when>
											<c:otherwise>											
											</c:otherwise>
										</c:choose>
									</form>
									<form action="/hrdb1/RmDimissionServlet" method="post">
										删除离职信息： <input type="text" placeholder="员工号" name="eid" /> <input
											type="submit" value="提交" />
										<c:choose>
											<c:when test="${success==3 }">
												<c:out value="提交成功！点击“显示所有离职的信息”可查看" />
											</c:when>
											<c:when test="${success==4 }">
												<c:out value="提交失败！点击“显示所有离职的信息”可查看" />
											</c:when>
											<c:otherwise></c:otherwise>
										</c:choose>
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


								<script language="JavaScript" type="text/javascript"
									src="/hrdb1/admin/js/tab.js"></script>
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