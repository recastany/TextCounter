package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TextCounterTest {

    @Test

    public void testCountOneRow() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hello my friend!");

        int actual = counter.getRows();
        int expected = 1;

        //Assert
        assertEquals(expected, actual);
    }

    @Test

    public void testCountCharacters() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hello my friend!");
        counter.count("What`s up?");

        int actual = counter.getLetters();
        int expected = 26;

        //Assert
        assertEquals(expected, actual);

    }

    @Test

    public void testStopDoesNotCount() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hello my friend!");
        counter.count("What`s up?");
        counter.count("stop");

        int actualRows = counter.getRows();
        int actualletters = counter.getLetters();
        assertFalse(counter.isRunning());

        //Assert
        assertEquals(2, actualRows);
        assertEquals(26, actualletters);

    }

    @Test

    public void testCountWords() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hello my friend!");
        counter.count("What`s up?");


        //Assert
        assertEquals(5, counter.getWords());


    }

    @Test

    public void testLongestWords() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hello my friend");
        counter.count("What`s up?");


        //Assert
        assertEquals("friend", counter.getLongestWord());

    }
    @Test

    public void testCountWordsWithMultipleSpace() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act

        counter.count("Hello     my     friend");
        counter.count("What`s up?");


        //Assert
        assertEquals(2, counter.getRows());
        assertEquals(33, counter.getLetters());
        assertEquals(5, counter.getWords());




    }
}