package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Titre en ASCII grâce à jfiglet
        String titreAscii = FigletFont.convertOneLine("APP");
        System.out.println(titreAscii);
        System.out.println("Hello World!");
    }
}