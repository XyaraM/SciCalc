package Fractions;
import Actions.Calculacion;

public class Operaciones{
    static Integer numerador;
    static Integer denominador;
    static Integer numerador2;
    static Integer denominador2;
    static Integer X1M;
    static Integer X2M;
    static Integer X1D;
    static Integer X2D;
    static Integer SDS;

    public static void sumaresta(){
        int muldeno = denominador * denominador2;
        Integer X1S = numerador * denominador2;
        Integer X2S = numerador2 * denominador;
        if (Fracciones.isAdding){
            SDS = X1S + X2S;
        }else{
            SDS = X1S - X2S;
        }
        Calculacion.resultStr = "\n Numerador: " + SDS + "\n Denominador: " + muldeno;
        limpiezaVariables();
    }

    public static void multiplicaciondivision(){
        if (Fracciones.isMultiplying){
            X1M = denominador * denominador2;
            X2M = numerador * numerador2;
            Calculacion.resultStr = "\n Numerador: " + X2M + "\n Denominador: " + X1M;
        }else{
            X1D = numerador * denominador2;
            X2D = numerador2 * denominador;
            Calculacion.resultStr = "\n Numerador: " + X1D + "\n Denominador: " + X2D;
        }
        limpiezaVariables();
    }

    public static void limpiezaVariables(){
        numerador = 0;
        numerador2 = 0;
        denominador = 0;
        denominador2 = 0;
        X1M = 0;
        X2M = 0;
        X1D = 0;
        X2D = 0;
        SDS = 0;
    }
}
