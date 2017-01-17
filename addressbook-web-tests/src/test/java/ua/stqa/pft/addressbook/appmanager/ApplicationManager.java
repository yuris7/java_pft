package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  FirefoxDriver wd;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private ContactHelper contactHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    String pathToGeckoDriver = Paths.get("./geckodriver.exe").toAbsolutePath().toString();
    System.setProperty("webdriver.gecko.driver", pathToGeckoDriver);
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {

    wd.quit();
  }

  public GroupHelper getGroupHelper() {

    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {

    return navigationHelper;
  }

  public ContactHelper getContactHelper() {

    return contactHelper;
  }

  public SessionHelper getSessionHelper() {

    return sessionHelper;
  }
}
