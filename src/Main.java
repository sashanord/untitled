import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Напишите, откуда считать строку");
        String fileFrom = scanner.nextLine();

        System.out.println("Напишите, куда написать строку");
        String fileTo = scanner.nextLine();

        Copier copier = new Copier(fileFrom, fileTo);
        copier.copy();


    }
}
