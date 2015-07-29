import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class Test {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println("");

		LocalDate LD1 = LocalDate.of(1989, 10, 14);
		System.out.println(LD1);
		LocalDate LD2 = LocalDate.of(1989, Month.OCTOBER, 14);
		System.out.println(LD2);

		LocalTime LT1 = LocalTime.of(9, 23);
		System.out.println(LT1);
		LocalTime LT2 = LocalTime.of(9, 23, 50);
		System.out.println(LT2);
		System.out.println("");

		LocalDateTime LDT1 = LocalDateTime.of(LD1, LT1);
		System.out.println(LDT1);
		System.out.println("");

		LocalDateTime LDT2 = LocalDateTime.now();
		System.out.println(LDT2);
		LDT2 = LDT2.minusDays(6);
		System.out.println(LDT2);
		LDT2 = LDT2.minusMonths(6);
		System.out.println(LDT2);
		System.out.println("");

		LDT2 = LDT2.minusSeconds(15);
		System.out.println(LDT2);
		LDT2 = LDT2.minusHours(10);
		System.out.println(LDT2);
		System.out.println("");

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time).minusDays(1)
				.minusHours(10).minusSeconds(30);
		System.out.println(dateTime);
		System.out.println("");

		LocalDate localdate = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(localdate.getDayOfWeek());
		System.out.println(localdate.getMonth());
		System.out.println(localdate.getYear());
		System.out.println(localdate.getDayOfYear());
	}
}
