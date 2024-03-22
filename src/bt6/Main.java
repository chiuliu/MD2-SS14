package bt6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = {"abc","dahkg","abe","csd"};
//  Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
        Arrays.stream(str).map(s -> s.toUpperCase()).forEach(System.out::println);
    }

}