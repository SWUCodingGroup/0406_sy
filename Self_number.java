package baekjoon;

public class Self_number {
	public static int arr[] = new int[10036];		//�����ڿ� �����ڰ��ƴ� ���� �����ϱ����� �迭 		//�ִ�ũ�� 9999+9+9+9+9=10035 
	
	public static void main(String[] args) {
		
		for(int n=1; n<=10000; n++) {
			
			arr[Check(n)]=1;	//�����ڶ�� �迭�� 1�� �Է�
			if(arr[n]!=1) {		//1�� �ƴ� �ε���(=�����ڰ� �ƴϿ��� 1�� ���� ���� �迭)�� ����
			System.out.println(n);}
		}

	}
	
	static int Check(int n) {		//�����ڸ� ���ϴ¼�
		
		int tmp = 0;
		
		if(n<10) {tmp = n;}
		if(n<100) {tmp = n/10 + n%10 + n;}
		if(n<1000) {tmp = n/100 + (n%100)/10 + (n%100)%10 + n;}
		if(n<10000) {tmp = n/1000 + (n%1000)/100 + ((n%1000)%100)/10 + ((n%1000)%100)%10 + n;}
		if(n==10000) {tmp = 10001;}
		
		return tmp;		//�����ڰ�
		
	}

}
