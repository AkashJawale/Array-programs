// Java program to Find another array 
// such that the hamming distance 
// from the original array is maximum 
class MaxHamming
{ 
static int maxHamming(int arr[], int n) 
{ 
	int brr[]=new int[2 *n + 1]; 
	for (int i = 0; i < n; i++) 
		brr[i] = arr[i]; 
	for (int i = 0; i < n; i++) 
		brr[n+i] = arr[i]; 

	int maxHam = 0; 

	for (int i = 1; i < n; i++) 
	{ 
		int currHam = 0; 
		for (int j = i, k=0; j < (i + n); j++, 
										k++) 
			if (brr[j] != arr[k]) 
				currHam++; 

		if (currHam == n) 
			return n; 

		maxHam = Math.max(maxHam, currHam); 
	} 

	return maxHam; 
} 

public static void main (String[] args) 
{ 
	int arr[] = {2, 4, 6, 8, 9}; 
	int n = arr.length; 
	System.out.print(maxHamming(arr, n));	 
} 
} 
