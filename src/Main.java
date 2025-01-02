import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("""
                ========TeClea========
                1. Modos de Juego
                2. Estadísticas
                3. Salir del programa
                ======================""");
        System.out.println("Selecciona una opción");
        int opcion = pedirNumero(1,3);
        switch (opcion){
            case 1:
                System.out.println("Modos de Juego");
                break;
            case 2:
                System.out.println("Estadísticas");
                break;
            case 3:
                System.out.println("Salir del programa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static int pedirNumero(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("No es un número");
                sc.next();
            }
            numero = sc.nextInt();
            if (numero < min || numero > max) {
                System.out.println("Número no válido, debe estar entre " + min + " y " + max);
            }
        } while (numero < min || numero > max);
        return numero;
    }
}
