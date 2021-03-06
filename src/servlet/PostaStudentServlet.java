package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.StudentBusiness;
import entity.Student;

public class PostaStudentServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		int result = 0;
		try {
			String name = new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
			String gradeTap = req.getParameter("grade");
			Student student = new Student(name, Float.parseFloat(gradeTap));
			StudentBusiness studentBusiness = new StudentBusiness();
			result = studentBusiness.insertOne(student);
			out.print("{'result':" + result + ", 'status': 'ok'}");
		}
		catch (Exception e) {
			out.print("{'result':" + result + ", 'status': 'error'}");
		}
		finally {
			out.close();
		}
	}

}
