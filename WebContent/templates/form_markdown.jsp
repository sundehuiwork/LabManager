<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - Bootstrap3 Markdown编辑器</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/plugins/markdown/bootstrap-markdown.min.css" />
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css?v=4.1.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content">

                <div class="row">
                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>Markdown文本编辑器</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="form_editors.jsp#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="form_editors.jsp#">选项1</a>
                                        </li>
                                        <li><a href="form_editors.jsp#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">
                                <textarea name="content" data-provide="markdown" rows="10"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">

                            <div class="ibox-content">
                                <div data-provide="markdown-editable">
                                    <h2>Bootstrap-Markdown简介</h2>
                                    <p>Bootstrap-Markdown是一款优秀的markdown编辑器，提供了实用的API，利用插件进行扩展。<code>你可以单击这段文字试试</code>
                                    </p>
                                </div>
                                <p class="alert alert-success alert-dismissable m-t">
                                    更多示例请访问：<a href="http://toopay.github.io/bootstrap-markdown/">http://toopay.github.io/bootstrap-markdown/</a>
                                    <br>GitHub：
                                    <a href="https://github.com/toopay/bootstrap-markdown">https://github.com/toopay/bootstrap-markdown</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>            
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/content.min.js?v=1.0.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/markdown/markdown.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/markdown/to-markdown.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/markdown/bootstrap-markdown.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/plugins/markdown/bootstrap-markdown.zh.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>