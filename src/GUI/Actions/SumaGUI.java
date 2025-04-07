package GUI.Actions;

import javax.swing.*;

import Actions.Suma;
import GUI.Core.Resultado;
import GUI.Core.SimboloSRMDGUI;
import GUI.Core.SubNivelGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaGUI extends Resultado {
    public float firstTerm;
    public float secondTerm;

    //Se instancia y se hace un override a Suma.java, calc es el metodo que se encarga de sumar s1 y s2, para luego guardarlo en la variable de resultado
    Suma S = new Suma(){
        @Override
        public void calc(float s1, float s2) {
            super.calc(s1, s2);
        }
    };

    //Crea un metodo para que cuando SumaGUI sea instanciada desde GUI.java se muestre la ventana de abajo
    public SumaGUI(){
        sumaGui();
    }

    //Esta ventana
    public void sumaGui(){

        //Esto instancia el simbolo de calculo
        SimboloSRMDGUI simb = new SimboloSRMDGUI(){
            @Override
            public void simb(int simboloNumero) {
                super.simb(simboloNumero);
            }
        };

        //Instancia el SubMenuGUI, la ventana que se abre cuando pulsas el boton de sumar, y agrega el cubito de calculo que tendra el resultado
        SubNivelGUI menuMadre = new SubNivelGUI();
        menuMadre.menuOperaciones(new JFrame());
        calculo(SubNivelGUI.frameDef);

        //Crea dos casillas para colocar texto, junto a un boton para sumar cuando es pulsado, y coloca el simbolo del centro
        JTextField suma = new JTextField();
        JTextField suma2 = new JTextField();
        JButton botonResultado = new JButton("Sumar");
        simb.simb(1);

        suma.setBounds(100, 100, 100, 30);
        suma2.setBounds(290, 100, 100, 30);
        botonResultado.setBounds(145, 230, 200, 100);


        //Esta es la logica del boton, cuando es pulsado las dos variables del inicio pasan a tener un valor de string que sera sacado de los botones "getText()",
        //y finalmente se llama a butP que tomara la variable result y la mostrara en pantalla
        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                firstTerm = Float.parseFloat(suma.getText());
                secondTerm = Float.parseFloat(suma2.getText());
                S.calc(firstTerm, secondTerm);
                butP();
            }
        });

        //Finalmente los contenidos creados en esta ventana son añadidos al frame de SubMenuGUI.java, el cual es la madre de esta aberracion que me atrevo a llamar programacion de swing
        SubNivelGUI.frameDef.add(suma);
        SubNivelGUI.frameDef.add(suma2);
        SubNivelGUI.frameDef.add(botonResultado);
    }
}
