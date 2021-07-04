package sg.edu.iss.domain;

import java.math.BigInteger;

public class Response {
	private BigInteger[] fibonacci;
	private BigInteger[] sorted;
	
	public Response(BigInteger[] fibonacci, BigInteger[] sorted) {
		this.fibonacci = fibonacci;
		this.sorted = sorted;
	}

	public BigInteger[] getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(BigInteger[] fibonacci) {
		this.fibonacci = fibonacci;
	}

	public BigInteger[] getSorted() {
		return sorted;
	}

	public void setSorted(BigInteger[] sorted) {
		this.sorted = sorted;
	}
}
