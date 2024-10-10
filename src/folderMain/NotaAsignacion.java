package folderMain;


public class NotaAsignacion {
    public static double calcularPromedio(double nota1, double nota2, double nota3, double nota4){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    public static String mediaPuntuacion(double nota1, double nota2, double nota3, double nota4){
        double promedio = calcularPromedio(nota1, nota2, nota3, nota4);
        String resultado="";
        
        if(promedio < 60){
            resultado = "E";
        }else if(promedio < 70){
            resultado = "D";
        }else if(promedio < 80){
            resultado = "C";
        }else if(promedio < 90){
            resultado = "B";
        }else if(promedio < 100){
            resultado = "A";
        }else{
            resultado = "Nota Erronea";
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        double nota1=90;
        double nota2=40;
        double nota3=90;
        double nota4=90;
        System.out.println("Nota Final: " + calcularPromedio(nota1, nota2, nota3, nota4) + " " + mediaPuntuacion(nota1, nota2, nota3, nota4));
        
        
    }
    
}
