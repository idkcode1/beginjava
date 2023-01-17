
import java.util.Scanner;

class checkdb{

	public static void main(String[] args) throws Exception{
		db con = new db();
		int i=1;
		Scanner ch= new Scanner(System.in);
		//while(i<2){
		System.out.println("enter ur choice 1)insert\n2)Display\n3)Update\n4)Search\n5)DELETE\n6)exit");
		int o=ch.nextInt();

		switch(o){
		case 1: 
			System.out.println("Enter code");
			int code1= ch.nextInt();
			System.out.println("Enter name");
			String name1=ch.next();
			System.out.println("Enter score");
			int score1=ch.nextInt();
			con.insert(code1,name1,score1);
			con.close();
			break;
		case 2:
			con.display();
			con.close();
			break;
		case 3:
			System.out.println("Enter code to update ");
			code1=ch.nextInt();
			System.out.println("Enter name");
			name1=ch.next();
			System.out.println("Enter score");
			score1=ch.nextInt();
			con.update(code1,name1,score1);
			con.close();
			break;
		case 4: 
			System.out.println("Enter code to search");
			code1=ch.nextInt();
			con.search(code1);
			break;
		case 5:
			System.out.println("Enter name to delete record");
			name1=ch.next();
			con.delete(name1);
			break;
		default:
			con.close();
			break;
		
		}
	}
}
