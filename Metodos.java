package paquetote.Metodos;

class metodos {
    public static int multi(int x, int y) {
        if (x == 0 || y == 0) 
            return 0;
        else 
            return x + multi(x, y - 1);

    }

    public static int div(int x, int y) {
        if (x < y)
            return 0;

        else 
            return 1 + div(x - y, y);
    }

    public static int residuo(int x, int y) {
        if (x < y)
        return x;

        else 
        return residuo(x-y, y);
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
            System.out.println("Entrada inválida. Por favor, ingrese un número binario válido.");
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
