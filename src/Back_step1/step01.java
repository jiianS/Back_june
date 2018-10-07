package Back_step1;

import java.util.ArrayList;
import java.util.Scanner;

public class step01 {

//no.1000
	public void no1000() {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		System.out.println(A + B);
	}
	
//	no.11718
	public void no11718() {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> txt = new ArrayList<>();
		
		while (scan.hasNextLine()){
			String t = scan.nextLine();
			if(t.startsWith(" ") || t.endsWith(" ") || t.length() >100 || t.isEmpty()) {
				break;
			}
			txt.add(t);
		}
		scan.close();
		
		for(int i=0; i<txt.size(); ++i) {
			System.out.println(txt.get(i));
		}
	}
}
