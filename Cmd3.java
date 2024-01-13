
public class Cmd3 {

	public static void main(String[] args) {


		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		boolean result = (a<=b*c?true:(b<=a*c?true:(c<=a*b?true:false))); //(a <= b * c || b <= a * c || c <= a * b)
		System.out.println(result);
		

	}

}
