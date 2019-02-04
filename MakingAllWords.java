import java.util.List;
import java.util.ArrayList;

public class MakingAllWords{

  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> boop = new ArrayList<String>();
    help(k,"",boop,maxLetter);
    return boop;
  }

  public static void help(int k, String word, ArrayList<String> words, int maxLetter){
    if (k == 0) {
      words.add(word);
    }
    for (int x = 1; x <= maxLetter; x++){
      help(k,word + (char)(('a' - 1) + x),words,maxLetter);
    }
  }
  //a == 97

}
