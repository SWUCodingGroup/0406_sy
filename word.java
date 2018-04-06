package baekjoon;
import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);		//키 입력(1)system.in	(2)scanner클래스 : 공백인식O
        String input = scan.nextLine().trim().replaceAll(" +"," ");		//nextLine() '\n'가 나올때까지(=한문장전체)를 읽어 문자열로 리턴 //String input = scan.nextLine().trim();
        scan.close();
        int count;		//단어갯수(=공백의 갯수)
        
        if(input.isEmpty()) {
        	count = 0;		//문자열을 입력하지 않았거나 공백 입력후, 엔터를 눌렀을때 count값 설정
        }else {
            count = input.split(" ").length;	
        }
        
        System.out.println(count);

	}

}
