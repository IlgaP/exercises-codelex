package io.codelex.classesandobjects.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VideoStore {

    List<Video> videos = new ArrayList<>();

    public void addVideo(String title, int rating){
        Video video = new Video(title);
        videos.add(video);
        video.getRating(rating);
    }

    public void checkOutVideo(String title){
        for (Video video : videos) {
            if (Objects.equals(video.getTitle(), title)) {
                video.checkedOut();
                System.out.println("Video " + video.getTitle() + " checked out");
                break;
            }
        }
    }

    public void checkInVideo(String title){
        for (Video video : videos) {
            if (Objects.equals(video.getTitle(), title)) {
                video.checkedIn();
                break;
            }
        }
    }

    public void showAllVideos(){
        for (Video video : videos) {
            System.out.println("Video: " + video.getTitle());
            System.out.println("Rating: " + video.getRating());
            System.out.println("Available: " + video.isChecked());
        }
    }

}


