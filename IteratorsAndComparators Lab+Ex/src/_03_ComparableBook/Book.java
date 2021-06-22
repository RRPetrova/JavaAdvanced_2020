package _03_ComparableBook;

import java.util.*;

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

    @Override
    public int compareTo(Book o) {
        if (this.title.equals(o.title)) {
            return (this.year).compareTo(o.year);
        }
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return String.format("Book(title='%s', year=%d authors=%s)",
                this.title, this.year, this.authors);
    }

}
