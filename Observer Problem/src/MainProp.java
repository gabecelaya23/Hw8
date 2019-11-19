
public class MainProp {

	public static void main(String[] args) {
		//Create an observer window and a controller window.
		//The controller window will be observed.
		PropWindow pin = new PropWindow();
		new PropController(pin);
	}

}
