package com.tencent.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet  extends HttpServlet{
	UserServlet us=new UserServlet();
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
	//req发送请求；resp响应请求
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charst=utf-8");//我们写的内容以UTF-8让浏览器识别
		String r_name=req.getParameter("name");
		String r_pwd=req.getParameter("pwd");
		System.out.println(r_name);
		System.out.println(r_pwd);
		int count=us.doLogin(r_name,r_pwd);
		if(count>0){
//			resp.getWriter().write("登录成功");
			req.getRequestDispatcher("/example_P252.jsp").forward(req,resp);
			System.out.println("登录成功");
		}else{
			resp.getWriter().write("登录失败");
			System.out.println("登录失败");
		}
		
	}
}
