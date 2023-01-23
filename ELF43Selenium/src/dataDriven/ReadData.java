package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static String fromPropertyFile(String key) {
		 FileInputStream fis=null;
		try {
			fis = new FileInputStream("./testData/configuration.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);

	}
	public static String fromExcelFile(String sheetName,int row,int col) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("./testData/SeleniumDataProvider.xlsx");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return sheetName;
	}

}
