package util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthorityFilter implements Filter
{

	@Override
	public void destroy()
	{
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession(true);
		String superuser = (String) session.getAttribute("superuser");
		if (superuser == null)
			response.sendRedirect(request.getContextPath() + "/authority.html");
		else
			if (superuser.equals("3"))
				chain.doFilter(request, response);
			else
				response.sendRedirect(request.getContextPath() + "/ok.html");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
	}

}
