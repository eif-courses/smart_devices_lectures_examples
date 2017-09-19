import java.sql.Connection;

public class Result extends Table {
    public int id;
    public int patient_id;
    public int indicator_id;
    public int visit_id;
    public double value;

    private String tableName = "result";

    public Result(int id,
                    int patient_id,
                    int indicator_id,
                    int visit_id,
                    double value)
    {
        this.id = id;
        this.patient_id = patient_id;
        this.indicator_id = indicator_id;
        this.visit_id = visit_id;
        this.value = value;

    }

    @Override
    boolean insert() {
        Connection con = new DbConnection().getConnection();
        String sql = "insert into result (`patient_id`, `indicator_id`, `visit_id`, `value`)";
        sql += " values ('"+this.patient_id+"', '"+this.indicator_id+"', '"+this.visit_id+"', '"+this.value+"')";
        System.out.println(sql);
        int id = (int)Data.executeSQL(con, sql);
        System.out.println(id);
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
