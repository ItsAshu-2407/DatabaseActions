/*Java Program To Access a student DATABASE
 * @author:- Ashutosh Kumar
 * */

package Simple.illustrateDB;
import java.sql.*;																		//importing sql packages.
import static java.lang.System.*;

public class databaseActions 
{
    public static void main( String[] args ) throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");										//Loading jdbc Driver.
    	String url = "jdbc:mysql://localhost:3306/anudip";			
    	String username = "root";
    	String password = "ashu@2407";
    	//It can be used to get a particular details of any student.
    	//String querry = "SELECT * FROM student WHERE s_id=1";
    	String querry = "SELECT * FROM student";
    	Connection c = DriverManager.getConnection(url,username,password);				//Verifying details and getting connection.
    	Statement s = c.createStatement();				
    	ResultSet rs = s.executeQuery(querry);
    	while(rs.next()) {																	//It is used to move to next row.
    	String getName = "Student Id is: "+rs.getString("s_id")+" his/her name is: "+rs.getString("s_name")+" will take class in/at "+rs.getString("s_classTiming")+" with class teacher Mr./Ms./Mrs. "+rs.getString("s_classTeacher");
    	//It can be used to get a particular details of any student.
    	//String getName = rs.getString("s_name");								
    	//out.println("Student Name is "+getName+".");
    	out.println(getName);}
    	c.close();																		//Connection closed.
    }
}
