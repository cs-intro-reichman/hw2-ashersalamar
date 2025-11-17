/*Feedback:
 * Nice
 */

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Math.abs(Integer.parseInt(args[0]));
		double pi = Math.PI;
		double approximation = 0.0;
		for (int k = 0; k < times; k++) {
			double sign = Math.pow(-1.0, k);
			double terms = sign*(1.0 / (k*2+1));
			approximation += terms;
		}
		System.out.println("pi according to Java: " + pi);
	    System.out.println("pi, approximated:     " + approximation*4);
	}
}

