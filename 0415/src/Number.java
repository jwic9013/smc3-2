import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int random=0;
		
		int count=0;
		
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
		
		int number = scan.nextInt();
		
		for(int i=0; i<10; i++) {
			random = (int)((Math.random()*50)+1);
			
			System.out.print(random + " ");
			
			if(random==number) count++;
			}
		
		if(count>0)	System.out.println("\n��÷!");
		else System.out.println("\n��");
		scan.close();
	}
}
