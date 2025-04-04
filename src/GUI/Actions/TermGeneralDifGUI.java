package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PAritmetica.TermGeneralDif;

import javax.swing.*;
import java.awt.*;

public class TermGeneralDifGUI extends Resultado {
    public int r1;
    public int r2;
    public int r3;

    public TermGeneralDifGUI(){
        termGeneral();
    }

    public void termGeneral(){

        calculo(SubNivelGUI.frameDef);

        TermGeneralDif termGeneral = new TermGeneralDif(){
            @Override
            public void calc(int PrimerTermino, int Diferencia, int PosicionEncontrar) {
                super.calc(PrimerTermino, Diferencia, PosicionEncontrar);
            }
        };

        JTextField t1 = new JTextField("Term");
        JTextField t2 = new JTextField("D");
        JTextField t3 = new JTextField("N");
        JButton botonCalculo = new JButton("Calcular");
        JLabel text = new JLabel("Dn + ? (NumeroIgualador)");

        new BotonVolverGUI(SubNivelGUI.frameDef);

        t1.setBounds(220, 50, 60, 30);
        t2.setBounds(220, 90, 60, 30);
        t3.setBounds(220, 130, 60, 30);
        botonCalculo.setBounds(204, 180, 90, 30);
        text.setBounds(120, 10, 280, 40);
        text.setForeground(Color.white);
        text.setFont(new Font("helvetica", Font.BOLD, 20));

        SubNivelGUI.frameDef.add(t1);
        SubNivelGUI.frameDef.add(t2);
        SubNivelGUI.frameDef.add(t3);
        SubNivelGUI.frameDef.add(botonCalculo);
        SubNivelGUI.frameDef.add(text);


        botonCalculo.addActionListener(e -> {
            r1 = Integer.parseInt(t1.getText());
            r2 = Integer.parseInt(t2.getText());
            r3 = Integer.parseInt(t3.getText());

            termGeneral.calc(r1, r2, r3);
            butP();
        });
    }

}
