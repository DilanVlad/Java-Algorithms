package folderMain;


public class Ciclos {
    public static void printFibonacci(int limit){
        int  a = 0;
        int  b = 1;
        int  temp = 0;
        
        for (int i = 0; i < limit; i++) {
            System.out.printf("%3d",a);
            temp = a + b;
            a = b;
            b = temp;
        }
    }
    
    public static void printTriangulo1(int tamanio){
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 1; j < tamanio - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("1 ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j < tamanio - i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
    public static void printTriangulo2(int tamanio){
        for (int i = 1; i < tamanio; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < tamanio - i; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j < tamanio - i; j++) {
                System.out.print("1 ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void  imriprimitForma(int tamanio){
        for (int i = 0; i < tamanio; i++) {
            System.out.print("@ ");
        }
        System.out.println("");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("@ ");
            for (int j = 2; j < tamanio; j++) {
                System.out.print("  ");
            }
            System.out.println("@ ");
            
        }
        for (int i = 0; i < tamanio; i++) {
            System.out.print("@ ");
        }
    }
    public static void  imriprimitForma2(int tamanio){
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i == 0 || i == tamanio-1 || j == 0 || j == tamanio-1 ){
                    System.out.print("@ ");
                }else{
                   System.out.print("  "); 
                }
                
            }
            System.out.println("");
        }
    }
    public static void  imriprimitForma3(int tamanio){
        int contador = 1;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int rango = 4;
        
        printTriangulo1(rango);
        printTriangulo2(rango);
        System.out.println("\n");
        imriprimitForma(5);
        System.out.println("\n");
        imriprimitForma2(5);
        System.out.println("\n");
        imriprimitForma3(7);
        System.out.println("\n");
        printFibonacci(5);
    }
    
}
