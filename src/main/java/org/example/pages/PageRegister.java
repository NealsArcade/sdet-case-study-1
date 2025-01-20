package org.example.pages;


import java.lang.invoke.MethodHandles;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.example.base.TestBase;
import org.example.util.TestUtil;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageRegister extends TestBase {

    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private Map<String, String> data;
    private WebDriver driver;

    private static final String PAGE_LOADED_TEXT = "";
    private static final String PAGE_URL = "/Register.html";
    private static final String PAGE_TITLE = "Register";
    private static final String MALE_VALUE = "Male";
    private static final String FEMALE_VALUE = "FeMale";

    @FindBy(css = "textarea[ng-model='Adress']")
    @CacheLookup
    private WebElement address;

    @FindBy(id = "secondpassword")
    @CacheLookup
    private WebElement confirmPassword;

    @FindBy(id = "countries")
    @CacheLookup
    private WebElement country;

    @FindBy(id = "checkbox1")
    @CacheLookup
    private WebElement cricket;

    @FindBy(id = "yearbox")
    @CacheLookup
    private WebElement dateOfBirth1;

    @FindBy(css = "select[ng-model='monthbox']")
    @CacheLookup
    private WebElement dateOfBirth2;

    @FindBy(id = "daybox")
    @CacheLookup
    private WebElement dateOfBirth3;

    @FindBy(css = "input[ng-model='EmailAdress']")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(id = "Skills")
    @CacheLookup
    private WebElement skills;


    @FindBy(name = "radiooptions")
    @CacheLookup
    private List<WebElement> gender;


    @FindBy(css = "input[ng-model='FirstName']")
    @CacheLookup
    private WebElement firstName;

    @FindBy(css = "input[ng-model='LastName']")
    @CacheLookup
    private WebElement lastName;

    @FindBy(id = "checkbox3")
    @CacheLookup
    private WebElement hockey;

    @FindBy(id = "checkbox2")
    @CacheLookup
    private WebElement movies;



    @FindBy(id = "firstpassword")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "input[ng-model='Phone']")
    @CacheLookup
    private WebElement phone;

    @FindBy(id = "imagesrc")
    @CacheLookup
    private WebElement photo;

    @FindBy(id = "Button1")
    @CacheLookup
    private WebElement refresh;

    @FindBy(id = "country")
    @CacheLookup
    private WebElement selectCountry;

    @FindBy(id = "submitbtn")
    @CacheLookup
    private WebElement submit;

    public static final String FIRST_NAME_KEY = "firstName";
    public static final String LAST_NAME_KEY = "lastName";
    public static final String ADDRESS_KEY = "address";
    public static final String EMAIL_ADDRESS_KEY = "emailAddress";
    public static final String PHONE_KEY = "phone";
    public static final String GENDER_KEY = "gender";
    public static final String HOBBIES_KEY = "hobbies";
    public static final String LANGUAGES_KEY = "languages";
    public static final String SKILLS_KEY = "skills";
    public static final String COUNTRY_KEY = "country";
    public static final String YEAR_KEY = "year";
    public static final String MONTH_KEY = "month";
    public static final String DAY_KEY = "day";
    public static final String PASSWORD_KEY = "password";


    public PageRegister() {
    }

    public PageRegister(WebDriver driver) {
        this();
        this.driver = driver;
        driver.get(prop.getProperty("url") + PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public PageRegister(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    /**
     * Click on Refresh Button.
     *
     * @return the Register class instance.
     */
    public PageRegister clickRefreshButton() {
        refresh.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the Register class instance.
     */
    public PageRegister clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every field in the page.
     *
     * @return the Register class instance.
     */
    public PageRegister fill() {
        setFullName1TextField();
        setFullName2TextField();
        setAddressTextareaField();
        setEmailAddressEmailField();
        setPhoneTelField();
        setGenderRadioButton();
        setHobbiesCheckBox();
        setSkillsDropDownListField();
        setSelectCountryDropDownListField();
        setDateOfBirth1DropDownListField();
        setDateOfBirth2DropDownListField();
        setDateOfBirth3DropDownListField();
        setPasswordPasswordField();
        setConfirmPasswordPasswordField();
        return this;
    }


    /**
     * Fill every field in the page and submit it to target page.
     *
     * @return the Register class instance.
     */
    public PageRegister fillAndSubmit() {
        fill();
        return clickSubmitButton();
    }

    /**
     * Set default value to Address Textarea field.
     *
     * @return the Register class instance.
     */
    public PageRegister setAddressTextareaField() {
        return setAddressTextareaField(data.get(ADDRESS_KEY));
    }

    /**
     * Set value to Address Textarea field.
     *
     * @return the Register class instance.
     */
    public PageRegister setAddressTextareaField(String addressValue) {
        address.sendKeys(addressValue);
        return this;
    }

    /**
     * Set default value to Confirm Password Password field.
     *
     * @return the Register class instance.
     */
    public PageRegister setConfirmPasswordPasswordField() {
        return setConfirmPasswordPasswordField(data.get(PASSWORD_KEY));
    }

    /**
     * Set value to Confirm Password field.
     *
     * @return the Register class instance.
     */
    public PageRegister setConfirmPasswordPasswordField(String confirmPasswordValue) {
        confirmPassword.sendKeys(confirmPasswordValue);
        return this;
    }

    /**
     * Set default value to Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setCountryDropDownListField() {
        return setCountryDropDownListField(data.get(COUNTRY_KEY));
    }

    /**
     * Set value to Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setCountryDropDownListField(String countryValue) {
        new Select(country).selectByVisibleText(countryValue);
        return this;
    }


    public PageRegister setHobbiesCheckBox() {
        return setHobbiesCheckBox(data.get(HOBBIES_KEY));
    }

    public PageRegister setHobbiesCheckBox(String hobbies) {
        String[] hobbyArray = hobbies.split(",");
        for (String hobby : hobbyArray) {
            if (hobby.equalsIgnoreCase("Cricket")) {
                setCricketCheckboxField();
            }
            if (hobby.equalsIgnoreCase("Movies")) {
                setMoviesCheckboxField();
            }
            if (hobby.equalsIgnoreCase("Hockey")) {
                setHockeyCheckboxField();
            }
        }
        return this;
    }

    /**
     * Set Cricket Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister setCricketCheckboxField() {
        if (!cricket.isSelected()) {
            cricket.click();
        }
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth1DropDownListField() {
        return setDateOfBirth1DropDownListField(data.get(YEAR_KEY));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).selectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth2DropDownListField() {
        return setDateOfBirth2DropDownListField(data.get(MONTH_KEY));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).selectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth3DropDownListField() {
        return setDateOfBirth3DropDownListField(data.get(DAY_KEY));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).selectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Set default value to Email Address Email field.
     *
     * @return the Register class instance.
     */
    public PageRegister setEmailAddressEmailField() {
        return setEmailAddressEmailField(data.get(EMAIL_ADDRESS_KEY));
    }

    /**
     * Set value to Email Address Email field.
     *
     * @return the Register class instance.
     */
    public PageRegister setEmailAddressEmailField(String emailAddressValue) {
        emailAddress.sendKeys(emailAddressValue);
        return this;
    }

    public PageRegister setGenderRadioButton() {
        return setGenderRadioButton(data.get(GENDER_KEY));
    }

    public PageRegister setGenderRadioButton(String gender) {

        if (gender.equalsIgnoreCase(MALE_VALUE)) {
            setGenderMaleRadioButtonField();
        } else if (gender.equalsIgnoreCase(FEMALE_VALUE)) {
            setGenderFemaleRadioButtonField();
        }

        return this;
    }


    /**
     * Set default value to Female Radio Button field.
     *
     * @return the Register class instance.
     */
    public PageRegister setGenderMaleRadioButtonField() {
        for (WebElement el : gender) {
            if (el.getDomProperty("value").equals(MALE_VALUE)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Female Radio Button field.
     *
     * @return the Register class instance.
     */
    public PageRegister setGenderFemaleRadioButtonField() {
        for (WebElement el : gender) {
            if (el.getDomProperty("value").equals(FEMALE_VALUE)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public PageRegister setFullName1TextField() {
        return setFullName1TextField(data.get(FIRST_NAME_KEY));
    }

    /**
     * Set value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public PageRegister setFullName1TextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public PageRegister setFullName2TextField() {
        return setFullName2TextField(data.get(LAST_NAME_KEY));
    }

    /**
     * Set value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public PageRegister setFullName2TextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set Hockey Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister setHockeyCheckboxField() {
        if (!hockey.isSelected()) {
            hockey.click();
        }
        return this;
    }

    /**
     * Set Movies Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister setMoviesCheckboxField() {
        if (!movies.isSelected()) {
            movies.click();
        }
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the Register class instance.
     */
    public PageRegister setPasswordPasswordField() {
        return setPasswordPasswordField(data.get(PASSWORD_KEY));
    }

    /**
     * Set value to Password field.
     *
     * @return the Register class instance.
     */
    public PageRegister setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Phone Tel field.
     *
     * @return the Register class instance.
     */
    public PageRegister setPhoneTelField() {
        return setPhoneTelField(data.get(PHONE_KEY));
    }

    /**
     * Set value to Phone Tel field.
     *
     * @return the Register class instance.
     */
    public PageRegister setPhoneTelField(String phoneValue) {
        phone.sendKeys(phoneValue);
        return this;
    }

    /**
     * Set Photo File field.
     *
     * @return the Register class instance.
     */
    public PageRegister setPhotoFileField() {
        return this;
    }

    /**
     * Set default value to Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setSelectCountryDropDownListField() {
        return setSelectCountryDropDownListField(data.get(COUNTRY_KEY));
    }

    /**
     * Set value to Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setSelectCountryDropDownListField(String selectCountryValue) {
        new Select(selectCountry).selectByVisibleText(selectCountryValue);
        return this;
    }

    /**
     * Set default value to Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setSkillsDropDownListField() {
        return setSkillsDropDownListField(data.get(SKILLS_KEY));
    }

    /**
     * Set value to Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister setSkillsDropDownListField(String skillsValue) {
        new Select(skills).selectByVisibleText(skillsValue);
        return this;
    }

    /**
     * Unset default value from Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetCountryDropDownListField() {
        return unsetCountryDropDownListField(data.get(COUNTRY_KEY));
    }

    /**
     * Unset value from Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetCountryDropDownListField(String countryValue) {
        new Select(country).deselectByVisibleText(countryValue);
        return this;
    }

    /**
     * Unset Cricket Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetCricketCheckboxField() {
        if (cricket.isSelected()) {
            cricket.click();
        }
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth1DropDownListField() {
        return unsetDateOfBirth1DropDownListField(data.get(YEAR_KEY));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).deselectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth2DropDownListField() {
        return unsetDateOfBirth2DropDownListField(data.get(MONTH_KEY));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).deselectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth3DropDownListField() {
        return unsetDateOfBirth3DropDownListField(data.get(DAY_KEY));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).deselectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Unset Hockey Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetHockeyCheckboxField() {
        if (hockey.isSelected()) {
            hockey.click();
        }
        return this;
    }

    /**
     * Unset Movies Checkbox field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetMoviesCheckboxField() {
        if (movies.isSelected()) {
            movies.click();
        }
        return this;
    }

    /**
     * Unset default value from Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetSelectCountryDropDownListField() {
        return unsetSelectCountryDropDownListField(data.get(COUNTRY_KEY));
    }

    /**
     * Unset value from Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetSelectCountryDropDownListField(String selectCountryValue) {
        new Select(selectCountry).deselectByVisibleText(selectCountryValue);
        return this;
    }

    /**
     * Unset default value from Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetSkillsDropDownListField() {
        return unsetSkillsDropDownListField(data.get(SKILLS_KEY));
    }

    /**
     * Unset value from Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public PageRegister unsetSkillsDropDownListField(String skillsValue) {
        new Select(skills).deselectByVisibleText(skillsValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Register class instance.
     */
    public PageRegister verifyPageLoaded() {
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getPageSource().contains(PAGE_LOADED_TEXT));
        } catch (TimeoutException | NullPointerException e) {
            log.error("Expected Page load text to contain: {} but was: {}", PAGE_LOADED_TEXT,driver.getTitle());
        }
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the Register class instance.
     */
    public PageRegister verifyPageUrl() {
        log.info("Verifying page URL contains: {}", PAGE_URL);
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getCurrentUrl().contains(PAGE_URL));
        } catch (TimeoutException | NullPointerException e) {
            throw new AssertionError("Expected URL to contain: " + PAGE_URL + " but was: " + driver.getCurrentUrl());
        }
        log.info("Page URL verification successful: {}", PAGE_URL);
        return this;

    }

    /**
     * Verify that current page title to matches the expected title.
     *
     * @return the Register class instance.
     */
    public PageRegister verifyTitle() {
        log.info("Verifying page title contains: {}", PAGE_TITLE);
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getTitle().contains(PAGE_TITLE));
        } catch (TimeoutException | NullPointerException e) {
            throw new AssertionError("Expected Title to contain: " + PAGE_TITLE + " but was: " + driver.getTitle());
        }
        log.info("Page title URL verification successful: {}", PAGE_TITLE);
        return this;

    }
}
