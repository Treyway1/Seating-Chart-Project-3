import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     System.out.println(" Welcome to Ms.Benny's class, this is where everyone is sitting.");// First System.out.print
     int[] seatNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
     String[] names = new String [15];//String Here
     Scanner scan = new Scanner(System.in); for(int i = 0; i < 15; i++) {//For loop here
       System.out.println("The names of the Students?");
       names [i] = scan.next();//Names Are Here
     }
     int i = 0;
     while (i < 15) {//While loop is here
       System.out.println (names[i] + " Everyone go to your seat.");
       i++;

      }
  }
}
    
