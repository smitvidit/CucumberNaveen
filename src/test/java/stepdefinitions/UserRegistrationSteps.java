package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on register page")
	public void user_is_on_register_page() {
		System.out.println("register this ");
	}

	@When("User enter the following")
	public void user_enter_the_following(DataTable dataTable) {
	List<Map<String,String>> usermap = dataTable.asMaps(String.class, String.class);
	
	System.out.println(usermap);
	}

}
