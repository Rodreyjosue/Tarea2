import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Buen dia, Ingresa tu nombre: ");
        var nombre = scan.nextLine();
        System.out.print("Ingresa tu Edad: ");
        var edad = scan.nextInt();
        if (edad<18){
            System.out.println("Que tal "+nombre+" Eres Menor de edad");
        }else {
            System.out.println("Que tal "+nombre+" Eres Mayor de edad");
        }
    }
}
