// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		String name0 = args[0];
		String name1 = args[1];
		String name2 = args[2];
        int sum = Integer.parseInt(args[3]);
		
		double bill = sum/3;
		Math.ceil(bill);
		System.out.print("dear "+name0+" "+name1+" "+name2+" pay "+bill+" shekel each");
	}
}
