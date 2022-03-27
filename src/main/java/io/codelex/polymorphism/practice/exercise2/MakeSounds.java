package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        Parrot pat = new Parrot();
        Parrot rio = new Parrot();
        Parrot ruby = new Parrot();

        Radio sunsetRadio = new Radio();
        Radio radioReal = new Radio();

        List<Sound> sounds = new ArrayList<>();
        sounds.add(pat);
        sounds.add(sunsetRadio);
        sounds.add(rio);
        sounds.add(radioReal);
        sounds.add(ruby);

        for (Sound sound : sounds) {
            sound.playSound();
        }
    }
}
