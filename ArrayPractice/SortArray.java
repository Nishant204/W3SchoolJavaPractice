package ArrayPractice;
import java.util.Arrays;
public class SortArray
{

    public static void main(String []args)
    {
       int []arr = {1,2,3,9,0,9,9,10,5,70};
       String s = "Nishant";

      //sorting of digits in array
       Arrays.sort(arr);
       for (int i : arr)
         {
            System.out.print(" "+i);
         }
    // sorting of Character in array

       s= s.toLowerCase();
       char ch[] = s.toCharArray();
       Arrays.sort(ch);

      for(char c : ch)
       {
         System.out.print(" "+c);
       }
    }

}