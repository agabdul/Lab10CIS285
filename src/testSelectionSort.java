import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {


	@Test
	void testPositives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {1, 4, 7, 2, 9, 16};
		list.basicSelectionSort(arr);
		
		int exp[] = {1, 2, 4, 7, 9, 16};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}
	
	@Test
	void testNegatives() {
		SelectionSort list = new SelectionSort();
		int arr[] = {-1, -4, -7, -2, -9, -16};
		list.basicSelectionSort(arr);
		
		int exp[] = {-16,-9,-7,-4,-2,-1};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}
	

	@Test
	void testMixed() {
		SelectionSort list = new SelectionSort();
		int arr[] = {-1, 4, -7, 2, 9, -16};
		list.basicSelectionSort(arr);
		
		int exp[] = {-16, -7, -1, 2, 4, 9};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}
	
	@Test
	void testDuplicates() {
		SelectionSort list = new SelectionSort();
		int arr[] = {-1, 4, 4, -2, -1, 16};
		list.basicSelectionSort(arr);
		
		int exp[] = {-2, -1, -1, 4, 4, 16};
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println();
		
		assertArrayEquals(exp,arr);
	}

}
