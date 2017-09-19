import java.sql.Connection;
import java.sql.Statement;

public class Indicator extends Table {
    public int id;
    public String abbreviation;
    public String fullName;
    public String unit;
    public double low;
    public double high;
    public String description;

    private String tableName = "indicator";

    public Indicator(int id,
                     String abbreviation,
                     String fullName,
                     String unit,
                     double low,
                     double high,
                     String description)
    {
        if (id > 0) {
            this.id = id;
        }
        this.abbreviation = abbreviation;
        this.fullName = fullName;
        this.unit = unit;
        this.low = low;
        this.high = high;
        this.description = description;
    }

    @Override
    boolean insert() {
        Connection con = new DbConnection().getConnection();
        String sql = "insert into indicator (`abbreviation`, `fullName`, `unit`, `low`, `high`, `description`) ";
        sql += " values ('"+this.abbreviation+"', '"+this.fullName+"', '"+this.unit+"', "+this.low+", "+this.high+", '"+this.description+"')";
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
