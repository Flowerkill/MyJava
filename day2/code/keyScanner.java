// 导包
// 导包的动作必须出现在类定义的上边
import java.util.Scanner;

public class keyScanner{
	public static void main(String[] args){
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数：");
		// 接收键盘输入数据（只能是整数）
		int i = sc.nextInt();
		
		System.out.println(i);
	}
}