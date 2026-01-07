import java.util.Scanner;
public class Dollar{
	public static void main(String[] args){
		double d1=89.63;
		double result;
		System.out.println(d1);
		Scanner sc=new Scanner(System.in);
		double d2=sc.nextDouble();
		result=d1*d2;
		System.out.println(result);
	}
}