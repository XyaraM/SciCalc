package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PAritmetica.TerminoNesimoDif;

import javax.swing.*;
import java.awt.*;

public class TerminoNEsimoGUI extends Resultado {

    public int p1;
    public int p2;
    public int p3;
    public int p4;

    public TerminoNEsimoGUI(){
        NEGUI();
    }

    public void NEGUI(){

        TerminoNesimoDif instNE = new TerminoNesimoDif(){
            @Override
            public void calcGUI(int PrimerTermino, int PosicionTermino, int PosicionAK, int Diferencia) {
                super.calcGUI(PrimerTermino, PosicionTermino, PosicionAK, Diferencia);
            }
        };

        calculo(SubNivelGUI.frameDef);

        JTextField primerTermino = new JTextField("Ak");
        JTextField posicionTermino = new JTextField("K");
        JTextField posicionAK = new JTextField("N");
        JTextField diferencia = new JTextField("D");
        JButton calcular = new JButton("Calcular");
        JLabel text = new JLabel("An = Ak + (k-n) * D");

        primerTermino.setBounds(220, 50, 60, 30);
        posicionTermino.setBounds(220, 90, 60, 30);
        posicionAK.setBounds(220, 130, 60, 30);
        diferencia.setBounds(220, 170, 60, 30);
        calcular.setBounds(204, 220, 90, 30);
        text.setBounds(160, 10, 190, 40);
        text.setForeground(Color.white);
        text.setFont(new Font("helvetica", Font.BOLD, 20));

        SubNivelGUI.frameDef.add(primerTermino);
        SubNivelGUI.frameDef.add(posicionTermino);
        SubNivelGUI.frameDef.add(posicionAK);
        SubNivelGUI.frameDef.add(diferencia);
        SubNivelGUI.frameDef.add(calcular);
        SubNivelGUI.frameDef.add(text);
        new BotonVolverGUI(SubNivelGUI.frameDef); // Crea el boton volver

        calcular.addActionListener(e -> {
            p1 = Integer.parseInt(primerTermino.getText());
            p2 = Integer.parseInt(posicionTermino.getText());
            p3 = Integer.parseInt(posicionAK.getText());
            p4 = Integer.parseInt(diferencia.getText());
            instNE.calcGUI(p1, p2, p3, p4);
            butP();
        });

    }

}
