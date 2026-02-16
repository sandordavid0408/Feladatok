import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double masodperc;
        do {
            System.out.print("Villamlas utan hany masodperccel hallottad a dorgest? ");
            masodperc = scanner.nextDouble();
        } while (masodperc < 0);

        double tavolsagMeter = masodperc * 300;
        System.out.println("A villamlas tavolsaga: " + tavolsagMeter + " meter");
    }
}
