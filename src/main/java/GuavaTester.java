import java.sql.*;

public class GuavaTester {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/info", "root", "");
        //here sonoo is database name, root is username and password
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from rusis");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2));
        con.close();
    }

    /**
     * @deprecated jis yra pasenes naudojamas kitas foo()
     * @param a tai yra goo parametras
     */
    static void goo(int a){
    }
}