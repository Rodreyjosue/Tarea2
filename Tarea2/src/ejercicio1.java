import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese 1er Numero: ");
        var num1 = scan.nextInt();
        System.out.print("Ingrese 2do Numero: ");
        var num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("El mayor es el numero: "+num1);
        } else if (num2>num1) {
            System.out.println("El mayor es el numero: "+num2);
        }else {
            System.out.println("Los números son iguales");
        }
    }
}
