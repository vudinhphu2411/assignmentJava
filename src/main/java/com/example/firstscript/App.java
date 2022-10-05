// package com.example.firstscript;

// import java.net.URL;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import org.openqa.selenium.By;
// import org.openqa.selenium.remote.DesiredCapabilities;

// import io.appium.java_client.AppiumDriver;
// import io.appium.java_client.MobileElement;

// /**
// * Hello world!
// *
// */
// public class App {

// static AppiumDriver<MobileElement> driver;

// public static void main(String[] args) {
// try {
// setUp();
// TC1();
// TC2();
// TC3();
// tearDown();
// } catch (Exception exception) {
// System.out.println(exception.getCause());
// System.out.println(exception.getMessage());
// exception.printStackTrace();
// }
// }

// // @Before
// public static void setUp() throws Exception {
// DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
// desiredCapabilities.setCapability("platformName", "Android");
// // desiredCapabilities.setCapability("appium:platformVersion", "12");
// // desiredCapabilities.setCapability("appium:deviceName", "S10");
// // desiredCapabilities.setCapability("appium:udid", "R58M225HYKJ");
// desiredCapabilities.setCapability("appium:platformVersion", "13");
// desiredCapabilities.setCapability("appium:deviceName", "Emulator");
// desiredCapabilities.setCapability("appium:udid", "emulator-5554");
// desiredCapabilities.setCapability("appium:appPackage", "com.fplay.activity");
// desiredCapabilities.setCapability("appium:appActivity",
// "com.fptplay.mobile.HomeActivity");
// desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
// desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
// desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
// desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

// URL url = new URL("http://127.0.0.1:4723/wd/hub/");

// driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
// System.out.println("Application Start...");

// // MobileElement btnBack =
// // driver.findElementById("com.fplay.activity:id/tv_count_down");
// // btnBack.click();

// }

// // @Test
// public static void TC1() throws InterruptedException {
// System.out.println("TC1: Login successfully");
// Thread.sleep(9000);

// MobileElement menu = driver
// .findElementByXPath("//android.widget.LinearLayout[@content-desc='Ứngdụng']");
// System.out.println("Click PROFILE");
// Thread.sleep(3000);
// menu.click();

// MobileElement btnLoginPage =
// driver.findElement(By.id("com.fplay.activity:id/tv_title_login"));
// System.out.println("Click btnLogin");
// btnLoginPage.click();
// Thread.sleep(3000);

// MobileElement phone =
// driver.findElementById("com.fplay.activity:id/et_phone");
// System.out.println("SendKeys PHONE");
// phone.sendKeys("0919768787");

// MobileElement pw =
// driver.findElementById("com.fplay.activity:id/et_pass_login");
// System.out.println("Sendkeys Pw");
// pw.sendKeys("111111");

// MobileElement btnLogin =
// driver.findElement(By.id("com.fplay.activity:id/bt_login"));
// btnLogin.click();

// MobileElement btnOK =
// driver.findElementById("com.fplay.activity:id/bt_right");
// System.out.println("CLICK OK");
// btnOK.click();

// MobileElement pw1 =
// driver.findElementById("com.fplay.activity:id/et_pass_login");
// System.out.println("Sendkeys Pw1");
// pw1.sendKeys("000000");

// MobileElement btnLogin1 =
// driver.findElement(By.id("com.fplay.activity:id/bt_login"));
// btnLogin1.click();
// Thread.sleep(3000);

// MobileElement btnHome = driver.findElementByAccessibilityId("Trang chủ");
// btnHome.click();
// String tagName = btnHome.getAttribute("clickable");
// System.out.println(tagName);
// System.out.println("---------------------------------------------");
// Thread.sleep(3000);

// }

// public static void TC2() throws InterruptedException {
// System.out.println("TC2: Count Item");
// MobileElement btnType =
// driver.findElement(By.id("com.fplay.activity:id/tv_select_category"));
// btnType.click();
// Thread.sleep(10000);
// System.out.println("Open Categories");
// MobileElement menuCategory = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.TextView");
// menuCategory.click();
// System.out.println("Details");
// Thread.sleep(10000);

// String[] arr = {};
// List<String> testList = new ArrayList<>(Arrays.asList(arr));

// MobileElement item1 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item01 = item1.getAttribute("content-desc");
// testList.add(item01);
// System.out.println("get item 1 OK");

// MobileElement item2 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item02 = item2.getAttribute("content-desc");
// testList.add(item02);
// System.out.println("get item 2 OK");

// MobileElement item3 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item03 = item3.getAttribute("content-desc");
// testList.add(item03);
// System.out.println("get item 3 OK");

// MobileElement item4 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item04 = item4.getAttribute("content-desc");
// testList.add(item04);
// System.out.println("get item 4 OK");

// MobileElement item5 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item05 = item5.getAttribute("content-desc");
// testList.add(item05);
// System.out.println("get item 5 OK");

// MobileElement item6 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item06 = item6.getAttribute("content-desc");
// testList.add(item06);
// System.out.println("get item 6 OK");

// MobileElement item7 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item07 = item7.getAttribute("content-desc");
// testList.add(item07);
// System.out.println("get item 7 OK");

// MobileElement item8 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item08 = item8.getAttribute("content-desc");
// testList.add(item08);
// System.out.println("get item 8 OK");

// MobileElement item9 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item09 = item9.getAttribute("content-desc");
// testList.add(item09);
// System.out.println("get item 9 OK");

// MobileElement item010 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.widget.ImageView");
// String item10 = item010.getAttribute("content-desc");
// testList.add(item10);
// System.out.println("get item 10 OK");
// System.out.println("Total items are: " + testList.size());
// }

// public static void TC3() throws InterruptedException {
// System.out.println("---------------------------------------------");
// System.out.println("TC3: Change Quality");

// MobileElement childBack =
// driver.findElementById("com.fplay.activity:id/iv_back");
// childBack.click();
// System.out.println("BACK");

// MobileElement pb = driver
// .findElementByXPath("//android.widget.LinearLayout[@content-desc='PhimBộ']/android.widget.ImageView");
// Thread.sleep(12000);
// pb.click();
// System.out.println("Click Phim bO");
// Thread.sleep(7000);

// MobileElement play = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
// play.click();
// System.out.println("Click Phim OK");
// Thread.sleep(50000);

// MobileElement click = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
// System.out.println("CLICK OK");
// click.click();
// Thread.sleep(1500);

// MobileElement setti =
// driver.findElementById("com.fplay.activity:id/ib_setting");
// System.out.println("Setting OK");
// setti.click();
// Thread.sleep(2000);

// MobileElement btn1080 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView");
// btn1080.click();
// System.out.println("Mode: 1080 OK");
// Thread.sleep(30000);

// click.click();
// Thread.sleep(1500);

// MobileElement settin =
// driver.findElementById("com.fplay.activity:id/ib_setting");
// System.out.println("Setting OK");
// settin.click();
// Thread.sleep(2000);

// MobileElement btn720 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView");
// btn720.click();
// System.out.println("Mode: 720 OK");
// Thread.sleep(30000);

// click.click();
// Thread.sleep(1500);
// MobileElement setting =
// driver.findElementById("com.fplay.activity:id/ib_setting");
// System.out.println("Setting OK");
// setting.click();
// Thread.sleep(2000);
// MobileElement btn480 = driver.findElementByXPath(
// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.TextView");
// btn480.click();
// System.out.println("Mode: 480 OK");
// System.out.println("DONE............");
// Thread.sleep(5000);
// // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// // driver.findElementById("");

// }

// // @AfterAll
// public static void tearDown() {
// driver.quit();
// }
// }
