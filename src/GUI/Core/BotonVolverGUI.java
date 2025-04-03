package GUI.Core;

import GUI.Actions.ProgresionGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonVolverGUI {

    public BotonVolverGUI(JFrame s1){
        JButton volver = new JButton("Volver");
        volver.setBounds(400, 530, 80, 50);
        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubNivelGUI.frameDef.getContentPane().removeAll();
                SubNivelGUI.frameDef.revalidate();
                SubNivelGUI.frameDef.repaint();

                switch (GUI.botonVolverValor){
                    case 1:
                        new ProgresionGUI();
                }
            }
        });
        s1.add(volver);
    }



}
