import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println(Stream
                .generate(() -> new Random().nextInt(100))
                .filter((val) -> val != 0)
                .limit(100)
                .map((val) -> (char) val.intValue())
                .peek(System.out::println)
                .count());



    }
}
