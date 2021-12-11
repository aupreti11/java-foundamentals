package OOPSConcept;

public class StaticVariable1 {
	String name;
	static String color;
	
	public StaticVariable1(String name, String color) {
		this.name=name;
		this.color=color;
	}
	
	public void info() {
		System.out.println("name" + name);
		System.out.println("color" + color);
		System.out.println("StaticVariable1 color" + StaticVariable1.color);
	}
}
