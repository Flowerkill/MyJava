import java.util.Scanner;

public class StringDome1 {
    public static void main(String[] args) {
        //定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        //键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功!");
                break;
            } else {
                System.out.println("用户名或密码错误，你还有" + (2 - i) + "次机会!");
            }
        }

    }

}
