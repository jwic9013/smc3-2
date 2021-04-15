import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1: 가위 2: 바위 3: 보자기]");
		int user = scan.nextInt();
		int computer=((int)(Math.random()*3)+1);
		
		System.out.println("----------가위 바위 보 !----------");
		game(user,computer);
	}

public static void game(int user, int com){
	switch(user) {
		case 1: 
			if(com == 1) {	
				System.out.println("[나: 가위] VS [컴퓨터: 가위]");
				System.out.println("무승부..");	
				}
			else if(com == 2) {	
				System.out.println("[나: 가위] VS [컴퓨터: 바위]");
				System.out.println("패배....");	
				}
			else { 
				System.out.println("[나: 가위] VS [컴퓨터: 보자기]");
				System.out.println("승리!");		
				}
			break;
			
		case 2: 
			if(com == 1) {
				System.out.println("[나: 바위] VS [컴퓨터: 가위]");
				System.out.println("승리!");	
				}
			else if(com == 2) {
				System.out.println("[나: 바위] VS [컴퓨터: 바위]");
				System.out.println("무승부..");	
			}
			else {
				System.out.println("[나: 바위] VS [컴퓨터: 보자기]");
				System.out.println("패배....");	
			}
			break;
		case 3: 
			if(com == 1) {
				System.out.println("[나: 보자기] VS [컴퓨터: 가위]");
				System.out.println("패배....");	
			}
			else if(com == 2) {
				System.out.println("[나: 보자기] VS [컴퓨터: 바위]");
				System.out.println("승리!");	
			}
			else {
				System.out.println("[나: 보자기] VS [컴퓨터: 보자기]");
				System.out.println("무승부..");	
			}
			break;
		}
	}
}