import java.util.Scanner;

public class StringBuilder1 {
    public static void main(String[] args) {
        //判断是不是对称字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        String result = new StringBuilder(str).reverse().toString();
        if (str.equals(result)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");

        }

    }
}