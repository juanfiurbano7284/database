package co.com.ps.registro.utilidades;


import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@UtilityClass
public class utilitis {


    public String selectionDay(int day) {
/*
        var result = switch(day) {
            case 1 -> "Lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            default -> 0;
        };
  */
        String resultado = null;

        switch (day) {
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = "martes";
                break;
            case 3:
                resultado = "miercoles";
                break;
            case 4:
                resultado = "jueves";
                break;
            case 5:
                resultado = "viernes";
                break;
            case 6:
                resultado = "sabado";
                break;
            case 7:
                resultado = "domingo";
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> edades = new ArrayList<>();
        edades.add(29);
        edades.add(35);
        edades.add(47);
        edades.add(26);
        edades.add(42);
        edades.add(32);
        System.out.println(contarEdadTrabajadores(edades));

    }

    //For, While y DoWhile
    public static double contarEdadTrabajadores(List<Integer> edadesDetrabajadores) {
        double resultado = 0;

        for (int edad : edadesDetrabajadores) {
            resultado = resultado + edad;
        }
        resultado = resultado / edadesDetrabajadores.size();

        for (int i = 0; i < edadesDetrabajadores.size(); i++) {

        }
        return resultado;
    }


    public class main {

        public static void main(String[] args) {
            //--> Bucle while
            int i = 15; //iterador

            while (i < 10) {
                System.out.println("El valor es: " + i);
                i++; //incremento
            }

        }

    }
}