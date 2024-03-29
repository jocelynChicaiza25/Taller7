/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import concesionaria.creacional.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cajas
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Almacenamiento
        ArrayList<Auto> autosEnsamblados = new ArrayList<>();
        //Sistema de creacion de coches

        String op = " ";
        while (op != "4") {
            System.out.println("-------MENU------");
            System.out.println("//Elija una opción//");
            System.out.println("1. Crear Chevrolet Spark");
            System.out.println("2. Crear Chevrolet Sail");
            System.out.println("3. Crear Chevrolet Beat");
            System.out.println("4. Mostrar autos ensamblados");
            System.out.println("5. Cerrar");

            Scanner sc = new Scanner(System.in);
            op = sc.nextLine();
            if (op.equals("1")) {

                AutoDirector directorSpark = new AutoDirector(new ChevroletSparkBuilder());
                directorSpark.ConstruirAuto();
                Auto spark = directorSpark.getAuto();
                //Guardo auto
                autosEnsamblados.add(spark);
                System.out.println("Auto creado, autos en stock: " + autosEnsamblados.size());

            } else if (op.equals("2")) {
                AutoDirector directorSail = new AutoDirector(new ChevroletSailBuilder());
                directorSail.ConstruirAuto();
                Auto sail = directorSail.getAuto();
                //Guardo auto
                autosEnsamblados.add(sail);
                System.out.println("Auto creado, autos en stock: " + autosEnsamblados.size());

            } else if (op.equals("3")) {
                AutoDirector directorBeat = new AutoDirector(new ChevroletBeatBuilder());
                directorBeat.ConstruirAuto();
                Auto beat = directorBeat.getAuto();
                //Guardo auto
                autosEnsamblados.add(beat);
                System.out.println("Auto creado, autos en stock: " + autosEnsamblados.size());

            } else if (op.equals("4")) {

                for (Auto a : autosEnsamblados) {

                    System.out.println(a.toString());
                }
            } else if (op.equals("5")) {
                break;

            } else {
                System.out.println("Ingrese valores válidos(1,2,3,4)!!");
            }

        }

    }

}
