
import java.util.*;

class Password{
    public static void compare(int u_pass, int pass){
        while(pass!=u_pass) {
            if (u_pass == pass) {
                System.out.println("Correct Password");
            } else {
                System.out.println("Incorrect Password.Try again");
            }
        }

    }


    public static void main(String[] args){
        int u_pass = 0405, pass = 0;
        System.out.println("Enter a password:");
        Scanner s = new Scanner(System.in);
        pass = s.nextInt();
        compare(u_pass,pass);
    }
}