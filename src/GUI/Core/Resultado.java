package GUI.Core;
import Actions.Calculacion;
import GUI.Actions.FraccionGUI;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Resultado {
    JLabel resultado = new JLabel("0", SwingConstants.CENTER);

    public static int fracNumerador;
    public static int fracDenominador;
    public static DecimalFormat df = new DecimalFormat("0.#");
    public JLabel divDenominador = new JLabel(String.valueOf(fracDenominador), SwingConstants.CENTER);

    public void calculo(JFrame s1){
        resultado.setBounds(155, 350, 200, 200);
        resultado.setForeground(Color.white);
        resultado.setFont(new Font("Helvetica", Font.BOLD, 30));
        s1.add(resultado);

    }

    public void butP(){
        resultado.setText(df.format(Calculacion.result));
    }

    public void butF(){

        resultado.setText(String.valueOf(fracNumerador));
        divDenominador.setText(String.valueOf(fracDenominador));

    }
    public void fracActivate(){
        JLabel divSimbolo = new JLabel("÷");
        divSimbolo.setFont(new Font("helvetica", Font.BOLD, 30));
        divSimbolo.setBounds(248, 380, 200, 200);
        divSimbolo.setForeground(Color.white);
        divDenominador.setFont(new Font("helvetica", Font.BOLD, 30));
        divDenominador.setBounds(155, 410, 200, 200);
        divDenominador.setForeground(Color.white);
        SubNivelGUI.frameDef.add(divSimbolo);
        SubNivelGUI.frameDef.add(divDenominador);
    }

}
