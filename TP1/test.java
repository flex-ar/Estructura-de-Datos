import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    String version1 = Arrays.toString(punto8.generarEnterosAleatoriosV1(5));
    System.out.println(version1); // O(n²)

    String version2 = Arrays.toString(punto8.generarEnterosAleatoriosV2(5));
    System.out.println(version2); // O(n²)

    String version3 = Arrays.toString(punto8.generarEnterosAleatoriosV3(5));
    System.out.println(version3); // O(n)

    int[][] matriz = {{16,13,23}, {78,88,41}, {62,50,83}};
    System.out.println(punto9.buscarMayorNumero(matriz)); // O(n²)
  }
}
