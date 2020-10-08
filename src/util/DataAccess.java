package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DataAccess
{
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static String xmlPath = "../../conf/database.conf.xml";
	private static String xsdPath = "../../conf/database.conf.xsd";
	
	static {
		XMLParser parser = new XMLParser();
		try {
			if (XMLValidate.xmlStringValidate(xmlPath, xsdPath))
			{
				parser.parse(xmlPath);
				Properties dbProps = parser.getProps();
				driver = dbProps.getProperty("driver");
				url = dbProps.getProperty("url");
				user = dbProps.getProperty("user");
				password = dbProps.getProperty("password");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection()
	{
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
