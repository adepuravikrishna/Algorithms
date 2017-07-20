
public class BruitforceComparison {
	public static void main(String[] args){
		int a[]={3,4,2,1,8,0};
		int b[]={8,1,2};
		
		for(int i=0;i<a.length;i++){
			System.out.println("Running outer loop with element  "+ a[i]);
			for(int j=0;j<b.length;j++){
				System.out.println("                    Running inner loop with element "+b[j]);
				if(a[i]==b[j]){
					System.out.println("Match found yo and position in A[] array at index "+i);
					
				}
				
			}
		}
	}

}
