public class PracticeProblem {

	public static void main(String args[]) {
		insertionSort(new char[] {'b', 'e', 'a'});
	}

	public static void insertionSort(char[] characters) {
		for (int a = 1; a < characters.length; a++) {
			char key = characters[a];
			int index = a - 1;
			while (index >= 0 && characters[index] > key) {
				characters[index + 1] = characters[index];
				index--;
			}
			characters[index + 1] = key;

		}

	}

}
