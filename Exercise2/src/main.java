public class main {

	public static void main(String[] args) {
		WashingMachines a = new WashingMachines();
		a.brand = "Toshiba";
		a.colour = "Black";
		a.weight = 41;
		a.waterLevel = 80;
		System.out.println("Washing Machine 1: ");
		System.out.println(a.brand);
		System.out.println(a.colour);
		System.out.println(a.weight + " kg");
		System.out.println(a.waterLevel + "Liter");
		a.onOff();
		
		System.out.println();
		
		WashingMachines b = new WashingMachines();
		b.brand = "LG";
		b.colour = "White";
		b.weight = 50;
		b.waterLevel = 100;
		System.out.println("Washing Machine 2: ");
		System.out.println(b.brand);
		System.out.println(b.colour);
		System.out.println(b.weight + " kg");
		System.out.println(b.waterLevel + "Liter");
		b.onOff();

	}


}
