
public class subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {2,5,6,7,8,9,10};
		int []arr2= {2,50,6};
		
		int flag=0;
		for(int i=0;i<arr2.length;i++) {
			 flag=0;
			for(int j=0;j<arr1.length;j++)
				if(arr2[i]==arr1[j])flag=1;
			
			if(flag==0)break;
		}
		if(flag==1)
		System.out.println("arr2 is subarray of arr1");
		
		else
			System.out.println("arr2 is not subarray of arr1");
	}

}
