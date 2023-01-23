package ViaProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Shashank
 *
 */

public class ReadData {
	/**
	 * This method helps us to read data from property file
	 * 
	 * @param the associated key name in property file
	 * @return
	 */
	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./testData/configration.properties"));
			properties = new Properties();
			properties.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);

	}

	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./testData/Test.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

	}
	public static LocalDateTime fromExcelWithDateTime(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./testData/Test.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue();

	}
}
