package folderMain;

public class NotaAprobada {

    public static double calcularPromedio(double numero1, double numero2) {

        double respuesta = (numero2 + numero1) / 2;

        return respuesta;
    }

    public static boolean estaAprobado(double nota1, double nota2) {
        double promedio = calcularPromedio(nota1, nota2);

        if (promedio < 7) return false;
        return true;
        
    }

    public static double calcularPromedio(double numero1, double numero2, double numero3) {

        double respuesta = (numero2 + numero1 + numero3) / 3;

        return respuesta;
    }

    public static double multiplicarNumeros(double numero1, double numero2, double numero3) {
        return (numero1 * numero2 * numero3);
    }

    public static void main(String[] args) {
        System.out.println(estaAprobado(6.5, 7.5));

    }

}
