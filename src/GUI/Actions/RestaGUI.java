package GUI.Actions;

import Actions.Resta;
import GUI.Core.Resultado;
import GUI.Core.SimboloSRMDGUI;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaGUI extends Resultado {
    public float firstTerm;
    public float secondTerm;

    Resta R = new Resta(){
        @Override
        public void calc(float s1, float s2) {
            super.calc(s1, s2);
        }
    };

    public RestaGUI(){
        restaGUI();
    }

    public void restaGUI(){

        SimboloSRMDGUI simb = new SimboloSRMDGUI(){
            @Override
            public void simb(int simboloNumero) {
                super.simb(simboloNumero);
            }
        };

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField resta = new JTextField();
        JTextField resta2 = new JTextField();
        JButton botonResultado = new JButton("Restar");
        simb.simb(2);

        resta.setBounds(100, 100, 100, 30);
        resta2.setBounds(290, 100, 100, 30);
        botonResultado.setBounds(145, 230, 200, 100);


        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                firstTerm = Float.parseFloat(resta.getText());
                secondTerm = Float.parseFloat(resta2.getText());
                R.calc(firstTerm, secondTerm);
                butP();
            }
        });

        SubNivelGUI.frameDef.add(resta);
        SubNivelGUI.frameDef.add(resta2);
        SubNivelGUI.frameDef.add(botonResultado);

    }
}
