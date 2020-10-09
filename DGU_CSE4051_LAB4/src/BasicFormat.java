import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/** Specifies basic formatting for dates, integers, money, and people */
public class BasicFormat {
	public static String formatDate(Date date) {
		// BODY
		return new SimpleDateFormat("d MMM yyyy").format(date);
	}

	/**
	 * Formats a date
	 * 
	 * @param year  Full integral value of the year, e.g. 1945, 2008
	 * @param month Zero-based month index, e.g. 0 is January, 6 is July
	 * @param day   One-based day of the month
	 */
	public static String formatDate(int year, int month, int day) { // BODY
		return new SimpleDateFormat("d MMM yyyy").format(new GregorianCalendar(year, month, day).getTime());
	}

	public static String formatLong(long number) {
		return new DecimalFormat("#,###").format(number);
		// BODY
	}

	public static String formatMoney(double amount) {
		return new DecimalFormat(
				"$ #,##0.##").format(amount);
		// BODY
	}

	public static String formatPerson(String firstName, String lastName, String userName) {
		// BODY
		return new MessageFormat("{0}, {1} [{2}]").format(new Object[] { firstName, lastName, userName });
	}
}
