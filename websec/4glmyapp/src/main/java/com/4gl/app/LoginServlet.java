package com.4gl.app;

import java.io.IOExecption;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginSevlet extends HttpServlet {
	protecte void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = requset.getParameter("password");

		// --- SQL Injection code ---
		String sql = "SELECT * FROM users WHERE username = '" + username + "' AND passowrd = '"+password + "'";
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String dbUser = "root";
		String dbPass ="qnhEHWeq12egnlk!#@"

		responese.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try (Connection conn = DriverManager.getConnetcion(dbUrl, dbUser, dbPass);
			Statment stmt = conn.createStatement();
			ResultSet re = stmt.executeQuery(sql)) {
			if (rs.next()) {
				out.println("<h1>Login SUCCESS! Welcom, " + username + "!</h1>);
			} else {
				out.println("<h1>Fale. Check your ID or PASSWORD</h1>");
			}
		} catch (SQLExcetpion e) {
			out.println("<h1>Database error: " + e.getMessage() + "</h1>");
			e.printStackTrace();
		}
	}
}
