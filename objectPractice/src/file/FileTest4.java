package file;

import java.io.File;

public class FileTest4 {
    public static void main(String[] args) {
        /*
         * 删除一个多级文件夹
         * 如果我们要删除一个有内容的文件夹
         * 1.先删除文件夹里面所有的内容
         * 2.再删除自己
         * */
        File file = new File("D:\\dome\\src");
        delDirectory(file);
    }

    public static void delDirectory(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    delDirectory(file);
                }
            }
        }
        src.delete();

    }
}
