<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - 树形视图</title>

    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/plugins/jsTree/style.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css?v=4.1.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">

        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-content">

                        <strong>jsTree</strong>是一个基于jQuery的Tree控件。支持 XML，JSON，Html三种数据源。提供创建，重命名，移动，删除，拖放节点操作。可以自己自定义创建，删除，嵌套，重命名，选择节点的规则。在这些操作上可以添加多种监听事件。
                        <br>更多信息请访问： <a href="http://www.jstree.com/" target="_blank">http://www.jstree.com/</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>基本示例 <small>使用Font Awesome图标</small></h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">

                        <div id="jstree1">
                            <ul>
                                <li class="jstree-open">H+主题
                                    <ul>
                                        <li>css
                                            <ul>
                                                <li data-jstree='{"type":"css"}'> <input type="checkbox"  class="i-checks" >animate.css</li>
                                                <li data-jstree='{"type":"css"}'>bootstrap.css</li>
                                                <li data-jstree='{"type":"css"}'>style.css</li>
                                            </ul>
                                        </li>
                                        <li>email-templates
                                            <ul>
                                                <li data-jstree='{"type":"html"}'>action.jsp</li>
                                                <li data-jstree='{"type":"html"}'>alert.jsp</li>
                                                <li data-jstree='{"type":"html"}'>billing.jsp</li>
                                            </ul>
                                        </li>
                                        <li>fonts
                                            <ul>
                                                <li data-jstree='{"type":"svg"}'>glyphicons-halflings-regular.eot</li>
                                                <li data-jstree='{"type":"svg"}'>glyphicons-halflings-regular.svg</li>
                                                <li data-jstree='{"type":"svg"}'>glyphicons-halflings-regular.ttf</li>
                                                <li data-jstree='{"type":"svg"}'>glyphicons-halflings-regular.woff</li>
                                            </ul>
                                        </li>
                                        <li class="jstree-open">img
                                            <ul>
                                                <li data-jstree='{"type":"img"}'>profile_small.jpg</li>
                                                <li data-jstree='{"type":"img"}'>angular_logo.png</li>
                                                <li class="text-navy" data-jstree='{"type":"img"}'>html_logo.png</li>
                                                <li class="text-navy" >mvc_logo.png</li>
                                            </ul>
                                        </li>
                                        <li class="jstree-open">js
                                            <ul>
                                                <li data-jstree='{"type":"js"}'>hplus.js</li>
                                                <li data-jstree='{"type":"js"}'>bootstrap.js</li>
                                                <li data-jstree='{"type":"js"}'>jquery-2.1.1.js</li>
                                                <li data-jstree='{"type":"js"}'>jquery-ui.custom.min.js</li>
                                                <li class="text-navy" data-jstree='{"type":"js"}'>jquery-ui-1.10.4.min.js</li>
                                            </ul>
                                        </li>
                                        <li data-jstree='{"type":"html"}'>affix.jsp</li>
                                        <li data-jstree='{"type":"html"}'>dashboard.jsp</li>
                                        <li data-jstree='{"type":"html"}'>buttons.jsp</li>
                                        <li data-jstree='{"type":"html"}'>calendar.jsp</li>
                                        <li data-jstree='{"type":"html"}'>contacts.jsp</li>
                                        <li data-jstree='{"type":"html"}'>css_animation.jsp</li>
                                        <li class="text-navy" data-jstree='{"type":"html"}'>flot_chart.jsp</li>
                                        <li class="text-navy" data-jstree='{"type":"html"}'>google_maps.jsp</li>
                                        <li data-jstree='{"type":"html"}'>icons.jsp</li>
                                        <li data-jstree='{"type":"html"}'>inboice.jsp</li>
                                        <li data-jstree='{"type":"html"}'>login.jsp</li>
                                        <li data-jstree='{"type":"html"}'>mailbox.jsp</li>
                                        <li data-jstree='{"type":"html"}'>profile.jsp</li>
                                        <li class="text-navy" data-jstree='{"type":"html"}'>register.jsp</li>
                                        <li data-jstree='{"type":"html"}'>timeline.jsp</li>
                                        <li data-jstree='{"type":"html"}'>video.jsp</li>
                                        <li data-jstree='{"type":"html"}'>widgets.jsp</li>
                                    </ul>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>JSON示例</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">

                        <div id="using_json"></div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/content.min.js?v=1.0.0"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/jsTree/jstree.min.js"></script>
    <style>
        .jstree-open>.jstree-anchor>.fa-folder:before{content:"\f07c"}.jstree-default .jstree-icon.none{width:0}
    </style>
    <script>
        $(document).ready(function(){$("#jstree1").jstree({"core":{"check_callback":true},"plugins":["types","dnd"],"types":{"default":{"icon":"fa fa-folder"},"html":{"icon":"fa fa-file-code-o"},"svg":{"icon":"fa fa-file-picture-o"},"css":{"icon":"fa fa-file-code-o"},"img":{"icon":"fa fa-file-image-o"},"js":{"icon":"fa fa-file-text-o"}}});$("#using_json").jstree({"core":{"data":["Empty Folder",{"text":"Resources","state":{"opened":true},"children":[{"text":"css","children":[{"text":"animate.css","icon":"none"},{"text":"bootstrap.css","icon":"none"},{"text":"main.css","icon":"none"},{"text":"style.css","icon":"none"}],"state":{"opened":true}},{"text":"js","children":[{"text":"bootstrap.js","icon":"none"},{"text":"hplus.min.js","icon":"none"},{"text":"jquery.min.js","icon":"none"},{"text":"jsTree.min.js","icon":"none"},{"text":"custom.min.js","icon":"none"}],"state":{"opened":true}},{"text":"html","children":[{"text":"layout.jsp","icon":"none"},{"text":"navigation.jsp","icon":"none"},{"text":"navbar.jsp","icon":"none"},{"text":"footer.jsp","icon":"none"},{"text":"sidebar.jsp","icon":"none"}],"state":{"opened":true}}]},"Fonts","Images","Scripts","Templates",]}})});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>