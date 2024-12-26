package day33;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar Chrithmas = Calendar.getInstance();

		endOfYear.set(Calendar.MONTH, 11); // 12월
		endOfYear.set(Calendar.DATE, 31);
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("연말까지 남은 날: " + diff / (24 * 60 * 60 * 1000) + "일");

		Chrithmas.set(2024, 11, 25);
		diff = Chrithmas.getTimeInMillis() - today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날: " + diff / (24 * 60 * 60 * 1000) + "일");
	}
}
