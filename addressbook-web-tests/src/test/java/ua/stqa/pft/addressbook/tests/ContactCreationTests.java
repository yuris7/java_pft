package ua.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("first name", "last name", "test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(before, after - 1);
  }
}
