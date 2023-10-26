package com.liceolapaz.des.acc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    do {
            //Escribir el menú
            escribirMenu();
            //Pedir opción
            pedirOpcion();
            //Leer opción y guardarla
            int opcion= leerOpcion();
            //
            switch (opcion) {
                case 0:
                    System.out.println("Usted ha decidido salir, Hasta la próxima.");
                    System.exit(0);
                    break;
                case 1:
                    //pedir valor de la base (lado) del triángulo
                    pedirValorBasetr();
                    //leer el valor y guardarlo
                    double baseTriangulo = leerBasetr();
                    //pedir el valor de la altura del triángulo
                    pedirValorAlturatr();
                    //leer el valor y guardarlo
                    double alturaTriangulo= leerAlturatr();
                    // Calcular el área del ttriangulo
                    double areaTriangulo = (baseTriangulo * alturaTriangulo)/2 ;
                    //calcular el perimetro del triángulo
                    double perimetroTriangulo = baseTriangulo+baseTriangulo+baseTriangulo;
                    //Escribir el resultado del área y del perímetro
                    System.out.println("El área es " + areaTriangulo + " y el perímetro del triángulo es:  " + perimetroTriangulo);
                    break;
                case 2:
                    //Pedir el valor de la base del rectángulo
                    pedirValorBaseRec();
                    //Leer el valor y guardarlo
                    double baseRectangulo = leerBaserect();
                    //Pedir el valor de la altura del rectángulo
                    pedirValorAlturarect();
                    //leer el valor y guardarlo
                    double alturaRectangulo = leerAlturarect();
                    //Calcular el área del rectangulo
                    double areaRectangulo= baseRectangulo*alturaRectangulo;
                    //Calcular el perímetro del rectangulo
                    double perimetroRectangulo= (baseRectangulo+baseRectangulo+alturaRectangulo+alturaRectangulo);
                    //Escribir el resultado del área y del perímetro del rectangulo
                    System.out.println("El área es " + areaRectangulo + " y el perímetro del rectángulo es:  " + perimetroRectangulo);
                    break;
                case 3:
                    // Pedir el valor del lado del cuadrado
                    pedirValorLadocuadrado();
                    //Leer el valor y guardarlo
                    double ladocuadrado= leerLadoCuadr();
                    //Calcular el area del cuadrado
                    double areacuadrado=  ladocuadrado * ladocuadrado ;
                    //calcular perímetro del cuadrado
                    double perimetrocuadrado= ladocuadrado+ladocuadrado+ladocuadrado+ladocuadrado;
                    //Escribir el resultado del área y del perímetro del cuadrado
                    System.out.println("El área es " + areacuadrado + " y el perímetro del cuadrado es:  " + perimetrocuadrado);
                    break;
                case 4:
                    //Pedir el número de lados del pentágono
                    pedirNumeroLados();
                    //Leer el número y guardarlo
                    int numeroLados= leerNumeroLados();
                    //Pedir el valor del lado del pentágono
                    pedirValorLadoPent();
                    //Leer el valor y guardarlo
                    double ladoPentagono = leerLadoPentagono();
                    //Calcular el perimetro del pentágono
                    double perimetroPentagono= ladoPentagono * numeroLados;
                    //Pedir valor de la apotema del pentágono
                    pedirValorApotema();
                    //Leer y guardar el valor
                    double apotemaPentagono= leerApotemaPentagono();
                    //Calcular el área del pentágono
                    double areaPentagono= (perimetroPentagono * apotemaPentagono) / 2 ;
                    //Escribir el resultado del área y del perímetro del pentágono
                    System.out.println("El área es " + areaPentagono + " y el perímetro del pentágono es:  " + perimetroPentagono);
                    break;
                default:
                    System.out.println("Error, no existe esta opción");

            }
        }while(true);
    }

    private static double leerApotemaPentagono() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorApotema() {
        System.out.print("Escriba el valor de la apotema del pentágono:");
    }

    private static int leerNumeroLados() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumeroLados() {
        System.out.print("Escriba el número de lados del pentágono: ");
    }

    private static double leerLadoPentagono() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorLadoPent() {
        System.out.print("Escriba el valor del lado del pentágono:");
    }

    private static double leerLadoCuadr() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorLadocuadrado() {
        System.out.print("Escriba el valor del lado del cuadrado: ");
    }

    private static double leerAlturarect() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorAlturarect() {
        System.out.print("Escriba el valor de la altura del rectángulo:");
    }

    private static double leerBaserect() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorBaseRec() {
        System.out.print("Escriba el valor de la base del rectángulo:");
    }

    private static double leerAlturatr() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorAlturatr() {
        System.out.print("Escriba el valor de la altura (h) del triángulo:");
    }

    private static double leerBasetr() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void pedirValorBasetr() {
        System.out.print("Escriba el valor del primer lado (base) del triángulo:");
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.print("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("FIGURAS GEOMÉTRICAS\n"+
                "1.Triángulo\n"+
                "2.Rectángulo\n"+
                "3.Cuadrado\n"+
                "4.Pentágono\n"+
                "0.Salir");
    }
}
