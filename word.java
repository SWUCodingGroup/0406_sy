package baekjoon;
import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);		//Ű �Է�(1)system.in	(2)scannerŬ���� : �����ν�O
        String input = scan.nextLine().trim().replaceAll(" +"," ");		//nextLine() '\n'�� ���ö�����(=�ѹ�����ü)�� �о� ���ڿ��� ���� //String input = scan.nextLine().trim();
        scan.close();
        int count;		//�ܾ��(=������ ����)
        
        if(input.isEmpty()) {
        	count = 0;		//���ڿ��� �Է����� �ʾҰų� ���� �Է���, ���͸� �������� count�� ����
        }else {
            count = input.split(" ").length;	
        }
        
        System.out.println(count);

	}

}
