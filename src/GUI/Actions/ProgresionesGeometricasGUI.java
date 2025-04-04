package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PGeometrica.NEsimoSucesion;

import javax.swing.*;
import java.awt.*;

public class ProgresionesGeometricasGUI extends Resultado {
    public int r1;
    public int r2;

    public ProgresionesGeometricasGUI(){
        progresionGeo();
    }

    public void progresionGeo(){

        calculo(SubNivelGUI.frameDef);

        NEsimoSucesion geoNE = new NEsimoSucesion(){
            @Override
            public void calcNE(int s1, int s2) {
                super.calcNE(s1, s2);
            }
        };

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton botonCalculo = new JButton("Calcular");
        JLabel text = new JLabel("A1 * 2 ^ n-1");

        t1.setBounds(220, 50, 60, 30);
        t2.setBounds(220, 90, 60, 30);
        botonCalculo.setBounds(204, 130, 90, 30);
        text.setBounds(193, 10, 190, 40);
        text.setForeground(Color.white);
        text.setFont(new Font("helvetica", Font.BOLD, 20));

        SubNivelGUI.frameDef.add(t1);
        SubNivelGUI.frameDef.add(t2);
        SubNivelGUI.frameDef.add(botonCalculo);
        SubNivelGUI.frameDef.add(text);
        new BotonVolverGUI(SubNivelGUI.frameDef);

        botonCalculo.addActionListener(e -> {
            r1 = Integer.parseInt(t1.getText());
            r2 = Integer.parseInt(t2.getText());
            geoNE.calcNE(r1, r2);
            butP();
        });
    }

}
