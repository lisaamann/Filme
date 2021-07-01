package filme;

import java.util.List;
import java.util.Scanner;

public class Filme {
    // IO Input Output
    private FilmeDAO filmeDAO;
    private GenreDAO genreDAO;
    private Scanner scanner;

    public Filme() {
        this.filmeDAO = new FilmeDAO();
        this.genreDAO = new GenreDAO();
        this.scanner = new Scanner(System.in);
    }

    public void readInput() {
        System.out.println("Willkommen in der Filmbibliothek");
        System.out.println("Menü:");
        System.out.println("f Alle Filme anzeigen");
        System.out.println("g Alle Genres anzeigen");
        System.out.println("b Beenden");

        while (true) {
            String input = this.scanner.nextLine();

            if (input.equals("f")) {
                System.out.println("Die Liste der Filme");
                showAllFilms();
            }
            if (input.equals("g")) {
                System.out.println("Die Liste der Genres");
                showAllGenres();
            }
            if (input.equals("b")) {
                System.out.println("Programm wird beendet");
                System.exit(0);
            }
        }

    }

    public void showAllFilms() {
        List<FilmeVO> films = this.filmeDAO.getAllFilms();
        for (FilmeVO film : films) {
            System.out.println("id: " + film.getId() + " titel: " + film.getTitel() + " land: " + film.getLand()
                    + " jahr: " + film.getJahr());
        }
    }

    public void showAllGenres() {
        List<GenreVO> genreVOs = this.genreDAO.getAllGenres();
        for (GenreVO genre1 : genreVOs) {
            System.out.println("id: " + genre1.getId() + " genre: " + genre1.getName());
        }
    }
}
