package Fractions;
import Actions.Calculacion;
import static Fractions.Operaciones.*;

public class Fracciones extends Calculacion {
    public static boolean isAdding;
    public static boolean isMultiplying;
    public Fracciones(int s1, int s2, int s3, int s4) {
        calc(s1, s2, s3, s4);
    }

    public Fracciones(int sup) {
        switch (sup){
            case 1:
                isAdding = true;
                fracverify = true;
                sumaresta();
                break;
            case 2:
                isAdding = false;
                fracverify = true;
                sumaresta();
                break;
            case 3:
                fracverify = true;
                isMultiplying = true;
                multiplicaciondivision();
                break;
            case 4:
                fracverify = true;
                isMultiplying = false;
                multiplicaciondivision();
                break;
        }
        System.out.println(sup);
    }

    public Fracciones() {

    }

    public void calc(int s1, int s2, int s3, int s4){
        Operaciones.numerador = s1;
        Operaciones.denominador = s2;
        Operaciones.numerador2 = s3;
        Operaciones.denominador2 = s4;
    }
}
