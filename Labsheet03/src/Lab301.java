import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		String txtConcate = "";
		String word;
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Prongram Terinate");
				break;
			}
			
			txtConcate += word+" ";
		}
		System.out.println(txtConcate.toUpperCase());
		
		kb.close();
	}

}
