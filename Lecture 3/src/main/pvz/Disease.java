public class Disease extends Table {
    private int id;
    private String name;
    private String description;

    private String tableName = "disease";

    public Disease(int id,
                   String name,
                   String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    boolean insert() {
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
