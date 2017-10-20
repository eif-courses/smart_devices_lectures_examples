public class Klase {
    private Object object;

    public Klase(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Klase{" +
                "object=" + object +
                '}';
    }
}
