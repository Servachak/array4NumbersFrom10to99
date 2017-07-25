import java.util.Arrays;

/**
 * Created by adavi on 25.07.2017.
 */
public class BuildArray {

    public int [] arrayBild(int k){
         int [] arr = new int[k];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (99 - 10) + 10);

            System.out.print(arr[i]);
            System.out.print(" ");
        }
        return arr;
    }

    public int sortArray(int arr[]) {

        int min = 0;
        for (int i : arr) {

            if (i > min) {
                min = i;

                System.out.println();
                System.out.println(min);

            } else {
                System.out.println("Масив не зростаючий");
                min = 0;
                break;
            }
        }

            return min;

    }




       public void equalsArray(int min, int k) {

            if (min == k) {
                System.out.println("Масив строго зростаючий");
            }

       }




}
