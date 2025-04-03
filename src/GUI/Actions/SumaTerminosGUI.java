package GUI.Actions;

import GUI.Core.BotonVolverGUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;
import PAritmetica.SumaTerminos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaTerminosGUI extends Resultado {
    public int r1;
    public int r2;
    public int r3;

    public SumaTerminosGUI(){
        sumaTerminos();
    }

   public void sumaTerminos(){

        calculo(SubNivelGUI.frameDef);

       SumaTerminos sumaAction = new SumaTerminos(){
           @Override
           public void calcTotal(int s1, int s2, int s3) {
               super.calcTotal(s1, s2, s3);
           }
       };

       JTextField t1 = new JTextField("A1");
       JTextField t2 = new JTextField("An");
       JTextField t3 = new JTextField("N");
       JButton botonCalculo = new JButton("Calcular");
       JLabel text = new JLabel("(A1 + An) * N / 2");


       t1.setBounds(220, 50, 60, 30);
       t2.setBounds(220, 90, 60, 30);
       t3.setBounds(220, 130, 60, 30);
       botonCalculo.setBounds(204, 180, 90, 30);
       text.setBounds(170, 10, 190, 40);
       text.setForeground(Color.white);
       text.setFont(new Font("helvetica", Font.BOLD, 20));

       SubNivelGUI.frameDef.add(t1);
       SubNivelGUI.frameDef.add(t2);
       SubNivelGUI.frameDef.add(t3);
       SubNivelGUI.frameDef.add(botonCalculo);
       SubNivelGUI.frameDef.add(text);
       new BotonVolverGUI(SubNivelGUI.frameDef);

       botonCalculo.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               r1 = Integer.parseInt(t1.getText());
               r2 = Integer.parseInt(t2.getText());
               r3 = Integer.parseInt(t3.getText());
               sumaAction.calcTotal(r1, r2, r3);
               butP();
           }
       });

   }
}
