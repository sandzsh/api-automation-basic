package stepdefinitions;

import cucumber.api.java.en.When;
import pages.PagesManager;
import io.cucumber.datatable.DataTable;

public class actionSteps {
  @When("I {string} in {string} page with the following data:")
  public void i_in_page_with_the_following_data(String action, String page, DataTable dataTable) {
    PagesManager.getPage(page).doAction(action, dataTable);
  }
}
