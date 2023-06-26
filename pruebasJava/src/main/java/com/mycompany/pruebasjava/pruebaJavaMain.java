package com.mycompany.pruebasjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pruebaJavaMain {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            pruebasJava modoConsigna = new pruebasJava();

            System.out.println("---------------------------------------------------");
            System.out.print("Ingrese el numero de operacion: ");
            int operacion = entrada.nextInt();
            System.out.println("---------------------------------------------------");

            switch (operacion) {
                case 1:
                    modoConsigna.OperacionA1();
                    break;
                case 2:
                    modoConsigna.OperacionA2();
                    break;
                case 3:
                    modoConsigna.OperacionA3();
                    break;
                case 4:
                    modoConsigna.OperacionA4();
                    break;
                case 5:
                    modoConsigna.OperacionA5();
                    break;
                case 6:
                    modoConsigna.OperacionA6();
                    break;
                case 7:
                    modoConsigna.OperacionA7();
                    break;
                case 8:
                    modoConsigna.OperacionA8();
                    break;
                case 9:
                    modoConsigna.OperacionA9();
                    break;
                case 10:
                    modoConsigna.OperacionA10();
                    break;
                case 11:
                    modoConsigna.OperacionA11();
                    break;
                case 12:
                    modoConsigna.OperacionA12();
                    break;
                case 13:
                    modoConsigna.OperacionA13();
                    break;
                case 14:
                    modoConsigna.OperacionA14();
                    break;
                case 15:
                    modoConsigna.OperacionA15();
                    break;
                case 16:
                    modoConsigna.OperacionA16();
                    break;
                case 17:
                    pruebasJava.FormularioA1 formulario1 = modoConsigna.new FormularioA1();
                    
                    formulario1.setBounds(0, 0, 400, 300);
                    formulario1.setLocationRelativeTo(null);
                    formulario1.setVisible(true);
                    break;
                case 18:
                    pruebasJava.FormularioA2 formulario2 = modoConsigna.new FormularioA2();
                    
                    formulario2.setBounds(0,0,500,500);
                    formulario2.setLocationRelativeTo(null);
                    formulario2.setVisible(true);
                    formulario2.setResizable(true);
                    break;
                case 19:
                    pruebasJava.FormularioA3 formulario3 = modoConsigna.new FormularioA3();
                    
                    formulario3.setBounds(0,0,450,300);
                    formulario3.setLocationRelativeTo(null);
                    formulario3.setVisible(true);
                    formulario3.setResizable(false);
                    break;
                case 20:
                    pruebasJava.FormularioA4 formulario4 = modoConsigna.new FormularioA4();
                    
                    formulario4.setBounds(0,0,500,500);
                    formulario4.setLocationRelativeTo(null);
                    formulario4.setVisible(true);
                    formulario4.setResizable(false);
                    break;
                case 21:
                    pruebasJava.FormularioA5 formulario5 = modoConsigna.new FormularioA5();
                    
                    formulario5.setBounds(0, 0, 300, 300);
                    formulario5.setResizable(false);
                    formulario5.setLocationRelativeTo(null);
                    formulario5.setVisible(true);
                    break;
                case 22:
                    pruebasJava.FormularioA6 formulario6 = modoConsigna.new FormularioA6();
                    
                    formulario6.setBounds(0, 0, 500, 500);
                    formulario6.setLocationRelativeTo(null);
                    formulario6.setResizable(false);
                    formulario6.setVisible(true);
                    break;
                case 23:
                    pruebasJava.FormularioA7 formulario7 = modoConsigna.new FormularioA7();
                    
                    formulario7.setBounds(0,0,500,500);
                    formulario7.setLocationRelativeTo(null);
                    formulario7.setResizable(false);
                    formulario7.setVisible(true);
                    break;
                case 24:
                    pruebasJava.FormularioA8 formulario8 = modoConsigna.new FormularioA8();
                    
                    formulario8.setBounds(0,0,500,500);
                    formulario8.setLocationRelativeTo(null);
                    formulario8.setResizable(false);
                    formulario8.setVisible(true);
                    break;
                case 25:
                    pruebasJava.FormularioA9 formulario9 = modoConsigna.new FormularioA9();
                    
                    formulario9.setBounds(0,0,300,150);
                    formulario9.setLocationRelativeTo(null);
                    formulario9.setVisible(true);
                    formulario9.setResizable(false);
                    break;
                case 26:
                    pruebasJava.FormularioA10 formulario10 = modoConsigna.new FormularioA10();
                    
                    formulario10.setBounds(0,0,300,300);
                    formulario10.setLocationRelativeTo(null);
                    formulario10.setResizable(false);
                    formulario10.setVisible(true);
                    break;
                case 27:
                    pruebasJava.FormularioA11 formulario11 = modoConsigna.new FormularioA11();
                    
                    formulario11.setBounds(0,0,300,300);
                    formulario11.setLocationRelativeTo(null);
                    formulario11.setResizable(false);
                    formulario11.setVisible(true);
                    break;
                case 28:
                    pruebasJava.FormularioA12 formulario12 = modoConsigna.new FormularioA12();
                    
                    formulario12.setBounds(0,0,300,300);
                    formulario12.setLocationRelativeTo(null);
                    formulario12.setResizable(false);
                    formulario12.setVisible(true);
                    break;
                case 29:
                    pruebasJava.FormularioA13 formulario13 = modoConsigna.new FormularioA13();
                    
                    formulario13.setBounds(0,0,500,500);
                    formulario13.setLocationRelativeTo(null);
                    formulario13.setResizable(false);
                    formulario13.setVisible(true);
                    break;
                case 30:
                    pruebasJava.FormularioA14 formulario14 = modoConsigna.new FormularioA14();
                    
                    formulario14.setBounds(0,0,500,500);
                    formulario14.setLocationRelativeTo(null);
                    formulario14.setVisible(true);
                    formulario14.setResizable(false);
                    break;
                case 31:
                    pruebasJava.FormularioA15 formulario15 = modoConsigna.new FormularioA15();
                    
                    formulario15.setBounds(0,0,500,500);
                    formulario15.setLocationRelativeTo(null);
                    formulario15.setVisible(true);
                    formulario15.setResizable(false);
                    break;
                case 32:
                    pruebasJava.FormularioA16 formulario16 = modoConsigna.new FormularioA16();
                    
                    formulario16.setBounds(0,0,500,500);
                    formulario16.setLocationRelativeTo(null);
                    formulario16.setResizable(false);
                    formulario16.setVisible(true);
                    break;
                default:
                    System.out.println("----------------------");
                    System.out.println("Operacion inexistente.");
                    System.out.println("----------------------");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("------------------------------------------");
            System.out.println("Solo puede ingresar numeros en este campo.");
            System.out.println("------------------------------------------");
        }

    }
}
