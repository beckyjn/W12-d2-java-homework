package Attractions;

public abstract class Attraction {
    private String name;
//    private int rating;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//
//    public int getRating() {
//        return rating;
//    }
}
