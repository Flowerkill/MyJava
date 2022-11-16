package file;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        /*
         * 需求：
         *       定义一个方法找电脑中，是否有以avi结尾的电影
         *      （需要考虑子文件夹）
         *
         *          递归
         *
         * */
        File file = new File("D:\\");
        findAvi();
    }

    public static void findAvi() {
        File[] files = File.listRoots();
        for (File file : files) {
            findAvi(file);
        }
    }

    public static void findAvi(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    findAvi(file);
                }
            }
        }

    }


}
