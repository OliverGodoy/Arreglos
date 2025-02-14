package umg.progra3.Clases;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgruparPersonas {

    public static String Resultado(int[] GroupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        StringBuilder resultado = new StringBuilder();

        // Agrupar los índices según el tamaño del grupo
        for (int i = 0; i < GroupSizes.length; i++) {
            int size = GroupSizes[i];
            map.putIfAbsent(size, new ArrayList<>());
            map.get(size).add(i);
        }

        // Imprimir los grupos en horizontal
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int groupSize = entry.getKey();
            List<Integer> group = entry.getValue();

            for (int i = 0; i < group.size(); i += groupSize) {
                List<Integer> subGroup = group.subList(i, i + groupSize);
                resultado.append("["); // Inicio del grupo
                for (int j = 0; j < subGroup.size(); j++) {
                    resultado.append(subGroup.get(j)); // Índice de la persona
                    if (j < subGroup.size() - 1) {
                        resultado.append(", ");
                    }
                }
                resultado.append("] "); // Fin del grupo
            }
        }
        return resultado.toString();
    }
}
