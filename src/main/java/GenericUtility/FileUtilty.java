package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class FileUtilty {
	/**
	 * To fetch common data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fileinputstream = new FileInputStream("./src/test/resources/commondata.properties.txt");
		Properties properties = new Properties();
		properties.load(fileinputstream);
		String data = properties.getProperty(key);
		return data;
	}
}
