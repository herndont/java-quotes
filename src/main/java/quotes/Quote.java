package quotes;

public class Quote {
    public String[] tags;
    public String author;
    public String likes;
    public String text;

    //constructor
    public Quote (String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public String toString() {
        return author + " once said: " + text;
    }

}
