package eclipse1;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		byte b = 8;
		short s = 22;
		double d = 1.2;
		int i = 1;
		long l = 1231L;
		float f = 0.1654f;
		char c = 'c';
		boolean bo = true;
		String str = "Hello World";
		
		
		
		
		System.out.println("Byte = " + Byte.MAX_VALUE);
		System.out.println("Short = " + Short.MAX_VALUE);
		System.out.println("Integer = " + Integer.MAX_VALUE);
		System.out.println("Long  = " + Long.MAX_VALUE);
		System.out.println("Float = " + Float.MAX_VALUE);
		System.out.println("Double = " + Double.MAX_VALUE);
		System.out.println("Character = " + Character.MAX_VALUE);
		System.out.println("Boolean = " + Boolean.TRUE);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Long  = " + Long.MIN_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Character = " + Character.MIN_VALUE);
		System.out.println("Boolean = " + Boolean.FALSE);

		System.out.println();
		System.out.println();
		
		int arr [] = new int[10];
		int j;
		int x = 4;
		for (j = 0; j < arr.length-1; j++) {
			arr[j] = x + j;
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		
		for (int k = 1; k < arr.length; k++) {
			if (arr[k]>max) {
				max = arr[k];
			}
			if (arr[k]<min) {
				min = arr[k];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
