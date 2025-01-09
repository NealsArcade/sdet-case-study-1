package org.example.testcases;

import org.example.base.TestBase;
import org.example.pages.pageRegister;
import org.example.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestRegisterPage extends TestBase {

    TestUtil objTestUtil = new TestUtil();
    pageRegister register;
    private final String pageUrl = "/Register.html";

    //constructor
    public TestRegisterPage() throws Exception {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        register = new pageRegister(driver);
    }

    @DataProvider(name = "registerTestData")
    public Object[][] getRegisterTestData() {
        String sheetName = "RegisterPage";
        return convertToMapData(objTestUtil.getTestData(sheetName));
    }

    private Object[][] convertToMapData(Object[][] data) {
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

    @Test(priority = 0)
    public void verifyTitle() {
        register.verifyTitle().verifyPageUrl();
    }

    @Test(dataProvider = "registerTestData")
    public void testEmailFunctionality(Map<String, String> testData) {

        register = new pageRegister(driver, testData);
        register.fillAndSubmit();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
