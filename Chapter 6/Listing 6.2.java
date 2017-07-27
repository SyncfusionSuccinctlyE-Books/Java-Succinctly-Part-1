public class MainClass {
	public static void main(String[] args) {
		
		// Causing overflow of a byte:
		byte myByte = 127;
		myByte++; // Results in -128
		System.out.println("Byte says 127+1=" + myByte);
		myByte = -128;
		myByte--; // Results in 127
		System.out.println("Byte says -128-1=" + myByte);
		
		// Causing overflow of a short 
		short myShort = 32767;	// This is the maximum for short!
		System.out.println("Short is " + myShort + " before ++.");
		myShort++;
		System.out.println("Short is " + myShort + " after ++.");
		myShort--;
		System.out.println("Short is " + myShort + " after --.");
	}
}