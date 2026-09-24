
public class  Multadd {
	
	public static void main(String[] args) {
		double answer1 = multadd(Math.sin(Math.PI/4),1,Math.cos(Math.PI/4)/2);
		System.out.println(answer1);
		double answer2 = multadd(Math.log10(10),1,Math.log10(20));
		System.out.println(answer2);
		double answer3 = expsum(1);
		System.out.println(answer2);
	}
	
	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}
	
	public static double expsum(double x){
		return multadd( x * Math.pow(Math.exp(),(-x)),1,
		Math.sqrt(1-Math.pow(Math.exp(),(-x))));
	}
	
}
