package ua.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String last_name;
  private String group;


  public ContactData(String name, String last_name, String group) {
    this.name = name;
    this.last_name = last_name;
    this.group = group;
  }


  public String getName() {

    return name;
  }

  public String getLast_name() {

    return last_name;
  }

  public String getGroup() {
    return group;
  }
}
