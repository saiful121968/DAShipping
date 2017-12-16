package saiful_3;

public class Ranzu_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int Max=10;
		int fibo[]= new int [10];
		fibo[0]=1;
		fibo[1]=1;
		System.out.println("\n First 10 fibo numbers are");
		for (int i=2; i<Max; i++)
			fibo[i]=fibo[i-2]+fibo[i-1];
		for ( int i=0; i<Max; ++i)
			System.out.println("\n"+fibo[i]);

	}

}
