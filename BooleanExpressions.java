public class BooleanExpressions{
	public static void main(Strings[] args){
		Scanner keyboard = new Scanner (System.in){
			boolean a,b,c,d,e;
			double x,y;
			System.out.print("Give me two number. First: " );
			x = keyboard.nextDouble();
			System.out.print("Second: ");
			y = keyboard.nextDouble();
			a= (x < y);
			b= (x <=y);
			System.out.println( x + " is LESS THAN " + y + ": " + a );