public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			System.out.println("Invalid time format");
			return;
		}
        for (minutes += minutesToAdd; minutes >=60; minutes -= 60) {
            hours += 1;
        }
        while (hours >=24) {
            hours -= 24;
        }
        System.out.println((hours < 10 ? "0" + hours : hours) + ":" + (minutes < 10 ? "0" + minutes : minutes));
}

}