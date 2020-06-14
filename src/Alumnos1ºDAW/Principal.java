/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos1ºDAW;

import java.util.Scanner;

/**
 *
 * @author JoseManuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int op;
        String IntroducirNombre;
        String IntroducirApellidos;
        String IntroducirDireccion;
        String IntroducirTelefono;
        String IntroducirCurso;
        String IntroducirModulos;
        String IntroducirNombreModulo;
        String IntroducirCursoModulo;
        double IntroducirNotaModulo;
        int primeraLibre;
        int cont = 0;
        System.out.print("Introduce el numero de alumnos del grupo:");
        int n = s.nextInt();

        Alumno[] nalumnos = new Alumno[n];
        for (int i = 0; i < n; i++) {
            nalumnos[i] = new Alumno();
        }
        
        Modulo[] nmodulos = new Modulo[5];
        for (int i = 0; i < 5; i++) {
            nmodulos[i] = new Modulo();
        }
        boolean salir = false;
        while (!salir == true) {
            System.out.println("1-Introducir datos de los alumnos\n2-Mostrar datos de los alumnos\n3-Nota media curso\n4-Salir");
            System.out.println("Introduce una opcion");
            op = s.nextInt();
            switch (op) {
                case 1:

                    cont++;
                    System.out.println("Introduce los datos alumno " + cont + ":");
                    primeraLibre = -1;
                    do {
                        primeraLibre++;
                    } while (!((nalumnos[primeraLibre].getNombre()).equals("LIBRE")));
                    System.out.print("Nombre: ");
                    IntroducirNombre = s.next();
                    nalumnos[primeraLibre].setNombre(IntroducirNombre);

                    System.out.print("Apellidos: ");
                    IntroducirApellidos = s.next();
                    nalumnos[primeraLibre].setApellidos(IntroducirApellidos);

                    System.out.print("Dirección: ");
                    IntroducirDireccion = s.next();
                    nalumnos[primeraLibre].setDireccion(IntroducirDireccion);

                    System.out.print("Teléfono: ");
                    IntroducirTelefono = s.next();
                    nalumnos[primeraLibre].setTelefono(IntroducirTelefono);

                    System.out.print("Curso: ");
                    IntroducirCurso = s.next();
                    nalumnos[primeraLibre].setCurso(IntroducirCurso);

                    System.out.println("Módulos: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Módulo " + (i + 1) + ": ");

                        System.out.print("Nombre: ");
                        IntroducirNombreModulo = s.next();
                        nmodulos[i].setNombre(IntroducirNombre);

                        System.out.print("Curso:");
                        IntroducirCursoModulo = s.next();
                        nmodulos[i].setCurso(IntroducirCurso);

                        System.out.print("Nota:");
                        IntroducirNotaModulo = s.nextDouble();
                        nmodulos[i].setNota(IntroducirNotaModulo);

                    }

                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        if (nalumnos[i].getNombre().equals("LIBRE")) {

                        } else {
                            System.out.println(nalumnos[i].toString());
                            
                        }
                    }
                    break;

                case 3:
                    int notamedia=0;
                    for (int i = 0; i <n; i++) {
                        notamedia+=nmodulos[i].getNota();
                    }
                    System.out.println(notamedia/n);
                    

                    break;
                case 4:System.out.println("Un placer trabajar con usted");
                    salir = true;

                    
                    break;
                default:
                    System.out.println("Introduce una opcion válida.....");
                    break;

            }
        }
    }
}
