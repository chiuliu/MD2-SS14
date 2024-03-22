package bt8;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);

        }

        // tìm ra số chãn
        boolean check =Arrays.stream(arr).anyMatch(value -> value%2 == 0);

        // nêwus có in ra 2 số đầu tiên
        //nếu k tìm nem ra lỗi k tì thấy

        OptionalInt optional = Arrays.stream(arr).filter(value -> value%2==0).findFirst();

//        System.out.println(optional.orElseThrow(Com));
    }
}
