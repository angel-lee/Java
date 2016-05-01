class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed = SLOW;
	boolean on = false;
	double radius = 5;
	String color = "white";
	
	public Fan() {
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isOn() {
		retur on;
	}
	
	public void setOn(boolean on) {
		this.on = on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Speed: " + speed + "\n"
		+ "Color: " + color + "\n"
		+ "Radius: " + radius + "\n"
		+ ((on) ? "Fan is on" : "Fan is off");
	}
}

public class Exercise7_2 {
	public static void main(String[] args) {
		Fan one = new Fan();
		one.setSpeed(Fan.FAST);
		one.setColor("yellow");
		one.setRadius(10);
		one.setOn(true);
		
		Fan two = new Fan();
		two.setSpeed(Fan.MEDIUM);
		two.setColor("blue");
		two.setRadius(5);
		two.setOn(false);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
	}
}