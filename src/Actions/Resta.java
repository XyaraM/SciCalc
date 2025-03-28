package Actions;

public class Resta extends Calculacion {
    public Resta(int firstEntry, int secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Resta() {

    }

    public void calc(int s1, int s2){
        result = s1 - s2;

    }
}
