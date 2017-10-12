



 class Piramide extends Figura{
    private double a, b;
    public Piramide(String pavadinimas) {
        super(pavadinimas);
    }
    public Piramide(int a, int b){
        this.a = a;
        this.b = b;
       // System.out.println("JUSU PLOTAS:" + perimetras());
    }
    @Override
    public double perimetras() {
        return a * b;
    }
    @Override
    public double plotas() {
        return a + b * b;
    }

    @Override
    public double spalva(int r, int g, int b) {
        return 50;
    }
    @Override
    void info()
    {
        System.out.println("Cia piramides metodas info()");
        super.info();
    }

}
