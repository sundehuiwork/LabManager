<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - Sweet alert</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <!-- Sweet Alert -->
    <link href="${pageContext.request.contextPath}/assets/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/assets/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/assets/css/style.min.css?v=4.1.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox ">
                    <div class="ibox-title">
                        <h5>Sweet Alert</h5>
                    </div>

                    <div class="ibox-content">

                        <strong>可以替换JavaScript中alert的插件</strong>

                        <p>
                            Sweet Alert 是一个替代传统的 JavaScript Alert 的漂亮提示效果。SweetAlert 自动居中对齐在页面中央，不管您使用的是台式电脑，手机或平板电脑看起来效果都很棒。另外提供了丰富的自定义配置选择，可以灵活控制。项目主页：
                            <a href="http://t4t5.github.io/sweetalert/" target="_blank">http://t4t5.github.io/sweetalert/</a>

                        </p>

                        <div class="row text-center">

                            <div class="col-sm-6 h-100 p-lg">
                                <p>基本消息</p>
                                <button class="btn btn-primary btn-sm demo1">打开示例</button>
                            </div>
                            <div class="col-sm-6 h-100 p-lg">
                                <p>成功提示 </p>
                                <button class="btn btn-success btn-sm demo2">打开示例</button>
                            </div>
                            <div class="col-sm-6 h-100 p-lg">
                                <p>警告信息</p>
                                <button class="btn btn-warning btn-sm demo3">打开示例</button>
                            </div>
                            <div class="col-sm-6 h-100 p-lg">
                                <p>通过传参可以自定义取消按钮 </p>
                                <button class="btn btn-danger btn-sm demo4">打开示例</button>
                            </div>





                        </div>
                        <div class="m-t-md">
                            <p>
                                您可以在js中很简单的实用SweetAlert，如添加一个警告框：
                            </p>
                            <pre>
$('.demo3').click(function () {
    swal({
        title: "您确定要删除这条信息吗",
        text: "删除后将无法恢复，请谨慎操作！",
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "删除",
        closeOnConfirm: false
    }, function () {
        swal("删除成功！", "您已经永久删除了这条信息。", "success");
    });
});</pre>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath}/assets/js/content.min.js?v=1.0.0"></script>
    <script src="${pageContext.request.contextPath}/assets/js/plugins/sweetalert/sweetalert.min.js"></script>
    <script>
        $(document).ready(function(){$(".demo1").click(function(){swal({title:"欢迎使用SweetAlert",text:"Sweet Alert 是一个替代传统的 JavaScript Alert 的漂亮提示效果。"})});$(".demo2").click(function(){swal({title:"太帅了",text:"小手一抖就打开了一个框",type:"success"})});$(".demo3").click(function(){swal({title:"您确定要删除这条信息吗",text:"删除后将无法恢复，请谨慎操作！",type:"warning",showCancelButton:true,confirmButtonColor:"#DD6B55",confirmButtonText:"删除",closeOnConfirm:false},function(){swal("删除成功！","您已经永久删除了这条信息。","success")})});$(".demo4").click(function(){swal({title:"您确定要删除这条信息吗",text:"删除后将无法恢复，请谨慎操作！",type:"warning",showCancelButton:true,confirmButtonColor:"#DD6B55",confirmButtonText:"是的，我要删除！",cancelButtonText:"让我再考虑一下…",closeOnConfirm:false,closeOnCancel:false},function(isConfirm){if(isConfirm){swal("删除成功！","您已经永久删除了这条信息。","success")}else{swal("已取消","您取消了删除操作！","error")}})})});
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>

</html>