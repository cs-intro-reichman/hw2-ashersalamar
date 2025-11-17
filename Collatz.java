/* Feedback:
Great work overall! Just a couple of minor suggestions for clarity and style.
Some variable names could be more descriptive.
Also, ensure consistent indentation for better readability.
as a "rule of thumb", always add a space before and after 
 { } in if-else statements, do-while etc 
always add a tab after ; and don't write two statements in the same line
always add a tab after closing a loop or conditional block before writing the next statement
for example: line 59 shouldn't be }System.out.println("Every one of the first " + seed + " hailstone sequences reached 1."); 
it should be:
  }
System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
Another styling mistake is writing two statements in the same line like in line 40
 */

// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int seed = Math.abs(Integer.parseInt(args[0]));
		String mode = args[1];
		int count1 = 0;
		int count2 = 0;
		int w = 0;

        if (mode.equals ("v")) {
			boolean added = false;
			while (w != 1) {
				 if (!added) {
                    w += 1;
                    added = true;
                }
				System.out.print(w + " ");
				if (w % 2 == 0) {
                        w /= 2; 
                    } else {
                        w = w * 3 + 1; 
                    }
					count1 ++;
					
			} count1 ++; System.out.println("1 (" + count1 + ")");
        for (int j = 2; j <= seed; j++) {
			int i = j; 
			count2 = 0;
                while (i != 1) {
                    System.out.print(i + " ");
                    if (i % 2 == 0) {
                        i /= 2; 
                    } else {
                        i = i * 3 + 1; 
                    }
					count2 ++;
                
            }
            System.out.print(1);
			count2 ++;
			System.out.println(" (" + count2 + ")");
        }
		
    }System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
}
}

