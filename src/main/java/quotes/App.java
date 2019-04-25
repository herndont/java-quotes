/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

//import java.lang.annotation.Annotation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
//import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) {

            gsoningItUp();

    }

    //need to write a method to read the quotes file
    public static void jsonReader() {
        BufferedReader reader = null;
        try {
            File file = new file ("./quotes.json");
            reader = new BufferedReader(new FileReader(quotes));
        }
    }

//    public static void readDom() {
//        BufferedReader reader = null;
//        try {
    //        File file = new file (filepath)
//            reader = new BufferedReader(new FileReader(file));
//            Gson gson = new GsonBuilder().create();
//            Person[] people = gson.fromJson(reader, Person[].class);
//
//            System.out.println("Object mode: " + people[0]);
//
//        } catch (FileNotFoundException ex) {
//        ...
//        } finally {
//        ...
//        }
//    }

//buffered reader with try/catch inside


    public static void gsoningItUp() {

        Gson gson = new Gson();

        String jsonOrwell = "{\"tags\": [], \"author\": \"George Orwell\", \"likes\": \"28 likes\", \"text\": \" “If liberty means anything at all it means the right to tell people what they do not want to hear.” \"}";

        Quote resultingQuote = gson.fromJson(jsonOrwell, Quote.class);

        System.out.println(resultingQuote.toString());
    }

//    public static void testFields() {
//        Quote quote = new Quote();
//        quote.author = "George Orwell";
//
//        Class c = Quote.class;
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

//        Method[] methods = c.getMethods();

//        Annotation[] annots = methods[1].getAnnotations();
//    }

}
