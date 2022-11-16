package stream;

import java.util.stream.Stream;

public class StreamDome4 {
    public static void main(String[] args) {
        //一堆零散的数据    public static <T> Stream of(T... values)    Stream接口中的静态方法

        //必须是同种数据类型
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
        Stream.of("a", "b", "c", "d").forEach(s -> System.out.println(s));

    }
}
