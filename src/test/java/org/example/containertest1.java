package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class containertest1 {


//
//
//   // WebDriver driver = new ChromeDriver();
//
//   public  WebDriver driver ;
//   public WebDriverWait wait;
    ////    ExtentReports extent;
    ////   ExtentTest test;
    ////


    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leader-fms.discretal.com");
    }
//    void launchBrowser()
//    {
//        WebDriverManager.chromedriver().setup();
//
//
//       System.out.println("Chrome binary: " + System.getProperty("webdriver.chrome.driver"));
//
//
//        // Set Chrome options for headless mode
//        ChromeOptions options = new ChromeOptions();
//       options.addArguments("--headless");
//       options.addArguments("--disable-gpu"); // Disable GPU hardware acceleration
//        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model
//
//
//
//        // Initialize driver with Chrome options
//        driver = new ChromeDriver(options);
//
//
//
//        driver.manage().window().maximize();
//        driver.get("https://leader-fms.discretal.com/login/");
//
//
//    }
//
//
//    @BeforeMethod
//    public void setup() {
    ////        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
    ////        extent = new ExtentReports();
    ////        extent.attachReporter(sparkReporter);
    ////
    ////        test = extent.createTest("LoginTest", "Verifying login functionality");
//        launchBrowser();
//    }

    @Test
    public void ClickOnTheContainersTest() throws IOException, InterruptedException
    {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();

    }

    @Test
    public void CreateTheContainersTest() throws IOException, InterruptedException
    {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.clickOnTheCreateContainers();
        Thread.sleep(1000);
        conatiner1.EnterTheIdentifier("30");
        Thread.sleep(1000);
        conatiner1.EnterTheLatitude("3.99");
        Thread.sleep(1000);
        conatiner1.EnterTheLongitude("3.8");
        Thread.sleep(1000);
        conatiner1.EnterTheDistictName("kerala");
        Thread.sleep(1000);
//        conatiner1.EnterTheSerialNumber("7777");
//        Thread.sleep(1000);
//        conatiner1.EnterTheTagNumber("8888");
//
//        Thread.sleep(1000);
//        conatiner1.clickOnTheContainersType();
//        Thread.sleep(1000);
//        conatiner1.SelectOnTheContainersType();
//        Thread.sleep(1000);
//        conatiner1.ClickOnTheContractors();
//        Thread.sleep(1000);
//        conatiner1.SelectTheContractors();
//        Thread.sleep(1000);
        conatiner1.ClickOnTheZones();
        Thread.sleep(1000);
        conatiner1.SelectTheZones();
        Thread.sleep(1000);
        //conatiner1.ClickOnTheSave();
    }
    @Test
    public void SeeTheContainersStatusTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheContainerStatus();
    }
    @Test
    public void EditTheContainersTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheEdit();
        Thread.sleep(1000);
        conatiner1.ClickOnTheZones();
        Thread.sleep(1000);
        conatiner1.SelectTheZones();
//        conatiner1.ClearEnterTheDistictName();
//        Thread.sleep(1000);
//        conatiner1.ClearEnterTheDistictName();
//        Thread.sleep(1000);
//           conatiner1.EnterTheDistictName("kerala");
        Thread.sleep(1000);
        conatiner1.ClickOnTheSave();
    }
    @Test
    public void DeleteTheContainersTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.DeleteTheContainers();
        Thread.sleep(1000);
//containers.ClickOnTheRemove();
    }
    @Test
    public void FilterContainerTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterContainer();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterStatus();
        Thread.sleep(1000);
        conatiner1.ClickOnTheSelectFull();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterArrow();
        Thread.sleep(1000);
        conatiner1.AgainClickOnTheFilter();

    }
    @Test
    public void ClearFilterContainerTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterContainer();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterStatus();
        Thread.sleep(1000);
        conatiner1.ClickOnTheSelectFull();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterArrow();
        Thread.sleep(1000);
        conatiner1.AgainClickOnTheFilter();
        Thread.sleep(1000);
        conatiner1.ClickOnTheFilterContainer();
        Thread.sleep(1000);
        conatiner1.ClickOnTheClearFilter();
        Thread.sleep(1000);
    }
    @Test
    public void SelectTheCreatedTimeTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheCreatedTime();
        Thread.sleep(1000);
        conatiner1.SelectOnTheCreatedTime();
    }
    @Test
    public void SearchTheContainerTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.SearchTheContainer("8181");

    }
    @Test
    public void ClickTheContainersLocationTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheLocation();


    }
    @Test
    public void ClickTheMovingPageTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
//containers.ClickOnTheMovingPage();


    }
    @Test
    public void SelectTheZonesTest() throws IOException, InterruptedException {
        conatiner1 conatiner1=new conatiner1(driver);
        conatiner1.enterUsername("Admin");
        conatiner1.enterPassword("Leader@123");
        conatiner1.clickLogin();
        Thread.sleep(1000);
        conatiner1.clickOnSetting();
        Thread.sleep(1000);
        conatiner1.clickOnTheAddContainers();
        Thread.sleep(1000);
        conatiner1.ClickOnTheZZones();
        Thread.sleep(1000);
        conatiner1.SelectOnTheZZones();
        Thread.sleep(1000);
        conatiner1.ClickOnTheApply();
    }












}
