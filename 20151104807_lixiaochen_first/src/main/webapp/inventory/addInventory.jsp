<%@ page language="java" pageEncoding="UTF-8"%>
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
							style="box-sizing: initial; -webkit-box-sizing: initial;">添加商品</li>
					</ul>
				</div>
				<div class="bd">

					<ul class="theme-popbod dform">
						<div class="am-cf admin-main" style="padding-top: 0px;">

							<div class="am-cf admin-main" style="padding-top: 0px;">
								<!-- content start -->
								<div class="admin-content">
									<div class="admin-content-body">

										<div class="am-g">
											<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
											<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
												style="padding-top: 30px;">
												<form class="am-form am-form-horizontal"
													action="/InventoryManage/inventory/add.do" method="post">

													<div class="am-form-group">
														<label for="name" class="am-u-sm-3 am-form-label">
															商品名称</label>
														<div class="am-u-sm-9">
															<input type="text" id="name" required placeholder="商品名称"
																name="productName">
														</div>
													</div>

													<div class="am-form-group">
														<label for="name" class="am-u-sm-3 am-form-label">
															商品价格</label>
														<div class="am-u-sm-9">
															<input type="text" id="name" required placeholder="商品价格"
																name="productPrice">
														</div>
													</div>

													<div class="am-form-group">
														<label for="name" class="am-u-sm-3 am-form-label">
															商品数量</label>
														<div class="am-u-sm-9">
															<input type="text" id="name" required
																placeholder="请输入商品数量" name="productNum">
														</div>
													</div>

													<div class="am-form-group">
														<label for="user-intro" class="am-u-sm-3 am-form-label">
															备注</label>
														<div class="am-u-sm-9">
															<textarea class="" rows="5" id="user-intro" name="remark"
																placeholder="输入备注"></textarea>

														</div>
													</div>
													<div class="am-form-group">
														<div class="am-u-sm-9 am-u-sm-push-3">
															<input type="submit" class="am-btn am-btn-success"
																value="添加" />
														</div>
													</div>
												</form>
											</div>
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