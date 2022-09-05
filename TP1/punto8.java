import java.util.Random;

class punto8 {
  private static int randomNum (int n) {
    return new Random().nextInt(n);
  }

  private static int randomNum (int start, int end) {
    return new Random().nextInt(start, end + 1);
  }

  public static int[] generarEnterosAleatoriosV1 (int n) {  // O(n²)
    int[] vector = new int[n];        // 1
    int random = randomNum(n) + 1;    // 1

    for (int i = 0; i < n; i++) {     // n
      int j = 0;                      // n

      while (j < i) {                 // n²
        if (vector[j] == random) {    // n²
          random = randomNum(n) + 1;  // n²
          j = 0;                      // n²
        } else {
          j++;                        // n²
        }
      }

      vector[i] = random;             // n
    }

    return vector;                    // 1
  }

  public static int[] generarEnterosAleatoriosV2 (int n) {  // O(n²)
    int[] vector = new int[n];              // 1
    boolean[] existentes = new boolean[n];  // 1
    int random = randomNum(n);              // 1

    for (int i = 0; i < n; i++) {           // n

      while (existentes[random] == true) {  // n²
        random = randomNum(n);              // n²
      }

      vector[i] = random + 1;               // n
      existentes[random] = true;            // n
    }

    return vector;                          // 1
  }

  public static int[] generarEnterosAleatoriosV3 (int n) {  // O(n)
    int[] vector = new int[n];          // 1

    for (int i = 0; i < n; i++) {       // n
      vector[i] = i + 1;                // n
    }

    for (int i = 1; i < n; i++) {       // n
      int randomPos = randomNum(0, i);  // n
      int aux = vector[i];              // n
      vector[i] = vector[randomPos];    // n
      vector[randomPos] = aux;          // n
    }

    return vector;                      // 1
  }
}
