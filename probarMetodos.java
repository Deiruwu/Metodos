package paquetote.Metodos;
import java.util.Scanner;

public class probarMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println();
            System.out.println("Elija una opción:");
            System.out.println("A) Operaciones");
            System.out.println("B) Conversor");
            System.out.println("Z) Salir");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    menuOperaciones(sc);
                    break;
                case 'B':
                    menuConversor(sc);
                    break;
                case 'Z':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'Z');

        sc.close();
    }

    public static void menuOperaciones(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Operaciones:");
            System.out.println("A) Multiplicar");
            System.out.println("B) Dividir");
            System.out.println("C) Calcular residuo");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Resultado de la multiplicación: " + metodos.multi(num1, num2));
                    break;
                case 'B':
                    System.out.print("Ingrese el dividendo: ");
                    int dividendo = sc.nextInt();
                    System.out.print("Ingrese el divisor: ");
                    int divisor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cociente de la división: " + metodos.div(dividendo, divisor));
                    break;
                case 'C':
                    System.out.print("Ingrese el dividendo: ");
                    int dividendoRes = sc.nextInt();
                    System.out.print("Ingrese el divisor: ");
                    int divisorRes = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Residuo de la división: " + metodos.residuo(dividendoRes, divisorRes));
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'Z');
    }

    public static void menuConversor(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Conversor:");
            System.out.println("A) Decimal");
            System.out.println("B) Binario");
            System.out.println("C) Octal");
            System.out.println("D) Hexadecimal");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    menuConversorDecimal(sc);
                    break;
                case 'B':
                    menuConversorBinario(sc);
                    break;
                case 'C':
                    menuConversorOctal(sc);
                    break;
                case 'D':
                    menuConversorHexadecimal(sc);
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 'Z');
    }

    public static void menuConversorDecimal(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Convertir decimal a: ");
            System.out.println("A) Binario");
            System.out.println("B) Octal");
            System.out.println("C) Hexadecimal");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese el número decimal: ");
                    int numDecimal = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Número en binario: " + metodos.decimalToBinario(numDecimal));
                    break;
                case 'B':
                    System.out.print("Ingrese el número decimal: ");
                    int numDecimal2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Número en octal: " + metodos.decimalToOctal(numDecimal2));
                    break;
                case 'C':
                    System.out.print("Ingrese el número decimal: ");
                    int numDecimal3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Número en hexadecimal: " + metodos.decimalToHexadecimal(numDecimal3));
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 'Z');
    }

    public static void menuConversorBinario(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Convertir binario a: ");
            System.out.println("A) Decimal");
            System.out.println("B) Octal");
            System.out.println("C) Hexadecimal");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese el número binario: ");
                    String numBinario = sc.nextLine();
                    System.out.println("Número en decimal: " + metodos.binarioToDecimal(numBinario));
                    break;
                case 'B':
                    System.out.print("Ingrese el número binario: ");
                    String numBinario2 = sc.nextLine();
                    System.out.println("Número en octal: " + metodos.binarioToOctal(numBinario2));
                    break;
                case 'C':
                    System.out.print("Ingrese el número binario: ");
                    String numBinario3 = sc.nextLine();
                    System.out.println("Número en hexadecimal: " + metodos.binarioToHexadecimal(numBinario3));
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'Z');
    }

    public static void menuConversorOctal(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Convertir octal a: ");
            System.out.println("A) Decimal");
            System.out.println("B) Binario");
            System.out.println("C) Hexadecimal");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese el número octal: ");
                    String numOctal = sc.nextLine();
                    System.out.println("Número en decimal: " + metodos.octalToDecimal(numOctal));
                    break;
                case 'B':
                    System.out.print("Ingrese el número octal: ");
                    String numOctal2 = sc.nextLine();
                    System.out.println("Número en binario: " + metodos.octalToBinario(numOctal2));
                    break;
                case 'C':
                    System.out.print("Ingrese el número octal: ");
                    String numOctal3 = sc.nextLine();
                    System.out.println("Número en hexadecimal: " + metodos.octalToHexadecimal(numOctal3));
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'Z');
    }

    public static void menuConversorHexadecimal(Scanner sc) {
        char opcion;

        do {
            System.out.println();
            System.out.println("Convertir hexadecimal a: ");
            System.out.println("A) Decimal");
            System.out.println("B) Binario");
            System.out.println("C) Octal");
            System.out.println("Z) Volver al menú principal");
            System.out.print("Opción: ");

            opcion = sc.nextLine().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    System.out.print("Ingrese el número hexadecimal: ");
                    String numHexadecimal = sc.nextLine();
                    System.out.println("Número en decimal: " + metodos.hexadecimalToDecimal(numHexadecimal));
                    break;
                case 'B':
                    System.out.print("Ingrese el número hexadecimal: ");
                    String numHexadecimal2 = sc.nextLine();
                    System.out.println("Número en binario: " + metodos.hexadecimalToBinario(numHexadecimal2));
                    break;
                case 'C':
                    System.out.print("Ingrese el número hexadecimal: ");
                    String numHexadecimal3 = sc.nextLine();
                    System.out.println("Número en octal: " + metodos.hexadecimalToOctal(numHexadecimal3));
                    break;
                case 'Z':
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'Z');
    }

}

