<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>库存管理</title>

<link rel="stylesheet" />
<link rel="stylesheet" href="../css/Site.css" />
<link rel="stylesheet" href="../css/zy.all.css" />
<link rel="stylesheet" href="../css/font-awesome.min.css" />
<link rel="stylesheet" href="../css/amazeui.min.css" />
<link rel="stylesheet" href="../css/admin.css" />

</head>
<body>
	<div class="dvcontent">

		<div>
			<!--tab start-->
			<div class="tabs">
				<div class="hd">
					<ul>
						<li class="on"
							style="box-sizing: initial; -webkit-box-sizing: initial;">添加用户</li>
					</ul>
				</div>
				<div class="bd">
					
					<ul class="theme-popbod dform">
						<div class="am-cf admin-main" style="padding-top: 0px;">
							<!-- content start -->

							<div class="am-cf admin-main" style="padding-top: 0px;">
								<!-- content start -->
								<div class="admin-content">
									<div class="admin-content-body">

										<div class="am-g">
											<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
											<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
												style="padding-top: 30px;">
												<form class="am-form am-form-horizontal" action="/InventoryManage/user/addUser.do" method="post">

													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															用户名 / userName </label>
														<div class="am-u-sm-9">
															<input type="text"  required
																placeholder="用户名 / userName" name="userName">
														</div>
													</div>
													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															密码 / userPwd </label>
														<div class="am-u-sm-9">
															<input type="text"  required
																placeholder="密码 / userPwd" name="userPwd">
														</div>
													</div>
													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															性别 / sex </label>
														<div class="am-u-sm-9" style="line-height: 30px;">
															<input type="radio" id="man" name="sex" value="男"/> 
																<label> 男 </label> &nbsp;&nbsp;&nbsp;&nbsp; 
															<input type="radio" id="woman" name="sex" value="女" /> 
																<label> 女 </label> <br /> 
														</div>
													</div>
													
													<div class="am-form-group">
														<label for="user-email" class="am-u-sm-3 am-form-label">
															联系电话 / userTel </label>
														<div class="am-u-sm-9">
															<input type="tel"  required
																placeholder="请输入联系电话" name="userTel" /> 
														</div>
													</div>
													
													<div class="am-form-group">
														<label for="user-email" class="am-u-sm-3 am-form-label">
															家庭地址 / address </label>
														<div class="am-u-sm-9">
															<input type="tel"  required
																placeholder="请输入详细住址" name="address" /> 
														</div>
													</div>
													
													<div class="am-form-group">
														<div class="am-u-sm-9 am-u-sm-push-3">
															<input type="submit" class="am-btn am-btn-success" value="添加用户" />
														</div>
													</div>
												</form>
											</div>
										</div>
									</div>

								</div>
							</div>
						</ul>
					</div>
				</div>

						</div>


						
				</div>
</body>


</html>