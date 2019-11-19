import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

//This class will be the changeable bean for the property change listener
public class PropertyChangable {
	private String tapText;
	private final PropertyChangeSupport support = new PropertyChangeSupport(this);
	
	//Adds  Property Change Listeners
	public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
	
	 public void removePropertyChangeListener(PropertyChangeListener listener) {
	        support.removePropertyChangeListener(listener);
	 }
	 
	 public String getTaps(){
		 return this.tapText;
	 }
	 
	    public void setTaps(String newValue) {
	        String oldValue = this.tapText;
	        this.tapText = newValue;
	        // The parameter values of firePropertyChange method

	        support.firePropertyChange("Taps", oldValue, newValue);
	    }
	 
	 
}
