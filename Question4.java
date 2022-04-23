import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter base of triangle : ");
    int num = in.nextInt();
    System.out.println("Base of Triangle : " + num);
    // ROW 
    for(int i = 1; i <= num; i++)
    {
        // THEN FOR EACH ROW I WANNA HAVE AN ASTERISK FOR EACH COL
        for(int j = 1; j <= i; j++)
        {
          System.out.print("* ");
        }
          System.out.println(' ');
    }


    
  }
}
