import Actions.*;
import GUI.Core.GUI;
import PAritmetica.SumaTerminos;
import PAritmetica.TerminoNesimoDif;
import PAritmetica.TermGeneralDif;
import Fractions.Fracciones;
import PGeometrica.NEsimoSucesion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // new GUI();
        while(true){
            System.out.println("Selecciona la operacion que quieres realizar \n \nSi quieres ver las operaciones disponibles escribe Ayuda.");
            Scanner bootup = new Scanner(System.in);
            String selection = bootup.nextLine();
            if(selection.equals("1")){
                System.out.println("Inserte los numeros que desea sumar");
                Suma calc = new Suma(bootup.nextInt(), bootup.nextInt());
                calc.displayResult();
            } else if (selection.equals("2")) {
                System.out.println("Inserte los numeros que desea restar");
                Resta calc = new Resta(bootup.nextInt(), bootup.nextInt());
                calc.displayResult();
            } else if (selection.equals("3")) {
                System.out.println("Inserte los numeros que desea multiplicar");
                Multiplicacion calc = new Multiplicacion(bootup.nextInt(), bootup.nextInt());
                calc.displayResult();
            } else if (selection.equals("4")) {
                System.out.println("Inserte los numeros que desea dividir");
                Division calc = new Division(bootup.nextInt(), bootup.nextInt());
                calc.displayResult();
            } else if (selection.equals("5")){
                System.out.println("""
                        Selecciona la operacion a realizar
                         \
                        
                        1 - Termino N-Esimo conociendo un termino y la diferencia\
                        
                        2 - Termino general conociendo la sucesion\
                        
                        3 - Suma de N terminos de la sucesion""");
                String seleccionAritmetica = bootup.nextLine();
                if (seleccionAritmetica.equals("1")){
                    System.out.println("""
                             \
                            Primer Numero: Primer Termino/Termino conocido\
                            
                             Segundo Numero: Posicion del Termino a encontrar\
                            
                             Tercer Numero: Posicion del primer Termino/Termino conocido\
                            
                             Cuarto Numero: Diferencia""");
                    TerminoNesimoDif calc = new TerminoNesimoDif(bootup.nextInt(), bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                } else if (seleccionAritmetica.equals("2")) {
                    System.out.println("""
                             \
                            Primer Numero: Primer Termino\
                            
                             Segundo Numero: Diferencia\
                            
                             Tercer Numero: Posicion a encontrar""");
                    TermGeneralDif calc = new TermGeneralDif(bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                } else if (seleccionAritmetica.equals("3")) {
                    System.out.println("""
                            \
                             Primer Numero: Primer Termino\
                            
                             Segundo Numero: Ultimo Termino\
                            
                             Tercer Numero: Total de terminos""");
                    SumaTerminos calc = new SumaTerminos(bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                }
            }else if (selection.equals("6")){
                System.out.print(
                        """
                                Ingresa las dos fracciones a utilizar
                                \s
                                 Primer numero: Numerador 1 \
                                
                                 Segundo numero: Denominador 1 \
                                
                                 Tercer numero: Numerador 2 \
                                
                                 Cuarto numero: Denominador 2
                                """);
                Fracciones frac = new Fracciones(bootup.nextInt(), bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                System.out.println("""
                        Que accion desea realizar con las dos fracciones ingresadas?\s
                         \
                        
                        1 - Suma\
                        
                        2 - Resta\
                        
                        3 - Multiplicacion\
                        
                        4 - Division""");
                bootup.nextLine();
                Fracciones fras = new Fracciones(bootup.nextInt());
                bootup.nextLine();
                frac.displayResult();
            } else if (selection.equals("7")) {
                System.out.println("""
                        Ingrese los valores que desea usar en la Sucesion\
                        
                        
                         Primer Numero: Primer valor\
                        
                         Segundo Numero: Posicion a encontrar\
                        """);
                NEsimoSucesion calc = new NEsimoSucesion(bootup.nextInt(),bootup.nextInt());
                calc.displayResult();
            }
            if (selection.equals("Ayuda")) {
                System.out.println("""
                       Este es el mensaje de ayuda con los comandos para ingresar a las operaciones\
                       \s
                         1 - Suma\
                       \s
                         2 - Resta\
                       \s
                         3 - Multiplicacion\
                       \s
                         4 - Division\
                       \s
                         5 - Operaciones Aritmeticas\
                       \s
                         6 - Operaciones Fraccionales\
                        \s
                         7 - Operaciones Progresiones Geometricas\
                       \s
                         8 - Salir\
                        \s""");
            } else if (selection.equals("8")) {
                break;
            }
        }
    }
}