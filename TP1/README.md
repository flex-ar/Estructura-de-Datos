# Trabajo Práctico N° 1

### **Punto 8:**
Escriba el código necesario para generar una permutación aleatoria de los primeros n enteros (por ejemplo [4,3,1,5,2] y [3,1,4,2,5] son permutaciones válidas, pero [5,4,1,2,1] no lo es), mediante tres versiones distintas del método generarEnterosAleatorios(n), las cuales se explican a continuación:
  - **Versión 1.** Se crea un vector con valores enteros desde vector[0] hasta vector[n1] como sigue: para llenar vector[i] generar números aleatorios hasta que se obtiene uno que no se encuentre entre vector[0] y vector[i-1].
  - **Versión 2.** De igual manera al anterior, pero mantener un vector adicional llamado existentes[ ] inicializado en false, en donde para cada valor aleatorio guardado en vector se marca su posición correspondiente en existentes como true. Por ejemplo si en vector[i] = x, entonces existentes[x] = true.
  - **Versión 3.** Se completa el arreglo de forma que se cumpla que vector[i] = i. Luego a cada valor del arreglo intercambiarlo por otro valor situado en una posición aleatoria:
  ```
  for ( i = 2; i < n; i++)
    intercambiarValores(vector[i], vector[posición_aleatoria_entre(0, i-1)
  ```
Para **cada versión** se pide obtener la complejidad del algoritmo O(n).

---

### **Punto 9:**
Escriba el código necesario para hallar el mayor de los elementos de una matriz no ordenada de enteros. ¿Cuál es la complejidad de este algoritmo?