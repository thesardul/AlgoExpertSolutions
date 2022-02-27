import java.util.*;

class Program {
  public static int getNthFib(int n) {
		int a = 0, b = 1, c;
		if(n <= 1)
			return a;
		for(int i = 2; i < n; i++){
			c = a+b;
			a = b;
			b = c;
		}
    // Write your code here.
    return b;
  }
}
