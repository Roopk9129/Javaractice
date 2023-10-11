import java.util.LinkedHashSet;

public class PositionOfCharInString {

	public static void main(String[] args) {
		String str ="india";
		int count=0;
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		
		for(int i=0; i<str.length();i++) {
			set.add(str.charAt(i));
			
			
		}for (Object object : set) {
			count++;
			System.out.println(object+"-->"+count+" position");
		}
	}

}
