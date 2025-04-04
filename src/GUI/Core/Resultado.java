package GUI.Core;
import Actions.Calculacion;

import javax.swing.*;
import java.awt.*;

public class Resultado {
    JLabel resultado = new JLabel("0", SwingConstants.CENTER);

    public static int fracNumerador;
    public static int fracDenominador;

    public void calculo(JFrame s1){
        resultado.setBounds(155, 350, 200, 200);
        resultado.setForeground(Color.white);
        resultado.setFont(new Font("Helvetica", Font.BOLD, 30));
        s1.add(resultado);
    }

    public void butP(){
        resultado.setText(String.valueOf(Calculacion.result));
    }

    public void butF(){
        JLabel divSimbolo = new JLabel("÷");
        JLabel divDenominador = new JLabel(String.valueOf(fracDenominador), SwingConstants.CENTER);
        divSimbolo.setFont(new Font("helvetica", Font.BOLD, 30));
        divSimbolo.setBounds(248, 380, 200, 200);
        divSimbolo.setForeground(Color.white);
        divDenominador.setFont(new Font("helvetica", Font.BOLD, 30));
        divDenominador.setBounds(155, 410, 200, 200);
        divDenominador.setForeground(Color.white);
        SubNivelGUI.frameDef.add(divSimbolo);
        SubNivelGUI.frameDef.add(divDenominador);
        resultado.setText(String.valueOf(fracNumerador));


    }

}
