package baekjoon;

public class Self_number {
	public static int arr[] = new int[10036];		//생성자와 생성자가아닌 수를 구분하기위한 배열 		//최대크기 9999+9+9+9+9=10035 
	
	public static void main(String[] args) {
		
		for(int n=1; n<=10000; n++) {
			
			arr[Check(n)]=1;	//생성자라면 배열에 1을 입력
			if(arr[n]!=1) {		//1이 아닌 인덱스(=생성자가 아니여서 1이 들어가지 못한 배열)를 추출
			System.out.println(n);}
		}

	}
	
	static int Check(int n) {		//생성자를 구하는수
		
		int tmp = 0;
		
		if(n<10) {tmp = n;}
		if(n<100) {tmp = n/10 + n%10 + n;}
		if(n<1000) {tmp = n/100 + (n%100)/10 + (n%100)%10 + n;}
		if(n<10000) {tmp = n/1000 + (n%1000)/100 + ((n%1000)%100)/10 + ((n%1000)%100)%10 + n;}
		if(n==10000) {tmp = 10001;}
		
		return tmp;		//생성자값
		
	}

}
