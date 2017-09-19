public class DiseaseIndicators extends Table {
    private int id;
    private int disease_id;
    private int indicator_id;
    private boolean confirmed;

    private String tableName = "disease_indicators";

    public DiseaseIndicators(int id,
                             int disease_id,
                             int indicator_id,
                             boolean confirmed)
    {
        this.id = id;
        this.disease_id = disease_id;
        this.indicator_id = indicator_id;
        this.confirmed = confirmed;
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
