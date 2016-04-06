<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - 文件上传</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/plugins/dropzone/basic.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/plugins/dropzone/dropzone.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css?v=4.1.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeIn">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>文件上传</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="form_file_upload.jsp#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="form_file_upload.jsp#">选项1</a>
                                </li>
                                <li><a href="form_file_upload.jsp#">选项2</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <form id="my-awesome-dropzone" class="dropzone" action="form_file_upload.jsp#">
                            <div class="dropzone-previews"></div>
                            <button type="submit" class="btn btn-primary pull-right">提交</button>
                        </form>
                        <div>
                            <div class="m"><small>DropzoneJS是一个开源库，提供拖放文件上传与图片预览：<a href="https://github.com/enyo/dropzone" target="_blank">https://github.com/enyo/dropzone</a></small>，百度前端团队提供的<a href="http://fex.baidu.com/webuploader/" target="_blank">Web Uploader</a>也是一个非常不错的选择，值得一试！</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/content.min.js?v=1.0.0"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/dropzone/dropzone.js"></script>
    <script>
        $(document).ready(function(){Dropzone.options.myAwesomeDropzone={autoProcessQueue:false,uploadMultiple:true,parallelUploads:100,maxFiles:100,init:function(){var myDropzone=this;this.element.querySelector("button[type=submit]").addEventListener("click",function(e){e.preventDefault();e.stopPropagation();myDropzone.processQueue()});this.on("sendingmultiple",function(){});this.on("successmultiple",function(files,response){});this.on("errormultiple",function(files,response){})}}});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>