public class KlaseGenerics <TIPAS>{
    private TIPAS tipas;

    public TIPAS getTipas() {
        return tipas;
    }

    public void setTipas(TIPAS tipas) {
        this.tipas = tipas;
    }

    public KlaseGenerics(TIPAS tipas) {

        this.tipas = tipas;
    }

    @Override
    public String toString() {
        return "KlaseGenerics{" +
                "tipas=" + tipas +
                '}';
    }
}
