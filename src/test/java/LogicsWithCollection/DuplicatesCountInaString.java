package LogicsWithCollection;

public class DuplicatesCountInaString {
//need to work on
	public static void main(String[] args) {
		String str = "Tester";
		String sl = str.toLowerCase();
		int count=0;
		for(int i=0; i<sl.length();i++) {
			for(int j=i+1;j<sl.length();j++) {
				if(sl.charAt(i)==sl.charAt(j)) {
					count++;
					
				}
			}
			
		}System.out.println(count);
	}

}
