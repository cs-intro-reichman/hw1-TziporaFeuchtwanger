// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		String name0 = args[0];
		String name1 = args[1];
		String name2 = args[2];
        double sum = Double.parseDouble(args[3]);
		
		double bill = Math.ceil(sum/3);
		System.out.print("Dear "+name2+", "+name1+", "+name0+": pay "+bill+" shekel each.");
		//Dear Dan, Lisa, and Ron: pay 34.0 Shekels each.
	}
}
