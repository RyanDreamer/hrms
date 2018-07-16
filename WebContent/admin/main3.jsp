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
<title>管理员首页</title>
<link type="text/css" rel="stylesheet" href="/hrms/admin/css/css.css" />
</head>
<body>

	<div id="main">

		<div class="header">
			<div class="top">
				<img class="logo" src="/hrms/admin/images/logo.jpg" />
				<ul class="nav">
					<li class="seleli"><a href="#">首页</a></li>
					<li><a href="/hrms/admin/dept.jsp">部门管理</a></li>
					<li><a href="/hrms/admin/job.jsp">岗位管理</a></li>
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

				<div class="lm01">
					<img class="peptx" src="/hrms/admin/images/b.jpg" />
					<div class="pepdet">
						<p class="pepname">${uname }</p>

					</div>
					<div class="clear"></div>
				</div>

				<div class="lm03">
					<div class="title">
						<img src="/hrms/admin/images/listicon.jpg" class="icon"
							style="padding-top: 13px;">
						<h2>企业介绍</h2>
					</div>
					<p>火柴人公司建于二零一八年七月，位于山东省青岛市黄岛区中国石油大学</p>
				</div>


				<div class="lm02">
					<div class="title">
						<img class="icon" src="/hrms/admin/images/dataicon.jpg" />
						<h2>日历</h2>
					</div>
					<a
						href="https://www.baidu.com/s?ie=utf-8&f=3&rsv_bp=1&tn=92564395_hao_pg&wd=%E6%97%A5%E5%8E%862018&oq=%25E5%25A4%25A9%25E6%25B0%2594%25E9%25A2%2584%25E6%258A%25A5&rsv_pq=883e84af0007f603&rsv_t=cc1bqku2Ri%2BWixMClFv%2BEr5sQFkAoBWIQ51unXq1GuQTXJDWKrUOwLkCd50Bb0HnduLrbmmp&rqlang=cn&rsv_enter=1&inputT=5927&rsv_sug3=23&rsv_sug1=20&rsv_sug7=101&rsv_sug2=1&prefixsug=%25E6%2597%25A5%25E5%258E%2586&rsp=1&rsv_sug4=6934">点击查看日历</a>
				</div>

				<div class="lm03">
					<div class="title">
						<img style="padding-right: 5px;" class="icon"
							src="/hrms/admin/images/weaicon.jpg" />
						<h2>天气</h2>
					</div>
					<a href="http://www.weather.com.cn/weather/101120201.shtml">点击查看天气</a>
				</div>

			</div>



			<div class="mainbody">




				<div class="adtip">
					<div class="tip">
						<p class="goom">你好！${uname }</p>

					</div>

				</div>


				<div class="rig_lm02">
					<div class="title">
						<img src="/hrms/admin/images/listicon.jpg" class="icon"
							style="padding-top: 13px;">
						<h2>各部门人员分布</h2>
					</div>
					<div class="detail">
						<div class="det_inner">
							<div class="scordeti">
								<ul>
									<li><c:if test="${not empty developementNum }">
											<p class="ywc">${developementNum }</p>
										</c:if>
										<h3>研发部</h3></li>

									<li><c:if test="${not empty qualityNum }">
											<p class="wwc">${qualityNum }</p>
										</c:if>
										<h3>质检部</h3></li>


									<li><c:if test="${not empty salesNum }">
											<p class="ycd">${salesNum }</p>
										</c:if>
										<h3>销售部</h3></li>

									<li><c:if test="${not empty adminisNum }">
											<p class="ywc">${adminisNum }</p>
										</c:if>
										<h3>行政部</h3></li>

									<li><c:if test="${not empty personnelNum }">
											<p class="wwc">${personnelNum }</p>
										</c:if>
										<h3>人事部</h3></li>

									<li><c:if test="${not empty financeNum }">
											<p class="wwc">${financeNum }</p>
										</c:if>
										<h3>财务部</h3></li>

								</ul>
							</div>
						</div>
					</div>
				</div>

				<div class="rig_lm03">
					<div class="title">
						<img src="/hrms/admin/images/listicon.jpg" class="icon"
							style="padding-top: 13px;">
						<h2>报表</h2>
					</div>
					<div class="detail">
						<div class="inner03">
							<div id="tabCot_product" class="zhutitab">
								<div class="tabContainer">
									<ul class="tabHead" id="tabCot_product-li-currentBtn-">
										<li><a href="javascript:void(0)" title="空闲职位" rel="1">空闲职位</a><span
											class="grey_numb">12</span></li>
										<li><a href="javascript:void(0)" title="入职统计" rel="2">入职统计</a><span
											class="red_numb">2</span></li>
										<li class="currentBtn"><a href="javascript:void(0)"
											title="离职统计" rel="3">离职统计</a><span class="red_numb">5</span></li>
									</ul>

									<input style="width: 30px;" type="text" value="10"> <img
										src="/hrms/admin/images/sz.jpg" class="icon" style="">
									</p>
									<div class="clear"></div>
								</div>
								<div id="tabCot_product_1" class="tabCot" style="display: none;">
									<form action="/hrms/EmptyJob" method="post">
										<input type="submit" value="开始生成数据" align="left" />
										<table class="tabindex" width="80%" border="0" cellpadding="0"
											cellspacing="0">
											<thead>
												<tr>
													<th width="15%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位代号</span><span class="xila">&or;</span></th>
													<th width="15%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位名称</span><span class="xila">&or;</span></th>
													<th width="15%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">所属部门</span><span class="xila">&or;</span></th>
													<th width="15%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位空缺人数</span><span class="xila">&or;</span></th>

													<th width="20%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">薪酬</span><span class="xila">&or;</span></th>
												</tr>
											</thead>
											<tbody>

												<c:choose>
													<c:when test="${not empty requestScope.emptyJob}">
														<c:forEach var="staff" items="${requestScope.emptyJob}">
															<tr>

																<td>${staff.jid }</td>
																<td>${staff.title }</td>
																<td>${staff.dept}</td>
																<td>${staff.countDemand-staff.countReal}</td>
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
								<div id="tabCot_product_2" class="tabCot" style="display: none;">
									<form action="/hrms/CountEntry" method="post">
										起始日期-截止日期:<input type="text" name="start" />- <input
											type="text" name="end" /><br /> <input type="submit"
											value="生成入职信息" />
										<table class="tabindex" width="100%" border="0"
											cellpadding="0" cellspacing="0">
											<thead>
												<tr>
													<th width="50%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位号</span><span class="xila">&or;</span></th>

													<th width="50%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">入职人数</span><span class="xila">&or;</span></th>


												</tr>
											</thead>
											<tbody>
												<c:choose>
													<c:when test="${not empty requestScope.Entry}">
														<c:forEach var="staff" varStatus="vs"
															items="${requestScope.Entry}">
															<tr>
																<c:choose>
																	<c:when test="${staff != 0}">
																		<td>${vs.index+1 }</td>
																		<td>${staff}</td>
																	</c:when>
																	<c:otherwise></c:otherwise>
																</c:choose>

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
								</div>
								<div id="tabCot_product_3" class="tabCot">
									<form action="/hrms/CountDimission" method="post">
										起始日期-截止日期:<input type="text" name="start" />- <input
											type="text" name="end" /><br /> <input type="submit"
											value="生成离职信息" />
										<table class="tabindex" width="100%" border="0"
											cellpadding="0" cellspacing="0">
											<thead>
												<tr>
													<th width="50%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">岗位号</span><span class="xila">&or;</span></th>

													<th width="50%" bgcolor="#f8f8f8" scope="col"><span
														class="titlab">离职人数</span><span class="xila">&or;</span></th>


												</tr>
											</thead>
											<tbody>
												<c:choose>
													<c:when test="${not empty requestScope.Dimission}">
														<c:forEach var="staff" varStatus="vs"
															items="${requestScope.Dimission}">
															<tr>
																<c:choose>
																	<c:when test="${staff != 0}">
																		<td>${vs.index+1 }</td>
																		<td>${staff}</td>
																	</c:when>
																	<c:otherwise></c:otherwise>
																</c:choose>

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

								</div>
								<script language="JavaScript" type="text/javascript"
									src="/hrms/admin/js/tab.js"></script>
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