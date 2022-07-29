import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalender {
	static GregorianCalendar gc = new GregorianCalendar();
	
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("year: ");		int year = sc.nextInt();	
		System.out.print("month: ");	int month = sc.nextInt();
		
		int day = 1;
		int sum=0;
		
		for(int i=1; i<year; i++) {
			if(year%400==0 || (year%4==0 &&year%100!=0)) { // i가 윤년입니까?
				sum+=366;
			}else {
				sum+=365;
			}
		} //작년 12월31일까지 합
		
		for(int i=1; i<month; i++) {
			sum+=getLastDay(year,i);
		}//올해 6월까지 합
		sum++; // 6월 마지막날 다음날
		int space = sum%7;
		
		System.out.println("           <<<"+year + "년"+month+"월"+">>>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//첫주  공백 출력하는 달력
		int count=0;
		for(int i=0; i<space; i++) {
			System.out.print("★\t");
			count++;
		}
		//첫주 1일부터 마지막 날 까지 출력
		int lastday = getLastDay(year,month);
		for(int i =1; i<lastday; i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0)System.out.println();		
		}
		
		
//		switch(sum%7) {
//		case 0:System.out.println("SUN"); break;
//		case 1:System.out.println("MON"); break;
//		case 2:System.out.println("TUE"); break;
//		case 3:System.out.println("WED"); break;
//		case 4:System.out.println("THU"); break;
//		case 5:System.out.println("FRI"); break;
//		case 6:System.out.println("SAT"); break;
//		}
		
  } // main end
static int getLastDay(int year,int month) {//지역변수 month
	int lastday=0;	
	if(month==2) {
		if(year%400==0 || (year%4==0 &&year%100!=0)) lastday= 29; else lastday= 28; //2월 일수
		}else if(month!=2) {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				lastday=31;
			else lastday=30;
		}return lastday;
}
}

