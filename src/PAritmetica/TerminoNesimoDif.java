package PAritmetica;

import Actions.Calculacion;

public class TerminoNesimoDif extends Calculacion {

    //Progresiones aritmeticas
    //Conocer un termino n-esimo conociendo un termino y la diferencia
    //Formula a seguir: An = Ak + (k-n) * D
    public TerminoNesimoDif(int PrimerTermino, int PosicionTermino, int PosicionAK, int Diferencia) {
        calcGUI(PrimerTermino, PosicionTermino, PosicionAK, Diferencia);
    }

    public TerminoNesimoDif() {

    }

    public void calcGUI(int PrimerTermino, int PosicionTermino, int PosicionAK, int Diferencia){
        int pos = PosicionTermino - PosicionAK;
        int first = pos * Diferencia;
        result = PrimerTermino + first;
    }
}
