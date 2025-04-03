package PGeometrica;

import Actions.Calculacion;

public class NEsimoSucesion extends Calculacion {
    int PrimerTermino;
    double Elevado;
    int Resultado;

    //Formula utilizada: A1 * 2 ^ n-1
    public NEsimoSucesion(int s1, int s2) {
        calcNE(s1, s2);
    }

    public NEsimoSucesion() {

    }

    public void calcNE(int s1, int s2){
        PrimerTermino = s1;
        Elevado = s2;
        Elevado -= 1;
        Resultado = 3 * (int) Math.pow(2, Elevado);
        result = Resultado;
    }
}
