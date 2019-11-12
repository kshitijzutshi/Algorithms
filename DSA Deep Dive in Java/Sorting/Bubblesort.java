package unionfind;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// First have the array which contains the integer numbers
		int[] arr= {12,34,-12,1,0,45,40};
		
		System.out.println("The unsorted array is: ");
		for(int n = 0 ; n < arr.length ; n++) {
			System.out.print(arr[n]+" ");	
			
		}
		
		// Now its an increasing order bubble sort so have a sorted and unsorted partition
		
		for(int unsortedindex = arr.length-1 ; unsortedindex > 0 ; unsortedindex--) {
			
			for(int i = 0 ; i < unsortedindex ; i++) {
				swap( arr, i, i+1);
//				for( int j = 0; j < arr.length ; j++) {
//					swap( arr, i, j);
//				}
			}
		}
		System.out.println(" ");
		System.out.println("The sorted array in ascending bubble sort is: ");
		for(int m = 0 ; m < arr.length ; m++) {
			System.out.print(arr[m]+" ");	
		}
		
		}
		
		public static void swap(int[] array1, int index1 , int index2) {
			
			
//			for( int k = 0 ; k < array1.length ; k++)
//			{
//				if ( array1[k] > array1[k+1] ) {
//					int temp = array1[k+1];
//					array1[k+1] = array1[k];
//					array1[k] = temp;
//				}
//			}
			
			if ( array1[index1] > array1[index2]) {
				int temp = array1[index2];
				array1[index2] = array1[index1];
				array1[index1] = temp;
			}
		
			}
	
}
