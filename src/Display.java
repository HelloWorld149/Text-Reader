import java.io.*;

/**
 * Text Reader -- Search
 *
 * This class search the text of the books.
 *
 * @author Yunhu Kim, lab sec 22
 * @version March 23, 2021
 *
 */

public class Display {

    public static int displayTheBook() {
        File f = new File("src/books.txt");
        int count = 0;

        try(BufferedReader bfr = new BufferedReader(new FileReader(f))) {
            while (true) {
                String line = bfr.readLine();


                if (line != null) {
                    String[] bookInfo = line.split(",");
                    System.out.println(new Book(bookInfo[0], bookInfo[1], bookInfo[2], count));
                    System.out.println();
                    count++;
                } else {
                    System.out.println("END\n");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }


}
