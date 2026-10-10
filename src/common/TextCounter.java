package common;

public class TextCounter {

    private int rows ;
    private int letters ;
    private int words ;
    private String longestWord;
    private boolean running;


    //Initialize the atributes
    public TextCounter() {
        this.rows = 0;
        this.letters = 0;
        this.words = 0;
        this.longestWord = "";
        this.running = true;


    }


    //Count the lines and characters and words
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

         //Split the text into words using spaces
        String trimedText = text.trim();

        if (!trimedText.isEmpty()){
            String[] textWords = trimedText.split("\\s+");

            //Count the words
            words += textWords.length;

            //Find the longest word
            for (int i=0; i< textWords.length; i++){
                if (textWords[i].length() > longestWord.length()) {
                longestWord = textWords[i];


                }
            }

        }
}


// Return the number of lines
public int getRows() {
            return rows;
        }
        // Return the number of characters
            public int getLetters() {
                return letters;
            }
            // Return the number of words
    public int getWords() {
        return words;
    }
    //Return the longest word

    public String getLongestWord() {
        return longestWord;
    }


    // Check wheter the program is still running
public boolean isRunning() {
    return running;
}
        }
