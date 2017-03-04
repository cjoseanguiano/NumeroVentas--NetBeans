/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroventas;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int numeroVentas;
        int ventaIngresada = 0;
        int sumaVentas = 0;
        int guardarVenta = 0;

        Scanner scannernumeroVentas = new Scanner(System.in);
        Scanner scannerventaIngresada = new Scanner(System.in);

        System.out.println("Ingresa cuantas ventas quieres registrar");
        numeroVentas = scannernumeroVentas.nextInt();

        for (int i = 1; i <= numeroVentas; i++) {
            System.out.println("Ingresa la venta " + i);
            ventaIngresada = scannerventaIngresada.nextInt();
            sumaVentas = sumaVentas + ventaIngresada;
        }
        System.out.println("Este es el valor de la venta " + sumaVentas);

    }

}
