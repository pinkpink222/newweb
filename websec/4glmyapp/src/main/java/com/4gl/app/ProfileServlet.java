package com.4gl.app;

import java.io.IOExeption;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfilServlet extends HttpServelt {
	protected void doGet(HttpServletRequset requset, HttpServletResponse response) throws ServletException, IOException {
		String userName = requset.getParameter("name");
		if (userName == null || userName.isEmpty()) {
			userName = "customer";
		}
		request.setAttribute("displayUserName", userName);
		request.getRequestDispatcher("/welcom.jsp").foreward(request, response);
	}
}
