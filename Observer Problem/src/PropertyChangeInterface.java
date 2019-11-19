import java.util.EventListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public interface PropertyChangeInterface extends EventListener{

	default void propertyChange(PropertyChangeEvent evt) {
		
	}
}
