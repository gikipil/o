import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.example.Find;
import java.io.IOException;



public class FindTest {

    /**
     * checking at the beginning of the file.
     *
     * @throws IOException
     */
    @Test
    void in_the_startTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("1.txt","aaaa"),0);

    }

    /**
     * If not present in the file.
     *
     * @throws IOException
     */

    @Test
    void emptyTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("1.txt","qwerty"),-1);
    }

    /**
     * the whole file is a searchable.
     *
     * @throws IOException
     */

    @Test
    void fullTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("2.txt","abcd"),0);
    }

    /**
     * palindrome test.
     *
     * @throws IOException
     */

    @Test
    void palindromTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("3.txt","cba"),4);
    }

    /**
     * looking for nothing.
     *
     * @throws IOException
     */

    @Test
    void null_objectTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("1.txt",""),0);
    }

    /**
     * looking in an empty file.
     *
     * @throws IOException
     */

    @Test
    void null_inputTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("4.txt","qwerty"),-1);
    }

    /**
     * if we are looking for more than there is in the file.
     *
     * @throws IOException
     */

    @Test
    void little_textTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("2.txt","qwerty"),-1);
    }

    /**
     * a large text for 100 thousand sivols.
     *
     * @throws IOException
     */

    @Test
    void large_textTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("5.txt","В четверть одиннадцатого, наконец, сели в кареты и поехали."),45085);
    }

    /**
     * checking chinese characters.
     *
     * @throws IOException
     */

    @Test
    void chinaTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("7.txt","青空"),1);
    }

    /**
     * a file with almost a million characters.
     *
     * @throws IOException
     */

    @Test
    void very_largeTest() throws IOException {
        Find test = new Find();
        assertEquals(test.find("8.txt","Я это знаю, и я это докажу, - сказал Ростов."),552790);
    }

    /**
     * a file with almost a million characters.
     * search for very large text.
     *
     * @throws IOException
     */

    @Test
    void very_large_large_exampleTest() throws IOException {
        Find test = new Find();
        String ex = test.openfile("8.txt");
        assertEquals(test.find("8.txt",ex),0);
    }

}
