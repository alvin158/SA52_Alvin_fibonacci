package sg.edu.iss.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.iss.domain.Fibonacci;
import sg.edu.iss.domain.Response;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class FibonacciController {
	
	@GetMapping("/fibonacci")
	public Response fibonacci(int elements) {
		
		// Getting Fibonacci sequence into an array
		BigInteger[] array = new BigInteger[elements];
		
		for (int i = 0; i < elements; i++) {
			array[i] = Fibonacci.fib(i);
		}
		
		// Sorting the array, even first then odd
		List<BigInteger> even = new ArrayList<>();
		List<BigInteger> odd = new ArrayList<>();
		BigInteger divisor = new BigInteger("2");
		BigInteger zero = new BigInteger("0");

		// Adding even numbers to one List and odd to another
		for (int i = 0; i < elements; i++) {
			if (array[i].remainder(divisor).equals(zero)) {
				even.add(array[i]);
			} else {
				odd.add(array[i]);
			}
		}
		
		// Reversing the Lists
		Collections.reverse(even);
		Collections.reverse(odd);
		
		// Converting the List to an array
		BigInteger[] evenArray = new BigInteger[even.size()];
		for(int a = 0; a < even.size(); a++) {
			evenArray[a] = even.get(a);
		}
		
		BigInteger[] oddArray = new BigInteger[odd.size()];
		for(int b = 0; b < odd.size(); b++) {
			oddArray[b] = odd.get(b);
		}
		
		BigInteger[] combinedArray = new BigInteger[elements];
		
		// Placing elements in order
		for (int j = 0; j < evenArray.length; j++) {
			combinedArray[j] = evenArray[j];
		}
		
		for (int k = 0; k < oddArray.length; k++) {
			combinedArray[k + evenArray.length] = oddArray[k];
		}
		
		// Returning the response object to client
		return new Response(array, combinedArray);
	}
}
