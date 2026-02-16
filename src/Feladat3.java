import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eletkor;
        do {
            System.out.print("Adj meg egy eletkort (1-20): ");
            eletkor = scanner.nextInt();
        } while (eletkor < 1 || eletkor > 20);

        for (int i = 0; i < eletkor; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
