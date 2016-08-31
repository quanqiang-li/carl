<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>出错了</title>
<style>
/*404页面开始*/
.mobdec{width:700px;height:325px; margin:0 auto; background:url(<%=path%>images/gf2.png) no-repeat;}
.mobdex{width:350px;height:180px; float:right; padding-top:130px;}
.mobdex ul li{ list-style:none; line-height:30px;}
.mobdex-size{font-weight:bold; font-size:14px;}
.mo-bedu{ font-size:14px;}
.mo-bedp{padding-left:30px;}
.mo-bedk{ display:block;height:30px; margin-top:10px; }
.mo-bedk li a{width:70px; height:25px; float:left;background:#e8fcff; margin-left:10px; text-align:center; line-height:25px;border:1px solid #b5dcf1;border-radius:5px 5px 5px 5px;color:#4b90b4; }
/*404页面结束*/
</style>

</head>

<body>
<div class="mobdec">
	<div class="mobdex">
    	   <ul>
                <li class="mo-bedu">非常抱歉，并没有找到您需要的页面。最可能的原因是：</li>
                <li class="mo-bedp">●&nbsp;地址栏的地址可能是错误的。</li>
                <li class="mo-bedp">●&nbsp;您的点击链接不存在或者更新中。</li>
                <li class="mobdex-size">请点击下面链接回到首页或者刷新此页面：</li>
            <ul class="mo-bedk">
                <li><a href="<%=basePath %>">回到首页</a></li>
                <li><a href="javascript:history.go(-1);">刷新页面</a></li>
            </ul>
        </ul>
    </div>
</div>
</body>
</html>