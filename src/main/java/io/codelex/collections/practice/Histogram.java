package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        //System.out.println(scores);
        final int RANGE_COUNT = 11;

        int[] rangeArr = new int[RANGE_COUNT];
        for (int i : rangeArr) {
            rangeArr[i] = 0;
        }
        countScoresInRanges(scores, rangeArr);
        displayHistogram(rangeArr);

    }

    private static void countScoresInRanges(String scores, int[] rangeArr) {
        String[] scoreArr = scores.split(" ");
        for (String score : scoreArr) {
            int rangeIndex = Integer.parseInt(score) / 10;
            rangeArr[rangeIndex]++;
        }
    }

    private static void displayHistogram(int[] rangeArr) {
        for (int i = 0; i < 11; i++) {
            String rangeLabel;
            if (i == 0) {
                rangeLabel = "00-09";
            } else if (i == 10) {
                rangeLabel = "  100";
            } else {
                rangeLabel = i * 10 + "-" + (i * 10 + 9);
            }
            StringBuilder stars = new StringBuilder();
            for (int j = 0; j < rangeArr[i]; j++) {
                stars.append('*');
            }
            System.out.println(rangeLabel + ": " + stars);
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);


    }
}
