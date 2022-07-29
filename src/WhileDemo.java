
public class WhileDemo {
	public static void main(String[] args) {
//		int x=1;
//		while(x<10) {
//			int y=2;
//			while(y<10) {
//				System.out.printf("%d x %d = %d \t",y,x,x*y);
//				y++;
//			}
//			System.out.println();
//			x++;
//		}
		int i=65;
		int count=0;
		int line=1;
		while(i<91) {
			if(line%2==0) 
				System.out.printf("%c \t",i+32);
			else 
				System.out.printf("%c \t",i);
			count++;
			if(count%5==0) {
				System.out.println();
				line++;
			}
			i++;			
		}
		
		
		
	}
}
