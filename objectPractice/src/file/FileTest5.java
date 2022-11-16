package file;

import java.io.File;

public class FileTest5 {
    public static void main(String[] args) {
        File file = new File("D:\\dome");

        long len = getLen(file);
        System.out.println(len);
    }


    public static long getLen(File src) {
        long sum = 0;

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
                System.out.println(file.length());
                sum += file.length();
            } else {
                sum += getLen(file);
            }
        }
        return sum;
    }
}
