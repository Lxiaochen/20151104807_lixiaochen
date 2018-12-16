package com.qst.dao;

import com.qst.po.Customer;
import com.qst.po.User;
import com.qst.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public List<Customer> selectCustomerList(Customer customer) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        Customer customerLocal = null;
        List<Customer> list = new ArrayList<>();

        String sql =    "SELECT " +
                "    * " +
                "FROM " +
                "    customer ";
        try {
            // 获取到链接
            connection = DBUtil.getConnection();

            // 创建一个prepareStatement
            preparedStatement = connection.prepareStatement(sql);

            // 执行sql语句
            rs = preparedStatement.executeQuery();

            // 结果集中取数据
            while (rs.next()) {
                customerLocal = new Customer();
                customerLocal.setCust_name(rs.getString("cust_name"));
                list.add(customerLocal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeJDBC(rs,preparedStatement,connection);
        }
        return list;
    }

    @Override
    public Integer selectCustomerListCount(Customer customer) {
        return null;
    }

    @Override
    public int createCustomer(Customer customer) {
        return 0;
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return null;
    }

    @Override
    public int updateCustomer(Customer customer) {
        return 0;
    }

    @Override
    public int deleteCustomer(Integer id) {
        return 0;
    }
}
