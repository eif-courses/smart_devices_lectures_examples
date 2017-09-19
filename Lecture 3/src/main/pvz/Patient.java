import java.sql.Connection;

public class Patient extends Table {
    public int id;
    public String firstName;
    public String lastName;
    public String gender;
    public String dateOfBirth;

    private String tableName = "patient";

    public Patient(int id,
                    String firstName,
                    String lastName,
                    String gender,
                    String dateOfBirth)
    {
        if (id > 0) {
            this.id = id;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;

    }

    @Override
    boolean insert() {
        Connection con = new DbConnection().getConnection();
        String sql = "insert into patient (`firstName`, `lastName`, `gender`, `dateOfBirth`)";
        sql += " values ('"+this.firstName+"', '"+this.lastName+"', '"+this.gender+"', '"+this.dateOfBirth+"')";
        System.out.println(sql);
        int id = (int)Data.executeSQL(con, sql);
        if (id > 0){
            this.id = id;
            return true;
        }
        return false;
    }

    @Override
    boolean update() {
        return false;
    }

    @Override
    boolean delete() {
        return false;
    }
}
