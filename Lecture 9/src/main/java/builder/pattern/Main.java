package builder.pattern;

public class Main {
    public static void main(String[] args) {
        Person p = new PersonBuilder().setRole(new Role("Admin", 100)).
                setNewFirstName("Hello").
                createPerson();
        System.out.println(p);
    }
}
