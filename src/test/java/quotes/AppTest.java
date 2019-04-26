package quotes;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class AppTest {
//I think we are going to need to break up our methods into smaller chunks to be able to test this properly.
    @Test
    public void main() {
    }

//    @Test
//    public void jsonReader() {
//        String json = "[{author:Orwell, text: if liberty...}, {author: Gladwell, text: there can be...}]";
//        JsonElement e = parser.parse(json);
//        assertTrue(e.isJsonArray());
//
//        JsonArray array = e.getAsJsonArray();
//        assertEquals("{author:Orwell, text: if liberty...}", array.get(0).toString());
//        assertEquals("{author: Gladwell, text: there can be...}", array.get(1).toString());
//
//    }
}