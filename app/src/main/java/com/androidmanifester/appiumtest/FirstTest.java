package com.androidmanifester.appiumtest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FirstTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "6.0.1");
        capabilities.setCapability("deviceName","Emulator");

        //
        capabilities.setCapability("platformName","Android");
        //ranjithpsundar@gmail.com

     //   capabilities.setCapability("appPackage", "com.example.aim.jsonelevan");
    // This package name of your app (you can get it from apk info app)
    //    capabilities.setCapability("appActivity","com.example.aim.jsonelevan.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)

        capabilities.setCapability("appPackage", "kp.ranjith.usermanagement");

        // Set android appActivity desired capability. It is
        // com.android.calculator2.Calculator for calculator application.
        // Set your application's appPackage if you are using any other app.
        capabilities.setCapability("appActivity", "kp.ranjith.usermanagement.LoginActivity");

//Create RemoteWebDriver instance and connect to the Appium server
   ///     //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
//        WebElement two=driver.findElement(By.name("2"));
  //      two.click();
        WebElement plus=driver.findElement(By.name("Sign In"));
        plus.click();

        List<WebElement> tfl=driver.findElements(By.className("android.widget.EditText"));
       // tfl.get(0).sendKeys("User Name"); // tfl=text field list
        tfl.get(1).sendKeys("idage");
      //  WebElement four=driver.findElement(By.name("4"));
      //  four.click();
      //  WebElement equalTo=driver.findElement(By.name("="));
      //  equalTo.click();
        //locate the edit box of the calculator by using By.tagName()
      //  WebElement results=driver.findElement(By.tagName("EditText"));
        //Check the calculated value on the edit box
       // assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

    }
//
//    @AfterClass
//    public void teardown(){
//        //close the app
//        driver.quit();
//    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        // Code executed after the last test method
    }

}


//public class FirstTest {
//
//    WebDriver driver;
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        // Created object of DesiredCapabilities class.
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        // Set android deviceName desired capability. Set your device name.
//        capabilities.setCapability("deviceName", "SCH-I535");
//
//        // Set BROWSER_NAME desired capability. It's Android in our case here.
//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
//
//        // Set android VERSION desired capability. Set your mobile device's OS version.
//        capabilities.setCapability(CapabilityType.VERSION, "4.2.2");
//
//        // Set android platformName desired capability. It's Android in our case here.
//        capabilities.setCapability("platformName", "Android");
//
//        // Set android appPackage desired capability. It is
//        // com.android.calculator2 for calculator application.
//        // Set your application's appPackage if you are using any other app.
//        capabilities.setCapability("appPackage", "com.android.calculator2");
//
//        // Set android appActivity desired capability. It is
//        // com.android.calculator2.Calculator for calculator application.
//        // Set your application's appPackage if you are using any other app.
//        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//
//        // Created object of RemoteWebDriver will all set capabilities.
//        // Set appium server address and port number in URL string.
//        // It will launch calculator app in android device.
//       /// driver = new RemoteWebDriver(), capabilities);
////        System.setProperty("webdriver.chrome.driver","Drive:"+ File.separator+"chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.get("http://127.0.0.1:4723/wd/hub");
//
//       // driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//        //driver =new RemoteWebDriver(new URL("http://localhost:4723"), (Capabilities) capabilities);
//        driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"));
//
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//
//    }
//
//    @Test
//    public void testFirstCalculator() {
//
//
//        // Click on DELETE/CLR button to clear result text box before running test.
//        driver.findElements(By.xpath("//android.widget.Button")).get(0).click();
//
//        // Click on number 2 button.
//        driver.findElement(By.name("7")).click();
//
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//    }
//
//    @After
//    public void End() {
//        driver.quit();
//    }
//}