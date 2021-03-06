package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueTextTest {

    @Test
    public void sameTexts() {

        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertThat(UniqueText.isUnique(origin, text), is(false));
    }

    @Test
    public void isNotEquals() {

        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isUnique(origin, text), is(true));
    }

    @Test
    public void ifTextHasTheSameWordsDifferentOrder() {

        String origin = "My cat eats a mouse";
        String text = "a cat eats My mouse";
        assertThat(UniqueText.isUnique(origin, text), is(false));
    }
}