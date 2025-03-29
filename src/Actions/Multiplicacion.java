package Actions;

public class Multiplicacion extends Calculacion {
    public Multiplicacion(int firstEntry, int secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Multiplicacion() {

    }

    public void calc(int s1, int s2){
        result = s1 * s2;
    }
}
