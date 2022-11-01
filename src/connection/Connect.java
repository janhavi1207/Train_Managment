package connection;
import java.sql.*;
public class Connect
{
    static Connection con=null;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //  System.out.println("Driver load");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public static Connection dataConnection()
    {

        try
        {

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/train","root","root");
            // System.out.println("Connection success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
