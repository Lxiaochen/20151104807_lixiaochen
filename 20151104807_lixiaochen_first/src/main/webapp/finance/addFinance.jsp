<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
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
							style="box-sizing: initial; -webkit-box-sizing: initial;">添加财务</li>
					</ul>
				</div>
				<div class="bd">
					<ul style="display: block; padding: 20px;">


					</ul>
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
												<form class="am-form am-form-horizontal"
													action="${pageContext.request.contextPath }/finance/add.do" method="post">

													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															明细 </label>
														<div class="am-u-sm-9">
															<input type="text" 
																 name="detail">
														</div>
													</div>
													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															描述  </label>
														<div class="am-u-sm-9">
															<input type="text"  
																 name="remark">
														</div>
													</div>
													<div class="am-form-group">
														<label for="user-name" class="am-u-sm-3 am-form-label">
															执行人  </label>
														<div class="am-u-sm-9">
															<input type="text"  
																 name="userName">
														</div>
													</div>
													
													
													<div class="am-form-group">
														<div class="am-u-sm-9 am-u-sm-push-3">
															<input type="submit" class="am-btn am-btn-success"
																value="添加财务" />
														</div>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
								<!-- content end -->
							</div>
							<!--添加角色 end--
						</ul>
					</div>
				</div>
				<!--tab end-->

						</div>

</ul>
						
				</div>
				</div>
				</div>
				</div>
</body>


</html>