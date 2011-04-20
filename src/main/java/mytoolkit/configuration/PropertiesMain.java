package mytoolkit.configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;


public class PropertiesMain {
	public static void main(String[] args) throws ConfigurationException{
		PropertiesConfiguration config = new PropertiesConfiguration("a.properties");
		config.setProperty("colors.background", "#000000");
		config.save();
		config.save("usergui.backup.properties");//save a copy
		Integer integer = config.getInteger("window.width",1);
	}

}
