package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;

import com.test.dao.*;
import com.test.util.GetSqlSession;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
		UserDaoImplement usrdao = new UserDaoImplement();
		SqlSession session = GetSqlSession.createSqlSession();
		
		String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html;charset=UTF-8");

        
        try {
			PrintWriter pw = resp.getWriter();
			pw.println("<html>");
			pw.println("<body>");
			if(usrdao.verify(username, password, session)==true)
			{
				pw.println("Login success.");
			}
			else
			{
				pw.println("Login failed. Wrong username or password");
			}
			pw.println("</body>");
			pw.println("</html>");
			pw.close();
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
