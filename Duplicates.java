
 class duplicat{
	public void duplicates(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,1,5,2};
		duplicat d=new duplicat();
		d.duplicates(arr);
	}

}
