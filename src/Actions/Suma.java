package Actions;

public class Suma extends Calculacion {

    public Suma(float firstEntry, float secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Suma() {

    }

    public void calc(float s1, float s2){
        result = s1 + s2;
    }
}

