import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//�뒪罹�
			
		int random=0;	//�옖�뜡 蹂��닔
			
		int count=0;	//移댁슫�듃 蹂��닔
		
		System.out.print("10媛쒖쓽 �옖�뜡 �닽�옄 以� �븯�굹瑜� 留욎떠蹂댁꽭�슂(1~50源뚯�): ");	//�봽由고듃
		
		int number = scan.nextInt();	//�뒪罹�
		
		for(int i=0; i<10; i++) {	//諛섎났臾�
			random = (int)((Math.random()*50)+1);	//�옖�뜡�쑝濡� �닽�옄
			
			System.out.print(random + " ");	//異쒕젰
			
			if(random==number) count++;	//媛숈쑝硫� 移댁슫�듃 �걽�걽
			}
		
		if(count>0)	System.out.println("\n�떦泥�!");	//1�씠硫� �떦泥� 異쒕젰
		else System.out.println("\n苑�");	//�븘�땲硫� 苑� 異쒕젰
		scan.close();
	}
}
//諛곌퀬�봽�떎
