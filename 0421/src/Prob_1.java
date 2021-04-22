import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			int sum=0;
			
			System.out.print("시작 숫자: ");
			int num = scan.nextInt();
			
			System.out.print("마지막 숫자: ");
			int num2 = scan.nextInt();
			
			for(int i=num; i<=num2; i++){
				sum += i;
			}
			
			System.out.println(num + "부터 " + num2 + "까지의 합은 " + sum);
			
		}
}
