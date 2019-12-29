package com.tencent.servlet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;


public class DbUtils {
	//数据库配置信息
		private static String driver = "";
		private static String url = "";
		private static String user = "";
		private static String password = "";

		//静态代码块（只执行一次，类被加载的时候执行）
		static {
			try {
				driver ="com.mysql.jdbc.Driver";
				url = "jdbc:mysql://localhost:3306/jdbctest";
				user = "root";
				password = "123456";
				//开始加载驱动
				Class.forName(driver);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * 获取数据库连接
		 * @return
		 */
		public static Connection getConnection() {
			//获取Connection
			Connection connection = null;
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				System.err.println("当前获取数据库连接参数有误[" + url + "][" + user + "][" + password + "]");
				e.printStackTrace();
			}
			return connection;
		}

		/**
		 * 关闭连接
		 * @param connection
		 */
		public static void closeConnection(Connection connection) {
			//判断是否为空
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		/**
		 * 获取Statement
		 * @param connection
		 * @return
		 */
		public static Statement getStatement(Connection connection) {
			//声明
			Statement statement = null;
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return statement;
		}

		/**
		 * 关闭Statement
		 * @param statement
		 */
		public static void closeStatement(Statement statement) {
			try {
				//判断为空
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		/**
		 * 获取预处理Statement
		 * @param connection
		 * @param sql
		 */
		public static PreparedStatement getPreparedStatement(Connection connection, CharSequence sql) {
			//声明
			PreparedStatement preparedStatement = null;
			try {
				preparedStatement = connection.prepareStatement(sql.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return preparedStatement;
		}

		/**
		 * 关闭结果集
		 * @param resultSet
		 */
		public static void closeResult(ResultSet resultSet) {
			try {
				//判断是否为空
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		/**
		 * 关闭连接释放资源
		 * @param connection
		 * @param statement
		 * @param resultSet
		 */
		public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) {
			closeResult(resultSet);
			closeStatement(statement);
			closeConnection(connection);
		}

}
