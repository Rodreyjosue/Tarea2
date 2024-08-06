import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingrese un año: ");
            var anio = scan.nextInt();
            if ((anio%4==0 && anio%100!=0) || (anio%400 == 0)){
                System.out.println("El Año "+anio+" es un año bisiesto");
            }else {
                System.out.println("El Año "+anio+" No es un año bisiesto");
            }
            System.out.print("desea validar otro año (s/n):");
            continuar = scan.next().charAt(0);
        }while (continuar == 's');
    }
}
