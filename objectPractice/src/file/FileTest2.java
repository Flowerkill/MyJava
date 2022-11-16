package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.AclEntryFlag;
import java.sql.SQLOutput;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        /*
         * 需求：
         *       定义一个方法找某一个文件夹中，是否有以avi结尾的电影
         *      （暂时不需要考虑子文件夹）
         * */
        File file = new File("D:\\dome\\aaa");

        boolean b = FileTest2.isAvi(file);
        System.out.println(b);
    }

    public static boolean isAvi(File file) {

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")) {
                return true;
            }

        }

        return false;
    }
}
