package Actions;

public class Multiplicacion extends Calculacion {
    public Multiplicacion(float firstEntry, float secondEntry){
        calc(firstEntry, secondEntry);
    }

    public Multiplicacion() {

    }

    public void calc(float s1, float s2){
        result = s1 * s2;
    }
}
