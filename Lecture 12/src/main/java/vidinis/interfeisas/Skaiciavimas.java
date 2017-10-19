package vidinis.interfeisas;

public interface Skaiciavimas {
    void spausdinti();

    interface Daugyba{
        int dauginti(int a, int b);
    }
    interface Dalyba{
        int dalinti(int a, int b);
    }
}
