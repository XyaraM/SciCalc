package GUI.Actions;

import Actions.Resta;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaGUI extends Resultado {
    public int firstTerm;
    public int secondTerm;

    Resta R = new Resta(){
        @Override
        public void calc(int s1, int s2) {
            super.calc(s1, s2);
        }
    };

    public RestaGUI(){
        restaGUI();
    }

    public void restaGUI(){

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField resta = new JTextField();
        resta.setBounds(100, 100, 100, 30);
        JTextField resta2 = new JTextField();
        resta2.setBounds(100, 200, 100, 30);
        JButton botonResultado = new JButton("Restar");
        botonResultado.setBounds(100, 300, 200, 200);

        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                firstTerm = Integer.parseInt(resta.getText());
                secondTerm = Integer.parseInt(resta2.getText());
                R.calc(firstTerm, secondTerm);
                butP();
            }
        });

        SubNivelGUI.frameDef.add(resta);
        SubNivelGUI.frameDef.add(resta2);
        SubNivelGUI.frameDef.add(botonResultado);

    }
}
