import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
	//return 0;
    }


    // Método que encuentra el mayor de tres números enteros
   public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }


    // Método que retorna la tabla de multiplicar de un número

    public int[] tablaMultiplicar(int numero, int limite) {
       
        int[] resultado = new int[limite];
        
        for (int i = 0; i < limite; i++) {
            resultado[i] = numero * (i + 1);
        }
        return resultado;
    }


    // Método que calcula el factorial de un número entero

    public int factorial(int n) {
    
    if (n < 0) {
        throw new IllegalArgumentException("El número no puede ser negativo");
    }

    int resultado = 1;

    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }

    return resultado;
    }

    // Método que verifica si un número es primo

    public boolean esPrimo(int numero) {
    
    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
    }

   // Método que genera una serie de Fibonacci

    public int[] serieFibonacci(int n) {
       
        if (n < 0) {
            throw new IllegalArgumentException("El número de elementos no puede ser negativo.");
        }
        int[] fibonacci = new int[n];
    
        if (n > 0) {
            fibonacci[0] = 0; 
        }
        if (n > 1) {
            fibonacci[1] = 1; 
        }
   
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
        }

    // Método que suma todos los elementos de un arreglo
  
        public int sumaElementos(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
        suma += arreglo[i];
        }

        return suma;
        }

    // Método que calcula el promedio de los elementos de un arreglo

       public double promedioElementos(int[] arreglo) {

        if (arreglo.length == 0) {
        return 0.0;
        }

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
        suma += arreglo[i];
        }

       return (double) suma / arreglo.length;
       }

    // Método que encuentra el elemento mayor en un arreglo
  
      public int encontrarElementoMayor(int[] arreglo) {

        if (arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío");
       }

        int mayor = arreglo[0];

         for (int i = 1; i < arreglo.length; i++) {
          if (arreglo[i] > mayor) {
            mayor = arreglo[i];
          }
      }

       return mayor;
     }

    // Método que encuentra el elemento menor en un arreglo

     public int encontrarElementoMenor(int[] arreglo) {

    if (arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío");
    }

    int menor = arreglo[0];

    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] < menor) {
            menor = arreglo[i];
        }
    }

    return menor;
    }

    // Método que busca un elemento en un arreglo

    public boolean buscarElemento(int[] arreglo, int elemento) {

    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == elemento) {
            return true;
        }
    }

    return false;
    }

    // Método que invierte un arreglo

   public int[] invertirArreglo(int[] arreglo) {

    int[] invertido = new int[arreglo.length];

    for (int i = 0; i < arreglo.length; i++) {
        invertido[i] = arreglo[arreglo.length - 1 - i];
    }

    return invertido;
}

    // Método que ordena un arreglo en orden ascendente

    public int[] ordenarArreglo(int[] arreglo) {

    int[] ordenado = arreglo.clone();

    for (int i = 0; i < ordenado.length - 1; i++) {
        for (int j = 0; j < ordenado.length - 1 - i; j++) {

            if (ordenado[j] > ordenado[j + 1]) {
                int temporal = ordenado[j];
                ordenado[j] = ordenado[j + 1];
                ordenado[j + 1] = temporal;
            }
        }
    }

    return ordenado;
    }
   
   // Método que elimina los duplicados de un arreglo

    public int[] eliminarDuplicados(int[] arreglo) {

    int[] temporal = new int[arreglo.length];
    int cantidad = 0;

    for (int i = 0; i < arreglo.length; i++) {
        boolean repetido = false;

        for (int j = 0; j < cantidad; j++) {
            if (temporal[j] == arreglo[i]) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            temporal[cantidad] = arreglo[i];
            cantidad++;
        }
    }

    int[] resultado = new int[cantidad];

    for (int i = 0; i < cantidad; i++) {
        resultado[i] = temporal[i];
    }

    return resultado;
    }

    // Método que combina dos arreglos en uno solo

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {

    int[] resultado = new int[arreglo1.length + arreglo2.length];

    
    for (int i = 0; i < arreglo1.length; i++) {
        resultado[i] = arreglo1[i];
    }

    
    for (int i = 0; i < arreglo2.length; i++) {
        resultado[arreglo1.length + i] = arreglo2[i];
    }

    return resultado;
    }

    // Método que rota un arreglo n posiciones

    public int[] rotarArreglo(int[] arreglo, int posiciones) {

    int[] resultado = new int[arreglo.length];

    if (arreglo.length == 0) {
        return resultado;
    }

    posiciones = posiciones % arreglo.length;

    for (int i = 0; i < arreglo.length; i++) {
        resultado[i] = arreglo[(i + posiciones) % arreglo.length];
    }

    return resultado;
    }

   // Método que cuenta los caracteres en una cadena

    public int contarCaracteres(String cadena) {
    return cadena.length();
    }

    // Método que invierte una cadena

    public String invertirCadena(String cadena) {

    String invertida = "";

    for (int i = cadena.length() - 1; i >= 0; i--) {
        invertida += cadena.charAt(i);
    }

    return invertida;
    }

    // Método que verifica si una cadena es un palíndromo

    public boolean esPalindromo(String cadena) {

    String invertida = invertirCadena(cadena);

    return cadena.equals(invertida);
    }

  // Método que cuenta el número de palabras en una cadena

    public int contarPalabras(String cadena) {

    if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }

    String[] palabras = cadena.trim().split("\\s+");

    return palabras.length;
}

    // Método que convierte una cadena a mayúsculas

    public String convertirAMayusculas(String cadena) {
    return cadena.toUpperCase();
     }

    // Método que convierte una cadena a minúsculas

     public String convertirAMinusculas(String cadena) {
     return cadena.toLowerCase();
    }

   // Método que reemplaza una subcadena en una cadena por otra subcadena

    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
    return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

 // Método que busca una subcadena en una cadena y retorna su índice

    public int buscarSubcadena(String cadena, String subcadena) {
    return cadena.indexOf(subcadena);
    }

   // Método que valida un correo electrónico

    public boolean validarCorreoElectronico(String correo) {
 
    if (correo == null || correo.isEmpty()) {
        return false;
    }

    return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
   }

   // Método que calcula el promedio de una lista de números

   public double promedioLista(List<Integer> lista) {

    if (lista == null || lista.isEmpty()) {
        return 0.0;
    }

    int suma = 0;

    for (Integer numero : lista) {
        suma += numero;
    }

    return (double) suma / lista.size();
    }

     // Método que convierte un número en su representación binaria
     public String convertirABinario(int numero) {
     return Integer.toBinaryString(numero);
     }


    // Método que convierte un número en su representación hexadecimal

    public String convertirAHexadecimal(int numero) {
    return Integer.toHexString(numero).toUpperCase();
    }

   // Método para el juego de Piedra, Papel, Tijera, Lagarto, Spock

   public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {

    String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    int indice = (int) (Math.random() * opciones.length);
    String eleccionComputadora = opciones[indice];

    if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
        return "Empate. Ambos eligieron " + eleccionComputadora;
    }

    boolean ganaUsuario =
            (eleccionUsuario.equalsIgnoreCase("Piedra") &&
                    (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto")))
            ||
            (eleccionUsuario.equalsIgnoreCase("Papel") &&
                    (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock")))
            ||
            (eleccionUsuario.equalsIgnoreCase("Tijera") &&
                    (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto")))
            ||
            (eleccionUsuario.equalsIgnoreCase("Lagarto") &&
                    (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel")))
            ||
            (eleccionUsuario.equalsIgnoreCase("Spock") &&
                    (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra")));

            if (ganaUsuario) {
            return "Ganaste. Tú elegiste " + eleccionUsuario + " y la computadora eligió " + eleccionComputadora;
           } else {
            return "Perdiste. Tú elegiste " + eleccionUsuario + " y la computadora eligió " + eleccionComputadora;
    }
    }

    // El método debe retornar un mensaje indicando el resultado del juego.

    public String pptls2(String game[]) {

    String jugador1 = game[0].toUpperCase();
    String jugador2 = game[1].toUpperCase();

    if (jugador1.equals(jugador2)) {
        return "Empate";
    }

    boolean ganaJ1 =
            (jugador1.equals("R") && (jugador2.equals("S") || jugador2.equals("L"))) ||
            (jugador1.equals("P") && (jugador2.equals("R") || jugador2.equals("V"))) ||
            (jugador1.equals("S") && (jugador2.equals("P") || jugador2.equals("L"))) ||
            (jugador1.equals("L") && (jugador2.equals("P") || jugador2.equals("V"))) ||
            (jugador1.equals("V") && (jugador2.equals("R") || jugador2.equals("S")));

    if (ganaJ1) {
        return "Jugador 1";
    } else {
        return "Jugador 2";
    }
}



   // El método debe retornar el area de un circulo

  public double areaCirculo(double radio) {
    return Math.PI * radio * radio;
   }

 // El método debe retornar el signo del zodiaco dependiendo el dia y el mes

    public String zoodiac(int day, int month) {

    if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
        return "Aries";
    } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
        return "Tauro";
    } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
        return "Géminis";
    } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
        return "Cáncer";
    } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
        return "Leo";
    } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
        return "Virgo";
    } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
        return "Libra";
    } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
        return "Escorpio";
    } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
        return "Sagitario";
    } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
        return "Capricornio";
    } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
        return "Acuario";
    } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
        return "Piscis";
    }
    return "Fecha inválida";
    }
}
