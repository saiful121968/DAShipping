package saiful_3;

public class Ranzu_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Matrix1[][] = {{10,2,3}, {41,5,6}, {7, 8,13}};
		 int Matrix2[][] = {{9,18,7}, {6,15,4}, {31, 12,1}};
		 int Matrix3[][] = new int[3][3];
		 int x, y;
		 
		 System.out.println("Elements of the Matrix1 is:");
		 for(x=0; x<3; x++)	
		  {
		  for(y=0; y<3; y++)
		  System.out.print(Matrix1[x][y]+ "  ");
		  System.out.println();
		  }
		 System.out.println("Elements of the Matrix2 is:");
		 for(x=0; x<3; x++)
		  {
		  for(y=0; y<3; y++)
		  System.out.print(Matrix2[x][y]+ "  ");
		  System.out.println();
		  }
		  for( x=0; x<3; x++)
		  {		// Addition done here
		  for(y=0; y<3; y++)
		   Matrix3[x][y] =  Matrix1[x][y]+Matrix2[x][y];
		  }
		 System.out.println("Addition of the Matrices is: ");
		 for(x=0; x<3; x++)
		  {
		  for(y=0; y<3; y++)
		  System.out.print(Matrix3[x][y]+ "  ");
		  System.out.println();
		  }

	}

}
