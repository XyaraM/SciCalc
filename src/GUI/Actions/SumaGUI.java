package GUI.Actions;

import javax.swing.*;

import Actions.Calculacion;
import Actions.Suma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaGUI{
    public int firstTerm;
    public int secondTerm;

    Suma S = new Suma(){
        @Override
        public void calc(int s1, int s2) {
            super.calc(s1, s2);
        }
    };

    public SumaGUI(){
        sumaGui();
    }

    public void sumaGui(){
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        JTextField suma = new JTextField();
        suma.setBounds(100, 100, 100, 30);
        JTextField suma2 = new JTextField();
        suma2.setBounds(100, 200, 100, 30);

        JButton botonResultado = new JButton("Sumar");
        botonResultado.setBounds(100, 300, 200, 200);

        JTextArea resultado = new JTextArea("0");
        resultado.setBounds(100, 600, 200, 200);

        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                firstTerm = Integer.parseInt(suma.getText());
                secondTerm = Integer.parseInt(suma2.getText());
                S.calc(firstTerm, secondTerm);
                resultado.setText(String.valueOf(Calculacion.result));
            }
        });
        frame.add(suma);
        frame.add(suma2);
        frame.add(botonResultado);
        frame.add(resultado);

    }

}
