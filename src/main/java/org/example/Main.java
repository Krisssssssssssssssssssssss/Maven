package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String asciiArt = FigletFont.convertOneLine("Hello World");
            System.out.println(asciiArt);
        } catch (IOException e) {
            System.err.println("An error occurred while generating ASCII art: " + e.getMessage());
        }
    }
}
