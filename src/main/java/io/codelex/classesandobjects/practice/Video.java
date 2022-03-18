package io.codelex.classesandobjects.practice;

public class Video {
    String title;
    boolean isChecked;
    int rating;

    public Video(String title) {
        this.title = title;
        this.isChecked = true;
    }

    public void checkedOut() {
        isChecked = false;
    }

    public void checkedIn() {
        isChecked = true;
    }

    public void getRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
