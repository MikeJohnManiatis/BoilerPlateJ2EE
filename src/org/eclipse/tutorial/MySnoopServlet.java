package org.eclipse.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MySnoopServlet
 */
@WebServlet("/MySnoopServlet")
public class MySnoopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userAgent =  req.getHeader("user-agent");
		String clientBrowser =  "Not known!";	
		if( userAgent != null)
			clientBrowser = userAgent;
		req.setAttribute("client.browser",clientBrowser );
		req.getRequestDispatcher("/result.jsp").forward(req,resp);
	}
}
