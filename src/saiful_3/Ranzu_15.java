package saiful_3;

public class Ranzu_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Mark[][]=new double [4][4];
		Mark[0][0]=23.5;
		Mark[0][1]=25;
		Mark[0][2]=10;
		Mark[0][3]=11;
		
		Mark[1][0]=9;
		Mark[1][1]=78;
		Mark[1][2]=75;
		Mark[1][3]=80;
		
		Mark[2][0]=12;
		Mark[2][1]=14;
		Mark[2][2]=69;
		Mark[2][3]=32;
		
		Mark[3][0]=65.6;
		Mark[3][1]=90;
		Mark[3][2]=1;
		Mark[3][3]=45.3;
		
		int Love=Mark.length;
		
		System.out.println("Elements of the matrix is :");
		
		for ( int m=0; m<Love;m++){
			for ( int n=0; n<Love; n++) {
				System.out.println(Mark[m][n]+"\t");}{
					System.out.println();}
		}

	}

}
