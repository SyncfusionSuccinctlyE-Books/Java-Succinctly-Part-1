public class Insect extends Animal {
	
	public boolean antennas; 
	public String skeleton;
	public int numberOfLegs;
	public boolean wings;
	
	public Insect(){
		super();
		antennas = true;
		skeleton = "Exosketon";
		numberOfLegs = 6;
		wings = true;
	}

	public void Print() {
		System.out.println("Antennas: " + antennas + 
				" Skeleton: " + skeleton + 
				" Number of Legs: " + numberOfLegs +
				" Wings: " + wings + 
				" Voluntary Motion: " + voluntaryMotion + 
				" Requires Food: " + requiresFood);
	}
}