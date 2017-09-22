import java.util.List;

public class Auditorija <TIPAS>{
    private TIPAS tipas;

    public void spausdinti(List<TIPAS> list){

        for (TIPAS t: list) {
            System.out.println("elem:"+ t);
        }
    }

    public TIPAS getTipas() {
        System.out.println(tipas.getClass().getTypeName());
        return tipas;
    }
    public void setTipas(TIPAS tipas) {
        this.tipas = tipas;
    }
}
