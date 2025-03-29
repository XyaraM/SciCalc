package GUI.Actions;

import Actions.Multiplicacion;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField multi1 = new JTextField();
        multi1.setBounds(100, 100, 100, 30);
        JTextField multi2 = new JTextField();
        multi2.setBounds(100, 200, 100, 30);
        JButton botonResultado = new JButton("Multiplicar");
        botonResultado.setBounds(100, 300, 200, 200);

        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                firstTerm = Integer.parseInt(multi1.getText());
                secondTerm = Integer.parseInt(multi2.getText());
                M.calc(firstTerm, secondTerm);
                butP();

            }
        });

        SubNivelGUI.frameDef.add(multi1);
        SubNivelGUI.frameDef.add(multi2);
        SubNivelGUI.frameDef.add(botonResultado);

    }
}
