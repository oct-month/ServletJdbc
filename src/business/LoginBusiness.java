package business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DataAccess;

public class LoginBusiness
{
	public boolean login(String username, String password)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try {
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement("select password from usr where username=?");
			prep.setString(1, username);
			rs = prep.executeQuery();
			rs.next();
			String str = rs.getString("password");
			if (str.equals(password))
				flag = true;
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
		return flag;
	}
}
