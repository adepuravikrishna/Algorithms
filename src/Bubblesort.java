
public class Bubblesort {

	int[] array = new int[10];

	public int[] printArray() {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20 + 1);
			System.out.print("[" + array[i] + "]  ");
		}
		return array;
	}

	public int[] bubbleSort(int[] array) {
		int temp=0;
		int n=array.length;
		System.out.println("");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				if (array[j-1] > array[j]) {
					 temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;

				}

			}
			
		}
		return array;
	}

	public static void main(String[] args) {
		Bubblesort b = new Bubblesort();
		int[] array=b.printArray();
		array= b.bubbleSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print("[" + array[i] + "]  ");
		}
	}

}
