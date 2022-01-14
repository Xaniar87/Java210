
public interface Drivable {
	public static final int MAX_SPPED=150;
	
	public int numWheele(); 
	
	public boolean changeGear(int toGear);
	
	public int getSpeed();
	
	public int setSpeed(int speed);


}
