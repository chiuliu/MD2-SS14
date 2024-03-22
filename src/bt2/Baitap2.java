package bt2;

import java.util.Arrays;
import java.util.Random;

public class Baitap2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);

        }

        //lọc các số chẵn:
        int[] arrNew = Arrays.stream(arr).filter(value -> value%2 == 0).toArray();
        //biểu thức lamda value -> value%2 == 0 giữa các giá trị số chẵn
        //
        System.out.println(Arrays.toString(arrNew));

    }

}
