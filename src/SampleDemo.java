
class SampleDemo implements Runnable {
	private Thread T;
	private String thredName;
	SampleDemo(String threadName){
		this.thredName=threadName;
		
	}
	public void start(){
		if(T==null){
			T= new Thread(this,thredName);
			T.start();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			System.out.print(thredName);
		
	}

}


