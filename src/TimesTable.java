
public class TimesTable {
	
	public void TimesTab (int number) {
		
		System.out.println("Times Table: " + number);
		
		int i = 1;
		
		while (i <= 10) {
			
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
		number++;
	}
	
	public void AllTables (int firstTab, int LastTab) {

		// If bit is wrong - rest is correct
		if (LastTab > firstTab) {

			while (firstTab <= LastTab) {

				int i = 1;

				System.out.println("Times Table: " + firstTab);

				while (i <= 10) {

					System.out.println(firstTab + " X " + i + " = " + (firstTab * i));
					i++;
				}
				firstTab++;

// NEED TO FIX!!

			}



		}
	}
}


