package nyc.c4q.unit04midassessment;

import java.util.List;

/**
 * Created by AmyRivera on 12/20/17.
 */

public class BookModel {

    public String getBook() {
        return book;
    }

    private String book;
    private List<String> title;

    public List<String> getTitle() {
        return title;
    }

    public List<String> getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    private List<String> author;
    private int year;
}
