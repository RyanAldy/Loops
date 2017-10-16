
public class TimesTableTwo {

	public void TimesTabTwo (int number) {

		System.out.println("Times Table: " + number);

		int i;

		for (i=1; i <= 10; i++) {

			System.out.println(number + " X " + i + " = " + (number * i));

		}
		number++;
	}


	public void AllTablesTwo (int Start, int End) {

		int i;

		if (End < Start) {
			
			int newStart;
			newStart = End;

			for (i=1; i <= 10; i++) {

				System.out.println(Start + " X " + i + " = " + (Start * i));

			}
			Start++;
		}
		else {

			for (i=1; i >= 10; i--) {

				System.out.println(Start + " X " + i + " = " + (Start * i));

			}

		}
	}
}
