public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,2,3,4,5,7,8};
		quickSort q=new quickSort();
        
		q.sort(0,arr.length-1,arr);
        
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public void sort(int low,int high,int[] arr) {
		// TODO Auto-generated method stub
		
		
		if(low<high) {
			int mid=partition(low,high,arr);
             sort(low,mid-1,arr);
				sort(mid+1,high,arr);
              
			}
			
		}

	public int partition(int low, int high, int [] arr) {
		// TODO Auto-generated method stub
		int pivot=arr[low];
		int i=low; 
		int j=high;
		while(i<j) {
			
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			}
			
		}
		int temp=arr[j];
		arr[j]=pivot;
		arr[low]=temp;
		return j;
		
	}
		
		
}