package RbtPrograms;

public class jaggedArray {

	public static void main(String[] args) {
	
		
		int a[][]=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=i+j;
				System.out.println(a[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
