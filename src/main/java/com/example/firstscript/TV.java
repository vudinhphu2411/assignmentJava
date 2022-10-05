// package com.example.firstscript;

// import java.io.IOException;
// import java.net.MalformedURLException;
// import java.net.URL;
// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.remote.DesiredCapabilities;

// import io.appium.java_client.android.AndroidDriver;

// /**
// * Hello world!
// *
// */
// public class TV {
// static URL remoteUrl;
// public static AndroidDriver<WebElement> driver;

// public static void main(String[] args) throws IOException,
// InterruptedException {
// try {
// setUp();
// sampleTest();
// } catch (Exception exception) {
// System.out.println(exception.getCause());
// System.out.println(exception.getMessage());
// exception.printStackTrace();
// }
// }

// // @Before
// public static void setUp() throws MalformedURLException {
// System.out.println("hello");
// DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
// desiredCapabilities.setCapability("platformName", "Android");
// desiredCapabilities.setCapability("a ppium:platformVersion", "10");
// desiredCapabilities.setCapability("appium:deviceName", "TV phòng ngủ");
// desiredCapabilities.setCapability("appium:appPakage",
// "com.fptplay.launcher");
// desiredCapabilities.setCapability("appium:appActivity",
// "com.tear.modules.tv.welcome.WelcomeActivity");
// desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
// desiredCapabilities.setCapability("unicodeKeyboard", true);
// desiredCapabilities.setCapability("resetKeyboard", true);
// desiredCapabilities.setCapability("noReset", "true");
// try {
// remoteUrl = new URL("http://0.0.0.0:4723/wd/hub");
// } catch (MalformedURLException e) {
// e.printStackTrace();
// }
// driver = new AndroidDriver<WebElement>(remoteUrl, desiredCapabilities);
// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// System.out.println(">>>> APP launched::::");
// }

// // @Test
// public static void sampleTest() throws InterruptedException {
// WebElement btnSearch = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.ImageButton[1]");
// Thread.sleep(4000);
// btnSearch.click();
// System.out.println("Check sesssion");

// }

// // @AfterAll
// public static void tearDown() {
// driver.quit();
// }
// }
