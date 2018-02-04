
public class FactoryPatternDemo {
	public static void main(String[] args) {
		EngineerFactory engineerFactory = new EngineerFactory();
		Engineer firstEngineer = engineerFactory.createEngineer("computer");
		Engineer secondEngineer = engineerFactory.createEngineer("mechanical");
		Engineer thirdEngineer = engineerFactory.createEngineer("electrical");
		
		firstEngineer.printType();
		secondEngineer.printType();
		thirdEngineer.printType();
	}
}
