package builder.pattern;

public class Role {
    String name;
    int elapsedTime;

    public Role(String name, int elapsedTime) {
        this.name = name;
        this.elapsedTime = elapsedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", elapsedTime=" + elapsedTime +
                '}';
    }
}
