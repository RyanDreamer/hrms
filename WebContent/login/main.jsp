<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="description" content="人力资源管理平台" />
<link type="text/css" rel="stylesheet" href="css/css.css" />
<title>人力资源管理平台首页</title>
</head>
<body>
<div class="header">
  <div class="top"> <img class="logo" src="images/logo.jpg" />
    <ul class="nav">
      <li class="seleli"><a href="#">首页</a></li>
      <li><a href="#">个人中心</a></li>
      <li><a href="#">部门管理</a></li>
      <li><a href="#">岗位管理</a></li>
      <li><a href="#">员工信息管理</a></li>
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
      </div>
      <div class="clear"></div>
    </div>
    <div class="lm02">
      <div class="title"><img class="icon" src="images/dataicon.jpg" />
        <h2>日历</h2>
      </div>
      <div class="detail"> <img class="" src="images/kj_01.jpg" /> </div>
    </div>
    <div class="lm03">
      <div class="title"><img style="padding-right:5px;" class="icon" src="images/weaicon.jpg" />
        <h2>天气</h2>
      </div>
      <div class="detail"> <img class="" src="images/kj_02.jpg" /> </div>
    </div>
  </div>
  <div class="mainbody">
    <div class="currmenu">
      <ul class="rig_nav">
        <li class="rig_seleli"><a href="#">当前</a><span> x </span></li>
        
      </ul>
    </div>
    <div class="adtip">
      <div class="tip">
        <p class="goom">早上好，周云瑞！</p>
        <p>您目前有<span>15</span>条待办，<span>1</span>条调动信息，<span>2</span>条入职通知！</p>
      </div>
      <div class="adv">
        <p>公司统一公告在这边展示</p>
        <span> x </span> </div>
    </div>
    
    <div class="rig_lm01">
      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
        <h2>通知</h2>
        <span class="red_numb">2</span></div>
      <div class="detail">
        <div class="dat01"> <span class="datti"><span>20</span> <br />
          <span class="jan">jan</span></span> <span class="sqdeta"><img src="images/bs_03.jpg"> 您想王晓磊提交的换班申请已经通过，交换班次时间为2014-02-09  09:00-18:00，请按时上班！</span>
          <p class="linkbut"><a href="#">加入日历</a><a href="#">查看</a><a href="#">知道了</a></p>
        </div>
        <div class="dat02"> <span class="datti"><span>20</span> <br />
          <span class="jan">jan</span></span> <span class="sqdeta"><img src="images/bs_04.jpg"> 您提交的请假申请未审批通过</span>
          <p class="linkbut"><a href="#">查看</a><a href="#">知道了</a></p>
        </div>
      </div>
    </div>
    <div class="rig_lm02">
      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
        <h2>绩效打分进度</h2>
      </div>
      <div class="detail">
        <div class="det_inner">
          <div class="jd"><img src="images/jd.jpg" alt="" title=""></div>
          <div class="bs">
            <p><img src="images/bs_01.jpg" alt="" title=""> 已完成打分</p>
            <p><img src="images/bs_02.jpg" alt="" title=""> 未完成打分和异常打分</p>
          </div>
          <div class="scordeti">
            <ul>
              <li>
                <p class="ywc">1120</p>
                <h3>已完成打分人数</h3>
              </li>
              <li>
                <p class="wwc">11</p>
                <h3>未打分人数</h3>
              </li>
              <li>
                <p class="ycd">2</p>
                <h3>异常打分人数</h3>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <div class="rig_lm03">
      <div class="title"><img src="images/listicon.jpg" class="icon" style="padding-top:13px;">
        <h2>待办事项</h2>
      </div>
      <div class="detail">
        <div class="inner03">
          <div id="tabCot_product" class="zhutitab">
            <div class="tabContainer">
              <ul class="tabHead" id="tabCot_product-li-currentBtn-">
                <li class="currentBtn"><a href="javascript:void(0)" title="绩效考核" rel="1">绩效考核</a><span class="grey_numb">12</span></li>
                <li ><a href="javascript:void(0)" title="人事考核" rel="2">人事考核</a><span class="red_numb">2</span></li>
                <li ><a href="javascript:void(0)" title="TAB名称" rel="3">TAB名称</a><span class="red_numb">5</span></li>
              </ul>
              <p class="shent"><span>Show entries: </span>
                <input style="width:30px;" type="text" value="10">
                <img src="images/sz.jpg" class="icon" style=""></p>
              <div class="clear"></div>
            </div>
            <div id="tabCot_product_1" class="tabCot" >
              <table class="tabindex" width="100%" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">姓名</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">所属部门</span><span class="xila">&or;</span></th>
                  <th width="22%" bgcolor="#f8f8f8" scope="col"><span class="titlab">职位</span><span class="xila">&or;</span></th>
                  <th width="21%" bgcolor="#f8f8f8" scope="col"><span class="titlab">入职时间</span><span class="xila">&or;</span></th>
                  <th width="7%" bgcolor="#f8f8f8" scope="col"><span class="titlab">评分</span><span class="xila">&or;</span></th>
                  <th width="19%" bgcolor="#f8f8f8" scope="col">操作</th>
                </tr>
                <tr>
                   <td bgcolor="#FFFFFF">小明</td>
                  <td class="datacol" bgcolor="#FFFFFF">研发部</td>
                  <td bgcolor="#FFFFFF">部门经理</td>
                  <td bgcolor="#FFFFFF">2018-07-05</td>
                  <td class="yccol" bgcolor="#FFFFFF">100</td>
                  <td class="czcol" bgcolor="#FFFFFF"><a href="#">修改信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">查看</a></td>
                </tr>
                <tr>
                   <td bgcolor="#FFFFFF">小红</td>
                  <td class="datacol" bgcolor="#FFFFFF">质检部</td>
                  <td bgcolor="#FFFFFF">部门经理</td>
                  <td bgcolor="#FFFFFF">2018-07-05</td>
                  <td class="yccol" bgcolor="#FFFFFF">100</td>
                  <td class="czcol" bgcolor="#FFFFFF"><a href="#">修改信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">查看</a></td>
                 </tr>
                <tr>
                   <td bgcolor="#FFFFFF">小蓝</td>
                  <td class="datacol" bgcolor="#FFFFFF">销售部</td>
                  <td bgcolor="#FFFFFF">部门经理</td>
                  <td bgcolor="#FFFFFF">2018-07-05</td>
                  <td class="yccol" bgcolor="#FFFFFF">100</td>
                  <td class="czcol" bgcolor="#FFFFFF"><a href="#">修改信息</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">查看</a></td>
                 </tr>
                
              </table>
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
            <div id="tabCot_product_2" class="tabCot"  style="display: none;"> 2222222222 </div>
            <div id="tabCot_product_3" class="tabCot"  style="display: none;"> 3333333333 </div>
            <script language="JavaScript" type="text/javascript" src="js/tab.js"></script> 
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="footer"></div>
</body>
</html>