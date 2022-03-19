package io.codelex.test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Author {
    public static final int BOOKS_IN_THE_WORLD = 129864880;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    public String[] books;
    public int bookCount;


    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.bookCount = 0;
        this.books = new String[2];
    }


    public boolean hasWrittenBook(String book) {
        for (String s : books) {
            return (s.equals(book));
        }
        return false;
    }

    public void addBook(String book) {
        books[bookCount] = book;
        bookCount++;
    }

    public long getAge() {
        LocalDate end = LocalDate.now();
        Period period = Period.between(dateOfBirth, end);
        return period.getYears();

    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printAllInfo() {
        System.out.println("Author " + firstName + " " + lastName);
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + bookCount + " books");

    }


    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", books=" + Arrays.toString(books) +
                ", bookCount=" + bookCount +
                '}';
    }


}
