package io.codelex.oop.summary;

public class LazyBoxApp {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(LazyBoxApp::doLargeCalculation);
        printOutBoxContent(box);

        Integer result = 0;
        for (int i = 0; i < 10000; i++) {
            result = box.get();
        }
        System.out.println(result);

        LazyBox<String> textBex = box.map(Object::toString);
        LazyBox<String> upperTextBox = textBex.map(String::toUpperCase);
        LazyBox<String> fullTextBox = upperTextBox.map((String s) -> "Result is " + s);

        String resultText = fullTextBox.get();
        System.out.println(resultText);
    }

    public static Integer doLargeCalculation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return 153;
    }

    public static <A> void printOutBoxContent(LazyBox<A> box) {
        System.out.println(box.get());
    }
}
