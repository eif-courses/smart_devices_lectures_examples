import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.ResultSet;


public class App {
    static DbConnection db = new DbConnection();
    static ArrayList<Indicator> indicatorList = new ArrayList<Indicator>();
    static Scanner reader = new Scanner(System.in);

    public enum Day {
        MOTERIS, VYRAS
    }

    public App() {

    }


    public static void main(String[] args) {
        new App();
        System.out.println("Prašome pasirinkti ką norite daryti: ");
        System.out.println("1. Įvesti paciento duomenis");
        System.out.println("2. Peržiūrėti pacientų rezultatus");
        System.out.println("3. Peržiūrėti ligų sąrašą");
        System.out.println("4. Peržiūrėti indikatorius");

        int selection = reader.nextInt();
        String p = reader.nextLine();
        switch (selection) {
            case 1:
                enterPatientData();
                //getIndicators();
                break;
            case 2:
                System.out.println("Peržiūrėti pacientų rezultatus");
                break;
            case 3:
                System.out.println("Peržiūrėti ligų sąrašą");
                break;
            case 4:
                System.out.println("Peržiūrėti indikatorius");
                break;
        }

    }

    private static void enterPatientData(){
        String firstName;
        String lastName;
        String gender;
        String date;
        String visitDate;

        System.out.println("ĮVESTI VIZITO DATĄ: ");
        visitDate = reader.nextLine();
        System.out.println("ĮVESTI PACIENTO DUOMENIS: ");
        System.out.println("Vardas: ");
        firstName = reader.nextLine();
        System.out.println("Pavardė: ");
        lastName = reader.nextLine();
        System.out.println("Lytis (Moteris/Vyras): ");
        gender = reader.nextLine();
        System.out.println("Gimimo data (YYYY-mm-dd): ");
        date = reader.nextLine();
        System.out.println("ĮVESTI PACIENTO REZULTATUS: ");
        insert(visitDate, firstName, lastName, gender, date);
    }

    public static void insert(String visitDate, String firstName, String lastName, String gender, String date){
        Patient patient = new Patient(0, firstName, lastName, gender, date);
        patient.insert();

        Visit visit = new Visit(0, patient.id, visitDate);
        visit.insert();

        getIndicators(patient.id, visit.id);



    }

    public static void getIndicators(int patient_id, int visit_id) {
        ResultSet rs = (ResultSet) Data.executeSelectSQL(db.getConnection(), "select * from indicator");

        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String abbreviation = rs.getString("abbreviation");
                String fullName = rs.getString("fullName");
                String unit = rs.getString("unit");
                Double low = rs.getDouble("low");
                Double high = rs.getDouble("high");
                String description = rs.getString("description");
                indicatorList.add(new Indicator(id, abbreviation, fullName, unit, low, high, description));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < indicatorList.size(); i++) {
            System.out.println(indicatorList.get(i).abbreviation + " (" + indicatorList.get(i).fullName + "): ");
            double indicatorValue = reader.nextDouble();

            Result result = new Result(0, patient_id,indicatorList.get(i).id, visit_id,indicatorValue);
            result.insert();
        }
    }
}
