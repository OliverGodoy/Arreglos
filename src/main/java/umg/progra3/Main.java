package umg.progra3;


import umg.progra3.Clases.MinOperaciones;

import java.util.Arrays;
import java.util.List;

import static umg.progra3.Clases.AgruparPersonas.Resultado;
import static umg.progra3.Clases.ConvertirArregloAMatriz.construirMatriz;
import static umg.progra3.Clases.MinOperaciones.minOperations;
import static umg.progra3.Clases.OrdenarElementosFrecuencia.ElementosOrdenados;

public class Main {

    public static void main(String[] args) {
        MinOperaciones();
        AgruparPersonas();
        ConvertirArregloAMatriz();
        OrdenarElementosFrecuencia();
    }

    public static void MinOperaciones(){
        // Ejercicio 1 - Min Operaciones
        String boxes = "001011";
        System.out.println("Entrada: " + boxes);
        int[] resultado = minOperations(boxes);
        System.out.println("Salida: " + Arrays.toString(resultado));
    }


    public static void AgruparPersonas(){
        // Ejercicio 2 - Agrupar Personas
        int[] GroupSizes  = new int[]{3,3,3,3,3,1,3};
        System.out.println("\nEntrada:" + Arrays.toString(GroupSizes));
        System.out.println("Salida: "+"["+Resultado(GroupSizes)+"]");
    }


    public static void ConvertirArregloAMatriz(){
        // Ejercicio 3 - Convertir Arreglo a Matriz
        int[] nums = new int[]{1,3,4,1,2,3,1};
        System.out.println("\nEntrada:" + Arrays.toString(nums));

        List<List<Integer>> resultado = construirMatriz(nums);
        // Imprimir la matriz resultante
        System.out.println("Salida:");
        for (List<Integer> fila : resultado) {
            System.out.println(fila);
        }
    }

    public static void OrdenarElementosFrecuencia(){
        // Ejercicio 4 - Ordenar Elementos por Frecuencia
        int[] nums2 = new int[]{4, 3, 1, 6, 3, 4, 4, 6};
        System.out.println("\nEntrada:" + Arrays.toString(nums2));
        System.out.println("Salida:");
        ElementosOrdenados(nums2);
    }



}