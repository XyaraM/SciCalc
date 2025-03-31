package GUI.Actions;

import GUI.Core.GUI;
import GUI.Core.Resultado;
import GUI.Core.SubNivelGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgresionGUI extends Resultado {
    public static SubNivelGUI menuMadreProgresion = new SubNivelGUI();

    public ProgresionGUI(){
        proMenu();
    }

    public void proMenu(){

        if (GUI.botonVolverValor == 1){
        }else {
            menuMadreProgresion.menuOperaciones(new JFrame());
        }

        JButton terminoNEsimo = new JButton("N-Esimo");
        JButton generalDif = new JButton("Termino General");
        JButton sumaTerminos = new JButton("Suma Terminos");

        terminoNEsimo.setBounds(100, 100, 100, 30);
        generalDif.setBounds(130, 100, 100, 30);
        sumaTerminos.setBounds(160, 100, 100, 30);

        SubNivelGUI.frameDef.add(terminoNEsimo);
        SubNivelGUI.frameDef.add(generalDif);
        SubNivelGUI.frameDef.add(sumaTerminos);

        terminoNEsimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.botonVolverValor = 1; //Le da el valor a la variable para hacer dos cosas: Que cuando el boton de volver sea pulsado no se cree otra ventana (El if de mas arriba), y en la clase del boton volver se pueda retroceder a esta clase de aca
                SubNivelGUI.frameDef.getContentPane().removeAll();
                SubNivelGUI.frameDef.revalidate();
                SubNivelGUI.frameDef.repaint();
                terminoNEsimo();
            }
        });

        generalDif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.botonVolverValor = 1; //Le da el valor a la variable para hacer dos cosas: Que cuando el boton de volver sea pulsado no se cree otra ventana (El if de mas arriba), y en la clase del boton volver se pueda retroceder a esta clase de aca
                SubNivelGUI.frameDef.getContentPane().removeAll();
                SubNivelGUI.frameDef.revalidate();
                SubNivelGUI.frameDef.repaint();
                generalDif();
            }
        });

        sumaTerminos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.botonVolverValor = 1; //Le da el valor a la variable para hacer dos cosas: Que cuando el boton de volver sea pulsado no se cree otra ventana (El if de mas arriba), y en la clase del boton volver se pueda retroceder a esta clase de aca
                SubNivelGUI.frameDef.getContentPane().removeAll();
                SubNivelGUI.frameDef.revalidate();
                SubNivelGUI.frameDef.repaint();
                sumaDif();
            }
        });
    }

    public void terminoNEsimo(){
        new TerminoNEsimoGUI();
    }

    public void generalDif(){
        new TermGeneralDifGUI();
    }

    public void sumaDif(){
        new SumaTerminosGUI();
    }
}
