package GUI.Core;

import javax.swing.*;
import java.awt.*;

public class SubNivelGUI extends Resultado{
    public static JFrame frameDef;

    public void menuOperaciones(JFrame NombreJFrame){
        frameDef = NombreJFrame;
        frameDef = new JFrame();
        frameDef.setSize(500, 600);
        frameDef.setLayout(null);
        frameDef.setVisible(true);
        frameDef.getContentPane().setBackground(Color.darkGray);

    }

}
