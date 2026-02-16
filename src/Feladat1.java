import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az aktualis homersekletet (C): ");
        double homerseklet = scanner.nextDouble();

        if (homerseklet < 0) {
            System.out.println("Fagypont alatti");
        } else if (homerseklet <= 30) {
            System.out.println("Atlagos");
        } else {
            System.out.println("Tul meleg");
        }
    }
}
