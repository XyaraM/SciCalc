package GUI.Actions;

import Actions.Multiplicacion;
import GUI.Core.Resultado;
import GUI.Core.SimboloSRMDGUI;
import GUI.Core.SubNivelGUI;

import javax.swing.*;

public class MultiplicacionGUI extends Resultado {
    public int firstTerm;
    public int secondTerm;

    Multiplicacion M = new Multiplicacion(){
        @Override
        public void calc(int s1, int s2) {
            super.calc(s1, s2);
        }
    };

    public MultiplicacionGUI(){
        menuMulti();
    }

    public void menuMulti(){

        SimboloSRMDGUI simb = new SimboloSRMDGUI(){
            @Override
            public void simb(int simboloNumero) {
                super.simb(simboloNumero);
            }
        };

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField multi1 = new JTextField();
        JTextField multi2 = new JTextField();
        JButton botonResultado = new JButton("Multiplicar");
        simb.simb(3);

        multi1.setBounds(100, 100, 100, 30);
        multi2.setBounds(290, 100, 100, 30);
        botonResultado.setBounds(145, 230, 200, 100);


        botonResultado.addActionListener(e -> {

            firstTerm = Integer.parseInt(multi1.getText());
            secondTerm = Integer.parseInt(multi2.getText());
            M.calc(firstTerm, secondTerm);
            butP();

        });

        SubNivelGUI.frameDef.add(multi1);
        SubNivelGUI.frameDef.add(multi2);
        SubNivelGUI.frameDef.add(botonResultado);

    }
}
