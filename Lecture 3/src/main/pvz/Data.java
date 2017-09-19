import java.sql.*;

public final class Data {
    public static Object executeSelectSQL(Connection con, String query) {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static Object executeSQL(Connection con, String query) {
        try {
            Statement st = con.createStatement();
            int affectedRows = st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            if (affectedRows > 0) {
                try (ResultSet gKeys = st.getGeneratedKeys()) {

                    if (gKeys.next()) {
                        return gKeys.getInt(1);
                    }
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                    return 0;
                }
            }

            return 0;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
