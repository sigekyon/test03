package test;
import java.sql.*;
public class Testdb {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 int id;
	        String name;
	        try {
				String driver   = "org.gjt.mm.mysql.Driver";
				String server   = "172.16.110.206";
				//String server   = "localhost";
				String dbname   = "test";
				String url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=EUC_JP";
				String user     = "root";
				String password = "root";
				Class.forName (driver);
				Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement ();
				String sql = "SELECT * FROM testdb";
				ResultSet rs = stmt.executeQuery (sql);
				while(rs.next()){
					id = rs.getInt("ID");
					name = rs.getString("Name");
					System.out.println("ID：" + id);
					System.out.println("名前：" + name);
				}
				
				rs.close();
				stmt.close();
				con.close();
				
	        	} catch (SQLException e) {
				System.err.println("SQL failed.");
				e.printStackTrace ();
	        	} catch (ClassNotFoundException ex) {
				ex.printStackTrace ();
	        }
	}

}
