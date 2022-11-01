public class Question3 {
    public static void main(String[] args){
        int[] Array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int num = 50;

        for(int i = 0; i<Array.length; i++){
            if(num == Array[i]){
                System.out.println("Your array contains your value!");
            }
        }
    }
}