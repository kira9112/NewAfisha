package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    void ShouldShowDefaultAfisha() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "urlБладшот", "Бладшот", ",боевик", false);
        Movie second = new Movie(2, "urlВперед", "Вперед", "мультфильм",false);
        Movie third = new Movie(3, "urlОтельБелград ", "Отель Белгард","комедия",false);
        Movie fourth = new Movie(4, "urlДжентельмены", "Джентельмены", "боевик",false);
        Movie fifth = new Movie(5, "urlЧеловек-невидимка", "Человек-невидимка", "ужасы",false);
        Movie sixth = new Movie(6, "urlТролли.Мировой тур", "Тролли.Мировой тур", "мультфильм",true);
        Movie seventh = new Movie(7, "urlНомерОдин", "Номер Один", "комедия",true);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        ;

        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{ seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShow7LastMovies() {

        MovieManager manager = new MovieManager();

        Movie first = new Movie(1, "urlБладшот", "Бладшот", ",боевик", false);
        Movie second = new Movie(2, "urlВперед", "Вперед", "мультфильм",false);
        Movie third = new Movie(3, "urlОтельБелград ", "Отель Белгард","комедия",false);
        Movie fourth = new Movie(4, "urlДжентельмены", "Джентельмены", "боевик",false);
        Movie fifth = new Movie(5, "urlЧеловек-невидимка", "Человек-невидимка", "ужасы",false);
        Movie sixth = new Movie(6, "urlТролли.Мировой тур", "Тролли.Мировой тур", "мультфильм",true);
        Movie seventh = new Movie(7, "urlНомерОдин", "Номер Один", "комедия",true);
        Movie eighth = new Movie (8, "urlГлавный Герой", "Главный Герой" , "комедия", false);
        Movie ninth= new Movie (9, "urlВремя", "Время" , "ужасы", true);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{ ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShowSelectedQuantityMovies() {

        MovieManager manager = new MovieManager(3);

        Movie first = new Movie(1, "urlБладшот", "Бладшот", ",боевик", false);
        Movie second = new Movie(2, "urlВперед", "Вперед", "мультфильм",false);
        Movie third = new Movie(3, "urlОтельБелград ", "Отель Белгард","комедия",false);
        Movie fourth = new Movie(4, "urlДжентельмены", "Джентельмены", "боевик",false);
        Movie fifth = new Movie(5, "urlЧеловек-невидимка", "Человек-невидимка", "ужасы",false);
        Movie sixth = new Movie(6, "urlТролли.Мировой тур", "Тролли.Мировой тур", "мультфильм",true);
        Movie seventh = new Movie(7, "urlНомерОдин", "Номер Один", "комедия",true);
        Movie eighth = new Movie (8, "urlГлавный Герой", "Главный Герой" , "комедия", false);
        Movie ninth= new Movie (9, "urlВремя", "Время" , "ужасы", true);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{ninth,eighth,seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    void ShouldShowWhenMoviesUnder7() {
        MovieManager manager = new MovieManager ();
        Movie first = new Movie(1, "urlБладшот", "Бладшот", ",боевик", false);
        Movie second = new Movie(2, "urlВперед", "Вперед", "мультфильм",false);
        Movie third = new Movie(3, "urlОтельБелград ", "Отель Белгард","комедия",false);
        Movie fourth = new Movie(4, "urlДжентельмены", "Джентельмены", "боевик",false);
        Movie fifth = new Movie(5, "urlЧеловек-невидимка", "Человек-невидимка", "ужасы",false);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);


        Movie[] actual = manager.showMovies();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }
}