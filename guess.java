import java.util.Scanner;
import java.util.Random;
public class guess {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(100);
		System.out.println("猜数字（1-100）");
		do{
			int number = sc.nextInt();
			if (number == answer){
				System.out.println("恭喜您，猜对啦！");
				break;
			}
			else if(number<answer){
				System.out.println("猜小了");
			}
			else{
				System.out.println("猜大了");
			}
			}while(true);
		}
	}