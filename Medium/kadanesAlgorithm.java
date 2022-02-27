import java.util.*;

class Program {
  public static int kadanesAlgorithm(int[] array) {
    // Write your code here.
		int maxSum = Integer.MIN_VALUE;
		int maxEnd = 0;
		for(int i = 0; i < array.length; i ++){
			maxEnd += array[i];
			if(maxSum < maxEnd)
				maxSum = maxEnd;
			if(maxEnd < 0)
				maxEnd = 0;
		}		
    return maxSum;
  }
}
