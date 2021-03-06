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
							style="box-sizing: initial; -webkit-box-sizing: initial;">库存管理</li>
					</ul>
				</div>
				<div class="bd">
					<ul style="display: block; padding: 20px;">
						<li>
							<!--分页显示角色信息 start-->
							<div id="dv1">
								<table class="table" id="tbRecord">
									<thead>
										<tr>
											<th>库存编号</th>
											<th>商品名称</th>
											<th>商品价格</th>
											<th>商品数量</th>
											<th>商品备注</th>
											<th colspan="2">操作</th>
										</tr>
									</thead>
									<tbody>
									<c:forEach items="${page.list}" var="list">
											<tr>
												<td>${list.productId }</td>
												<td>${list.productName }</td>
												<td>${list.productPrice }</td>
												<td>${list.productNum}</td>
												<td>${list.remark}</td>
												<td colspan="2"><a
													href="/InventoryManage/inventory/query.do?productId=${list.productId }"
													target="main">修改</a> <a
													href="/InventoryManage/inventory/delete.do?productId=${list.productId }">删除</a>
												</td>
											</tr>
										</c:forEach>
									</tbody>

								</table>
								<center>
									<c:if test="${ page.pageNum==1}">
								    	首页
								   		||上一页
								   	</c:if>
								<c:if test="${page.pageNum!=1 }">
									<a href="/InventoryManager/inventory/list.do?pageNum=1">首页||</a>
									<a
										href="/InventoryManager/inventory/list.do?pageNum=${ page.upPage}">上一页||</a>
								</c:if>
								<c:if test="${page.pageNum!=page.totalPage }">
									<a
										href="/InventoryManager/inventory/list.do?pageNum=${ page.nextPage }">下一页||</a>
									<a
										href="/InventoryManager/inventory/list.do?pageNum=${ page.totalPage }">尾页</a>
								</c:if>
								<c:if test="${page.pageNum==page.totalPage }">
								   		下一页||尾页
							
								</c:if>
								</center>
							
							</div>
						</li>
					</ul>
					

		</div>



	</div>
</body>

</html>