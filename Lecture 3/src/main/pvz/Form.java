import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Form {

    DbConnection db = new DbConnection();
    ArrayList<Indicator> indicatorList = new ArrayList<Indicator>();
    public Form() {
        createForm();
    }

    public void createForm() {
//
        ResultSet rs = (ResultSet) Data.executeSelectSQL(db.getConnection(), "select * from patient");
//
//        try {
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String abbrevation = rs.getString("abbrevation");
//                String fullName = rs.getString("fullName");
//                String unit = rs.getString("unit");
//                Double low = rs.getDouble("low");
//                Double high = rs.getDouble("high");
//                String description = rs.getString("description");
//                indicatorList.add(new Indicator(id, abbrevation, fullName, unit, low, high, description));
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        //System.out.println(indicatorList.size());

        Indicator test = new Indicator(0,"test", "test", "test", 0, 0, "test" );
        test.insert();

//        for (int i = 0; i < indicatorList.size(); i++) {
//            System.out.println(indicatorList.get(i).abbrevation + " (" + indicatorList.get(i).fullName + ")");
//        }
    }


//
}
