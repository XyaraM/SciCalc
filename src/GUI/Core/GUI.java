package GUI.Core;

import Actions.Calculacion;
import GUI.Actions.*;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static JFrame frame = new JFrame();
    public static int botonVolverValor;
    public GUI(){
        GUII();
    }
    public void GUII(){
        Calculacion.isGuiOpen = true;
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(600, 500));
        frame.setMaximizedBounds(new Rectangle(600, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton botonSuma = new JButton("Suma");
        JButton botonResta = new JButton("Resta");
        JButton botonMultiplicacion = new JButton("Multiplicacion");
        JButton botonDivision = new JButton("Division");
        JButton botonFrac = new JButton("Fracciones");
        JButton botonPro = new JButton("Progresiones");
        JLabel title = new JLabel("SciCalc");
        frame.setTitle("SciCalc");

        botonSuma.setBounds(30, 100, 220, 50);
        botonResta.setBounds(30, 170, 220, 50);
        botonMultiplicacion.setBounds(30, 240, 220, 50);
        botonDivision.setBounds(30, 310, 220, 50);
        botonFrac.setBounds(345, 100, 220, 50);
        botonPro.setBounds(345, 170, 220, 50);
        title.setBounds(244, 30, 130, 50);
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setForeground(Color.white);
        frame.getContentPane().setBackground(Color.darkGray);


        frame.add(botonSuma);
        frame.add(botonResta);
        frame.add(botonMultiplicacion);
        frame.add(botonDivision);
        frame.add(botonFrac);
        frame.add(botonPro);
        frame.add(title);

        botonMultiplicacion.addActionListener(e -> multiplicacionAction());

        botonResta.addActionListener(e -> restaAction());

        botonSuma.addActionListener(e -> sumaAction());

        botonDivision.addActionListener(e -> diviAction());

        botonFrac.addActionListener(e -> fracAction());

        botonPro.addActionListener(e -> proAction());
    }

    public void multiplicacionAction(){
        new MultiplicacionGUI();
    }

    public void sumaAction(){
        new SumaGUI();
    }

    public void restaAction(){
        new RestaGUI();
    }

    public void diviAction(){
        new DivisionGUI();
    }

    public void fracAction(){
        new FraccionGUI();
    }

    public void proAction(){
        new ProgresionGUI();
    }
}
