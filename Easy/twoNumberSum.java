import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    HashSet<Integer> s = new HashSet<Integer>();
		if(array.length ==1){
			return new int[]{};
		}
        for (int i = 0; i < array.length; ++i)
        {
            int temp = targetSum - array[i];
            if (s.contains(temp)) {
                return new int[]{temp, array[i]};
            }
            s.add(array[i]);
        }
        return new int[]{};
  }
}
