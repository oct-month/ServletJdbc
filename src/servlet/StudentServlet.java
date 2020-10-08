package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.StudentBusiness;
import entity.Student;

public class StudentServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session = req.getSession(true);
		if (session.getAttribute("login_state") == null)
			session.setAttribute("login_state", false);
		boolean flag = (boolean) session.getAttribute("login_state");
		if (flag)
		{
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<head><title>学生成绩</title></head>");
			out.println("<body>");
			StudentBusiness finder = new StudentBusiness();
			List<Student> students = finder.findAll();
			out.println("<table border>");
			out.println("<tr><th>姓名</th><th>成绩</th></tr>");
			for (int i=0; i < students.size(); ++ i)
			{
				Student student = students.get(i);
				out.println("<tr><th>" + student.getName() + "</th><th>" + student.getGrade() + "</th></tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
		else
		{
			resp.sendRedirect("/login.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req, resp);
	}

}
