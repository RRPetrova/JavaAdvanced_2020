package _04_BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private Integer year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }

    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }


    @Override
    public int compareTo(Book book) {
        if (getTitle().compareTo(book.getTitle()) != 0) {
            return getTitle().compareTo(book.getTitle());
        } else {
            return Integer.compare(year, book.getYear());
        }
    }
}
