
class Notes {
	public static void main(String[] args) {


		int[] testArray = {5, 9, 1, 2, 3, 5, 7, 8, 2, 3, 14, 356, 25, 8, 26, 8, 3, 5};

		for (int i = 1; i < testArray.length; i++) {
			// compare to all the numbers before
			int key = testArray[i];
			int index = i - 1;
			while (index >= 0 && testArray[index] > key) { //check for -1 first
				testArray[index + 1] = testArray[index];
				index--;
			}
			testArray[index + 1] = key;
		}

		

		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}
		


		// //Insertion Sort

		// int index;
		// int key; //value of the element we are comparing with
		
		// for (int i = 1; i < testArray.length; i++) {
		// 	key = testArray[i]; //save current value for later
		// 	index = i - 1;

		// 	while (index >= 0 && key < testArray[index]) { //order of conditions matters to avoid -1 outOfBoundsException
		// 		testArray[index + 1] = testArray[index]; //move values that are greater up
		// 		index--; //continue to the previous index in our sorted section of the array
		// 	}
		// 	testArray[index + 1] = key; //insert it 1 higher becuase our value is greater than the value at index (or index is -1)
		// }

		// System.out.println(Arrays.toString(testArray));
		
	}
}
