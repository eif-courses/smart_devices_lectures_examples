import java.util.List;

public class Paukstis<TIPAS extends Gyvunas, KITAS>  extends Gyvunas {
    private TIPAS tipas;
    private KITAS kitas;

    public Paukstis(String name) {
        super(name);
    }
    void ziemoti(List<? extends Gyvunas> l){}
    void skristi(TIPAS t, KITAS k){
        System.out.println("Skrenda: "+ t.getClass().getSimpleName());
    }
    void skristi(List<? extends Gyvunas> list, TIPAS t){
        System.out.println("Skrenda: "+ t.getClass().getSimpleName());
    }





     public TIPAS getTipas() {
        return tipas;
    }

    public void setTipas(TIPAS tipas) {
        this.tipas = tipas;
    }

    public KITAS getKitas() {
        return kitas;
    }

    public void setKitas(KITAS kitas) {
        this.kitas = kitas;
    }

    @Override
    public String toString() {
        return "Paukstis{" +
                "tipas=" + tipas +
                ", kitas=" + kitas +
                '}';
    }
}
