package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        double capital;
        float tasaInteresAnual;
        int tiempoAnios;

        System.out.println("Ingrese su capital: ");
        capital = leerTeclado.nextDouble();
        System.out.println("Ingrese la tasa de interes: ");
        tasaInteresAnual = leerTeclado.nextFloat();
        System.out.println("Ingese el tiempo en años: ");
        tiempoAnios = leerTeclado.nextInt();

        double interes = capital *(tasaInteresAnual/100) * tiempoAnios;
        double total = capital + interes;



        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        formatoMoneda.setMaximumFractionDigits(2);  // Para asegurar solo 2 decimales

        // Mostrar el resultado
        System.out.println("Interes: " + formatoMoneda.format(interes) + " total: " + formatoMoneda.format(total));
    }
}