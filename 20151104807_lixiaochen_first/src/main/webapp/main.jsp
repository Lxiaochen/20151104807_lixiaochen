<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <script src="js/jquery.min.js"  type="application/javascript"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script src="js/bootstrap.min.js" type="application/javascript"></script>
    <link href="css/dashboard.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" />

    <style type="text/css">
            body{margin:0;}
            html, body{height:100%;}
            img{border:none;}
            *{font-family:'微软雅黑';font-size:12px;color:#626262;}
            dl,dt,dd{display:block;margin:0;}
            a{text-decoration:none;}
            #bg{background-image:url(images/content/dotted.png);}
            .container{width:100%;height:100%;margin:auto;}

            /*left*/
            .menus_area{width:250px;height:auto !important;overflow:visible !important;position:fixed;height:100% !important;background-color:#3992d0;}
            .line{height:2px;width:100%;background-image:url(images/left/line_bg.png);background-repeat:repeat-x;}
            .menus_area dt{padding-left:40px;padding-right:10px;background-repeat:no-repeat;background-position:10px center;background-color: #3992d0;color:#f5f5f5;font-size:14px;position:relative;line-height:48px;cursor:pointer;}
            .menus_area dd{background-color:#317eb4;padding-left:40px;display: none}
            .menus_area dd a{color:#f5f5f5;line-height:20px;}
            .menus_area dt img{position:absolute;right:10px;top:20px;}
            .system_log dt{background-image:url(images/left/system.png)}
            .custom dt{background-image:url(images/left/custom.png)}
            .channel dt{background-image:url(images/left/channel.png)}
            .app dt{background-image:url(images/left/app.png)}
            .cloud dt{background-image:url(images/left/cloud.png)}
            .syetem_management dt{background-image:url(images/left/syetem_management.png)}
            .source dt{background-image:url(images/left/source.png)}
            .statistics dt{background-image:url(images/left/statistics.png)}
            .menus_area dl dd:last-child{padding-bottom:10px;}
            dt.on{background-color: #317eb4}
        </style>
</head>
<body>
 <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">进销存管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Help</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
           <div class="menus_area" id="menus_area">
                <div class="line"></div>
                
              
                <dl class="source">
                    <dt>用户管理</dt>
                    <dd class="first_dd"><a href="user/addUser.jsp" target="main">用户添加</a></dd>
                    <dd><a href="user/listUser.do?pageNum=1" target="main">用户列表</a></dd>
                </dl>

				 <dl class="source">
                    <dt>库存管理</dt>
                    <dd class="first_dd"><a href="inventory/addInventory.jsp" target="main">添加商品</a></dd>
                    <dd><a href="/InventoryManage/inventory/list.do" target="main">库存管理</a></dd>
                </dl>
                
                 <dl class="source">
                    <dt>预警信息管理</dt>
                    <dd class="first_dd"><a href="warning/addWarning.jsp" target="main">预警信息添加</a></dd>
                    <dd><a href="/InventoryManage/warning/list.do" target="main">预警信息管理</a></dd>
                </dl>
                 <dl class="source">
                    <dt>分类管理</dt>
                    <dd><a href="type/select.do" target="main">分类列表</a></dd>
                    <dd><a href="type/addType.jsp" target="main">添加分类</a></dd>
                </dl> 
                 <dl class="source">
                    <dt>入库管理</dt>
                    <dd><a href="inbound/select.do" target="main">入库列表</a></dd>
                    <dd><a href="inbound/addInbound.jsp" target="main">入库增加</a></dd>
                </dl>
                 <dl class="source">
                    <dt>出库管理</dt>
                    <dd><a href="outboud/select.do" target="main">出库列表</a></dd>
                    <dd><a href="outboud/addOutboud.jsp" target="main">出库增加</a></dd>
                </dl>
                
                <dl class="source">
                    <dt>财务管理</dt>
                    <dd><a href="finance/select.do" target="main">财务列表</a></dd>
                    <dd><a href="finance/addFinance.jsp" target="main">添加财务</a></dd>
                </dl>
                <dl class="source">
                    <dt>订单管理</dt>
                    <dd><a href="order/select.do" target="main">订单列表</a></dd>
                    <dd><a href="order/addOrder.jsp" target="main">添加订单</a></dd>
                </dl>
                <dl class="source">
                    <dt>登录管理</dt>
                    <dd><a href="login/login.html">登录用户</a></dd>
                </dl>
            </div>
          	
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
         <iframe width="100%" height="100%" name="main" style="border-style: none;"></iframe>
        </div>
      </div>
    </div>
   
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript">

            $(function() {
                $("#menus_area").find("dt").click(function() { //一级菜单点击
                    if (!$(this).hasClass("on")) { //当前一级菜单不选中状态才切换
                        $("#menus_area").find("dt").removeClass("on");//所有的一级菜单去除选中样式
                        $(this).addClass("on");//当前一级菜单去除选中样式
                        $('dd').slideUp();//所有二级菜单隐藏
                        $(this).nextAll('dd').slideToggle();//当前所有二级菜单切换
                    }
                });
            })
        </script>
		<div style="text-align:left;">
</div>
    
</body>
</html>