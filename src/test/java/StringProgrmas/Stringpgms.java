package StringProgrmas;

public class Stringpgms {

	public static void main(String[] args) {
		String s = "Bangalore";
		int LenOfS = s.length() - 1;
		char[] ch = s.toCharArray();
		for (int i = LenOfS; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();

		// Using String Buffer
		StringBuffer SB = new StringBuffer("Bangalore");
		System.out.println(SB.reverse());
		
//		//Using 3rd Varable
//		String res="";
//		for(int i=LenOfS;i<=0;i++) {
//			rev=rev+ch[i];
//			
//		}
		

	}

}
