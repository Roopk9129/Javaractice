package MyPractices;

public class AddNumsInString {

	public static void main(String[] args){
		String str="6Lhw24";
		int num=0;
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>='0' && str.charAt(i) <= '9'){
		int n=str.charAt(i)-48;
		num=num+n;
		}

		}System.out.println(num);
		}
}
