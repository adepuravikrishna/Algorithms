
public class SetDataStructureTest {
	private static SetDataStructure setds;
	
	public static void main(String... args){
		setds = new SetDataStructure();
		Object obj= new Object();		
		setds.add(obj);
		//Test for null
		setds.add(null);
		//Test for duplicates
		setds.add(obj);
		//Test for size
		setds.add("");
		
	}

}
