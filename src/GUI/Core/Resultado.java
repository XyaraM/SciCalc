package GUI.Core;
import Actions.Calculacion;

import javax.swing.*;

public class Resultado {
    JTextArea resultado = new JTextArea("0");

    public void calculo(JFrame s1){
        resultado.setBounds(100, 600, 200, 200);
        s1.add(resultado);
    }

    public void butP(){
        resultado.setText(String.valueOf(Calculacion.result));
    }

    public void butF(){
        resultado.setText(Calculacion.resultStr);
    }

}
