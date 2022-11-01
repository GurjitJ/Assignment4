import java.util.Scanner;
public class Question5 {
    public static void main(String[] args)
    {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix");
        a = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        b  = sc.nextInt();

        int array1[][] = new int[a][b];
        int array2[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.println("Input the elements of the first matrix");

        for (  c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                array1[c][d] = sc.nextInt();

        System.out.println("Input the elements of the second matrix");

        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                array2[c][d] = sc.nextInt();

        for ( c = 0 ; c < a ; c++ )
            for ( d = 0 ; d < b ; d++ )
                sum[c][d] = array1[c][d] + array2[c][d];

        System.out.println("Sum of the matrices is: ");

        for ( c = 0 ; c < a ; c++ )
        {
            for ( d = 0 ; d < b ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}