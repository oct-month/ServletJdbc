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

public class PostStudentsServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		int result = 0;
		try {
			String[] names = req.getParameterValues("name");
			String[] gradesTap = req.getParameterValues("grade");
			List<Student> students = new ArrayList<>();
			for (int i=0; i < names.length; ++ i)
			{
				names[i] = new String(names[i].getBytes("iso-8859-1"), "utf-8");
				students.add(new Student(names[i], Float.parseFloat(gradesTap[i])));
			}
			StudentBusiness studentBusiness = new StudentBusiness();
			result = studentBusiness.insertStudents(students);
			out.print("{'result':" + result + ", 'status': ok}");
		}
		catch (Exception e) {
			out.print("{'result':" + result + ", 'status': error}");
		}
		finally {
			out.close();
		}
	}

}
