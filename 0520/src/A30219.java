import java.util.Scanner;

public class A30219 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("500������ �ڿ����� �Է��ϼ���.");
		a=scan.nextInt();
		
		for(int i=0; i<=a; i++){
		if(i%3==0 && i%2!=0){
			System.out.println(i);
			sum=sum+i;
			}
		}
		System.out.println("1~" + a + "���� 3�� ����̸鼭 Ȧ���� ���� ���� " + sum + "�Դϴ�.");
	}
}
