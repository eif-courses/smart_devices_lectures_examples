public class Kompiuteris {
    private String pav;
    public void spausdinti(){
        new RAM().sp();
    }
    class RAM{
        void sp(){spausdinti();}
    }
    class CPU{}
    class MOTHERBOARD{}
}
