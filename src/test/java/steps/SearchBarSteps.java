package steps;

import com.MagentoLuna.Base;
import com.MagentoLuna.Pages.SearchBarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBarSteps extends Base {
    SearchBarPage searchBarPage;
    @When("User fill the items word looking for")
    public void user_fill_the_items_word_looking_for() throws InterruptedException {
        searchBarPage=new SearchBarPage();
        searchBarPage.performSearchBar();

    }
    @Then("Item suggestion should be displayed")
    public void item_suggestion_should_be_displayed() {

    }
    @When("User click on result search")
    public void user_click_on_result_search() {

    }
    @Then("Result lookin for should be displayed")
    public void result_lookin_for_should_be_displayed() {

    }

}
