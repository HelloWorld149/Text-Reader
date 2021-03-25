import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Text Reader -- Search
 *
 * This class search the text of the books.
 *
 * @author Yunhu Kim, lab sec 22
 * @version March 23, 2021
 *
 */



public class Search {
    int bookNumber;

    public Search(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public Book SearchTheBook() {
        boolean FileFound;

        int count = 0;

        File file = new File("src/books.txt");

        try(BufferedReader bfr = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = bfr.readLine();
                String[] bookInfo = line.split(",");

                if (count == this.bookNumber) {
                    Book book = new Book(bookInfo[0], bookInfo[1], bookInfo[2], this.bookNumber);
                    return book;
                }

                count++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void readBook(Book book) {
        String link = book.getBookLink();

        try {
            URL url = new URL(link);
            InputStream is = url.openStream();
            BufferedReader bfr = new BufferedReader(new InputStreamReader(is));

            while (true) {
                String line = bfr.readLine();

                if (line != null) {
                    System.out.println(line);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
