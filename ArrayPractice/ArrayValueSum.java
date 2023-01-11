package ArrayPractice;
import java.util.Arrays;
public class ArrayValueSum {

    public static void main(String []args)
    {
     int []arr = {1,2,3,9,0,9,9,10,5,70};
     int j=0;
     for (int  i : arr)
     {
       j=j+i;
     }
     
     System.out.print(j);
    }
}
