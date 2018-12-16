package com.qst.dao;

import com.qst.po.User;
import com.qst.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用户DAO层实现
 */
public class UserDaoImpl implements UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	public User findUser(String usercode,
                         String password){

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		User user = null;

		String sql =    "SELECT " +
						"    * " +
						"FROM " +
						"    sys_user " +
						"WHERE " +
						"    user_code = ? " +
						"AND user_password = ?";
		try {
			// 获取到链接
			connection = DBUtil.getConnection();

			// 创建一个prepareStatement
			preparedStatement = connection.prepareStatement(sql);

			// 参数赋值
			preparedStatement.setString(1, usercode);
			preparedStatement.setString(2, password);

			// 执行sql语句
			rs = preparedStatement.executeQuery();

			// 结果集中取数据
			while (rs.next()) {
				user = new User();
				user.setUser_id(Integer.parseInt(rs.getString("user_id")));
				user.setUser_code(rs.getString("user_code"));
				user.setUser_name(rs.getString("user_name"));
				user.setUser_password(rs.getString("user_password"));
				user.setUser_state(Integer.parseInt(rs.getString("user_state")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeJDBC(rs,preparedStatement,connection);
		}
		return user;
	}
}
