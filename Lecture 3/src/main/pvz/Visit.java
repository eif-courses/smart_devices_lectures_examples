import java.sql.Connection;
import java.util.Date;

public class Visit extends Table {
    public int id;
    public int patient_id;
    public String visitDate;


    private String tableName = "visit";

    public Visit(int id,
                  int patient_id,
                  String visitDate)
    {
        this.id = id;
        this.patient_id = patient_id;
        this.visitDate = visitDate;

    }

    @Override
    boolean insert() {
        Connection con = new DbConnection().getConnection();
        String sql = "insert into visit (`patient_id`, `visitDate`) ";
        sql += " values ('"+this.patient_id+"', '"+this.visitDate+"')";
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
