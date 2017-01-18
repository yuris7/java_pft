package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.pft.addressbook.model.ContactData;

public class ContactHelper {
  private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {

    this.wd = wd;
  }

  public void submitContactCreation() {
      wd.findElement(By.name("submit")).click();
    }

  public void fillContactForm(ContactData contactData) {
      wd.findElement(By.xpath("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getLast_name());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contactData.getHome_number());
    }

  public void openContactCreationPage() {
      wd.get("http://localhost/addressbook/edit.php");
    }
}
