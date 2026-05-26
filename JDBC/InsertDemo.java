import java.sql.*;

class InsertDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName(
                "com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "root");

            Statement st =
                con.createStatement();

            st.executeUpdate(
                "insert into student values(1,'Aman')");

            System.out.println("Data inserted");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}