package org.example.pages;


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

public class pageRegister extends TestBase{
    private static final Logger logger = LoggerFactory.getLogger(pageRegister.class);
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = (int) TestUtil.PAGE_LOAD_TIMEOUT;

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

    private final String maleValue = "Male";

    private final String femaleValue = "FeMale";

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

    private final String pageLoadedText = "";

    private final String pageUrl = "/Register.html";
    private final String pageTitle = "Register";

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



    public pageRegister() {
    }

    public pageRegister(WebDriver driver) {
        this();
        this.driver = driver;
        driver.get(prop.getProperty("url")+pageUrl);
        PageFactory.initElements(driver, this);
    }

    public pageRegister(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public pageRegister(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Refresh Button.
     *
     * @return the Register class instance.
     */
    public pageRegister clickRefreshButton() {
        refresh.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Register class instance.
     */
    public pageRegister fill() {
        setFullName1TextField();
        setFullName2TextField();
        setAddressTextareaField();
        setEmailAddressEmailField();
        setPhoneTelField();
        setGenderRadioButton();
        setHobbiesCheckBox();
        setSkillsDropDownListField();
        //setCountryDropDownListField();
        setSelectCountryDropDownListField();
        setDateOfBirth1DropDownListField();
        setDateOfBirth2DropDownListField();
        setDateOfBirth3DropDownListField();
        setPasswordPasswordField();
        setConfirmPasswordPasswordField();
        return this;
    }



    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Register class instance.
     */
    public pageRegister fillAndSubmit() {
        fill();
        return clickSubmitButton();
    }

    /**
     * Set default value to Address Textarea field.
     *
     * @return the Register class instance.
     */
    public pageRegister setAddressTextareaField() {
        return setAddressTextareaField(data.get("Address"));
    }

    /**
     * Set value to Address Textarea field.
     *
     * @return the Register class instance.
     */
    public pageRegister setAddressTextareaField(String addressValue) {
        address.sendKeys(addressValue);
        return this;
    }

    /**
     * Set default value to Confirm Password Password field.
     *
     * @return the Register class instance.
     */
    public pageRegister setConfirmPasswordPasswordField() {
        return setConfirmPasswordPasswordField(data.get("Password"));
    }

    /**
     * Set value to Confirm Password Password field.
     *
     * @return the Register class instance.
     */
    public pageRegister setConfirmPasswordPasswordField(String confirmPasswordValue) {
        confirmPassword.sendKeys(confirmPasswordValue);
        return this;
    }

    /**
     * Set default value to Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setCountryDropDownListField() {
        return setCountryDropDownListField(data.get("Country"));
    }

    /**
     * Set value to Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setCountryDropDownListField(String countryValue) {
        new Select(country).selectByVisibleText(countryValue);
        return this;
    }


    public pageRegister setHobbiesCheckBox() {
       return setHobbiesCheckBox(data.get("Hobbies"));
    }

    public pageRegister setHobbiesCheckBox(String hobbies){
        String[] hobbyArray = hobbies.split(",");
        for (String hobby : hobbyArray){
            if (hobby.equalsIgnoreCase("Cricket")){
               setCricketCheckboxField();
            }
            if(hobby.equalsIgnoreCase("Movies")){
                setMoviesCheckboxField();
            }
            if(hobby.equalsIgnoreCase("Hockey")){
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
    public pageRegister setCricketCheckboxField() {
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
    public pageRegister setDateOfBirth1DropDownListField() {
        return setDateOfBirth1DropDownListField(data.get("Year"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).selectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setDateOfBirth2DropDownListField() {
        return setDateOfBirth2DropDownListField(data.get("Month"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).selectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Set default value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setDateOfBirth3DropDownListField() {
        return setDateOfBirth3DropDownListField(data.get("Day"));
    }

    /**
     * Set value to Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).selectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Set default value to Email Address Email field.
     *
     * @return the Register class instance.
     */
    public pageRegister setEmailAddressEmailField() {
        return setEmailAddressEmailField(data.get("Email Address"));
    }

    /**
     * Set value to Email Address Email field.
     *
     * @return the Register class instance.
     */
    public pageRegister setEmailAddressEmailField(String emailAddressValue) {
        emailAddress.sendKeys(emailAddressValue);
        return this;
    }

    public pageRegister setGenderRadioButton() {
        return setGenderRadioButton(data.get("Gender"));
    }

    public pageRegister setGenderRadioButton(String gender){

        if(gender.equalsIgnoreCase(maleValue)){
            setGenderMaleRadioButtonField();
        }else if(gender.equalsIgnoreCase(femaleValue)){
            setGenderFemaleRadioButtonField();
        }

        return this;
    }



    /**
     * Set default value to Female Radio Button field.
     *
     * @return the Register class instance.
     */
    public pageRegister setGenderMaleRadioButtonField() {
        for (WebElement el : gender) {
            if (el.getAttribute("value").equals(maleValue)) {
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
    public pageRegister setGenderFemaleRadioButtonField() {
        for (WebElement el : gender) {
            if (el.getAttribute("value").equals(femaleValue)) {
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
    public pageRegister setFullName1TextField() {
        return setFullName1TextField(data.get("First Name"));
    }

    /**
     * Set value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public pageRegister setFullName1TextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public pageRegister setFullName2TextField() {
        return setFullName2TextField(data.get("Last Name"));
    }

    /**
     * Set value to Full Name Text field.
     *
     * @return the Register class instance.
     */
    public pageRegister setFullName2TextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set Hockey Checkbox field.
     *
     * @return the Register class instance.
     */
    public pageRegister setHockeyCheckboxField() {
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
    public pageRegister setMoviesCheckboxField() {
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
    public pageRegister setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("Password"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the Register class instance.
     */
    public pageRegister setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Phone Tel field.
     *
     * @return the Register class instance.
     */
    public pageRegister setPhoneTelField() {
        return setPhoneTelField(data.get("Phone"));
    }

    /**
     * Set value to Phone Tel field.
     *
     * @return the Register class instance.
     */
    public pageRegister setPhoneTelField(String phoneValue) {
        phone.sendKeys(phoneValue);
        return this;
    }

    /**
     * Set Photo File field.
     *
     * @return the Register class instance.
     */
    public pageRegister setPhotoFileField() {
        return this;
    }

    /**
     * Set default value to Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setSelectCountryDropDownListField() {
        return setSelectCountryDropDownListField(data.get("Country"));
    }

    /**
     * Set value to Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setSelectCountryDropDownListField(String selectCountryValue) {
        new Select(selectCountry).selectByVisibleText(selectCountryValue);
        return this;
    }

    /**
     * Set default value to Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setSkillsDropDownListField() {
        return setSkillsDropDownListField(data.get("Skills"));
    }

    /**
     * Set value to Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister setSkillsDropDownListField(String skillsValue) {
        new Select(skills).selectByVisibleText(skillsValue);
        return this;
    }

    /**
     * Unset default value from Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetCountryDropDownListField() {
        return unsetCountryDropDownListField(data.get("Country"));
    }

    /**
     * Unset value from Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetCountryDropDownListField(String countryValue) {
        new Select(country).deselectByVisibleText(countryValue);
        return this;
    }

    /**
     * Unset Cricket Checkbox field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetCricketCheckboxField() {
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
    public pageRegister unsetDateOfBirth1DropDownListField() {
        return unsetDateOfBirth1DropDownListField(data.get("Year"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetDateOfBirth1DropDownListField(String dateOfBirth1Value) {
        new Select(dateOfBirth1).deselectByVisibleText(dateOfBirth1Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetDateOfBirth2DropDownListField() {
        return unsetDateOfBirth2DropDownListField(data.get("Month"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetDateOfBirth2DropDownListField(String dateOfBirth2Value) {
        new Select(dateOfBirth2).deselectByVisibleText(dateOfBirth2Value);
        return this;
    }

    /**
     * Unset default value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetDateOfBirth3DropDownListField() {
        return unsetDateOfBirth3DropDownListField(data.get("Day"));
    }

    /**
     * Unset value from Date Of Birth Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetDateOfBirth3DropDownListField(String dateOfBirth3Value) {
        new Select(dateOfBirth3).deselectByVisibleText(dateOfBirth3Value);
        return this;
    }

    /**
     * Unset Hockey Checkbox field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetHockeyCheckboxField() {
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
    public pageRegister unsetMoviesCheckboxField() {
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
    public pageRegister unsetSelectCountryDropDownListField() {
        return unsetSelectCountryDropDownListField(data.get("Country"));
    }

    /**
     * Unset value from Select Country Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetSelectCountryDropDownListField(String selectCountryValue) {
        new Select(selectCountry).deselectByVisibleText(selectCountryValue);
        return this;
    }

    /**
     * Unset default value from Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetSkillsDropDownListField() {
        return unsetSkillsDropDownListField(data.get("Skills"));
    }

    /**
     * Unset value from Skills Drop Down List field.
     *
     * @return the Register class instance.
     */
    public pageRegister unsetSkillsDropDownListField(String skillsValue) {
        new Select(skills).deselectByVisibleText(skillsValue);
        return this;
    }

    /**
     * Verify that the page loaded completely. TODO
     *
     * @return the Register class instance.
     */
    public pageRegister verifyPageLoaded() {
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getPageSource().contains(pageLoadedText));
        } catch (TimeoutException | NullPointerException e) {
            throw new AssertionError("Expected Page load text to contain: " + pageLoadedText + " but was: " + driver.getTitle());
        }
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the Register class instance.
     */
    public pageRegister verifyPageUrl() {
        logger.info("Verifying page URL contains: {}", pageUrl);
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getCurrentUrl().contains(pageUrl));
        } catch (TimeoutException | NullPointerException e) {
            throw new AssertionError("Expected URL to contain: " + pageUrl + " but was: " + driver.getCurrentUrl());
        }
        logger.info("Page URL verification successful: {}", pageUrl);
        return this;

    }

    /**
     * Verify that current page title to matches the expected title.
     *
     * @return the Register class instance.
     */
    public pageRegister verifyTitle() {
        logger.info("Verifying page title contains: {}", pageTitle);
        try {
            (new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT))).until((ExpectedCondition<Boolean>) d -> d.getTitle().contains(pageTitle));
        } catch (TimeoutException | NullPointerException e) {
            throw new AssertionError("Expected Title to contain: " + pageTitle + " but was: " + driver.getTitle());
        }
        logger.info("Page title URL verification successful: {}", pageTitle);
        return this;

    }
}
