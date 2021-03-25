import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);
        int numOfBook = Display.displayTheBook();


        System.out.println("Please enter the book number of the book you want to read\n");

        do {
            System.out.println("Enter the number between 0~" + numOfBook + ".");
            while (!scanner.hasNextInt()) {
                System.out.println();
                System.out.println("Wrong Format");
                scanner.next();
            }
            num = scanner.nextInt();
            System.out.println();

        } while (!(num >= 0 && num < numOfBook));


        Search search = new Search(num);

        Book book = search.SearchTheBook();

        search.readBook(book);





    }
}
