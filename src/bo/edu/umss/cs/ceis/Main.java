package bo.edu.umss.cs.ceis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = true;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la base");
            int ba = scanner.nextInt();
            System.out.println("Ingrese la altura");
            int ar = scanner.nextInt();
            Rectangulo rect = new Rectangulo(ba, ar);
            System.out.println("El area es:" + rect.area());
            System.out.println("El perimetro es:" + rect.perimetro());
        }
    }
}
