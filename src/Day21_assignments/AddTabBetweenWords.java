package Day21_assignments;

public class AddTabBetweenWords {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int k = 0; k < items.length; k++) {
            for (int a = items[k].length - 1; a >= 0; a--) {
                System.out.print(items[k][a]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = items.length-1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }

    }

}

/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */