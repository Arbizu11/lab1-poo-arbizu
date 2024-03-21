import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc, num1, num2, result;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opc = sc.nextInt();

            switch(opc)
            {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    result = calcu.suma(num1, num2);

                    System.out.println("Resultado: " + result);

                    break;

                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    result = calcu.resta(num1, num2);

                    System.out.println("Resultado: " + result);
                    break;

                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    result = calcu.multiplicacion(num1, num2);

                    System.out.println("Resultado: " + result);
                    break;

                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = sc.nextInt();

                    if (num2 == 0)
                    {
                        System.out.println("Error de division.");
                        break;
                    }
                    result = calcu.division(num1, num2);

                    System.out.println("Resultado: " + result);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error...");
                    break;
            }
        }while (opc != 5);

    }
}