package GetConnection;
import java.sql.*;
public class ConnectionProvider  {
	public static Connection getdbCon() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		return conn;
	}

}
