import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Hangman {

  private String pickedWord;
  private String output ="";

      public void setPickedWord(String word){
        pickedWord=word;
      }

      public void setOutput(String myOutput){
        output=myOutput;
      }

      public String getPickedWord(){
        return pickedWord;
      }
      
      public String getOutput(){
        return output;
      }

    public String computedWord(List<String> myWords) {
      Random newRandomWord= new Random();
      int indexOfWord = newRandomWord.nextInt(myWords.size());
      String pickedWord = myWords.get(indexOfWord);
      return pickedWord;
    }
    public String wordLength(String pickedWord) {


      for (int i=0;i<pickedWord.length() ;i++ ) {
        output=output+"-";
      }
      return output;
    }
    public String[] splitPickedWord(String pickedWord) {
      String[] splitWord = pickedWord.split("");
      return splitWord;
    }
    public String compareWords(String[] splitWord, String character) {
      StringBuilder theWord =new StringBuilder();

      String[] splitOutput =output.split("");

      for (int i=0;i<pickedWord.length() ;i++ ) {
        if (splitOutput[i].equals("-")) {
          if (splitWord[i].equals(character)) {
            theWord.append(character);

          }else{
            theWord.append("-");
          }

        } else {
          theWord.append(splitOutput[i]);
        }

      }
      output = theWord.toString();
      return output;
    }


}
