package PAritmetica;
import Actions.Calculacion;

public class TermGeneralDif extends Calculacion{
    //Conocer el termino general sabiendo la diferencia
    static int PrimerTermino;
    static int DiferenciaCalc;
    static int DiferenciaDef;
    static int PosicionEncontrar;
    static int NumeroIgualador;
    static int resultD;

    public TermGeneralDif(int PrimerTermino, int Diferencia, int PosicionEncontrar) {
        TermGeneralDif.PrimerTermino = PrimerTermino;
        TermGeneralDif.DiferenciaCalc = Diferencia;
        TermGeneralDif.DiferenciaDef = Diferencia;
        TermGeneralDif.PosicionEncontrar = PosicionEncontrar;

        //Formula a seguir: Dn + ? (NumeroIgualador)
        if (PrimerTermino < 0){
            numeroIgualadorNegativo();
            int R1N = Diferencia * PosicionEncontrar + NumeroIgualador;
            result = R1N;
        }else{
            numeroIgualadorPositivo();
            int R1N = Diferencia * PosicionEncontrar + NumeroIgualador;
            result = R1N;
        }
        limpiezaVariables();
    }
    static void numeroIgualadorPositivo(){
        while (DiferenciaCalc <= PrimerTermino){
            //NumeroIgualador es el numero igualador
            DiferenciaCalc++;
            TermGeneralDif.NumeroIgualador++;
        }
        TermGeneralDif.NumeroIgualador -= 1;
    }
    static void numeroIgualadorNegativo(){
        while (PrimerTermino <= DiferenciaCalc){
            //NumeroIgualador es el numero igualador
            DiferenciaCalc--;
            NumeroIgualador--;
        }
        NumeroIgualador += 1;
    }
    static void limpiezaVariables(){
        PrimerTermino = 0;
        DiferenciaCalc = 0;
        DiferenciaDef = 0;
        PosicionEncontrar = 0;
        NumeroIgualador = 0;
    }
}
