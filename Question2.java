import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of numbers you would like to add to the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int [size];
        int sum = 0;
        System.out.println("Enter the numbers you are adding to the array");
        for(int i=0; i<size; i++) {
            Array[i] = sc.nextInt();
        }
        for (int num: Array) {
            sum += num;
        }
        int average = sum / Array.length;
        System.out.println("The average is: "+ average);
    }
}