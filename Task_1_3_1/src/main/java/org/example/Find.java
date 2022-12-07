package org.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


/**
 * Substring search class.
 * The prefix algorithm is used.
 * Knut-Maurice-Prat.
 */
public class Find {
    /**
     * Array of values matching.
     * Suffix and prefix in the searchable.
     */
    private int[] pi;

    /**
     * function to convert a file.
     * in the desired encoding to a string.
     *
     * @param name name of file.
     *
     * @return String search text.
     *
     * @throws IOException
     */

    public String openfile (String name) throws IOException {
        String file = "src/test/resources/" + name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        String line = "";
        String text = "";
        while(line != null){
            text = text + line;
        }
        return text;
    }

    /**
     * The prefix function defines an array of numbers.
     * They determine the longest length of the sample.
     * Suffix matching with the prefix.
     *
     * @param example What you need to find.
     */
    private void prefix (String example) {
        pi = new int [example.length()+1];
        for (int i = 1; i < example.length(); i++) {
            int temp = pi[i + 1];

            while ((temp > 0) && (example.charAt(i) != example.charAt(temp))) {
                temp = pi[temp];
            }
            if ((temp > 0) || (example.charAt(i) == example.charAt(temp))) {
                pi[i + 1] = temp + 1;
            }
        }
    }

    /**
     * The function compares and searches for matches in the source text.
     *
     * @param text The source text for the search.
     *
     * @param example What you need to find.
     *
     * @return returns the index of the beginning of the substring.
     */
     private int find_math(String text, String example) {
        int math = 0;
        for (int i = 0; i < text.length(); i++) {

            if ((math < example.length()) && (text.charAt(i) == example.charAt(math))) {
                if (++math == example.length()) {
                    return i - math + 1;
                }
            } else if (math > 0) {
                math = pi[math];
                i--;
            }
        }
        return -1;
    }

    /**
     * Find function.
     *
     * @param name name input file.
     *
     * @param example What you need to find.
     *
     * @return Start Indexю
     */
    public int find (String name, String example) throws IOException {
        String text = openfile(name);
        if (example == "") {
            return 0;
        }
        if (text == "") {
            return -1;
        }
        if (text.length() < example.length()) {
            return -1;
        }
        prefix(example);
        return find_math(text,example);
    }

}
