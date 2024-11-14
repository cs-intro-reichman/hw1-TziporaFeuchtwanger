// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
int sum = Integer.parseInt(args[0]);
double rate = Double.parseDouble(args[1])/100;
int years = Integer.parseInt(args[2]);
int future = (int)((sum)*(Math.pow(1 + rate, years)));
Math.ceil(rate);
System.out.println("After "+years+" years, "+sum+"$ "+"saved at "+(double)(rate*100)+"% "+"will yield $"+future);
	}
}
//After 2 years, $100 saved at 10.0% will yield $121