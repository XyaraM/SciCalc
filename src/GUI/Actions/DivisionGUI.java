package GUI.Actions;

import Actions.Division;
import GUI.Core.Resultado;
import GUI.Core.SimboloSRMDGUI;
import GUI.Core.SubNivelGUI;

import javax.swing.*;

public class DivisionGUI extends Resultado {
    public int firstEntry;
    public int secondEntry;

    public DivisionGUI(){
        menuDivi();
    }

    Division D = new Division(){
        @Override
        public void calc(int s1, int s2) {
            super.calc(s1, s2);
        }
    };

    public void menuDivi(){

        SimboloSRMDGUI simb = new SimboloSRMDGUI(){
            @Override
            public void simb(int simboloNumero) {
                super.simb(simboloNumero);
            }
        };

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField divi1 = new JTextField();
        JTextField divi2 = new JTextField();
        JButton botonResultado = new JButton("Dividir");
        simb.simb(4);

        divi1.setBounds(100, 100, 100, 30);
        divi2.setBounds(290, 100, 100, 30);
        botonResultado.setBounds(145, 230, 200, 100);


        botonResultado.addActionListener(e -> {
            firstEntry = Integer.parseInt(divi1.getText());
            secondEntry = Integer.parseInt(divi2.getText());
            D.calc(firstEntry, secondEntry);
            butP();

        });

        SubNivelGUI.frameDef.add(divi1);
        SubNivelGUI.frameDef.add(divi2);
        SubNivelGUI.frameDef.add(botonResultado);
    }
}
