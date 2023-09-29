package logicals;

public class ReverseString {
	public static void main(String[] args) {
		String str = "java";		
		for(int i=str.length();i>0;i--) {
			char chhar = str.charAt(i-1);
			System.out.print(chhar);
			
		}
	}

}
