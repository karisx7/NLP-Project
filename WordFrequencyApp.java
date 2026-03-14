import java.util.ArrayList;
import java.util.Scanner;

public class WordFrequencyApp {

  // Creates ArrayLists
private ArrayList<String> foundWords;
private ArrayList<Integer> counts;
  
  // Assigns initial values for your instance variables
  public WordFrequencyApp() {
    foundWords = new ArrayList<String>();
    counts = new ArrayList<Integer>();
  }

  /**
   * Javadoc example
   * @param parameter1 the first parameter
   * @return what is returned from this method
   */

  /**
   * Starts the app and gets user input. Then, it calls all the following methods
   *
   * Precondition: countWords(), sortByFrequency(), and printSummary() must be defined within the scope of the program
   * Postcondition: The correct input is taken in from the user and run through all of the methods
   * @param: N/A. There is no parameter for this method
   * @return: N/A. There is no return value for this method
   */
  public void prompt() {
    Scanner input = new Scanner(System.in);
    
    // Starting text
    System.out.println("Enter a sentence to be analyzed:");
    String userInput = input.nextLine(); // collect userInput
  
    countWords(userInput);
    sortByFrequency();
    printSummary();
    input.close();
  }
  
/**
* Splits the text into parts and counts the frequeny of it
*
* Precondition: the argument for input exists
* Postcondition: The word and its corresponding frequency are put into counts and foundWords
* @param: String input: Represents the String given by the user
* @return: N/A. There is no return value for this method
*/
public void countWords(String input) {
  String[] words = input.split(" "); // splits at every word
  for (int i = 0; i < words.length; i++) { // for every word in words
    String currentWord = words[i]; // finds the current word in words
    int pos = foundWords.indexOf(currentWord); // Used to see if its in the foundWords ArrayList
    if (pos == -1) { // if its not already in the list
      foundWords.add(currentWord); // add the word to the foundWords list
      counts.add(1); // one for the count of that word
    } else { // if its already in the list
      int newCount = counts.get(pos) + 1; // add one to the count
      counts.set(pos, newCount); // set the number at that position to that number + 1;
    }
  }
}

/**
* Sorts the text within the ArrayLists by descending order
*
* Precondition: foundWords and counts must have appropriate arguments contained in them
* Postcondition: The foundWords and counts list is correctly sorted in descending order
* @param: N/A. There is no parameter for this method
* @return: N/A. There is no return value for this method
*/
public void sortByFrequency() {
  for (int i = 0; i < counts.size(); i++) { // for all elements in counts
    int maxIndex = i; // set the max index to i as the element from the outer
    for (int j =  i + 1; j < counts.size(); j++) { // for all the elements one after the one in the outer loop
      if (counts.get(j) > counts.get(maxIndex)) { // if that element from the inner is greater than the one from the outer
        maxIndex = j; // set maxIndex as j
      }
    }
    int current = counts.get(i); // gets the current element at the element from the outer
    counts.set(i, counts.get(maxIndex)); // set the element at that index to the one with the max count
    counts.set(maxIndex, current); // set the temp value to the one that just got replaced

    String tempWord = foundWords.get(i); // gets the corresponding word name at the element from the outer
    foundWords.set(i, foundWords.get(maxIndex)); // sets the corresponding word name at the index to the one with its corresponding max count
    foundWords.set(maxIndex, tempWord); // sets the temp value to the one that just replaced
  }
}
  
  /**
   * Prints the summary of my NLP project
   *
   * Precondition: The correct values are already in the foundWords and counts arraylists
   * Postcondition: The words and frequency are all printed correctly into the console
   * @param: N/A. There is no parameter for this method
   * @return: N/A. There is no return for this method.
   */
  public void printSummary() {
    System.out.println("\nFrequency Results: "); // title header
    for (int i = 0; i < foundWords.size(); i++) { // for every word in the foundWords list
      System.out.println(foundWords.get(i) + " is found " + counts.get(i) + " times."); // prints every individual word in foundWords
    }
  }

}