package builder.pattern;

public class Person {
    private String newLastName;
    private String newFirstName;
    private String newMiddleName;
    private String newSalutation;
    private String newSuffix;
    private String newStreetAddress;
    private String newCity;
    private String newState;
    private boolean newIsFemale;
    private boolean newIsEmployed;
    private boolean newIsHomeOwner;
    private Role role;

    public Person(String newLastName, String newFirstName, String newMiddleName, String newSalutation, String newSuffix, String newStreetAddress, String newCity, String newState, boolean newIsFemale, boolean newIsEmployed, boolean newIsHomeOwner, Role role) {
        this.newLastName = newLastName;
        this.newFirstName = newFirstName;
        this.newMiddleName = newMiddleName;
        this.newSalutation = newSalutation;
        this.newSuffix = newSuffix;
        this.newStreetAddress = newStreetAddress;
        this.newCity = newCity;
        this.newState = newState;
        this.newIsFemale = newIsFemale;
        this.newIsEmployed = newIsEmployed;
        this.newIsHomeOwner = newIsHomeOwner;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "newLastName='" + newLastName + '\'' +
                ", newFirstName='" + newFirstName + '\'' +
                ", newMiddleName='" + newMiddleName + '\'' +
                ", newSalutation='" + newSalutation + '\'' +
                ", newSuffix='" + newSuffix + '\'' +
                ", newStreetAddress='" + newStreetAddress + '\'' +
                ", newCity='" + newCity + '\'' +
                ", newState='" + newState + '\'' +
                ", newIsFemale=" + newIsFemale +
                ", newIsEmployed=" + newIsEmployed +
                ", newIsHomeOwner=" + newIsHomeOwner +
                ", role=" + role +
                '}';
    }
}
