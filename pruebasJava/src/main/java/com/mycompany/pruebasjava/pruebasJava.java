package com.mycompany.pruebasjava;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class pruebasJava {

    /*
    Hechos a partir de la Geekipedia de Ernesto
    Java desde Cero
     */
    private final Scanner entrada = new Scanner(System.in);

    public void OperacionA1() {
        System.out.println("Consigna A - 1: ");
        System.out.println("---------------------------------------------------");
        /*
        Resultado de cada operacion con numeroUno y numeroDos
        Result of every operation with numberOne and numberTwo
         */
        int numeroUno = 8, numeroDos = 4;

        int resultado = numeroUno + numeroDos;

        System.out.println("El resultado de la suma es: " + resultado);

        resultado = numeroUno - numeroDos;

        System.out.println("El resultado de la resta es: " + resultado);

        resultado = numeroUno * numeroDos;

        System.out.println("El resultado de la multiplicacion es: " + resultado);

        resultado = numeroUno / numeroDos;

        System.out.println("El resultado de la division es: " + resultado);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA2() {
        System.out.println("Consigna A - 2: ");
        System.out.println("---------------------------------------------------");
        /*
        Modificando las variables se obtiene el promedio de las materias
        Modifying the subjects you get the average of the subjects
         */
        int matematicas = 5, biologia = 8, quimica = 7;

        int promedio = (matematicas + biologia + quimica) / 3;

        if (promedio >= 6) {
            System.out.println("El alumno aprobo con " + promedio + ".");
        } else {
            System.out.println("El alumno desaprobo " + promedio + ".");
        }

        System.out.println("---------------------------------------------------");
    }

    public void OperacionA3() {
        System.out.println("Consigna A - 3: ");
        System.out.println("---------------------------------------------------");
        /*
        Modificando la variable operacion = ? del 0 al 4
        Modifying the variable operation = ? from 0 to 4
         */
        int operacion = 1, num_uno = 8, num_dos = 4;

        switch (operacion) {
            case 1 -> {
                int resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                int resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                int resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                int resultado = num_uno / num_dos;
                System.out.println("El resultado de la division es: " + resultado);
            }
            default ->
                System.out.println("La opcion que elegiste no existe.");
        }

        System.out.println("---------------------------------------------------");

    }

    public void OperacionA4() {
        System.out.println("Consigna A - 4");
        System.out.println("---------------------------------------------------");
        /*
        //Entrada por teclado - Nombre y la suma de dos variables
        //Keyboard input - Name and the sum of the two variables
         */
        entrada.useDelimiter("\n");

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.next();
        System.out.println("");

        System.out.println("Dame el primer valor para tu suma: ");
        int numeroUno = entrada.nextInt();
        System.out.println("");

        System.out.println("Dame el segundo valor para tu suma: ");
        int numeroDos = entrada.nextInt();
        System.out.println("");

        int resultado = numeroUno + numeroDos;

        System.out.println("Hola " + nombre + ", el resultado de tu suma es: " + resultado);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA5() {
        entrada.useDelimiter("\n");
        System.out.println("Operacion A - 5: ");
        System.out.println("---------------------------------------------------");
        /*
        Sistema de Coca-Cola - Dias de vacaciones para los trabajadores 
        Dependiendo de su antiguedad y clave
        
        Coca-Cola System - Vacation days for workers
        Depending on its antiquity and key
         */
        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");

        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = entrada.next();
        System.out.println();

        System.out.println("Ingrese cuantos años de servicio tiene el trabajador: ");
        int antiguedad = entrada.nextInt();
        System.out.println();

        System.out.println("Ingrese la clave de su departamento: ");
        int clave = entrada.nextInt();
        System.out.println();

        switch (clave) {
            case 1 -> {
                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + ", derecho a 6 dias de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + ", derecho a 14 dias de vacaciones");
                } else if (antiguedad == 7) {
                    System.out.println("El trabajador " + nombre + ", derecho a 20 dias de vacaciones");
                }
            }
            case 2 -> {
                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + ", derecho a 7 dias de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + ", derecho a 15 dias de vacaciones");
                } else if (antiguedad == 7) {
                    System.out.println("El trabajador " + nombre + ", derecho a 22 dias de vacaciones");
                }
            }
            case 3 -> {
                if (antiguedad == 1) {
                    System.out.println("El trabajador " + nombre + ", derecho a 10 dias de vacaciones");
                } else if (antiguedad >= 2 && antiguedad <= 6) {
                    System.out.println("El trabajador " + nombre + ", derecho a 20 dias de vacaciones");
                } else if (antiguedad == 7) {
                    System.out.println("El trabajador " + nombre + ", derecho a 30 dias de vacaciones");
                }
            }
            default -> {
            }
        }

        System.out.println("---------------------------------------------------");
    }

    public void OperacionA6() {
        System.out.println("Operacion A - 6: ");
        System.out.println("---------------------------------------------------");
        /*
        Distintas operaciones usando switch|if con una variable como parametro
        Different operations using switch|if with a value as a parameter
         */
        int numeroUno = 5, numeroDos = 3, resultado, parametro = 2;

        System.out.println("Numero del parametro: " + parametro);

        switch (parametro) {
            case 1 -> {
                resultado = numeroUno + numeroDos;
                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                resultado = numeroUno - numeroDos;
                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                resultado = numeroUno * numeroDos;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                resultado = numeroUno / numeroDos;
                System.out.println("El resultado de la division es: " + resultado);
            }
            default ->
                System.out.println("Error, la opcion no existe.");
        }

        System.out.println("---------------------------------------------------");
    }

    public void OperacionA7() {
        System.out.println("Consigna A - 7: ");
        System.out.println("---------------------------------------------------");
        /*
        Imprimiendo del 1 al 10 en consola usando for
        Printing from 1 to 10 in console using for
         */
        int i;

        for (i = 1; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA8() {
        System.out.println("Consigna A - 8: ");
        System.out.println("---------------------------------------------------");
        /*
        Imprimiendo en consola desde el 1 al 9 usando los 3 tipos de iteraciones
        for, while, do-while
        
        Priting to console from 1 to 9 using the 3 types of iterations
        for, while, do-while
         */

        System.out.println("Usando el for: \n");

        int i;

        for (i = 1; i < 8; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println(i);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el while: \n");

        i = 1;

        while (i < 8) {
            System.out.print(i + ", ");
            i += 2;
        }

        System.out.println(i);

        System.out.println("---------------------------------------------------");
        System.out.println("Usando el do-while: \n");

        i = 1;

        do {
            System.out.print(i + ", ");
            i += 2;
        } while (i < 8);

        System.out.println(i);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA9() {
        System.out.println("Consigna A - 9: ");
        System.out.println("---------------------------------------------------");
        /*
        Imprimiendo en consola desde el 1000 al 0 usando los 3 tipos de iteraciones
        for, while, do-while
        
        Priting to console from 1000 to 0 using the 3 types of iterations
        for, while, do-while
         */

        System.out.println("Usando el for: \n");

        int i;

        for (i = 1000; i > 0; i -= 200) {
            System.out.print(i + ", ");
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el while: \n");

        i = 1000;

        while (i > 0) {
            System.out.print(i + ", ");
            i -= 200;
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el do-while: \n");
        i = 1000;

        do {
            System.out.print(i + ", ");
            i -= 200;
        } while (i > 0);

        System.out.println(i);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA10() {
        System.out.println("Consigna A - 10: ");
        System.out.println("---------------------------------------------------");
        System.out.println("Desde el 1 al 9: \n");

        /*
        Imprimiendo en consola desde el 1 al 9 usando los 3 tipos de iteraciones
        for, while, do-while
        
        Priting to console from 1 to 9 using the 3 types of iterations
        for, while, do-while
         */
        System.out.println("Usando el for: \n");

        int i;

        for (i = 1; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el while: \n");

        i = 1;

        while (i < 10) {
            System.out.print(i + ", ");
            i++;
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el do-while: \n");

        i = 1;

        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 10);

        System.out.println(i);
        System.out.println("---------------------------------------------------");
        System.out.println("Desde el 1 hacia 5 y otra variable hacia el 99 al 95: \n");

        /*
        Imprimiendo en consola desde una variable que va hacia el 1 al 5 
        y otra variable que va desde el 99 al 95 
        usando los 3 tipos de iteraciones
        for, while, do-while
        
        Priting to console from a variable that goes from 1 to 5
        and another variable that goues from 99 to 95
        using the 3 types of iterations
        for, while, do-while
         */
        System.out.println("Usando el for: \n");

        int j = 99;

        for (i = 1; i < 5; i++) {
            System.out.print(i + ", " + j + ", ");
            j--;
        }

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        System.out.println("Usando el while: \n");

        j = 99;
        i = 1;

        while (i < 5) {
            System.out.print(i + ", " + j + ", ");
            i++;
            j--;
        }

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        System.out.println("Usando el do-while: \n");

        j = 99;
        i = 1;

        do {
            System.out.print(i + ", " + j + ", ");
            i++;
            j--;
        } while (i < 5);

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        System.out.println("Usando Secuencia de Fibonacci: \n");

        /*
        Imprimiendo en consola la Secuencia de Fibonacci 
        usando los 3 tipos de iteraciones
        for, while, do-while
        
        Priting with the Fibonacci Sequence on the console
        using the 3 types of iterations
        for, while, do-while
         */
        System.out.println("Usando el for: \n");

        int a = 0, b = 1, c;

        for (i = 0; i < 10; i++) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(a);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el while: \n");

        a = 0;
        b = 1;
        c = 0;
        i = 0;

        while (i < 10) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }

        System.out.println(a);
        System.out.println("---------------------------------------------------");

        System.out.println("Usando el do-while: \n");

        a = 0;
        b = 1;
        c = 0;
        i = 0;

        do {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < 10);

        System.out.println(a);
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA11() {
        System.out.println("Consigna A - 11: ");
        System.out.println("---------------------------------------------------");
        /*
        Usando String.equals - Comparacion de cadenas de texto
        Using String.equals - Comparison of text strings
         */
        entrada.useDelimiter("\n");

        System.out.println("Ingresa el primer nombre: ");
        String nombre_uno = entrada.next();
        System.out.println();

        System.out.println("Ingresa el segundo nombre: ");
        String nombre_dos = entrada.next();
        System.out.println();

        if (nombre_uno.equals(nombre_dos)) {
            System.out.println("------------------------");
            System.out.println("Los nombres son iguales.");
            System.out.println("------------------------");
        } else {
            System.out.println("---------------------------");
            System.out.println("Los nombres son diferentes.");
            System.out.println("---------------------------");
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese su usuario: ");
        String usuario = entrada.next();
        System.out.println();

        System.out.println("Ingrese su password: ");
        String password = entrada.next();

        if (usuario.equals("admin") && password.equals("admin")) {
            System.out.println("---------------------------");
            System.out.println("Inicio de sesion correcto.");
            System.out.println("---------------------------");
        } else {
            System.out.println("-----------------------------------------");
            System.out.println("Nombre de usuario o password incorrectos.");
            System.out.println("-----------------------------------------");
        }
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA12() {
        System.out.println("Consigna A - 12: ");
        System.out.println("---------------------------------------------------");
        /*
        Usando String.substring - Usa dos variables (int) para devolver una cadena nueva
        Using String.substring - Using two variables (int) to return a new string
         */
        entrada.useDelimiter("\n");

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena_original = entrada.next();
        System.out.println();

        int num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres \"" + cadena_original + "\" posee " + num_caracteres + " caracteres. \n");

        System.out.println("¿Desde que caracter deseas obtener la nueva cadena?: ");
        int desde = entrada.nextInt();
        System.out.println();

        System.out.println("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        int hasta = entrada.nextInt();
        System.out.println();

        String cadena_substraccion = cadena_original.substring(desde, hasta);

        System.out.println("La nueva cadena es: \"" + cadena_substraccion + "\"");
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA13() {
        System.out.println("Consigna A - 13: ");
        System.out.println("---------------------------------------------------");
        /*
        Uso de arreglos estaticos
        Using static arrays
         */
        int arreglo[] = new int[5];

        arreglo[0] = 413;
        arreglo[1] = 54;
        arreglo[2] = 623;
        arreglo[3] = 753;
        arreglo[4] = 981;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA14() {
        System.out.println("Consigna A - 14: ");
        System.out.println("---------------------------------------------------");
        /*
        Uso de Arreglos Dinamicos
        Variables introducidas a traves de la consola por teclado
        
        Using dynamic arrays
        Variables entered through the console by keyboard
         */
        System.out.println("Ingrese el tamaño del arreglo: ");
        int longitud = entrada.nextInt();
        System.out.println("");

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor #" + (i + 1));
            numeros[i] = entrada.nextInt();
            System.out.println("");
        }

        System.out.println("Numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + numeros[i] + "]");
        }
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA15() {
        System.out.println("Consigna A - 15: ");
        System.out.println("---------------------------------------------------");
        /*
        Uso de Matrices estaticas
        Using static arrays
         */
        int numeros[][] = new int[2][2];

        numeros[0][0] = 543;
        numeros[0][1] = 431;
        numeros[1][0] = 123;
        numeros[1][1] = 613;

        System.out.println("[" + numeros[0][0] + "]");
        System.out.println("[" + numeros[0][1] + "]");
        System.out.println("[" + numeros[1][0] + "]");
        System.out.println("[" + numeros[1][1] + "]");
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA16() {
        System.out.println("Consigna A - 16: ");
        System.out.println("---------------------------------------------------");

        /*
        Uso de Matrices Dinamicas
        Variables introducidas a traves de la consola por teclado
        
        Using dynamic matrix
        Variables entered through the console by keyboard
         */
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.println();

        System.out.println("Ingrese el numero de columnas de la matriz: ");
        int columnas = entrada.nextInt();
        System.out.println();

        int numeros[][] = new int[filas][columnas];
        int contador = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor #" + contador);
                numeros[i][j] = entrada.nextInt();
                System.out.println("");
                contador++;
            }
        }

        System.out.println("Numeros: ");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------------");
    }

    public class FormularioA1 extends JFrame {

        /*
        JLabel - Etiqueta de texto
        JLabel - Label of text
         */
        private final JLabel etiqueta1;

        public FormularioA1() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            etiqueta1 = new JLabel("Bienvenido a la prueba de "
                    + "Interfaz Grafica de KnightMortius");
            etiqueta1.setBounds(10, 20, 400, 300);
            add(etiqueta1);
        }
    }

    public class FormularioA2 extends JFrame {

        /*
        JLabel - Etiqueta de texto
        JLabel - Label of text
        
        String.setBounds - Coordenadas del objeto
        String.setBounds - Object Coordinates
         */
        private final JLabel etiqueta1, etiqueta2;

        public FormularioA2() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            etiqueta1 = new JLabel("Interfaz Gráfica");
            etiqueta1.setBounds(10, 20, 300, 30);
            add(etiqueta1);

            etiqueta2 = new JLabel("Versión 1.0");
            etiqueta2.setBounds(10, 100, 100, 30);
            add(etiqueta2);
        }
    }

    public class FormularioA3 extends JFrame implements ActionListener {

        /*
        JButton - Objeto tipo boton
        JButton - Object type button
        
        actionPerformed(ActionEvent e) - Uso de acciones sobre el boton
        actionPerformed(ActionEvent e) - Using actions on the button
         */
        private final JButton boton1;

        public FormularioA3() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            boton1 = new JButton("Cerrar");
            boton1.setBounds(300, 250, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                System.exit(0);
            }
        }
    }

    public class FormularioA4 extends JFrame implements ActionListener {

        /*
        JButton - Objeto tipo boton
        JButton - Object type button
        
        actionPerformed(ActionEvent e) - Uso de acciones sobre el boton
        actionPerformed(ActionEvent e) - Using actions on the button
        
        String.setText("") - Cambia lo que esta escrito 
        por otra cadena escrita por el usuario
        
        String.setText("") - Change what is written
        by another user-written string
         */
        private final JButton boton1, boton2, boton3;
        private final JLabel etiqueta1;

        public FormularioA4() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            etiqueta1 = new JLabel("En espera...");
            etiqueta1.setBounds(10, 10, 300, 30);
            add(etiqueta1);

            boton1 = new JButton("1");
            boton1.setBounds(10, 100, 90, 30);
            add(boton1);
            boton1.addActionListener(this);

            boton2 = new JButton("2");
            boton2.setBounds(110, 100, 90, 30);
            add(boton2);
            boton2.addActionListener(this);

            boton3 = new JButton("3");
            boton3.setBounds(210, 100, 90, 30);
            add(boton3);
            boton3.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                etiqueta1.setText("Has presionado el botón 1");
            } else if (e.getSource() == boton2) {
                etiqueta1.setText("Has presionado el botón 2");
            } else if (e.getSource() == boton3) {
                etiqueta1.setText("Has presionado el botón 3");
            }
        }
    }

    public class FormularioA5 extends JFrame implements ActionListener {

        /*
        JButton - Objeto tipo boton
        JButton - Object type button
        
        actionPerformed(ActionEvent e) - Uso de acciones sobre el boton
        actionPerformed(ActionEvent e) - Using actions on the button
        
        setTitle("") - Cambia el titulo del programa
        setTItle("") - Change the title of the program
         */
        private final JLabel etiqueta1;
        private final JTextField campoTexto1;
        private final JButton boton1;

        public FormularioA5() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            etiqueta1 = new JLabel("Usuario: ");
            etiqueta1.setBounds(10, 10, 100, 30);
            add(etiqueta1);

            campoTexto1 = new JTextField();
            campoTexto1.setBounds(120, 17, 150, 20);
            add(campoTexto1);

            boton1 = new JButton("Aceptar");
            boton1.setBounds(10, 80, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                String texto = campoTexto1.getText();

                setTitle(texto);
            }
        }
    }

    public class FormularioA6 extends JFrame {

        /*
        JTextArea - Objeto tipo cuadro de texto
        JTextArea - Object type text box
        
        JTextField - Objeto tipo campo de texto
        JTextField - Object type text field
        
         */
        private final JTextField campoTexto1;
        private final JTextArea cuadroTexto1;

        public FormularioA6() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            campoTexto1 = new JTextField();
            campoTexto1.setBounds(10, 10, 200, 30);
            add(campoTexto1);

            cuadroTexto1 = new JTextArea();
            cuadroTexto1.setBounds(10, 50, 400, 300);
            add(cuadroTexto1);
        }
    }

    public class FormularioA7 extends JFrame {

        /*
        JTextArea - Objeto tipo cuadro de texto
        JTextArea - Object type text box
        
        JTextField - Objeto tipo campo de texto
        JTextField - Object type text field
        
        JScrollPane - Objeto tipo barra de deslizamiento
        JScrollPane - Object type slider bar
         */
        private final JTextField campoTexto1;
        private final JTextArea cuadroTexto1;
        private final JScrollPane panelbarra1;

        public FormularioA7() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            campoTexto1 = new JTextField();
            campoTexto1.setBounds(10, 10, 200, 30);
            add(campoTexto1);

            cuadroTexto1 = new JTextArea();
            panelbarra1 = new JScrollPane(cuadroTexto1);
            panelbarra1.setBounds(10, 50, 400, 300);
            add(panelbarra1);
        }
    }

    public class FormularioA8 extends JFrame implements ActionListener {

        /*
        JTextArea - Objeto tipo cuadro de texto
        JTextArea - Object type text box
        
        JTextField - Objeto tipo campo de texto
        JTextField - Object type text field
        
        JScrollPane - Objeto tipo barra de deslizamiento
        JScrollPane - Object type slider bar
        
        Pasando texto desde JTextField hacia JTextArea usando un boton
        Passing text from JTextField to JTextArea using a button
         */
        private final JTextField campoTexto1;
        private final JTextArea cuadroTexto1;
        private final JScrollPane panelbarra1;
        private final JButton boton1;

        String texto = "";

        public FormularioA8() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            campoTexto1 = new JTextField();
            campoTexto1.setBounds(10, 10, 200, 30);
            add(campoTexto1);

            cuadroTexto1 = new JTextArea();
            cuadroTexto1.setEditable(false);
            cuadroTexto1.setFocusable(false);
            panelbarra1 = new JScrollPane(cuadroTexto1);
            panelbarra1.setBounds(10, 50, 400, 300);
            add(panelbarra1);

            boton1 = new JButton("Agregar");
            boton1.setBounds(250, 10, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                texto += campoTexto1.getText() + "\n";
                cuadroTexto1.setText(texto);
                campoTexto1.setText("");
            }
        }
    }

    public class FormularioA9 extends JFrame implements ActionListener {

        /*
        JTextArea - Objeto tipo cuadro de texto
        JTextArea - Object type text box
        
        JTextField - Objeto tipo campo de texto
        JTextField - Object type text field
        
        JScrollPane - Objeto tipo barra de deslizamiento
        JScrollPane - Object type slider bar
        
        Pasando texto desde JTextField hacia JTextArea usando un boton
        Passing text from JTextField to JTextArea using a button
         */
        private final JTextField campoTexto1, campoTexto2;
        private final JLabel etiqueta1, etiqueta2, etiqueta3;
        private final JButton boton1;

        public FormularioA9() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            campoTexto1 = new JTextField();
            campoTexto1.setBounds(120, 10, 150, 20);
            add(campoTexto1);

            campoTexto2 = new JTextField();
            campoTexto2.setBounds(120, 40, 150, 20);
            add(campoTexto2);

            etiqueta1 = new JLabel("Valor 1: ");
            etiqueta1.setBounds(50, 5, 100, 30);
            add(etiqueta1);

            etiqueta2 = new JLabel("Valor 2: ");
            etiqueta2.setBounds(50, 35, 100, 30);
            add(etiqueta2);

            etiqueta3 = new JLabel("Resultado: ");
            etiqueta3.setBounds(120, 80, 100, 30);
            add(etiqueta3);

            boton1 = new JButton("Sumar");
            boton1.setBounds(10, 80, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                int valor1 = Integer.parseInt(campoTexto1.getText());
                int valor2 = Integer.parseInt(campoTexto2.getText());

                int resultado = valor1 + valor2;

                etiqueta3.setText("Resultado: " + resultado);
            }
        }
    }

    public class FormularioA10 extends JFrame implements ItemListener {

        /*
        JComboBox - Objeto tipo lista desplegable
        JComboBox - Dropdown list object
        
        Usando el JComboBox para cambiar el nombre del titulo del programa
        Using the JComboBox for change the name of the program title
         */
        private final JComboBox seleccion1;

        public FormularioA10() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            seleccion1 = new JComboBox();
            seleccion1.setBounds(10, 10, 80, 20);
            add(seleccion1);
            seleccion1.addItem("Rojo");
            seleccion1.addItem("Verde");
            seleccion1.addItem("Azul");
            seleccion1.addItem("Amarillo");
            seleccion1.addItem("Negro");
            seleccion1.addItemListener(this);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == seleccion1) {
                String seleccion = seleccion1.getSelectedItem().toString();

                setTitle(seleccion);
            }
        }
    }

    public class FormularioA11 extends JFrame implements ActionListener {

        /*
        Usando el JComboBox 
        para cambiar el color del boton usando ActionListener
        (Añadiendo una accion al presionar el boton)
        
        Using the JComboBox
        to change the color of the button using ActionListener
        (Adding an action when pressing the button)
         */
        private final JLabel etiqueta1, etiqueta2, etiqueta3;
        private final JComboBox seleccion1, seleccion2, seleccion3;
        private final JButton boton1;

        public FormularioA11() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            etiqueta1 = new JLabel("Rojo: ");
            etiqueta1.setBounds(10, 10, 100, 10);
            add(etiqueta1);

            etiqueta2 = new JLabel("Verde: ");
            etiqueta2.setBounds(10, 50, 100, 10);
            add(etiqueta2);

            etiqueta3 = new JLabel("Azul: ");
            etiqueta3.setBounds(10, 90, 100, 10);
            add(etiqueta3);

            seleccion1 = new JComboBox();
            seleccion1.setBounds(120, 10, 50, 30);
            add(seleccion1);

            for (int i = 0; i <= 255; i++) {
                seleccion1.addItem(String.valueOf(i));
            }

            seleccion2 = new JComboBox();
            seleccion2.setBounds(120, 50, 50, 30);
            add(seleccion2);

            for (int i = 0; i <= 255; i++) {
                seleccion2.addItem(String.valueOf(i));
            }

            seleccion3 = new JComboBox();
            seleccion3.setBounds(120, 90, 50, 30);
            add(seleccion3);

            for (int i = 0; i <= 255; i++) {
                seleccion3.addItem(String.valueOf(i));
            }

            boton1 = new JButton("Fijar color");
            boton1.setBounds(10, 130, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                String cad1 = seleccion1.getSelectedItem().toString();
                String cad2 = seleccion2.getSelectedItem().toString();
                String cad3 = seleccion3.getSelectedItem().toString();

                int rojo = Integer.parseInt(cad1);
                int verde = Integer.parseInt(cad2);
                int azul = Integer.parseInt(cad3);

                Color color1 = new Color(rojo, verde, azul);

                boton1.setBackground(color1);
            }
        }
    }

    public class FormularioA12 extends JFrame implements ActionListener {

        /*
        JMenuBar - Barra de opciones
        JMenu - Despliegue de opciones
        JMenuItem - Items desplegados desde el JMenu
        
        JMenuBar - Options Bar
        JMenu - Options dropdown
        JMenuItem - Items displayed from the JMenu
        
        Usando JMenuItem y ActionListener para cambiar el color del fondo
        Using JMenuItem and ActionListener to change the background color
         */
        private final JMenuBar barra1;
        private final JMenu menu1;
        private final JMenuItem item1, item2, item3;

        public FormularioA12() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            barra1 = new JMenuBar();
            setJMenuBar(barra1);

            menu1 = new JMenu("Opciones");
            barra1.add(menu1);

            item1 = new JMenuItem("Rojo");
            item1.addActionListener(this);
            menu1.add(item1);

            item2 = new JMenuItem("Verde");
            item2.addActionListener(this);
            menu1.add(item2);

            item3 = new JMenuItem("Azul");
            item3.addActionListener(this);
            menu1.add(item3);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Container fondo = this.getContentPane();

            if (e.getSource() == item1) {
                fondo.setBackground(new Color(255, 0, 0));
            } else if (e.getSource() == item2) {
                fondo.setBackground(new Color(0, 255, 0));
            } else if (e.getSource() == item3) {
                fondo.setBackground(new Color(0, 0, 255));
            }
        }
    }

    public class FormularioA13 extends JFrame implements ActionListener {

        /*
        Usando JMenu y JMenuItem 
        para cambiar el color del fondo y tamaño de la ventana
        
        Using JMenu and JMenuItem
        to change the background color and window size
         */
        private final JMenuBar menubarra1;
        private final JMenu opciones, fondoResolucion, fondoColor;
        private final JMenuItem fondoResolucion1, fondoResolucion2, fondoColor1, fondoColor2;

        public FormularioA13() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            menubarra1 = new JMenuBar();
            setJMenuBar(menubarra1);

            opciones = new JMenu("Opciones");
            menubarra1.add(opciones);

            fondoResolucion = new JMenu("Tamaño de la ventana");
            opciones.add(fondoResolucion);

            fondoColor = new JMenu("Color de fondo");
            opciones.add(fondoColor);

            fondoResolucion1 = new JMenuItem("300*200");
            fondoResolucion.add(fondoResolucion1);
            fondoResolucion1.addActionListener(this);

            fondoResolucion2 = new JMenuItem("640*480");
            fondoResolucion.add(fondoResolucion2);
            fondoResolucion2.addActionListener(this);

            fondoColor1 = new JMenuItem("Rojo");
            fondoColor.add(fondoColor1);
            fondoColor1.addActionListener(this);

            fondoColor2 = new JMenuItem("Verde");
            fondoColor.add(fondoColor2);
            fondoColor2.addActionListener(this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == fondoResolucion1) {
                setSize(300, 200);
            }

            if (e.getSource() == fondoResolucion2) {
                setSize(640, 480);
            }

            if (e.getSource() == fondoColor1) {
                getContentPane().setBackground(new Color(255, 0, 0));
            }

            if (e.getSource() == fondoColor2) {
                getContentPane().setBackground(new Color(0, 255, 0));
            }
        }
    }

    public class FormularioA14 extends JFrame implements ChangeListener {

        /*
        JCheckBox - Uso de casilla de verificacion
        JCheckBox - Use of check box
        
        Usando JCheckBox para cambiar el titulo del programa
        Using JCheckBox to change the program title
         */
        private final JCheckBox checkbox1, checkbox2, checkbox3;

        public FormularioA14() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            checkbox1 = new JCheckBox("Ingles");
            checkbox1.setBounds(10, 10, 300, 30);
            add(checkbox1);
            checkbox1.addChangeListener(this);

            checkbox2 = new JCheckBox("Frances");
            checkbox2.setBounds(10, 50, 300, 30);
            add(checkbox2);
            checkbox2.addChangeListener(this);

            checkbox3 = new JCheckBox("Aleman");
            checkbox3.setBounds(10, 90, 300, 30);
            add(checkbox3);
            checkbox3.addChangeListener(this);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            String titulo = "";

            if (checkbox1.isSelected() == true) {
                titulo = titulo + "Ingles";
            }

            if (checkbox2.isSelected() == true) {
                titulo = titulo + "Frances";
            }

            if (checkbox3.isSelected() == true) {
                titulo = titulo + "Aleman";
            }

            setTitle(titulo);
        }
    }

    public class FormularioA15 extends JFrame implements ChangeListener, ActionListener {

        /*
        Usando JCheckBox para que el boton (JButton) 
        sea habilitado y pueda ser presionado
        
        Using JCheckBox for the button (JButton)
         be enabled and can be pressed
         */
        private final JLabel etiqueta1;
        private final JCheckBox checkbox1;
        private final JButton boton1;

        public FormularioA15() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            etiqueta1 = new JLabel("Aceptar terminos y condiciones");
            etiqueta1.setBounds(10, 10, 300, 30);
            add(etiqueta1);

            checkbox1 = new JCheckBox("Acepto");
            checkbox1.setBounds(10, 50, 300, 30);
            add(checkbox1);
            checkbox1.addChangeListener(this);

            boton1 = new JButton("Continuar");
            boton1.setBounds(10, 90, 300, 30);
            add(boton1);
            boton1.addActionListener(this);
            boton1.setEnabled(false);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            if (checkbox1.isSelected() == true) {
                boton1.setEnabled(true);
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                System.exit(0);
            }
        }
    }

    public class FormularioA16 extends JFrame implements ChangeListener {

        /*
        JRadioButton - Usado para elegir una sola opcion 
        de un conjunto predeterminado
        
        JRadioButton - Used to choose a single option
        from a predetermined set
        
        ButtonGroup - Se deben agrupar para que actúen en conjunto, 
        es decir cuando se selecciona uno automáticamente 
        se deben deseleccionar los otros
        
        ButtonGroup - They must be grouped to act together,
        i.e. when one is selected automatically
        the others must be deselected
        
        Usando JRadioButton para cambiar el tamaño de la ventana
        Using JRadioButton to resize the window
         */
        private final JRadioButton radio1, radio2, radio3;
        private final ButtonGroup bg;

        public FormularioA16() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            bg = new ButtonGroup();

            radio1 = new JRadioButton("640*480");
            radio1.setBounds(10, 20, 100, 30);
            add(radio1);
            radio1.addChangeListener(this);
            bg.add(radio1);

            radio2 = new JRadioButton("800*600");
            radio2.setBounds(10, 90, 100, 30);
            add(radio2);
            radio2.addChangeListener(this);
            bg.add(radio2);

            radio3 = new JRadioButton("1024*768");
            radio3.setBounds(10, 160, 100, 30);
            add(radio3);
            radio3.addChangeListener(this);
            bg.add(radio3);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            if (radio1.isSelected() == true) {
                setSize(640, 480);
            }

            if (radio2.isSelected() == true) {
                setSize(800, 600);
            }

            if (radio3.isSelected() == true) {
                setSize(1024, 768);
            }
        }
    }
}
