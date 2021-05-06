import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max=0;
		int i=0;
		int num=0;
		Scanner scan = new Scanner(System.in);
		
		for(i=0; i<5; i++){
			System.out.println(i+1+"번 입력:");
			arr[i] = scan.nextInt();
			if(arr[i]>max)	{
				max=arr[i];
				num=i+1;
			}
			
		}
		System.out.println("가장 큰 수는" + num + "번 째 숫자인 " + max);
	}

}
