package org.example.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.example.base.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestUtil extends TestBase{

	private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 10;

	public static final String TESTDATA_SHEET_PATH = System.getProperty("user.dir")
			+ "\\src\\main\\java\\org\\example\\testdata\\Automation_testData.xlsx";


	// methods
	public Object[][] getTestData(String sheetName) {
		DataFormatter dataFormatter = new DataFormatter();

		try (FileInputStream file = new FileInputStream(TESTDATA_SHEET_PATH);
			 Workbook book = new XSSFWorkbook(file)) {

			Sheet sheet = book.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();

			Object[][] data = new Object[rowCount][colCount];

			for (int i = 1; i <= rowCount; i++) { // Skip the header row
				Row row = sheet.getRow(i);
				for (int k = 0; k < colCount; k++) {
					Cell cell = row.getCell(k);
					data[i - 1][k] = (cell != null) ? dataFormatter.formatCellValue(cell) : "";
				}
			}

			return data;
		} catch (FileNotFoundException e) {
			log.error("File not found.! {}",e.getMessage());
		} catch (IOException e) {
			log.error("IO Exception {}", e.getMessage());
		}

		return new Object[0][0];
	}



	public static Map<String,String> convertToMapData(Object[][] data) {
		// Create an array of maps with the same number of rows minus the header row
		Object[] mapData = new Object[data.length - 1];
		Map<String, String> rowMap = new HashMap<>();
		// Extract headers
		String[] headers = new String[data[0].length];
		for (int i = 0; i < data[0].length; i++) {
			headers[i] = data[0][i].toString();
		}

		// Convert data rows to maps
		for (int i = 1; i < data.length; i++) {
			for (int j = 0; j < headers.length; j++) {
				rowMap.put(headers[j], data[i][j].toString());
			}
			mapData[i - 1] = rowMap; // Store the map in the corresponding position
		}

		return rowMap;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
	}

}
