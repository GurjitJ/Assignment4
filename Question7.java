public class Question7
{ 
    static int removeDuplicates(int array[], int a)
    {
        if (a==0 || a==1)
            return a;

        int[] temp = new int[a];

        int q = 0;
        for (int p=0; p<a-1; p++)
            if (array[p] != array[p+1])
                temp[q++] = array[p];

        temp[q++] = array[a-1];

        for (int p=0; p<q; p++)
            array[p] = temp[p];

        return q;
    }

    public static void main (String[] args)
    {
        int array[] = {2,2,3,3,4,4,4,11,11,11,11};
        int a = array.length;

        a = removeDuplicates(array, a);
        System.out.println(a);
    }
}