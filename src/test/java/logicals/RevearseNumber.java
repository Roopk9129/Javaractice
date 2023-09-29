package logicals;

public class RevearseNumber {
	public static void main(String[] args) {
		int r = 47463836;
		String str = Integer.toString(r);
		for(int i=str.length();i>0;i--) {
			char rev = str.charAt(i-1);
			System.out.print(rev);
		}
		
	}

}
