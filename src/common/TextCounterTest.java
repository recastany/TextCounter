package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        //Assert
        assertEquals(2, actualRows);
        assertEquals(26, actualletters);

    }




}
