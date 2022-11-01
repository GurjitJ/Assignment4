import java.util.*;
public class Question8
{
    public static int getValue(int[] a, int total){
        Arrays.sort(a);
        return a[total-3];
    }
    public static void main(String[] args){
        int a[]={1,16,2,19,10,20};
        System.out.println("The third largest element is : "+getValue(a,6));
    }
}