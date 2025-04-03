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
        JButton NEsimoPro = new JButton("P-Geometricas");

        terminoNEsimo.setBounds(174, 100, 150, 30);
        generalDif.setBounds(174, 130, 150, 30);
        sumaTerminos.setBounds(174, 160, 150, 30);
        NEsimoPro.setBounds(174, 190, 150, 30);

        SubNivelGUI.frameDef.add(terminoNEsimo);
        SubNivelGUI.frameDef.add(generalDif);
        SubNivelGUI.frameDef.add(sumaTerminos);
        SubNivelGUI.frameDef.add(NEsimoPro);

        terminoNEsimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
                terminoNEsimo();
            }
        });

        generalDif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
                generalDif();
            }
        });

        sumaTerminos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
                sumaDif();
            }
        });

        NEsimoPro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();
                NEsimoSucesion();
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

    public void NEsimoSucesion(){
        new ProgresionesGeometricasGUI();
    }

    public void volver(){
        GUI.botonVolverValor = 1; //Le da el valor a la variable para hacer dos cosas: Que cuando el boton de volver sea pulsado no se cree otra ventana (El if de mas arriba), y en la clase del boton volver se pueda retroceder a esta clase de aca
        SubNivelGUI.frameDef.getContentPane().removeAll();
        SubNivelGUI.frameDef.revalidate();
        SubNivelGUI.frameDef.repaint();
    }
}
