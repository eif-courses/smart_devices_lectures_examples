import javax.swing.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnozes", "root", "");
        //here sonoo is database name, root is username and password
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from rodiklis");
        while (rs.next())
            try {
                System.out.println(rs.getInt(1) + "  " + rs.getInt(2)+ " " + rs.getRow());
            }
            catch (Exception e){
              //  JOptionPane.showMessageDialog(null, "Atsiprasome duomenys yra neteisingo formato. BUVO ISTAISYTA");
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
        con.close();
    }

}
