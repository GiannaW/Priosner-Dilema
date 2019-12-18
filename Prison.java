import java.util.Random;

public class Prison {

  //True : the prisoner betrayed.
  //False : the prisoner stayed silent.
  final static boolean BETRAYED = true;
  final static boolean SILENT = false;

  public static void main(String[] args){


    //The last choice of each prisoner.

    boolean lastChoicePrisonerA = BETRAYED; //Set initially to BETRAYED for testing
    boolean lastChoicePrisonerB;

    //Example 1: PrisonerB using no prior information
    lastChoicePrisonerB = randomChoice();

    System.out.println("If Random Choice is the strategy, B decides to betray : "
       + lastChoicePrisonerB);

    //Example 2: PrisonerB using the last choice made by A to make a decision
    lastChoicePrisonerB = betrayIfBetrayed(lastChoicePrisonerA);

    System.out.println("If Betray If Betrayed is the strategy, B decides to betray : "
       + lastChoicePrisonerB);
  }

  public static boolean randomChoice(){
      Random rand = new Random();
      return rand.nextBoolean();
  }

  public static boolean betrayIfBetrayed(boolean lastChoice){
      if(lastChoice == BETRAYED)
        return BETRAYED;
      else
        return randomChoice();
  }
}