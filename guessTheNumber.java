 import java.util.*;

class guessTheNumber{

  public static int generateNumber(){
      Random rand = new Random();
    ;//Generate random integer from 1 to 100
      return rand.nextInt(100); 
 }
 public static void play(){
    int number = generateNumber();
    check(number);
 }
     
  public static void check(int number){
    int n;
    Scanner s = new Scanner(System.in);
    System.out.println("Guess the NUmber:");
    n = s.nextInt();
    boolean guessing = true;
    int lives = 5;
    while(guessing){
        if(n == number){
            System.out.println("Correct guess");
            guessing = false;
            break;
        }
        else if(n>number){
            System.out.println("Incorrect guess.(Too high)");
            System.out.println("Lives" + " " + --lives);
            if(lives == 0){
               System.out.println("You lose.");
               System.out.println("Correct answer is " + number);
                break;
            }
            else{
                n = s.nextInt();
            }
           
        }
        else{
            System.out.println("Incorrect guess.(Too low)");
             System.out.println("Lives" + " " + --lives);
            if(lives == 0){
               System.out.println("You lose.");
               System.out.println("Correct answer is " + number);
                break;
            }
            else{
                n = s.nextInt();
            }
          
        }
    }

  }
    
    
    public static void main(String[] args){
     
       play();
       

    }
}

