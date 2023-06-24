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
import javax.swing.JCheckBox;

public class pruebasJava {

    private Scanner entrada = new Scanner(System.in);

    public void OperacionA1() {
        System.out.println("Consigna A - 1: ");
        System.out.println("---------------------------------------------------");
        //Resultado de cada operacion con numeroUno y numeroDos
        int numeroUno = 8, numeroDos = 4, resultado = 0;

        resultado = numeroUno + numeroDos;

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
        //Modificar materias para obtener promedio
        int matematicas = 5, biologia = 8, quimica = 7, promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

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
        //Modificar operacion = ? del 0 al 4
        int operacion = 1, num_uno = 8, num_dos = 4, resultado = 0;

        if (operacion == 1) {
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion == 2) {
            resultado = num_uno - num_dos;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (operacion == 3) {
            resultado = num_uno * num_dos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        } else if (operacion == 4) {
            resultado = num_uno / num_dos;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("La opcion que elegiste no existe.");
        }

        System.out.println("---------------------------------------------------");

    }

    public void OperacionA4() {
        System.out.println("Consigna A - 4");
        System.out.println("---------------------------------------------------");
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
        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");

        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = entrada.next();
        System.out.println("");

        System.out.println("Ingrese cuantos años de servicio tiene el trabajador: ");
        int antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.println("Ingrese la clave de su departamento: ");
        int clave = entrada.nextInt();
        System.out.println("");

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + nombre + ", derecho a 6 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + ", derecho a 14 dias de vacaciones");
            } else if (antiguedad == 7) {
                System.out.println("El trabajador " + nombre + ", derecho a 20 dias de vacaciones");
            }
        } else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + nombre + ", derecho a 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + ", derecho a 15 dias de vacaciones");
            } else if (antiguedad == 7) {
                System.out.println("El trabajador " + nombre + ", derecho a 22 dias de vacaciones");
            }
        } else if (clave == 3) {
            if (antiguedad == 1) {
                System.out.println("El trabajador " + nombre + ", derecho a 10 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("El trabajador " + nombre + ", derecho a 20 dias de vacaciones");
            } else if (antiguedad == 7) {
                System.out.println("El trabajador " + nombre + ", derecho a 30 dias de vacaciones");
            }
        }

        System.out.println("---------------------------------------------------");
    }

    public void OperacionA6() {
        System.out.println("Operacion A - 6: ");
        System.out.println("---------------------------------------------------");
        int numeroUno = 5, numeroDos = 3, resultado, parametro = 2;

        switch (parametro) {
            case 1:
                resultado = numeroUno + numeroDos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = numeroUno - numeroDos;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = numeroUno * numeroDos;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = numeroUno / numeroDos;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("Error, la opcion no existe.");
                break;
        }

        System.out.println("---------------------------------------------------");
    }

    public void OperacionA7() {
        System.out.println("Consigna A - 7: ");
        System.out.println("---------------------------------------------------");
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
        int i;

        for (i = 1; i < 8; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println(i);
        System.out.println("---------------------------------------------------");
        i = 1;

        while (i < 8) {
            System.out.print(i + ", ");
            i += 2;
        }

        System.out.println(i);

        System.out.println("---------------------------------------------------");
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
        int i = 0;

        for (i = 1000; i > 0; i -= 200) {
            System.out.print(i + ", ");
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");
        i = 1000;

        while (i > 0) {
            System.out.print(i + ", ");
            i -= 200;
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");
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
        int i = 0;

        for (i = 1; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");
        i = 1;

        while (i < 10) {
            System.out.print(i + ", ");
            i++;
        }

        System.out.println(i);
        System.out.println("---------------------------------------------------");
        i = 1;

        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 10);

        System.out.println(i);
        System.out.println("---------------------------------------------------");
        int j = 99;

        for (i = 1; i < 5; i++) {
            System.out.print(i + ", " + j + ", ");
            j--;
        }

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        j = 99;
        i = 1;

        while (i < 5) {
            System.out.print(i + ", " + j + ", ");
            i++;
            j--;
        }

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        j = 99;
        i = 1;

        do {
            System.out.print(i + ", " + j + ", ");
            i++;
            j--;
        } while (i < 5);

        System.out.println(i + ", " + j);
        System.out.println("---------------------------------------------------");
        int a = 0, b = 1, c = 0;

        for (i = 0; i < 10; i++) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(a);
        System.out.println("---------------------------------------------------");
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
        entrada.useDelimiter("\n");

        System.out.println("Ingresa el primer nombre: ");
        String nombre_uno = entrada.next();
        System.out.println("");

        System.out.println("Ingresa el segundo nombre: ");
        String nombre_dos = entrada.next();
        System.out.println("");

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
        System.out.println("");

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
        entrada.useDelimiter("\n");

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena_original = entrada.next();
        System.out.println("");

        int num_caracteres = cadena_original.length();

        System.out.println("La cadena de caracteres \"" + cadena_original + "\" posee " + num_caracteres + " caracteres.");

        System.out.println("¿Desde que caracter deseas obtener la nueva cadena?: ");
        int desde = entrada.nextInt();

        System.out.println("¿Hasta que caracter deseas obtener la nueva cadena?: ");
        int hasta = entrada.nextInt();

        String cadena_substraccion = cadena_original.substring(desde, hasta);

        System.out.println("La nueva cadena es: \"" + cadena_substraccion + "\"");
        System.out.println("---------------------------------------------------");
    }

    public void OperacionA13() {
        System.out.println("Consigna A - 13: ");
        System.out.println("---------------------------------------------------");
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
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.println("");

        System.out.println("Ingrese el numero de columnas de la matriz: ");
        int columnas = entrada.nextInt();
        System.out.println("");

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

        private JLabel etiqueta1;

        public FormularioA1() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            etiqueta1 = new JLabel("Bienvenido a la Geekipedia de Ernesto");
            etiqueta1.setBounds(10, 20, 400, 300);
            add(etiqueta1);
        }
    }

    public class FormularioA2 extends JFrame {

        private JLabel etiqueta1, etiqueta2;

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

        private JButton boton1;

        public FormularioA3() {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            boton1 = new JButton("Cerrar");
            boton1.setBounds(300, 250, 100, 30);
            add(boton1);
            boton1.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                System.exit(0);
            }
        }
    }

    public class FormularioA4 extends JFrame implements ActionListener {

        private JButton boton1, boton2, boton3;
        private JLabel etiqueta1;

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

        private JLabel etiqueta1;
        private JTextField campoTexto1;
        private JButton boton1;

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

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                String texto = campoTexto1.getText();

                setTitle(texto);
            }
        }
    }

    public class FormularioA6 extends JFrame {

        private JTextField campoTexto1;
        private JTextArea cuadroTexto1;

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

        private JTextField campoTexto1;
        private JTextArea cuadroTexto1;
        private JScrollPane panelbarra1;

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

        private JTextField campoTexto1;
        private JTextArea cuadroTexto1;
        private JScrollPane panelbarra1;
        private JButton boton1;

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

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                texto += campoTexto1.getText() + "\n";
                cuadroTexto1.setText(texto);
                campoTexto1.setText("");
            }
        }
    }

    public class FormularioA9 extends JFrame implements ActionListener {

        private JTextField campoTexto1, campoTexto2;
        private JLabel etiqueta1, etiqueta2, etiqueta3;
        private JButton boton1;

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

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == boton1) {
                int valor1 = 0, valor2 = 0, resultado = 0;

                valor1 = Integer.parseInt(campoTexto1.getText());
                valor2 = Integer.parseInt(campoTexto2.getText());

                resultado = valor1 + valor2;

                etiqueta3.setText("Resultado: " + resultado);
            }
        }
    }

    public class FormularioA10 extends JFrame implements ItemListener {

        private JComboBox seleccion1;

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

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == seleccion1) {
                String seleccion = seleccion1.getSelectedItem().toString();

                setTitle(seleccion);
            }
        }
    }

    public class FormularioA11 extends JFrame implements ActionListener {
        
        /*
        
        */

        private JLabel etiqueta1, etiqueta2, etiqueta3;
        private JComboBox seleccion1, seleccion2, seleccion3;
        private JButton boton1;

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
        Interfaz Grafica
        Prueba 12
        JMenuBar - Barra de opciones
        JMenu - Despliegue de opciones
        JMenuItem - Items desplegados desde el JMenu
        */

        private JMenuBar barra1;
        private JMenu menu1;
        private JMenuItem item1, item2, item3;

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
        Interfaz Grafica
        Prueba 13
        JMenuBar - Barra de opciones
        JMenu - Despliegue de opciones
        JMenuItem - Items desplegados desde el JMenu
        */
        
        private JMenuBar menubarra1;
        private JMenu opciones, fondoResolucion, fondoColor;
        private JMenuItem fondoResolucion1, fondoResolucion2, fondoColor1, fondoColor2;
        
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
        
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == fondoResolucion1) {
                setSize(300,200);
            }
            
            if (e.getSource() == fondoResolucion2) {
                setSize(640,480);
            }
            
            if (e.getSource() == fondoColor1) {
                getContentPane().setBackground(new Color(255,0,0));
            }
            
            if (e.getSource() == fondoColor2) {
                getContentPane().setBackground(new Color(0,255,0));
            }
        }
    }

    public class FormularioA14 extends JFrame {
        /*
        Interfaz Gráfica
        Prueba 14
        JCheckBox - Uso de casillas de verificacion
        */
        
        public JCheckBox checkbox1, checkbox2, checkbox3;

        public FormularioA14() {
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
        }
    }
}
