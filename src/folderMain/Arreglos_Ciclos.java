package folderMain;


public class Arreglos_Ciclos {
    public static int obtenerFactorial(int limit){
        int fact = 1;
        for (int i = 1; i <= limit; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int[] obtenerFactorialDeArreglo(int[] arreglo){
        int[] nuevoArreglo = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = obtenerFactorial(arreglo[i]);
        }
        return nuevoArreglo;
    }
    public static boolean [] obtenerPrimo(int[] arreglo){
        boolean [] nuevoArreglo = new boolean [arreglo.length];
        
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = comprobarPrimo(arreglo[i]);
        }
        return nuevoArreglo;
    }
    public static int obFactRecursiv(int numero){
        if (numero <= 0) return 1;
        return numero * obFactRecursiv(numero-1);
    }
    public static void llenarArreglo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*numeros.length + 1);
        }
    }
    public static void imprimirArreglo(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }
    public static boolean comprobarPrimo(int numero){
        int cont = 0;
        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) cont++;
        }
        if (cont == 2) return true;
        return false;
    }
    public static int obtenerNextPrimo(int numero){
        for (int i = numero + 1; i < numero*2; i++) {
            if (comprobarPrimo(i)) return i;
        }
        return 2;
    }
    public static int obtenerNextPrimo2(int numero){
        do {
            numero++;
        } while (!comprobarPrimo(numero));
        return numero;
    }
    public static int obtenerNextPrimo3(int numero){
        numero ++;
        while (!comprobarPrimo(numero)) {
            numero++;
        }
        return numero;
    }
    public static void impP(int lim){
        for (int i = 0; i < lim; i++) {
            if (comprobarPrimo(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arreglo = new int[6];
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("\n----------");
        
        int[] nuevoArreglo = obtenerFactorialDeArreglo(arreglo);
        imprimirArreglo(nuevoArreglo);
        System.out.println("\n----------");
        
        System.out.println("Num Primo?: " + comprobarPrimo(19));
        System.out.println("[1.Form] Next Primo: " + obtenerNextPrimo(5));
        System.out.println("[2.Form] Next Primo: " + obtenerNextPrimo2(5));
        System.out.println("[3.Form] Next Primo: " + obtenerNextPrimo3(5));
        impP(100);
        System.out.println("\n" +obtenerFactorial(10));
        System.out.println(obFactRecursiv(10));
    }
    
}
