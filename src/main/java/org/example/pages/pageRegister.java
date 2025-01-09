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


    @FindBy(css = "a[href='Accordion.html']")
    @CacheLookup
    private WebElement accordion;

    @FindBy(css = "textarea.form-control.ng-pristine.ng-valid.ng-touched")
    @CacheLookup
    private WebElement address;

    @FindBy(css = "a[href='Alerts.html']")
    @CacheLookup
    private WebElement alerts;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(1) a.ui-corner-all")
    @CacheLookup
    private WebElement arabic;

    @FindBy(css = "a[href='AutoComplete.html']")
    @CacheLookup
    private WebElement autocomplete;

    @FindBy(css = "a[title='Sakinalium Demo Site']")
    @CacheLookup
    private WebElement automationTesting;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(2) a.ui-corner-all")
    @CacheLookup
    private WebElement bulgarian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(3) a.ui-corner-all")
    @CacheLookup
    private WebElement catalan;

    @FindBy(css = "a[href='Charts.html']")
    @CacheLookup
    private WebElement charts;

    @FindBy(css = "a[href='CKEditor.html']")
    @CacheLookup
    private WebElement ckeditor;

    @FindBy(css = "a[href='CodeMirror.html']")
    @CacheLookup
    private WebElement codemirror;

    @FindBy(id = "secondpassword")
    @CacheLookup
    private WebElement confirmPassword;

    @FindBy(id = "countries")
    @CacheLookup
    private WebElement country;

    @FindBy(id = "checkbox1")
    @CacheLookup
    private WebElement cricket;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(4) a.ui-corner-all")
    @CacheLookup
    private WebElement croatian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(5) a.ui-corner-all")
    @CacheLookup
    private WebElement czech;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(6) a.ui-corner-all")
    @CacheLookup
    private WebElement danish;

    @FindBy(id = "yearbox")
    @CacheLookup
    private WebElement dateOfBirth1;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(11) div:nth-of-type(2) select.form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required")
    @CacheLookup
    private WebElement dateOfBirth2;

    @FindBy(id = "daybox")
    @CacheLookup
    private WebElement dateOfBirth3;

    @FindBy(css = "a[href='Datepicker.html']")
    @CacheLookup
    private WebElement datepicker;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(6) ul.dropdown-menu li:nth-of-type(1) a.dropdown-toggle")
    @CacheLookup
    private WebElement dragAndDrop;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(7) a.ui-corner-all")
    @CacheLookup
    private WebElement dutch;

    @FindBy(css = "a[href='Dynamic.html']")
    @CacheLookup
    private WebElement dynamic;

    @FindBy(css = "a[href='DynamicData.html']")
    @CacheLookup
    private WebElement dynamicData;

    @FindBy(css = "input.form-control.ng-pristine.ng-valid-email.ng-invalid.ng-invalid-required.ng-touched")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(8) a.ui-corner-all")
    @CacheLookup
    private WebElement english;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(9) a.ui-corner-all")
    @CacheLookup
    private WebElement estonian;

    @FindBy(name = "radiooptions")
    @CacheLookup
    private List<WebElement> gender;

    private final String maleValue = "Male";

    private final String femaleValue = "FeMale";

    @FindBy(css = "a[href='FileDownload.html']")
    @CacheLookup
    private WebElement fileDownload;

    @FindBy(css = "a[href='FileUpload.html']")
    @CacheLookup
    private WebElement fileUpload;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(10) a.ui-corner-all")
    @CacheLookup
    private WebElement filipino;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(11) a.ui-corner-all")
    @CacheLookup
    private WebElement finnish;

    @FindBy(css = "a[href='Frames.html']")
    @CacheLookup
    private WebElement frames;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(12) a.ui-corner-all")
    @CacheLookup
    private WebElement french;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(1) div:nth-of-type(1) input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-touched[type='text']")
    @CacheLookup
    private WebElement fullName1;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(1) div:nth-of-type(2) input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-touched[type='text']")
    @CacheLookup
    private WebElement fullName2;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(13) a.ui-corner-all")
    @CacheLookup
    private WebElement german;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(14) a.ui-corner-all")
    @CacheLookup
    private WebElement greek;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(15) a.ui-corner-all")
    @CacheLookup
    private WebElement hebrew;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(16) a.ui-corner-all")
    @CacheLookup
    private WebElement hindi;

    @FindBy(id = "checkbox3")
    @CacheLookup
    private WebElement hockey;

    @FindBy(css = "a[href='Index.html']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(17) a.ui-corner-all")
    @CacheLookup
    private WebElement hungarian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(18) a.ui-corner-all")
    @CacheLookup
    private WebElement icelandic;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(19) a.ui-corner-all")
    @CacheLookup
    private WebElement indonesian;

    @FindBy(css = "a[href='Interactions.html']")
    @CacheLookup
    private WebElement interactions;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(20) a.ui-corner-all")
    @CacheLookup
    private WebElement italian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(21) a.ui-corner-all")
    @CacheLookup
    private WebElement japanese;

    @FindBy(css = "a[href='JqueryProgressBar.html']")
    @CacheLookup
    private WebElement jqueryProgressbar;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(22) a.ui-corner-all")
    @CacheLookup
    private WebElement korean;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(23) a.ui-corner-all")
    @CacheLookup
    private WebElement latvian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(24) a.ui-corner-all")
    @CacheLookup
    private WebElement lithuanian;

    @FindBy(css = "a[href='Loader.html']")
    @CacheLookup
    private WebElement loader;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(25) a.ui-corner-all")
    @CacheLookup
    private WebElement malay;

    @FindBy(css = "a[href='Modals.html']")
    @CacheLookup
    private WebElement modals;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(9) a.dropdown-toggle")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "checkbox2")
    @CacheLookup
    private WebElement movies;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(26) a.ui-corner-all")
    @CacheLookup
    private WebElement norwegian;

    private final String pageLoadedText = "";

    private final String pageUrl = "/Register.html";
    private final String pageTitle = "Register";

    @FindBy(id = "firstpassword")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(27) a.ui-corner-all")
    @CacheLookup
    private WebElement persian;

    @FindBy(css = "input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-pattern.ng-touched")
    @CacheLookup
    private WebElement phone;

    @FindBy(id = "imagesrc")
    @CacheLookup
    private WebElement photo;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(28) a.ui-corner-all")
    @CacheLookup
    private WebElement polish;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(29) a.ui-corner-all")
    @CacheLookup
    private WebElement portuguese;

    @FindBy(css = "a[href='http://practice.automationtesting.in/']")
    @CacheLookup
    private WebElement practiceSite;

    @FindBy(css = "a[href='ProgressBar.html']")
    @CacheLookup
    private WebElement progressbar;

    @FindBy(id = "Button1")
    @CacheLookup
    private WebElement refresh;

    @FindBy(css = "a[href='Register.html']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "a[href='Resizable.html']")
    @CacheLookup
    private WebElement resizable;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(30) a.ui-corner-all")
    @CacheLookup
    private WebElement romanian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(31) a.ui-corner-all")
    @CacheLookup
    private WebElement russian;

    @FindBy(id = "country")
    @CacheLookup
    private WebElement selectCountry;

    @FindBy(css = "a[href='Selectable.html']")
    @CacheLookup
    private WebElement selectable;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(32) a.ui-corner-all")
    @CacheLookup
    private WebElement serbian;

    @FindBy(id = "Skills")
    @CacheLookup
    private WebElement skills;

    @FindBy(css = "a[href='Slider.html']")
    @CacheLookup
    private WebElement slider;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(33) a.ui-corner-all")
    @CacheLookup
    private WebElement slovak;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(34) a.ui-corner-all")
    @CacheLookup
    private WebElement slovenian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(35) a.ui-corner-all")
    @CacheLookup
    private WebElement spanish;

    @FindBy(id = "submitbtn")
    @CacheLookup
    private WebElement submit;

    @FindBy(css = "a[href='SummerNote.html']")
    @CacheLookup
    private WebElement summernote;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(36) a.ui-corner-all")
    @CacheLookup
    private WebElement swedish;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(4) a.dropdown-toggle")
    @CacheLookup
    private WebElement switchto;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(37) a.ui-corner-all")
    @CacheLookup
    private WebElement thai;

    @FindBy(css = "a[href='TinyMCE.html']")
    @CacheLookup
    private WebElement tinymce;

    @FindBy(css = "button.btn.btn-success.navbar-toggle")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(38) a.ui-corner-all")
    @CacheLookup
    private WebElement turkish;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(39) a.ui-corner-all")
    @CacheLookup
    private WebElement ukrainian;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(40) a.ui-corner-all")
    @CacheLookup
    private WebElement urdu;

    @FindBy(css = "#header nav.navbar.navbar-inverse div.container div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(7) a.dropdown-toggle")
    @CacheLookup
    private WebElement video;

    @FindBy(css = "#basicBootstrapForm div:nth-of-type(7) div.col-md-4.col-xs-4.col-sm-4 multi-select div:nth-of-type(2) ul.ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content.ui-corner-all li:nth-of-type(41) a.ui-corner-all")
    @CacheLookup
    private WebElement vietnamese;

    @FindBy(css = "a[href='Vimeo.html']")
    @CacheLookup
    private WebElement vimeo;

    @FindBy(css = "a[href='WebTable.html']")
    @CacheLookup
    private WebElement webtable;

    @FindBy(css = "a[href='Widgets.html']")
    @CacheLookup
    private WebElement widgets;

    @FindBy(css = "a[href='Windows.html']")
    @CacheLookup
    private WebElement windows;

    @FindBy(css = "a[href='WYSIWYG.html']")
    @CacheLookup
    private WebElement wysiwyg;

    @FindBy(css = "a[href='Youtube.html']")
    @CacheLookup
    private WebElement youtube;

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
     * Click on Accordion Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickAccordionLink() {
        accordion.click();
        return this;
    }

    /**
     * Click on Alerts Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickAlertsLink() {
        alerts.click();
        return this;
    }

    /**
     * Click on Arabic Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickArabicLink() {
        arabic.click();
        return this;
    }

    /**
     * Click on Autocomplete Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickAutocompleteLink() {
        autocomplete.click();
        return this;
    }

    /**
     * Click on Automation Testing Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickAutomationTestingLink() {
        automationTesting.click();
        return this;
    }

    /**
     * Click on Bulgarian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickBulgarianLink() {
        bulgarian.click();
        return this;
    }

    /**
     * Click on Catalan Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickCatalanLink() {
        catalan.click();
        return this;
    }

    /**
     * Click on Charts Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickChartsLink() {
        charts.click();
        return this;
    }

    /**
     * Click on Ckeditor Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickCkeditorLink() {
        ckeditor.click();
        return this;
    }

    /**
     * Click on Codemirror Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickCodemirrorLink() {
        codemirror.click();
        return this;
    }

    /**
     * Click on Croatian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickCroatianLink() {
        croatian.click();
        return this;
    }

    /**
     * Click on Czech Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickCzechLink() {
        czech.click();
        return this;
    }

    /**
     * Click on Danish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDanishLink() {
        danish.click();
        return this;
    }

    /**
     * Click on Datepicker Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDatepickerLink() {
        datepicker.click();
        return this;
    }

    /**
     * Click on Drag And Drop Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDragAndDropLink() {
        dragAndDrop.click();
        return this;
    }

    /**
     * Click on Dutch Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDutchLink() {
        dutch.click();
        return this;
    }

    /**
     * Click on Dynamic Data Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDynamicDataLink() {
        dynamicData.click();
        return this;
    }

    /**
     * Click on Dynamic Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickDynamicLink() {
        dynamic.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Estonian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickEstonianLink() {
        estonian.click();
        return this;
    }

    /**
     * Click on File Download Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFileDownloadLink() {
        fileDownload.click();
        return this;
    }

    /**
     * Click on File Upload Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFileUploadLink() {
        fileUpload.click();
        return this;
    }

    /**
     * Click on Filipino Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFilipinoLink() {
        filipino.click();
        return this;
    }

    /**
     * Click on Finnish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFinnishLink() {
        finnish.click();
        return this;
    }

    /**
     * Click on Frames Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFramesLink() {
        frames.click();
        return this;
    }

    /**
     * Click on French Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickFrenchLink() {
        french.click();
        return this;
    }

    /**
     * Click on German Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickGermanLink() {
        german.click();
        return this;
    }

    /**
     * Click on Greek Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickGreekLink() {
        greek.click();
        return this;
    }

    /**
     * Click on Hebrew Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickHebrewLink() {
        hebrew.click();
        return this;
    }

    /**
     * Click on Hindi Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickHindiLink() {
        hindi.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on Hungarian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickHungarianLink() {
        hungarian.click();
        return this;
    }

    /**
     * Click on Icelandic Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickIcelandicLink() {
        icelandic.click();
        return this;
    }

    /**
     * Click on Indonesian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickIndonesianLink() {
        indonesian.click();
        return this;
    }

    /**
     * Click on Interactions Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickInteractionsLink() {
        interactions.click();
        return this;
    }

    /**
     * Click on Italian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickItalianLink() {
        italian.click();
        return this;
    }

    /**
     * Click on Japanese Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickJapaneseLink() {
        japanese.click();
        return this;
    }

    /**
     * Click on Jquery Progressbar Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickJqueryProgressbarLink() {
        jqueryProgressbar.click();
        return this;
    }

    /**
     * Click on Korean Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickKoreanLink() {
        korean.click();
        return this;
    }

    /**
     * Click on Latvian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickLatvianLink() {
        latvian.click();
        return this;
    }

    /**
     * Click on Lithuanian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickLithuanianLink() {
        lithuanian.click();
        return this;
    }

    /**
     * Click on Loader Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickLoaderLink() {
        loader.click();
        return this;
    }

    /**
     * Click on Malay Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickMalayLink() {
        malay.click();
        return this;
    }

    /**
     * Click on Modals Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickModalsLink() {
        modals.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on Norwegian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickNorwegianLink() {
        norwegian.click();
        return this;
    }

    /**
     * Click on Persian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickPersianLink() {
        persian.click();
        return this;
    }

    /**
     * Click on Polish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickPolishLink() {
        polish.click();
        return this;
    }

    /**
     * Click on Portuguese Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickPortugueseLink() {
        portuguese.click();
        return this;
    }

    /**
     * Click on Practice Site Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickPracticeSiteLink() {
        practiceSite.click();
        return this;
    }

    /**
     * Click on Progressbar Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickProgressbarLink() {
        progressbar.click();
        return this;
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
     * Click on Register Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Resizable Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickResizableLink() {
        resizable.click();
        return this;
    }

    /**
     * Click on Romanian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickRomanianLink() {
        romanian.click();
        return this;
    }

    /**
     * Click on Russian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickRussianLink() {
        russian.click();
        return this;
    }

    /**
     * Click on Selectable Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSelectableLink() {
        selectable.click();
        return this;
    }

    /**
     * Click on Serbian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSerbianLink() {
        serbian.click();
        return this;
    }

    /**
     * Click on Slider Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSliderLink() {
        slider.click();
        return this;
    }

    /**
     * Click on Slovak Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSlovakLink() {
        slovak.click();
        return this;
    }

    /**
     * Click on Slovenian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSlovenianLink() {
        slovenian.click();
        return this;
    }

    /**
     * Click on Spanish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSpanishLink() {
        spanish.click();
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
     * Click on Summernote Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSummernoteLink() {
        summernote.click();
        return this;
    }

    /**
     * Click on Swedish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSwedishLink() {
        swedish.click();
        return this;
    }

    /**
     * Click on Switchto Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickSwitchtoLink() {
        switchto.click();
        return this;
    }

    /**
     * Click on Thai Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickThaiLink() {
        thai.click();
        return this;
    }

    /**
     * Click on Tinymce Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickTinymceLink() {
        tinymce.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the Register class instance.
     */
    public pageRegister clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Turkish Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickTurkishLink() {
        turkish.click();
        return this;
    }

    /**
     * Click on Ukrainian Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickUkrainianLink() {
        ukrainian.click();
        return this;
    }

    /**
     * Click on Urdu Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickUrduLink() {
        urdu.click();
        return this;
    }

    /**
     * Click on Video Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickVideoLink() {
        video.click();
        return this;
    }

    /**
     * Click on Vietnamese Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickVietnameseLink() {
        vietnamese.click();
        return this;
    }

    /**
     * Click on Vimeo Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickVimeoLink() {
        vimeo.click();
        return this;
    }

    /**
     * Click on Webtable Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickWebtableLink() {
        webtable.click();
        return this;
    }

    /**
     * Click on Widgets Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickWidgetsLink() {
        widgets.click();
        return this;
    }

    /**
     * Click on Windows Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickWindowsLink() {
        windows.click();
        return this;
    }

    /**
     * Click on Wysiwyg Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickWysiwygLink() {
        wysiwyg.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the Register class instance.
     */
    public pageRegister clickYoutubeLink() {
        youtube.click();
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
        setCountryDropDownListField();
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
    public pageRegister setFullName1TextField(String fullName1Value) {
        fullName1.sendKeys(fullName1Value);
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
    public pageRegister setFullName2TextField(String fullName2Value) {
        fullName2.sendKeys(fullName2Value);
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
     * Submit the form to target page.
     *
     * @return the Register class instance.
     */
    public pageRegister submit() {
        clickToggleNavigationButton();
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
