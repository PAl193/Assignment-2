
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,7,8,8,0,9,10};
		int min_idx=0;
		for(int i=0;i<arr.length;i++) {
			min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				 
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
