public class punto9 {
  public static int buscarMayorNumero (int[][] matriz) {   // O(n²)
    int max = matriz[0][0];                         // 1

    for (int i = 0; i < matriz.length; i++) {       // n

      for (int j = 0; j < matriz[i].length; j++) {  // n²
        if (max < matriz[i][j]) {                   // n²
          max = matriz[i][j];                       // n²
        }
      }

    }

    return max;                                     // 1
  }
}
