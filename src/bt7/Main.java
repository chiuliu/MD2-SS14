package bt7;


import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên 1");
        int a = scanner.nextInt();
        System.out.println("Nhập số nguyên 2");
        int b = scanner.nextInt();
        IntStream stream = IntStream.range(a,b);
        stream.forEach(System.out::println);
    }
}
