//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheering = (args[0]).toUpperCase();
                int times = Integer.parseInt(args[1]);
                for (int x = 0; x < cheering.length(); x++) {
                        char c = cheering.charAt(x);
                        String article = ("AEFHILMNORSX".indexOf(c) != -1) ? "an" : "a ";
                        System.out.println("Give me " + article + " " + c + ": " + c + "!");
                }
                System.out.println("What does that spell?");
                
                for (int i = 0; i < times; i++) {
                        System.out.println(cheering + "!!!");
                }
        }
}
