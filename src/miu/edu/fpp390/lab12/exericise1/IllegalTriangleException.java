package miu.edu.fpp390.lab12.exericise1;

public class IllegalTriangleException extends IllegalClosedCurveException {
	
	public IllegalTriangleException(String message, String message2, String message3) {
		super(message);
	}
	
	public IllegalTriangleException(String message) {
		super(message);
	}
}
