import java.util.Scanner;

public class A30219 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("500이하의 자연수를 입력하세요.");
		a=scan.nextInt();
		
		for(int i=0; i<=a; i++){
		if(i%3==0 && i%2!=0){
			System.out.println(i);
			sum=sum+i;
			}
		}
		System.out.println("1~" + a + "까지 3의 배수이면서 홀수인 수의 합은 " + sum + "입니다.");
	}
}
