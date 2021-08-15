package ru.netology.manager.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import ru.netology.repository.AfishaRepository;


import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository();

    Movie first = new Movie(1, "urlБладшот", "Бладшот", ",боевик", false);
    Movie second = new Movie(2, "urlВперед", "Вперед", "мультфильм",false);
    Movie third = new Movie(3, "urlОтельБелград ", "Отель Белгард","комедия",false);
    Movie fourth = new Movie(4, "urlДжентельмены", "Джентельмены", "боевик",false);
    Movie fifth = new Movie(5, "urlЧеловек-невидимка", "Человек-невидимка", "ужасы",false);
    Movie sixth = new Movie(6, "urlТролли.Мировой тур", "Тролли.Мировой тур", "мультфильм",true);
    Movie seventh = new Movie(7, "urlНомерОдин", "Номер Один", "комедия",true);


    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);

    }

    @Test
    void removeById() {
        repository.removeById(3);

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{first, second, fourth, fifth, sixth, seventh};

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeAll() {
        repository.removeAll();

        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        Movie actual = repository.findById(3);
        Movie expected = third;

        assertEquals(expected, actual);
    }
}