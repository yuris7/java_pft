package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.stqa.pft.addressbook.model.GroupData;


public class GroupHelper extends HelperBase{

  public GroupHelper(WebDriver wd) {
    super(wd);

  }

  public void returnToGroupPage() {

    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {

    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {

    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    if (! isElementpresent(By.name("selected[]"))) {
      initGroupCreation();
      fillGroupForm(new GroupData("test35", "test20", "test38"));
      submitGroupCreation();

  }else
      click(By.name("delete"));
  }

  public void selectGroup() {

    click(By.name("selected[]"));
  }

  public void initGroupModification() {

    click(By.name("edit"));
  }

  public void submitGroupModification() {

    click(By.name("update"));
  }

  public int getGroupCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

}
