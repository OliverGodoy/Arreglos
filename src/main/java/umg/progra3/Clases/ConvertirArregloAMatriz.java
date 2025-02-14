package umg.progra3.Clases;

import java.util.*;

public class ConvertirArregloAMatriz {

    public static List<List<Integer>> construirMatriz(int[] nums) {
        // Paso 1: Contar las ocurrencias de cada número
        Map<Integer, Integer> contador = new HashMap<>();
        for (int num : nums) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        // Paso 2: Determinar el número máximo de filas necesarias
        int maxFilas = Collections.max(contador.values());

        // Paso 3: Crear la matriz 2D con el número de filas necesario
        List<List<Integer>> matriz = new ArrayList<>();
        for (int i = 0; i < maxFilas; i++) {
            matriz.add(new ArrayList<>());
        }

        // Paso 4: Distribuir los elementos en las filas
        for (int num : nums) {
            for (List<Integer> fila : matriz) {
                if (!fila.contains(num)) {
                    fila.add(num);
                    break;
                }
            }
        }

        return matriz;
    }

}
