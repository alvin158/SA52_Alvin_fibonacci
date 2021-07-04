package sg.edu.iss.domain;

import java.math.BigInteger;

public class Fibonacci {
	
	public static BigInteger fib(int number) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		
		if (number < 1)
			return a;
		
		for (int j = 2; j <= number; j++)
		{
			c =  a.add(b);
			a = b;
			b = c;
		}

		return b;
	}
}
