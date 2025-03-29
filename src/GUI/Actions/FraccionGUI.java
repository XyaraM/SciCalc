package GUI.Actions;

import Fractions.Fracciones;
import Fractions.Operaciones;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FraccionGUI extends Resultado {
    public int n1;
    public int d1;
    public int n2;
    public int d2;
    public JTextField numerador1 = new JTextField("N1");
    public JTextField denominador1 = new JTextField("D1");
    public JTextField numerador2 = new JTextField("N2");
    public JTextField denominador2 = new JTextField("D2");

    Fracciones Fe = new Fracciones(){
        @Override
        public void calc(int s1, int s2, int s3, int s4) {
            super.calc(s1, s2, s3, s4);
        }
    };


    public FraccionGUI(){
        fraGUI();
    }

    public void fraGUI(){

        SubNivelGUI F = new SubNivelGUI();
        F.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);


        JButton botonSuma = new JButton("Suma");
        JButton botonResta = new JButton("Resta");
        JButton botonMultiplicacion = new JButton("Multiplicacion");
        JButton botonDivision = new JButton("Division");

        numerador1.setBounds(100, 100, 30, 30);
        denominador1.setBounds(140, 100, 30, 30);
        numerador2.setBounds(100, 140, 30, 30);
        denominador2.setBounds(140, 140, 30, 30);
        botonSuma.setBounds(180, 140, 30, 30);
        botonResta.setBounds(210, 140, 30, 30);
        botonMultiplicacion.setBounds(240, 140, 30, 30);
        botonDivision.setBounds(270, 140, 30, 30);

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fracciones.isAdding = true;
                Fracciones.fracverify = true;
                includeVars();
                Fe.calc(n1, d1, n2, d2);
                Operaciones.sumaresta();
                butF();
            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fracciones.isAdding = false;
                Fracciones.fracverify = true;
                includeVars();
                Fe.calc(n1, d1, n2, d2);
                Operaciones.sumaresta();
                butF();
            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fracciones.isMultiplying = true;
                Fracciones.fracverify = true;
                includeVars();
                Fe.calc(n1, d1, n2, d2);
                Operaciones.multiplicaciondivision();
                butF();
            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fracciones.isMultiplying = false;
                Fracciones.fracverify = true;
                includeVars();
                Fe.calc(n1, d1, n2, d2);
                Operaciones.multiplicaciondivision();
                butF();
            }
        });

        SubNivelGUI.frameDef.add(numerador1);
        SubNivelGUI.frameDef.add(denominador1);
        SubNivelGUI.frameDef.add(numerador2);
        SubNivelGUI.frameDef.add(denominador2);
        SubNivelGUI.frameDef.add(botonSuma);
        SubNivelGUI.frameDef.add(botonResta);
        SubNivelGUI.frameDef.add(botonMultiplicacion);
        SubNivelGUI.frameDef.add(botonDivision);

    }

    public void includeVars(){
        n1 = Integer.parseInt(numerador1.getText());
        d1 = Integer.parseInt(denominador1.getText());
        n2 = Integer.parseInt(numerador2.getText());
        d2 = Integer.parseInt(denominador2.getText());
    }

}
