package business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import util.DataAccess;

public class StudentBusiness
{
	// 根据id查找一个学生
	public Student findOne(int id)
	{
		String sql = "select id, name, grade from student where id=?";
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		Student student = null;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement(sql);
			prep.setInt(1, id);
			rs = prep.executeQuery();
			if (rs.next())
				student = new Student(rs.getInt("id"), rs.getString("name"), rs.getFloat("grade"));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (prep != null)
					prep.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	
	// 查找所有学生
	public List<Student> findAll()
	{
		String sql = "select id, name, grade from student";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Student> students = new ArrayList<>();
		try {
			conn = DataAccess.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				students.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getFloat("grade")));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return students;
	}
	
	// 插入一个新学生
	public int insertOne(Student student)
	{
		String sql = "insert into student(name, grade) values(?, ?)";
		Connection conn = null;
		PreparedStatement prep = null;
		int result = 0;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement(sql);
			prep.setString(1, student.getName());
			prep.setFloat(2, student.getGrade());
			result = prep.executeUpdate();
		}
		catch (SQLException e) {
			try {
				conn.rollback();
			}
			catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				if (prep != null)
					prep.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 插入多个新学生
	public int insertStudents(List<Student> students)
	{
		String sql = "insert into student(name, grade) values(?, ?)";
		Connection conn = null;
		PreparedStatement prep = null;
		int result = 0;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement(sql);
			for (int i=0; i < students.size(); ++ i)
			{
				Student student = students.get(i);
				prep.setString(1, student.getName());
				prep.setFloat(2, student.getGrade());
				prep.addBatch();
			}
			int[] results = prep.executeBatch();
			for (int i=0; i < results.length; ++ i)
			{
				result += results[i];
			}
		}
		catch (SQLException e) {
			try {
				conn.rollback();
			}
			catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				if (prep != null)
					prep.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 根据id删除一个学生
	public int deleteOne(int id)
	{
		String sql = "delete from student where id=?";
		Connection conn = null;
		PreparedStatement prep = null;
		int result = 0;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement(sql);
			prep.setInt(1, id);
			result = prep.executeUpdate();
		}
		catch (SQLException e) {
			try {
				conn.rollback();
			}
			catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				if (prep != null)
					prep.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 更新一个学生的信息
	public int putOne(Student student)
	{
		String sql = "update student set name=?, grade=? where id=?";
		Connection conn = null;
		PreparedStatement prep = null;
		int result = 0;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement(sql);
			prep.setString(1, student.getName());
			prep.setFloat(2, student.getGrade());
			prep.setInt(3, student.getId());
			result = prep.executeUpdate();
		}
		catch (SQLException e) {
			try {
				conn.rollback();
			}
			catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				if (prep != null)
					prep.close();
				if (conn != null)
					conn.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
