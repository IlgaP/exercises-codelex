package io.codelex.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AuthorTest {

    @Test
    void testToString() {
        // GIVEN
        Author author = new Author("John", "Goode", LocalDate.of(2022, 03, 23));
        String expectedToStringResult = "Author{'John', 'Goode', '2022-23-03'}";

        // WHEN
        String actualResult = author.toString();

        // THEN
        Assertions.assertEquals(expectedToStringResult, actualResult);
    }
}
