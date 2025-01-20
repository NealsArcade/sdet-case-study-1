package org.example.testcases;

import org.example.base.TestBase;
import org.example.pages.PageRegister;
import org.example.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestRegisterPage extends TestBase {

    TestUtil objTestUtil = new TestUtil();
    PageRegister register;

    //constructor
    public TestRegisterPage() throws Exception {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        register = new PageRegister(driver);
    }


    @Test(priority = 0)
    public void verifyTitle() {
        register.verifyTitle().verifyPageUrl();
    }

    @DataProvider(name = "registerTestData")
    public Object[][] getRegisterTestData() {
        String sheetName = "RegisterPage";
        return objTestUtil.getTestData(sheetName);

    }


    @Test(dataProvider = "registerTestData")

    public void testRegisterPageFunctionality(String firstName, String lastName, String address, String emailAddress, String phone, String gender,
                                              String hobbies, String languages, String skills, String country, String year, String month, String day, String password) {



        //convert arguments to Map<String,String>
        Map<String, String> testData = new HashMap<>();
        testData.put(register.FIRST_NAME_KEY, firstName);
        testData.put(register.LAST_NAME_KEY, lastName);
        testData.put(register.ADDRESS_KEY, address);
        testData.put(register.EMAIL_ADDRESS_KEY, emailAddress);
        testData.put(register.PHONE_KEY, phone);
        testData.put(register.GENDER_KEY, gender);
        testData.put(register.HOBBIES_KEY, hobbies);
        testData.put(register.LANGUAGES_KEY, languages);
        testData.put(register.SKILLS_KEY, skills);
        testData.put(register.COUNTRY_KEY, country);
        testData.put(register.YEAR_KEY, year);
        testData.put(register.MONTH_KEY, month);
        testData.put(register.DAY_KEY, day);
        testData.put(register.PASSWORD_KEY, password);

        register = new PageRegister(driver, testData);
        register.fillAndSubmit();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}