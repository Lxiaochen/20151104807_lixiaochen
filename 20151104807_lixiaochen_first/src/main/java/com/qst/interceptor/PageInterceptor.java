package com.qst.interceptor;


import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
//StatementHandler����һprepare(Connection,transactiontimeout)  executor  R
import org.apache.ibatis.session.ResultHandler;

import com.qst.base.BaseEntity;

@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class PageInterceptor implements Interceptor {
	// ������еĴ��룬��������ԭ�еķ���
	
	public Object intercept(Invocation invocation) throws Throwable {
		//��ȡĿ�����
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		
		MetaObject metaStatementHandler = SystemMetaObject.forObject(statementHandler);
		
		BoundSql boundSql = (BoundSql) metaStatementHandler.getValue("delegate.boundSql");
		// ��ҳ������Ϊ��������parameterObject��һ������
		String sql = boundSql.getSql();
		System.out.println(sql);
		
		if (boundSql.getParameterObject() instanceof BaseEntity) {
			BaseEntity co = (BaseEntity) (boundSql.getParameterObject());
			if (co != null)
				if (co.isPage()) {
					int startRow = (co.getPageNum() - 1) * co.getPerRow() ;
					String mysql = sql + " limit " + startRow + "," + co.getPerRow();
					System.out.println(mysql);
					metaStatementHandler.setValue("delegate.boundSql.sql", mysql);
				}
		}

		
		
		
		
		/*BaseEntity co = (BaseEntity) (boundSql.getParameterObject());
		System.out.println(co.getPageNum());
		if (co != null)
			if (co.isPage()) {
				int startRow = (co.getPageNum() - 1) * co.getPerRow() + 1;
				System.out.println(startRow);
				String mysql = sql + " limit " + startRow + "," + co.getPageNum();
				System.out.println(mysql);
				metaStatementHandler.setValue("delegate.boundSql.sql", mysql);
			}*/
		

		/*Common co = (Common) (boundSql.getParameterObject());
		if(co!=null)
		if(co.isBool())
		{			
			int startRow=(co.getPage()-1)*co.getRow()+1;
			String mysql=sql+" limit "+startRow+","+co.getRow();	
			System.out.println(mysql);
			metaStatementHandler.setValue("delegate.boundSql.sql", mysql); 
		}*/
		
		return invocation.proceed();
	}

	// ��������StatementHandler
	public Object plugin(Object target) {
		if (target instanceof StatementHandler) {
			//���� �������
			return Plugin.wrap(target, this);
		} else {
			return target;
		}
	}

	public void setProperties(Properties properties) {
	}

	/**
	 * Ӳ����
	 * @param sql
	 * @return
	 */
	public String returnSql(String sql)
	{
		StringBuffer strB=new StringBuffer(sql);
		strB.insert(6, " rownum rr,");
		return strB.toString();
	}
	

	
}