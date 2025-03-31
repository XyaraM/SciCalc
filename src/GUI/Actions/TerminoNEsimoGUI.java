package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PAritmetica.TerminoNesimoDif;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JTextField primerTermino = new JTextField();
        JTextField posicionTermino = new JTextField();
        JTextField posicionAK = new JTextField();
        JTextField diferencia = new JTextField();
        JButton calcular = new JButton();

        primerTermino.setBounds(50, 50, 30, 30);
        posicionTermino.setBounds(80, 50, 30, 30);
        posicionAK.setBounds(110, 50, 30, 30);
        diferencia.setBounds(140, 50, 30, 30);
        calcular.setBounds(190, 50, 30, 30);

        SubNivelGUI.frameDef.add(primerTermino);
        SubNivelGUI.frameDef.add(posicionTermino);
        SubNivelGUI.frameDef.add(posicionAK);
        SubNivelGUI.frameDef.add(diferencia);
        SubNivelGUI.frameDef.add(calcular);
        new BotonVolverGUI(SubNivelGUI.frameDef); // Crea el boton volver

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1 = Integer.parseInt(primerTermino.getText());
                p2 = Integer.parseInt(posicionTermino.getText());
                p3 = Integer.parseInt(posicionAK.getText());
                p4 = Integer.parseInt(diferencia.getText());
                instNE.calcGUI(p1, p2, p3, p4);
                butP();
            }
        });

    }

}
