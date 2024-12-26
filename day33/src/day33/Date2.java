package day33;

import java.util.Calendar;
import java.util.GregorianCalendar; 

public class Date2 {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance(); // 싱글턴 패턴
		Calendar b = new GregorianCalendar();
		System.out.println(a.toString());
		System.out.println(b.toString());		
	}
}
