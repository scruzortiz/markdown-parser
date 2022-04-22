import static org.junit.Assert.*; //imports junit Assert

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

import org.junit.*; //imports junit 
public class MarkdownParseTest { //creates class for testing 
    @Test //the creatin of a test??
    public void addition() { //method that is going to test something
        assertEquals(2, 1 + 1); //checks if the first input (expected output) matches the actual output
    }
    @Test
    public void testgetLinks(){
        Path fileName = Path.of("test-file.md"); 
        try{
            String content = Files.readString(fileName); 
            assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));

        }catch(IOException e){
            System.out.println("exception thrown"); 
        }
    }
}