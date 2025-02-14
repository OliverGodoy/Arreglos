package umg.progra3.Clases;

public class MinOperaciones {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        // Primera pasada: de izquierda a derecha
        int balls = 0; // Número de bolas a la izquierda de la caja actual
        int operations = 0; // Operaciones acumuladas
        for (int i = 0; i < n; i++) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls; // Cada bola a la izquierda contribuye con 1 operación
        }

        // Segunda pasada: de derecha a izquierda
        balls = 0; // Número de bolas a la derecha de la caja actual
        operations = 0; // Operaciones acumuladas
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls; // Cada bola a la derecha contribuye con 1 operación
        }

        return answer;
    }
}
