package GUI.Actions;

import Actions.Division;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        JTextField divi1 = new JTextField();
        divi1.setBounds(100, 100, 100, 30);
        JTextField divi2 = new JTextField();
        divi2.setBounds(100, 200, 100, 30);
        JButton botonResultado = new JButton("Dividir");
        botonResultado.setBounds(100, 300, 200, 200);

        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstEntry = Integer.parseInt(divi1.getText());
                secondEntry = Integer.parseInt(divi2.getText());
                D.calc(firstEntry, secondEntry);
                butP();

            }
        });

        SubNivelGUI.frameDef.add(divi1);
        SubNivelGUI.frameDef.add(divi2);
        SubNivelGUI.frameDef.add(botonResultado);
    }
}
