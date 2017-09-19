import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class DbConnection {
    Statement st;
    ResultSet rs;
    static String query = "select abbrevation, fullName from indicator";
    private Connection con;

//    public static void main(String[] args) {
//        DbConnection db = new DbConnection();
//        db.getConnection();
//    }

    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bloodtestdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            return con;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
