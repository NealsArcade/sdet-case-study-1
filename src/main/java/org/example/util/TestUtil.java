package org.example.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.example.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 10;

	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\java\\org\\example\\testdata\\Automation_testData.xlsx";

	static XSSFWorkbook book;
	static XSSFSheet sheet;

	// methods

	public Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
        DataFormatter dataFormatter = new DataFormatter();
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {

			book = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                Cell cell = sheet.getRow(i).getCell(k);
				data[i][k] = dataFormatter.formatCellValue(cell);
			}
		}
		return data;
	}

	public Object[][] convertToMapData(Object[][] data) {
		Object[][] mapData = new Object[data.length - 1][1];
		// Extract headers
		String[] headers = new String[data[0].length];
		for (int i = 0; i < data[0].length; i++) {
			headers[i] = data[0][i].toString();
		}
		for (int i = 1; i < data.length; i++) {
			Map<String, String> rowMap = new HashMap<>();
			for (int j = 0; j < headers.length; j++) {
				rowMap.put(headers[j], data[i][j].toString());
			}
			mapData[i - 1][0] = rowMap;
		}
		return mapData;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
	}

}
