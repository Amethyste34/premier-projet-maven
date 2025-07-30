package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        String titre = ResourceBundle.getBundle("application").getString("titre");
        // Titre en ASCII grâce à jfiglet
        String titreAscii = FigletFont.convertOneLine(titre);
        System.out.println(titreAscii);

        // affichage de l'environnement
        String environnement = ResourceBundle.getBundle("application").getString(
                "environnement");
        System.out.println("Environnement : " + environnement);
    }
}