package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.StudentBusiness;
import entity.Student;

public class GetStudentsServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		StudentBusiness studentBusiness = new StudentBusiness();
		List<Student> students = studentBusiness.findAll();
		out.print("[");
		for (int i=0; i < students.size(); ++ i)
		{
			out.print(students.get(i) + ",");
		}
		out.print("]");
		out.close();
	}

}
