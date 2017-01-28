package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ua.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {

    super(wd);
  }

  public void initContactCreation() {

    click(By.linkText("add new"));
    }



  public void fillContactForm(ContactData contactData, boolean creation) {
      type(By.name("firstname"),contactData.getName());
      type(By.name("lastname"),contactData.getLast_name());

       if (creation){
         new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
       }else
         Assert.assertFalse(isElementpresent(By.name("new_group")));

  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }
  public void returnHomePage() {
    click(By.linkText("home page"));
  }

  public void initContactModification() {
    click(By.cssSelector("img[alt='Edit']"));
  }
  public void submitContactModification() {
    click(By.name("update"));
  }

  public int getContactCount() {
      return wd.findElements(By.name("selected[]")).size();
    }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {
    click(By.xpath(".//*[@id='content']/form[2]/div[2]/input"));
  }

  public void deleteSelectedContact() {
    if (! isElementpresent(By.name("selected[]"))) {
      initContactCreation();
      fillContactForm(new ContactData("first name", "last name", "test1"), true);
      submitContactCreation();
      returnHomePage();
      deleteContact();
  }else
      click(By.xpath(".//*[@id='content']/form[2]/div[2]/input"));
}
}

