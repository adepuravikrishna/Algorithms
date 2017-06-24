
public class CoinChange {
	public static long makeChange(int[] coins,int total)
	{
		
		return makeChangeHelper(coins,total,0);
		
	}

	private static long makeChangeHelper(int[] coins, int total, int index) {
		// TODO Auto-generated method stub
		int moneyWithcoin=0;
		while(moneyWithcoin<total){
			
		}
		
		return 0;
	}
	public static void main(String[] args){
		int coins[] =  {9, 6, 5, 1};
	    //   int m = coins.length;
	       int V = 11;
	       System.out.println("Minimum coins required is "+ makeChange(coins,  V) );
		
	}

}
