package io.codelex.javaAdvancedTest.Exercise4;

import java.io.*;

public class Reader {

    private static final String PATH = "C:\\Users\\ILGA\\exercises-codelex\\src\\main\\java\\io\\codelex\\javaAdvancedTest\\Exercise4/";

    public static void main(String[] args) throws IOException {
        String file = "File";

        BufferedReader in = new BufferedReader(new FileReader(PATH + file));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH + new StringBuilder(file).reverse()));

        String line;
        while ((line = in.readLine()) != null) {
            out.write(String.valueOf(new StringBuilder(line).reverse()));
        }
        in.close();
        out.close();
    }
}
