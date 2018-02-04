// singleton design pattern
public class SingleStudent {
	
	private static SingleStudent instance = new SingleStudent();
	
	private SingleStudent() {}
	
	public static SingleStudent returnInstance() {
		return instance;
	}
	
	public void printMessage() {
		System.out.println("Print message method called in the class SingleStudent");
	}
}
