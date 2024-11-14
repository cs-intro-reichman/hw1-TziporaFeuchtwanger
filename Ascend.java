// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
double n1 = Math.random()*100;
double n2 = Math.random()*100;
double n3 = Math.random()*100;
System.out.println((int)n1 + " " + (int)n2 + " " + (int)n3);
double a1 = Math.min((int)n1, Math.min((int)n2, (int)n3));
double a3 = Math.max((int)n1, Math.max((int)n2, (int)n3));
double a2 = n1 + n2 + n3 - a1 - a3;
System.out.println((int)a1+" "+(int)a2+" "+(int)a3);



	}
}