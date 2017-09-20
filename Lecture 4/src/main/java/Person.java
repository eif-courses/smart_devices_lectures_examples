public class Person {
    static void arSkaiciusNeperdidelis(Integer i) throws TikMaziSkaiciaiException {
        if(i > 100){
            throw new TikMaziSkaiciaiException("Per didelis skacius");
        }
    }
    static void nelegaliVeikla(Integer i){
        if(i < 100){
            throw new NelegaliVeiklaRuntimeException("Kazkas bando sulauzyti jusu PC");
        }
    }
}
