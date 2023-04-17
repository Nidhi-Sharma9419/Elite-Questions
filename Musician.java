package clssesobjconstrtor;

import java.util.List;

public class Musician extends Human{
//    static final int LIFESPAN = 100;
//    private String name;
//    private int age;
//    private float height;
    private String musicSchool;
    private String genre;
    private List<String> songs;
    public Musician(String name, int age, float height, String musicSchool, String genre){
        super(name, age, height);
        this.musicSchool = musicSchool;
        this.genre = genre;
    }
    public int getTimeToLive(){
        return (Lifespan - getAge())/2;
    }


    public String getMusicSchool() {
        return musicSchool;
    }


    public void setMusicSchool(String musicSchool) {
        this.musicSchool=musicSchool;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre=genre;
    }

}
