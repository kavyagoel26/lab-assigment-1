package day1;

public class FibonnaciSeries {

	public static void main (String args[]) {
		int a=1 ,b=1, sum=0, average=0;
		System.out.println("The First 20 Fibonacci Numbers are :");
		System.out.print(a+" "+b);
		int c = 0;
		for(int i=0;i<=17;i++) {
			sum+=2;
		}
		for(int i=2;i<=19;i++) {
			c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
			sum+=c;
		}
			System.out.println("\n average is: " +(float)sum/20);
		
	}


}
