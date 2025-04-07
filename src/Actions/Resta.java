package Actions;

public class Resta extends Calculacion {
    public Resta(float firstEntry, float secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Resta() {

    }

    public void calc(float s1, float s2){
        result = s1 - s2;

    }
}
