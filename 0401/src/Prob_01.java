import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Grade me = new Grade();
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		
		System.out.println("����� " + me.average(me.math, me.english, me.science));
	}
}
class Grade{
	int math, science, english;
	
	public int average(int math, int science, int english){
		return (math+science+english)/3;
	}
}