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

class metodos {

    public static int multi(int x, int y) {
        int mayor = 0;
        int menor = 0;
        int resultado = 0;
        if (x < y) {
            mayor = y;
            menor = x;
        } else {
            mayor = x;
            menor = y;
        }

        for (int i = 1; i <= menor; i++) {
            resultado += mayor;
        }
        return (resultado);
    }

    public static int div(int x, int y) {
        if (y != 0){
            int residuo = x;
            int cociente = 0;

            while (residuo >= y) {
                residuo -= y;
                cociente++;
            }
            return cociente;
        } else {
            System.out.println("Error; el dividendo no puede ser 0");
            return -1;
        }

    }

    public static int residuo(int x, int y) {
        int residuo = x;
        while (residuo >= y) {
            residuo -= y;
        }
        return residuo;
    }

    public static String decimalToBinario(int numero) {
        StringBuilder sb = new StringBuilder();
        if (numero == 0)
            return "0";

        while (numero > 0) {
            int residuo = residuo(numero, 2);
            numero = div(numero, 2);
            sb.insert(0, residuo);
        }
        return sb.toString();
    }

    public static String decimalToOctal(int numero) {
        StringBuilder sb = new StringBuilder();
        if (numero == 0)
            return "0";

        while (numero > 0) {
            int residuo = residuo(numero, 8);
            numero = div(numero, 8);
            sb.insert(0, residuo);
        }
        return sb.toString();
    }

    public static String decimalToHexadecimal(int numero) {
        StringBuilder sb = new StringBuilder();
        if (numero == 0)
            return "0";

        while (numero > 0) {
            int residuo = residuo(numero, 16);
            numero = div(numero, 16);
            sb.insert(0, hex(residuo));
        }
        return sb.toString();
    }

    public static char hex(int digito) {
        if (digito >= 0 && 9 >= digito) {
            return (char) (digito + '0');
        } else {
            return (char) (digito - 10 + 'A');
        }
    }

    // El valor ASCII del carácter '0' es 48.
    // El valor ASCII del carácter '9' es 57.
    // El valor ASCII del carácter 'A' es 65.
    // El valor ASCII del carácter 'F' es 70.

    // Multiplicar por el tipo de dato elevado a la potencia de 0 para el primero
    // dato aumentando su potencia de 1 en 1 hasta el último dato
    public static int hexadecimalToDecimal(String hexadecimal) {
        hexadecimal = hexadecimal.toUpperCase();
        boolean valido = true;
        for (char c : hexadecimal.toCharArray()) {
            if (!Character.isDigit(c) && (c < 'A' || c > 'F')) {
                System.out.println("Entrada inválida. Por favor, ingrese un número hexadecimal válido.");
                valido = false;
            }
        }

        if (valido){
            int decimal = 0;
            for (int x = 0, y = 1; x < hexadecimal.length(); x++, y++) {
                char auxiliar = hexadecimal.charAt(x);
                int digito = Character.isDigit(auxiliar) ? auxiliar - '0' : auxiliar - 'A' + 10;
                decimal += multi(digito, (int) (Math.pow(16, hexadecimal.length() - y)));
            }
            return decimal;
        } else{
            return -1;
        }
    }

    public static int octalToDecimal(String octal) {
        boolean valido = true;
        for (char c : octal.toCharArray()) {
        if (c < '0' || c > '7') {
            System.out.println("Entrada inválida. Por favor, ingrese un número octal válido.");
            valido = false;
        }
    }
        if (valido){
            int decimal = 0;
            for (int x = 0, y = 1; x < octal.length(); x++, y++) {
                int auxiliar = octal.charAt(x) - '0';
                decimal += multi(auxiliar, (int) (Math.pow(8, octal.length() - y)));
            }
            return decimal;
        } else{
            return -1;
        }
    }



    public static int binarioToDecimal(String binario) {
        boolean valido = true;
        for (char c : binario.toCharArray()) {
        if (c != '0' && c != '1') {
            valido = false;
        }
    }
        if (valido){
            int decimal = 0;
                for (int x = 0, y = 1; x < binario.length(); x++, y++) {
                    int auxiliar = binario.charAt(x) - '0';
                    decimal += multi(auxiliar, (int) (Math.pow(2, binario.length() - y)));
                }
                return decimal;
        } else{
            System.out.println("Entrada inválida. Por favor, ingrese un número binario válido.");
            return -1;
        }
    }
 

    // Modulos Conectores:
    public static String octalToHexadecimal(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToHexadecimal(decimal);
    }

    public static String octalToBinario(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinario(decimal);
    }

    public static String hexadecimalToOctal(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToOctal(decimal);
    }

    public static String hexadecimalToBinario(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToBinario(decimal);
    }

    public static String binarioToOctal(String binario) {
        int decimal = binarioToDecimal(binario);
        return decimalToOctal(decimal);
    }

    public static String binarioToHexadecimal(String binario) {
        int decimal = binarioToDecimal(binario);
        return decimalToHexadecimal(decimal);
    }
}