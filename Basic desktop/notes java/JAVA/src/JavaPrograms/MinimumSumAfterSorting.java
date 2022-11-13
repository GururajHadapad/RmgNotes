package JavaPrograms;

public class MinimumSumAfterSorting {
	public static void main(String[] args) {
		int[] a= {3,8,1,4,10};//1,3,4,8,10
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				
				if(a[i]>a[j]) { //sum of first 3 number
					//int (a[i]<a[j]) maximum sum of last 3 number
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
//		//to add sum of num
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		}
	}
	

