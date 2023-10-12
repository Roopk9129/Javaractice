package MyPractices;

public class Zeros {

	public static void main(String[] args) {
		int [] a= {6,9,0,7,0,2};
		int len=a.length-1;
		int n=0;
		int res[] = new int[a.length];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]!=0) {
				res[n]=a[i];
				n++;
				
			}else {
				res[len]=a[i];
				len--;
			}
			
		}
		for(int b:res) {
			System.out.println(b);
			
		}
	}
}

