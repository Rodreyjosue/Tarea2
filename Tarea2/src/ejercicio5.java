import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular el mes correspondiente: ");
        var numeroMes = scan.nextInt();

        if (numeroMes==1) System.out.println("El mes es Enero");
        else if (numeroMes==2) System.out.println("El mes es Febrero");
        else if (numeroMes==3) System.out.println("El mes es Marzo");
        else if (numeroMes==4) System.out.println("El mes es Abril");
        else if (numeroMes==5) System.out.println("El mes es Mayo");
        else if (numeroMes==6) System.out.println("El mes es Junio");
        else if (numeroMes==7) System.out.println("El mes es Julio");
        else if (numeroMes==8) System.out.println("El mes es Agosto");
        else if (numeroMes==9) System.out.println("El mes es Septiembre");
        else if (numeroMes==10) System.out.println("El mes es Octubre");
        else if (numeroMes==11) System.out.println("El mes es Noviembre");
        else if (numeroMes==12) System.out.println("El mes es Diciembre");
        else System.out.println("Numero ingresado es incorrecto");
    }
}
