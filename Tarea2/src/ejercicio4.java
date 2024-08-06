import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        var num = scan.nextInt();
        if (num<0){
            System.out.println("El numero es Negativo (-)");
        } else if (num>0) {
            System.out.println("EL numero es Positivo (+)");
        }else {
            System.out.println("EL numero es 0");
        }
    }
}
