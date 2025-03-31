package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PAritmetica.TermGeneralDif;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton botonCalculo = new JButton("Calcular");
        new BotonVolverGUI(SubNivelGUI.frameDef);

        t1.setBounds(100, 100, 30, 30);
        t2.setBounds(130, 100, 30, 30);
        t3.setBounds(160, 100, 30, 30);
        botonCalculo.setBounds(200, 100, 30, 30);

        SubNivelGUI.frameDef.add(t1);
        SubNivelGUI.frameDef.add(t2);
        SubNivelGUI.frameDef.add(t3);
        SubNivelGUI.frameDef.add(botonCalculo);

        botonCalculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r1 = Integer.parseInt(t1.getText());
                r2 = Integer.parseInt(t2.getText());
                r3 = Integer.parseInt(t3.getText());

                termGeneral.calc(r1, r2, r3);
                butP();
            }
        });
    }

}
