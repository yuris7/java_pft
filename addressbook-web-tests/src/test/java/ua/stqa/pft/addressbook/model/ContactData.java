package ua.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String last_name;
  private final String home_number;

  public ContactData(String name, String last_name, String home_number) {
    this.name = name;
    this.last_name = last_name;
    this.home_number = home_number;
  }

  public String getName() {

    return name;
  }

  public String getLast_name() {

    return last_name;
  }

  public String getHome_number() {

    return home_number;
  }
}
