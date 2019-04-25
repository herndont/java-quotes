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
        return "tags: " + tags +  " author: " + author + " likes: " + likes + "text: " + text;
    }

//    public static String iterator(Class quotes) {
//        public int n = quotes.
//        for (int i = 0; i < quotes.length)
//        final JSONArray quotes = Object.getJSONArray(quotes)
//    }
    // add for Loop to the quote.java

//    Class c = Quote.class;
//
//        Field[] fields = c.getFields();
//
//        try {
//            Object q = fields[1].get(quote);
//            System.out.println(q);
//        }
//        catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
}
