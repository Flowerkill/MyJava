// 1.导包
import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		// 2.创建 Scanner 对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		// 3.接收键盘录入数据
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("这两个整数的和为：" + sum);
	}
}