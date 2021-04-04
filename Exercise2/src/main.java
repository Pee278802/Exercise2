public class main {

	public static void main(String[] args) {
		WashingMachines a = new WashingMachines();
		//a.brand = "Toshiba";
		//a.colour = "Black";
		//a.weight = 41;
		//a.waterLevel = 80;
		System.out.println("Washing Machine 1 ");
		//System.out.println(a.brand);
		//System.out.println(a.colour);
		//System.out.println(a.weight + " kg");
		//System.out.println(a.waterLevel + "Liter");
		a.printWashingMachines("Toshiba", "Black" , 41 , 80);
		a.onOff();
		System.out.println();
		a.printTime(30, 50, 90, 100);
		System.out.println();
		a.printMode("Spin", "Quick", "Regular");
		
		System.out.println();
		System.out.println();
		
		WashingMachines b = new WashingMachines();
		//b.brand = "LG";
		//b.colour = "White";
		//b.weight = 50;
		//b.waterLevel = 100;
		System.out.println("Washing Machine 2 ");
		//System.out.println(b.brand);
		//System.out.println(b.colour);
		//System.out.println(b.weight + " kg");
		//System.out.println(b.waterLevel + "Liter");
		b.printWashingMachines("LG", "White" , 50 , 100);
		b.onOff();
		System.out.println();
		b.printTime(25, 45 , 60, 90);
		System.out.println();
		a.printMode("Heavy Cycle", "Fast", "Synthetics Cycle");

	}


}
