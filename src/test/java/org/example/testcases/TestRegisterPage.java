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


    @Test(priority = 0)
    public void verifyTitle() {
        register.verifyTitle().verifyPageUrl();
    }

    @DataProvider(name = "registerTestData")
    public Object[][] getRegisterTestData() {
        String sheetName = "RegisterPage";
        return objTestUtil.convertToMapData(objTestUtil.getTestData(sheetName));
    }

    @Test(dataProvider = "registerTestData")
    public void testRegisterPageFunctionality(Map<String, String> testData) {

        register = new pageRegister(driver, testData);
        register.fillAndSubmit();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
