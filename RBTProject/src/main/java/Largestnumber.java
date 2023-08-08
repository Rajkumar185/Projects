
public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {78,35,2,133};
		int size=number.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			
		}
		System.out.println("Second largest number in an array is:"+number[size-2]);
		

	}

}
