package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.StudentBusiness;
import entity.Student;

public class GetaStudentServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String tap = req.getParameter("id");
		if (tap != null && tap.trim().length() > 0)
		{
			int id = Integer.parseInt(tap);
			StudentBusiness studentBusiness = new StudentBusiness();
			Student student = studentBusiness.findOne(id);
			out.print("[");
			if (student != null)
				out.print(student.toString());
			out.print("]");
		}
		else
			out.print("[]");
		out.close();
	}

}
