import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//스캔
			
		int random=0;	//랜덤 변수
			
		int count=0;	//카운트 변수
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");	//프린트
		
		int number = scan.nextInt();	//스캔
		
		for(int i=0; i<10; i++) {	//반복문
			random = (int)((Math.random()*50)+1);	//랜덤으로 숫자
			
			System.out.print(random + " ");	//출력
			
			if(random==number) count++;	//같으면 카운트 쁠쁠
			}
		
		if(count>0)	System.out.println("\n당첨!");	//1이면 당첨 출력
		else System.out.println("\n꽝");	//아니면 꽝 출력
		scan.close();
	}
}
//배고프다
