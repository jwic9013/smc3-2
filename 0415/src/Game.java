import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1: ���� 2: ���� 3: ���ڱ�]");
		int user = scan.nextInt();
		int computer=((int)(Math.random()*3)+1);
		
		System.out.println("----------���� ���� �� !----------");
		game(user,computer);
	}

public static void game(int user, int com){
	switch(user) {
		case 1: 
			if(com == 1) {	
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("���º�..");	
				}
			else if(com == 2) {	
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�й�....");	
				}
			else { 
				System.out.println("[��: ����] VS [��ǻ��: ���ڱ�]");
				System.out.println("�¸�!");		
				}
			break;
			
		case 2: 
			if(com == 1) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("�¸�!");	
				}
			else if(com == 2) {
				System.out.println("[��: ����] VS [��ǻ��: ����]");
				System.out.println("���º�..");	
			}
			else {
				System.out.println("[��: ����] VS [��ǻ��: ���ڱ�]");
				System.out.println("�й�....");	
			}
			break;
		case 3: 
			if(com == 1) {
				System.out.println("[��: ���ڱ�] VS [��ǻ��: ����]");
				System.out.println("�й�....");	
			}
			else if(com == 2) {
				System.out.println("[��: ���ڱ�] VS [��ǻ��: ����]");
				System.out.println("�¸�!");	
			}
			else {
				System.out.println("[��: ���ڱ�] VS [��ǻ��: ���ڱ�]");
				System.out.println("���º�..");	
			}
			break;
		}
	}
}