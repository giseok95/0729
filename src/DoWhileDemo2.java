import java.util.Random;

public class DoWhileDemo2 {
public static void main(String[] args) {
	//1~6까지의 랜덤값 추출하되 서로 다른 2개를 출력
//	int i =1;
//	int k,j;
//	do {
//		k =(int) (Math.random()*6+1);
//		j =(int) (Math.random()*6+1);		
//	}while(k==j);
//	System.out.printf("%d %d \n",k,j);
  int n1,n2,n3,n4,n5,n6;
  do {
	  n1=(int) (Math.random()*45+1);
	  n2=(int) (Math.random()*45+1);
	  n3=(int) (Math.random()*45+1);
	  n4=(int) (Math.random()*45+1);
	  n5=(int) (Math.random()*45+1);
	  n6=(int) (Math.random()*45+1);
  }while((n1==n2)||(n1==n3)||(n1==n4)||(n1==n5)||(n1==n6)||
		  (n2==n3)||(n2==n4)||(n2==n5)||(n2==n6)||
		  (n3==n4)||(n3==n5)||(n3==n6)||
		  (n4==n5)||(n4==n6)||
		  (n5==n6));
	
	System.out.printf("%d %d %d %d %d %d",n1,n2,n3,n4,n5,n6);
	
}
}
