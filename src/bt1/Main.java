package bt1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> random = Stream.generate(()->new Random().nextInt(1000))
                .limit(100)
                .sorted()
                .collect(Collectors.toList());
        //tạo danh sách List (định dang Int) có tên random. Stream.generate(()->new Random().nextInt dùng phương thức gểnate
        // của lớp Stream(luồng) tạo vô hạn các phần tử ngẫu nhiễn từ 0-999.
        //limit() giới hạn
        // sorted(): Sắp xếp mặc định là tăng dần
        // collect(Collectors.toList()): thu thập các phần tử trong luồng thành danh sách

        System.out.println("List : " +random);

        //tìm ra phần tử lớn nhất

//        Optional<Integer> max = random.stream().max(Comparator.comparingInt(o -> o));
        //Optional: Lớp bọc tránh tránh trả về nulll, biểu thị giá trị max có thể tồn tại hoặc k tồn tjai
        // <> kiểu dữ liệu
        // max(): phương thức tìm giá trị max
        // Comparator.comparingInt(o -> o): tạo ra đối tượng Comparator trong luồng Stream,

      Optional<Integer> max =random.stream().max(Comparator.naturalOrder());

        System.out.println("Giá trị lớn nhất " + max.orElseThrow(()-> new RuntimeException("Luồng rỗng")));



    }
}