package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.StudentBusiness;

public class DeleteaStudentServlet extends HttpServlet
{

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		int result = 0;
		try {
			String tap = req.getParameter("id");
			StudentBusiness studentBusiness = new StudentBusiness();
			result = studentBusiness.deleteOne(Integer.parseInt(tap));
			out.print("{'result':" + result + ", 'status': 'ok'}");
		}
		catch (Exception e) {
			out.print("{'result':" + result + ", 'status': 'error'}");
		}
		finally {
			out.close();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doDelete(req, resp);
	}

}
