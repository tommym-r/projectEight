import java.util.*;

class Guesser {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args){
    new Guesser();
  } // end main
  
  public Guesser(){
    boolean keepGoing = true;
    String userInput = "";
    while (keepGoing){
      userInput = menu();
      if (userInput.equals("0")){
        keepGoing = false;
      } else if (userInput.equals("1")){
        humanGuesser();
      } else if (userInput.equals("2")){
        computerGuesser();
      } else {
        System.out.println("Enter 0, 1, or 2: ");
      } // end if
    } // end while
  } // end Guesser Constructor

  public String menu(){
    String userInput = "";
    System.out.println("0) Exit");
    System.out.println("1) Human");
    System.out.println("2) Computer");
    System.out.println("\nPlease enter 0-2: ");
    userInput = input.nextLine();
    return userInput;
  } // end menu
  
  public void humanGuesser(){
    Random rand = new Random();
    int correct = rand.nextInt(100) + 1;
    int turns = 0;
    int guess = 0;
    boolean keepGoing = true;
    while (keepGoing){
      turns += 1;
      System.out.println("Please enter a guess between 1 and 100: ");
      guess = Integer.parseInt(input.nextLine());
      if (guess < correct){
        System.out.println("Too low");
      }  else if (guess > correct){
        System.out.println("Too high");
      }  else {
        System.out.println("Correct, you win!");
        keepGoing = false;
      } // end if
    } // end while

    if (turns < 7){
      System.out.println("Great job, you performed above average.");
    } else if (turns > 7){
      System.out.println("You could do better, you performed below average.");
    } else {
      System.out.println("Good job, you performance was average.");
    } // end if
  } // end humanGuesser

  public void computerGuesser(){
    int lower = 1;
    int upper = 100;
    int guess = (upper+lower)/2;
    int turns = 0;
    boolean keepGoing = true;
    String userInput = "";
    while (keepGoing){
      System.out.println(guess);
      turns += 1;
      System.out.println("Is the guess (H)igher, (L)ower, or (C)orrect?");
      userInput = input.nextLine();
      if (userInput.equalsIgnoreCase("H")){
        upper = guess;
        guess = (upper+lower)/2;
      } else if (userInput.equalsIgnoreCase("L")){
        lower = guess;
        guess = (upper+lower)/2;
      } else if (userInput.equalsIgnoreCase("C")){
        System.out.println("It took the computer " + turns + " turns to get the correct guess.");
        keepGoing = false;
      } else {
        System.out.println("Please enter 'H', 'L', or 'C'");
      } //end if
    } //end while
  } // end computerGuesser
} // end Guesser 
