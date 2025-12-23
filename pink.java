package com.ami;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pink extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("uname");
		PrintWriter out=res.getWriter();
		out.println("<h1>Hope your are enjoying "+name+"</h1>");
	}

}
