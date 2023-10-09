import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static String[] palabras = {
            "motocicleta", "calculadora", "comer", "inspirar", "nombre",
            "laptop", "programar", "teclado", "escribir", "progresar",
            "tipo", "dinero", "vamos", "vida", "decir"
    };

    public static void main(String[] args) throws InterruptedException{

        //cuenta regresiva con 1 segundo de tiempo
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido!");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Comencemos en: ");
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("---------------------------------------------------------------------------------------------");

        Random random = new Random();//palabras en orden aleatorio"random"
        for (int i = 0; i < 15; i++){
            System.out.print(palabras[random.nextInt(14)] + " ");
        }
        System.out.println();

        //tiempo en escribir del usuario
        double iniciar = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        String escPalabras = sc.nextLine();

        double finalizar = LocalTime.now().toNanoOfDay();
        double tiempoExpirado = finalizar - iniciar;
        double segundos = tiempoExpirado / 1000000000.0;//segundos
        int numChars = escPalabras.length();
        int tiempoPorMinuto = (int) ((((double) numChars / 5) / segundos) * 60);//minutos

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Tu wpm fue de: " + tiempoPorMinuto + "!");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Adios! ;)");
    }
}