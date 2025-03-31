package PAritmetica;

import Actions.Calculacion;

public class SumaTerminos extends Calculacion {
    int PrimerTermino;
    int UltimoTermino;
    int NumeroTerminos;
    int SumaPU;
    int ResSumaPU;
    int FinalResult;

    public SumaTerminos(int s1, int s2, int s3) {
        calcTotal(s1, s2, s3);
    }

    public SumaTerminos() {

    }

    public void calcTotal(int s1, int s2, int s3){
        //Formula a seguir:(A1 + An) * N / 2
        PrimerTermino = s1;
        UltimoTermino = s2;
        NumeroTerminos = s3;
        SumaPU = PrimerTermino + UltimoTermino;
        ResSumaPU = SumaPU * NumeroTerminos;
        FinalResult = ResSumaPU / 2;
        result = FinalResult;
    }
}
