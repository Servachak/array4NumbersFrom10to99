import java.util.Arrays;

/**
 * Created by adavi on 25.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        BuildArray array = new BuildArray();

        int k = 4;
       int []newArray =  array.arrayBild(k);

       int min = array.sortArray(newArray);
        Arrays.sort(newArray);

        array.equalsArray(min,newArray[3]);

    }
}
