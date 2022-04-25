import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
 

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter total integers to be entered : ");
    int num = in.nextInt();

    ArrayList<Integer> data = new ArrayList<>(); 
    for(int i = 1; i <= num; ++i)
    {
        int alpha = in.nextInt();
        data.add(alpha);
    }

    ArrayList<Integer> freq = new ArrayList<>();

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (Integer i : data)
    {
      Integer count = frequencyMap.get(i);
      if (count == null)
      {
        count = 0;
      }
      frequencyMap.put(i, count + 1);
    }
    
    // To store the result
    for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet())
    {
      System.out.println(entry.getKey() +": " + entry.getValue());
      
    }

    // Using Collections.max() method returning max
    // value in HashMap and storing in a integer
    // variable
    int maxValueInMap = (Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey());
    System.out.println(maxValueInMap);


  }
}
