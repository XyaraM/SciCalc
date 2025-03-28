package GUI;

import Actions.Calculacion;
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

        botonSuma.setBounds(150, 200, 220, 50);

        frame.add(botonSuma);
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickTest();
            }
        });
    }

    public void clickTest(){
        new SumaGUI();
    }
}
