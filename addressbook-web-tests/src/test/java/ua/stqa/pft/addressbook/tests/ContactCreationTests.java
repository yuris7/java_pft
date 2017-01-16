package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().openContactCreationPage();
    app.getSessionHelper().login("admin","secret");
    app.getContactHelper().fillContactForm(new ContactData("first name", "last name", "123 123 123"));
    app.getContactHelper().submitContactCreation();
  }

}
