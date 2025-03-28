package GUI.Core;

import Actions.Calculacion;
import GUI.Actions.RestaGUI;
import GUI.Actions.SumaGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public GUI(){
        GUII();
    }
    public void GUII(){
        Calculacion.isGuiOpen = true;
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton botonSuma = new JButton("Suma");
        JButton botonResta = new JButton("Resta");

        botonSuma.setBounds(30, 100, 220, 50);
        botonResta.setBounds(30, 170, 220, 50);

        frame.add(botonSuma);
        frame.add(botonResta);

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restaAction();
            }
        });

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaAction();
            }
        });
    }

    public void sumaAction(){
        new SumaGUI();
    }

    public void restaAction(){
        new RestaGUI();
    }
}
