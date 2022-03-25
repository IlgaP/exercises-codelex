package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);

        int lines = 0;
        int words = 0;
        int chars = 0;

        for (String line : Files.readAllLines(path)) {
            String[] charsArr = line.split("");
            chars += charsArr.length;

            line = line.replace("  ", " ");
            String[] wordsArr = line.split("[ ']");
            words += wordsArr.length;

            lines++;
        }
        System.out.println("Lines: " + lines);
        System.out.println("words: " + words);
        System.out.println("Chars: " + chars);
    }
}
