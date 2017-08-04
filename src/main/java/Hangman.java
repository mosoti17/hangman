import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Hangman {


    public String computedWord(List<String> myWords) {
      Random newRandomWord= new Random();
      int indexOfWord = newRandomWord.nextInt(myWords.size());
      String pickedWord = myWords.get(indexOfWord);
      return pickedWord;
    }
    public String wordLength(String pickedWord) {

      String output = "";
      for (int i=0;i<pickedWord.length() ;i++ ) {
        output=output+"-";
      }
      return output;
    }
    public String[] splitPickedWord(String pickedWord) {
      String[] splitWord = pickedWord.split("");
      return splitWord;
    }


}
