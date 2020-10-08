package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.LoginBusiness;

public class LoginServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException
	{
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginBusiness lb = new LoginBusiness();
		boolean flag = lb.login(username, password);
		HttpSession session = req.getSession(true);
		session.setAttribute("login_state", flag);
		if (flag)
			resp.sendRedirect(req.getContextPath() + "/ok.html");
		else
			resp.sendRedirect(req.getContextPath() + "/error.html");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}
	
}
