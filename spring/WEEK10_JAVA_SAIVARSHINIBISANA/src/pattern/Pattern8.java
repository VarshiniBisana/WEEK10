package pattern;

public class Pattern8 {
public static void main(String[] args) {
	int row = 6;
	
	for(int i=1;i<row;i++) {
		for(int j=1;j<row;j++) {
			if(i==2 && i==3 && i==5 ) {
				System.out.println(" ");
			}
			
		System.out.print("*");
		}
		System.out.println("*");
	}
}
}
