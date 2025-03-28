package Actions;

public class Suma extends Calculacion {

    public Suma(int firstEntry, int secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Suma() {

    }

    public void calc(int s1, int s2){
        result = s1 + s2;
    }
}

