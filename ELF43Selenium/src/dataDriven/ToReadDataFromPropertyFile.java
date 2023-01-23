package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1: Creating Input stream type oject
		File abspath = new File("./testData/SampleScriptData.properties");
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2: Creating object of File type
		Properties properties = new Properties();
		properties.load(fis);
		
		//Step 3: Read methods
		properties.get(fis);

	}

}
