package baekjoon;
import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
/*		
		String Large[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};	
		String Small[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int num[] = {0,1,2,3,4,5,6,7,8,9};
*/
//		Scanner scan = new Scanner(System.in);
//		String input = scan.nextLine();			//�Է°�
		
		Scanner scan = new Scanner(System.in);
		
		char text;
		text = scan.nextLine().charAt(0);		// �Է°��� Char���·� �޾ƿ� int�� �������ֱ����� ����
												// charAt(������ġ): ���ڿ����� ������ ��ġ�� �����ϴ� ���ڸ� ã�� ��ȯ�ϴ� �Լ�	
		int i;
		i = (int)text;
		
		System.out.println(i);
	}

}
