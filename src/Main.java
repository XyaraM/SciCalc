import Actions.*;
import Fractions.Operaciones;
import PAritmetica.SumaTerminos;
import PAritmetica.TerminoNesimoDif;
import PAritmetica.TermGeneralDif;
import Fractions.Fracciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                System.out.println("Inserte los numeros que desea multiplicar");
                Division calc = new Division(bootup.nextInt(), bootup.nextInt());
                calc.displayResult();
            } else if (selection.equals("5")){
                System.out.println("Selecciona la operacion a realizar\n " +
                        "\n1 - Termino N-Esimo conociendo un termino y la diferencia" +
                        "\n2 - Termino general conociendo la sucesion" +
                        "\n3 - Suma de N terminos de la sucesion");
                String seleccionAritmetica = bootup.nextLine();
                if (seleccionAritmetica.equals("1")){
                    System.out.println(" " +
                            "Primer Numero: Primer Termino/Termino conocido" +
                            "\n Segundo Numero: Posicion del Termino a encontrar" +
                            "\n Tercer Numero: Posicion del primer Termino/Termino conocido" +
                            "\n Cuarto Numero: Diferencia");
                    TerminoNesimoDif calc = new TerminoNesimoDif(bootup.nextInt(), bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                } else if (seleccionAritmetica.equals("2")) {
                    System.out.println(" " +
                            "Primer Numero: Primer Termino" +
                            "\n Segundo Numero: Diferencia" +
                            "\n Tercer Numero: Posicion a encontrar");
                    TermGeneralDif calc = new TermGeneralDif(bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                } else if (seleccionAritmetica.equals("3")) {
                    SumaTerminos calc = new SumaTerminos(bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                    calc.displayResult();
                }
            }else if (selection.equals("6")){
                System.out.print(
                        "Ingresa las dos fracciones a utilizar\n \n Primer numero: Numerador 1 " +
                        "\n Segundo numero: Denominador 1 " +
                        "\n Tercer numero: Numerador 2 " +
                        "\n Cuarto numero: Denominador 2\n");
                Fracciones frac = new Fracciones(bootup.nextInt(), bootup.nextInt(), bootup.nextInt(), bootup.nextInt());
                System.out.println("Que accion desea realizar con las dos fracciones ingresadas? \n " +
                        "\n1 - Suma" +
                        "\n2 - Resta" +
                        "\n3 - Multiplicacion" +
                        "\n4 - Division");
                bootup.nextLine();
                Fracciones fras = new Fracciones(bootup.nextInt());
                bootup.nextLine();
                frac.displayResult();
            }else if (selection.equals("Ayuda")) {
                System.out.println(" " +
                        "Este es el mensaje de ayuda con los comandos para ingresar a las operaciones" +
                        "\n 1 - Suma" +
                        "\n 2 - Resta" +
                        "\n 3 - Multiplicacion" +
                        "\n 4 - Division" +
                        "\n 5 - Operaciones Aritmeticas" +
                        "\n 6 - Operaciones Fraccionales" +
                        "\n 7 - Salir" +
                        " ");
            } else if (selection.equals("7")) {
                break;
            }
        }
    }
}