import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese 1er Numero: ");
        var num1 = scan.nextInt();
        System.out.print("Ingrese 2do Numero: ");
        var num2 = scan.nextInt();
        System.out.print("Ingrese 3er Numero: ");
        var num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor es el numero: "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("El mayor es el numero: "+num2);
        }else if (num3>num1 && num3>num2) {
            System.out.println("El mayor es el numero: "+num3);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
