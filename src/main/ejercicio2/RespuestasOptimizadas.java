package main.ejercicio2;
import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n^2)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
            HashSet<Integer> repes = new HashSet<>();
            for (int num : arr) {
                if (repes.contains(num)) {
                    return true;
                }
                repes.add(num);
            }
            return false;
        }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = ""; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        // TODO: implementar versión eficiente
        return 0;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        // TODO: implementar versión eficiente
        return 0;
    }
}
