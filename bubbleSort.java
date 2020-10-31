import java.util.Arrays;

public class bubbleSort{
    public static void main(String[]args){
        int[] arrayOfNumbers = {24, 19, 9, 14, 94, 56, 32, 87, 5, 101};
        System.out.println(bubbleSorting(arrayOfNumbers));
    }

    public static String bubbleSorting(int[] array){
        // A single iteration of this loop will move the largest possible remaining number to the end
        for (int i = 0; i < array.length - 1; i++){
            /*A single iteration of this loop will swap the position of the element at the current index
             with the consecutive element if it is greater*/
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j + 1]){
                    int temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return (Arrays.toString(array));
    }
}