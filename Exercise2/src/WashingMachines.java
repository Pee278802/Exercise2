
public class WashingMachines {

	String brand;
	String colour;
	double weight;
	int waterLevel;
	
	void onOff() {
	boolean on = true;
	System.out.println("The washing machine is on!");

	}
	
	void printWashingMachines(String b, String c, double w, int wl) {
		System.out.println("Brand : " + b);
		System.out.println("Colour : " + c);
		System.out.println("Weight : " + w +"kg");
		System.out.println("Water Level : " + wl + "liter");
	}
	
	void printTime(int t1, int t2, int t3, int t4) {
		System.out.println("timer:");
		System.out.println(t1 + "Minutes");
		System.out.println(t2 + "Minutes");
		System.out.println(t3 + "Minutes");
		System.out.println(t4 + "Minutes");
	}
	
	void printMode(String m1, String m2 , String m3) {
		System.out.println("mode1:" +  m1);
		System.out.println("mode2:" +  m2);
		System.out.println("mode3:" +  m3);
	}
	
}

 