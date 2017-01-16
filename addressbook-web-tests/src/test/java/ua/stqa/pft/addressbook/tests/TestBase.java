package ua.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.stqa.pft.addressbook.appmanager.ApplicationManager;
import ua.stqa.pft.addressbook.appmanager.ContactHelper;
import ua.stqa.pft.addressbook.model.ContactData;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {

    app.stop();
  }

}
