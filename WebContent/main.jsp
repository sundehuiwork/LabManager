<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>sun智能管理系统</title>

    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/favicon.ico">
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg " style="overflow:hidden" >
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element" align="left">
                       
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                                <span class="block m-t-xs"><strong class="font-bold">欢迎您：${vo.rolename}</strong></span>
                                </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="${pageContext.request.contextPath}/templates/profile.jsp">个人资料</a>
                                </li>
                                <li><a class="J_menuItem" href="${pageContext.request.contextPath}/templates/contacts.jsp">联系我们</a>
                                </li>
                                <li><a class="J_menuItem" href="${pageContext.request.contextPath}/templates/mailbox.jsp">信箱</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="${pageContext.request.contextPath}/login.jsp">安全退出</a>
                                </li>
                            </ul>
                        </div>
                        <div class="logo-element"> <img   style="height:100%; weight:100%;" src="${pageContext.request.contextPath}/img/favicon.ico"/>
                        </div>
                    </li>
                 	<c:if  test="${vo.isadmin==1}"> 
                    <li>
                        <a href="#">
                            <i class="fa fa-home"></i>
                            <span class="nav-label"> 系统管理</span>
                            <span class="fa arrow"></span>
                        </a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/sysuser/index.action" data-index="0">用户管理</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/templates/index_v3.jsp">角色管理</a>
                            </li>
                            <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/freemarker/index_v3.jsp">资源管理</a>
                            </li>
                              <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/autocode/productCode.jsp">代码生成器</a>
                            </li>
                              <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/freemarker/test1.action">freemarker静态页面测试1</a>
                            </li>
                             <li>
                                <a class="J_menuItem" href="${pageContext.request.contextPath}/freemarker/test2.action">freemarker静态页面测试2</a>
                            </li>
                        </ul>

                    </li>
                    <li>
                        <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">拓扑管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">网络拓扑</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">系统拓扑</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">产品管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">网络设备管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">IP管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">位置管理</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-flask"></i> <span class="nav-label">产品管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">网络管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">主机管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">数据库管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">中间件管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">应用管理</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">日志管理</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table"></i> <span class="nav-label">故障管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">告警规则</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">当前告警</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">告警查看</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">告警分析</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">
                               处理经验</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-flask"></i> <span class="nav-label">设备管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">设备入库</a>
                            </li>
                     		<li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">设备出库</a>
                            </li>
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">设备使用情况查询</a>
                            </li>
                        </ul>
                    </li>
                    </c:if >
                    <c:if  test="${vo.isadmin==0}"> 
                    <li>
                        <a href="#"><i class="fa fa-flask"></i> <span class="nav-label">设备管理</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a class="J_menuItem" href="${pageContext.request.contextPath}/business/frm/user/user0000.jsp">设备借用</a>
                            </li>
                     
                        </ul>
                    </li>
                    </c:if>
                    
                </ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        
        <div id="page-wrapper" class="gray-bg dashbard-1">
        
        	<!--抬头部分开始-->
            <jsp:include flush="true" page="/inc/top.jsp"></jsp:include>
            <!--抬头部分结束-->
            
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="${pageContext.request.contextPath}/templates/index_v3.jsp">首页</a>
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a>
                        </li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="${pageContext.request.contextPath}/login.jsp" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="${pageContext.request.contextPath}/templates/index_v3.jsp?v=4.0" frameborder="0" data-id="${pageContext.request.contextPath}/templates/index_v3.jsp" seamless></iframe>
            </div>
            
            <!--footer部分开始-->
            <jsp:include flush="true" page="/inc/footer.jsp"></jsp:include>
            <!--footer部分结束-->
        </div>
        <!--右侧边栏开始-->
        <jsp:include flush="true" page="/inc/right.jsp"></jsp:include>
        <!--右侧边栏结束-->
        <!--mini聊天窗口开始-->
        <jsp:include flush="true" page="/inc/right_chat.jsp"></jsp:include>
        <!--mini聊天窗口结束-->
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/layer/layer.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/hplus.min.js?v=4.1.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/contabs.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/pace/pace.min.js"></script>
</body>

</html>