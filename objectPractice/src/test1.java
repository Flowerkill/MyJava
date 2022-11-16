
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        //要求1：长度为小于等于9
        //要求2：只能是数字
        //将内容变成罗马数字
        //注意点：罗马数字里面没有0，如果键盘录入的数字包含0，可以变成“”
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一串不大于9的只包含数字的字符串：");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入：");
                continue;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            String s = changLuoMa(number);
            sb.append(s);
        }
        System.out.println(sb);

    }

    public static String changLuoMa(int number) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
