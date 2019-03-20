class MatrixMultiplication{
	public static void main(String args[]){
		int a[][]={{1,2,1},{2,3,2},{4,3,0}};    
		int b[][]={{2,1,1},{2,4,3},{3,5,2}}; 
		int c[][]=new int[3][3];
		System.out.println("First Matrix:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second Matrix:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Resulted Matrix:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}