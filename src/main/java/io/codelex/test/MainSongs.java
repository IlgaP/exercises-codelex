package io.codelex.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainSongs {
    public static void main(String[] args) {

        Song firstSong = new Song("Mazais prieks", 120, "Muzikanti");
        Song secondSong = new Song("Kustibas", 120, "Lalala");
        Song thirdSong = new Song("Vakars", 145, "Puikas");

        List<Song> songList = new ArrayList<>();
        songList.add(firstSong);
        songList.add(secondSong);
        songList.add(thirdSong);

        List<String> songTitles = songList.stream()
                .map(Song::getTitle)
                .map(String::toUpperCase)
                .map((String title) -> "===" + title + "===")
                .toList();
        System.out.println(songTitles);

        //songTitles.forEach(System.out::println);

        Map<Integer, List<Song>> songsByDuration = songList.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(songsByDuration);

    }


}
