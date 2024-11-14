
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
    if (hours > 12){
    System.out.println((hours-12)+":"+minutes+" PM");
    }
    else{
    System.out.println(hours+":"+String.format("%02d", minutes)+" AM");   
    }


	}}