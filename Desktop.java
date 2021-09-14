package week3.day2;

public class Desktop implements Software,Hardware {
	public void desktopModel() {
		System.out.println("The Desktop Model: ASUS Notebook");
	}

	public void softwareResources() {
		System.out.println("The Software Resources are OS, Cloud Computing, Network Functionalities,");
		
	}

	public void hardwareResources() {
		System.out.println("The Hardware Resources are Disk, Printer, Monitor");	
		
	}
	public static void main(String[] args) {
		 
		//Abstract class cannot be instantiated
		//We cannot create an object for a class when it is declared as abstract
		
		Desktop deskObj = new Desktop();
		deskObj.desktopModel();
		deskObj.hardwareResources();
		deskObj.softwareResources();
		System.out.println(hardware);
		System.out.println(hardwarePart1);
		System.out.println(hardwarePart2);
		
	}

}
