package GUI.Core;

import javax.swing.*;
import java.awt.*;

public class SimboloSRMDGUI {

    public SimboloSRMDGUI(){

    }

    public void simb(int simboloNumero){
        JLabel simbolo = new JLabel();

        switch (simboloNumero){
            case 1:
                simbolo.setText("+");
                simbolo.setBounds(236, 100, 30, 30);
                simbolo.setFont(new Font("Helvetica", Font.BOLD, 30));
                simbolo.setForeground(Color.white);
                break;
            case 2:
                simbolo.setText("-");
                simbolo.setBounds(240, 96, 30, 30);
                simbolo.setFont(new Font("Helvetica", Font.BOLD, 30));
                simbolo.setForeground(Color.white);
                break;
            case 3:
                simbolo.setText("X");
                simbolo.setBounds(236, 100, 30, 30);
                simbolo.setFont(new Font("Helvetica", Font.BOLD, 30));
                simbolo.setForeground(Color.white);
                break;
            case 4:
                simbolo.setText("/");
                simbolo.setBounds(236, 100, 30, 30);
                simbolo.setFont(new Font("helvetica", Font.BOLD, 30));
                simbolo.setForeground(Color.white);
                break;
            case 5:
                simbolo.setText("/");
                simbolo.setBounds(249, 140, 30, 30);
                simbolo.setFont(new Font("helvetica", Font.BOLD, 30));
                simbolo.setForeground(Color.white);
        }
        SubNivelGUI.frameDef.add(simbolo);
    }
}
