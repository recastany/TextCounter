package common;

public class TextCounter {

    private int rows = 0;
    private int letters = 0;
    private boolean running;


    //Initialize the aributes
    public TextCounter() {
        this.rows = 0;
        this.letters = 0;
        this.running = true;


    }


    //Count the lines and characters
    public void count(String text) {

        //Stop the program if the user enters "stop"
        if(text.equals("stop")){
        running = false;
        return;
    }

        //count the characters
         letters += text.length();

        //Count the lines
         rows++;
}


// Return the number of lines
public int getRows() {
            return rows;
        }
        // Return the number of characters
            public int getLetters() {
                return letters;
            }
// Check wheter the program is still running
public boolean isRunning() {
    return running;
}
        }
