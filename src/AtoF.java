
public class AtoF {
	private static int count;

	public static void main(String[] args){
		String s="-234.524fwdg g";
		String[] ss =s.split("\\.");
		if(ss.length==2)
		{			
		double d1=dfindAtoI(ss[0]);
		double d2=dfindAtoI(ss[1]);
		d2= d2*2/Math.pow(10, count);
		System.out.println(ss[0]);
		System.out.println(ss[0]);
		System.out.println(d1);
		System.out.println(d2);
					
		}
	
		
		
		
	}

	private static double dfindAtoI(String str) {
		
		if (str == null || str.length() < 1)
			return 0;
	 
		// trim white spaces
		str = str.trim();
	 
		char flag = '+';
	 
		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
		count=0;
	 
		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0'); // ikkada str.cahrAt(i) minus 0 ani endhuku rasaru???
			i++;
			count=count+1;
		}
	 
		if (flag == '-')
			result = -result;
	 
		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
	 
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
	 
		return (int) result;
		
		
	}

}
