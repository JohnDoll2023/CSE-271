import java.util.Arrays;

public class Sorting {
	    /** Sorting algorithms **/
	    
	    /** Finds the smallest element in the array and swaps it with the first element, then increments to the second element and so on
	     * Sorts an array 
	     * @param array sorted array
	     */
        public static void selectionSort(int[] array) {
            for(int i = 0; i < array.length; i++) {
            	int min = Integer.MAX_VALUE;
	            for(int j = i; j < array.length; j++) {
	            	if(array[j] < min) 
	            		min = j;
	            }
	            swap(array, i, min);
            }
         }
    
	    /**
	     * Sorts an array by moving up the array one element at a time and sorting that element into the correct location
	     * @param array inputted array
	     */
	    public static void insertionSort(int[] array) {
	    	int temp = 0;
	       for(int i = 1; i < array.length; i++) {
	    	   temp = array[i];
	    	   
	    	   int j = i;
	    	   while(j >= 1 && array[j-1] > temp) {
	    		   array[j] = array[j-1];
	    		   j--;
	    	   }
	    	   array[j] = temp;
	       } 	          
	    }
	    
	    /**
	     * Uses quick sort methodology to sort the array
	     * @param array inputted array
	     */
	    public static void quickSort(int[] array) {
	        quickSort(array, 0, array.length - 1);
	    }

	    /**
	     * partitions the inputted array and calls itself to repeat the process until the first integer is larger or equal to the second
	     * @param array inputted array
	     * @param begin where the array starts sorting
	     * @param end where the array ends sorting
	     */
	    private static void quickSort(int[] array, int begin, int end) {
	    	if(begin >= end) {
	    		return;
	    	}
	    	int x = partition(array, begin, end);
	    	quickSort(array, begin, x-1);
	    	quickSort(array, x + 1, end);
	    }

	    /**
	     * Partions part of an array and returns where the index ended up
	     * @param array array to be partitioned
	     * @param begin where the array starts partitioning
	     * @param end where the array ends partitioning
	     * @return the index of where the partition is split
	     */
	    private static int partition(int[] array, int begin, int end) {
	    	for(int i = 0; i < end; i++) {
	    		if(array[i] > array[end]) {
	    			swap(array, i, end);
	    			end -= 1;
	    			swap(array, i, end);
	    			i -= 1;
	    		}
	    	}
	    	return end;
	    }

	    /**
	     * Swap two elements in the array
	     * @param array the array where the elements are swapped
	     * @param i the index of one of the swapped items
	     * @param j the index of one of the swapped items
	     */
	    private static void swap(int[] array, int i, int j) {
	        int x = array[i];
	        array[i] = array[j];
	        array[j] = x;
	    }

	    /**
	     * Merge sorts an array
	     * @param array the array to be sorted
	     * @return sorted array
	     */
	    public static int[] mergeSort(int[] array) {
	    	if(array.length <=1) 
	    		return array;
	    	int left [] = Arrays.copyOfRange(array, 0, array.length/2);
	    	int right [] = Arrays.copyOfRange(array, array.length/2, array.length);
	    	left = mergeSort(left);
	    	right = mergeSort(right);
	    	return merge(left, right);
	    }

	    /**
	     * Sorts the two halves of the splits arrays together
	     * @param left the first half of the array
	     * @param right the second half of the array
	     * @return one sorted array
	     */
	    private static int[] merge(int[] left, int[] right) {
	    	int [] sorted = new int[left.length + right.length];
	    	int x = 0;
	    	int y = 0;
	        for(x = x; x < left.length; x=x) {
	        	for(y = y; y < right.length; y=y) {
	        		if(x>=left.length) {
	        			sorted[x+y] = right[y];
	        			y += 1;
	        		}
	        		
	        		else if(left[x] <= right[y]) {
	        			sorted[x+y] = left[x];
	        			x += 1;
	        		}
	        		
	        		else if(right[y] < left[x]) {
	        			sorted[x+y] = right[y];
	        			y += 1;
	        		}
	        	}
	        	
	        	if(y >= right.length) {
	        		while(x < left.length) {
	        			sorted[x+y] = left[x];
	        			x += 1;
	        		}
	        	}
	        }
	        return sorted;
	    }
	    
	    //Main method
	    public static void main(String[] args) {
	    
	   // use this main function to try you sorting over a simple example
	    int[] data = {-2, 45, 0, 11, -9};
	    
	    System.out.println("Unsorted: "+ Arrays.toString(data));
	    
	    // sort the array using your implemented algorithm. 
	    // call the sort here. 
	    System.out.println("sorted: "+ Arrays.toString(data));
	}
}