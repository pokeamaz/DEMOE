import java.util.Scanner;
import java.util.Random;
public class guess {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(100);
		System.out.println("�����֣�1-100��");
		do{
			int number = sc.nextInt();
			if (number == answer){
				System.out.println("��ϲ�����¶�����");
				break;
			}
			else if(number<answer){
				System.out.println("��С��");
			}
			else{
				System.out.println("�´���");
			}
			}while(true);
		}
	}