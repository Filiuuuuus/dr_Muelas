package connectionBD;

public class Credentials {
	// Attributes
		 public String JDBC_DRIVER; 
		 public String DB_URL;
	// Credentials Database
		 public String USER;
		 public String PASS;
	//	 public String PATH;
		 
		 public Credentials(){
			 this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			 this.DB_URL = "jdbc:mysql://localhost:3306/database_dr_muelas";
			 this.USER = "root";
			 this.PASS = "";
			 //this.PATH = "";
		 }
}
