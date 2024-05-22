package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefinition {

	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String string) {
		System.out.println("Step 1 : ");
	}

	@When("User selects car type as {string} and pick up point {string} and Drop point {string}")
	public void user_selects_car_type_as_and_pick_up_point_and_drop_point(String string, String string2,
			String string3) {
		System.out.println("Step 2 : ");
	}

	@Then("Driver Starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3 : ");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4 : ");
	}

	@Then("User pays {int} rupees")
	public void user_pays_rupees(Integer int1) {
		System.out.println("Step 5 : ");
	}
}
