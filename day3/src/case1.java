// 导包
import java.util.Scanner;
public class case1 {
    public static void main(String[] args){
        // 创建 Scanner 对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位的整数：");
        int number = sc.nextInt();
        int singleDigit = number % 10;
        int tenPlace = number / 10 % 10;
        int hundredDigit = number / 100 % 10;
        System.out.println("这三位数的个位是：" + singleDigit);
        System.out.println("这三位数的十位是：" + tenPlace);
        System.out.println("这三位数的百位是：" + hundredDigit);
    }


}
