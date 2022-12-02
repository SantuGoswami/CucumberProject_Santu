package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomeloanPage;
import utils.TestBase;

public class Steps extends TestBase {
	
	HomeloanPage hp=new HomeloanPage();
	@Before
	public void startBrowser() throws InterruptedException {
		initializeDriver();
		openBrowser(); 
		maximizeWindows();
		
	}
	@After
	public void closeBroser() {
		driver.close();
	}
	
	@Given("user is on ANZ application home page")
	public void user_is_on_anz_application_home_page() {
	    
	}

	@When("user clicks on calculators and tools entity page")
	public void user_clicks_on_calculators_and_tools_entity_page() {
	    
	}

	@Then("system should display calculators and tools entity page")
	public void system_should_display_calculators_and_tools_entity_page() {
	   
	}

	@When("user selects Application type as {string}")
	public void user_selects_application_type_as(String string) {
		
		hp.clickOnApplicationType();
	   
	}

	@When("user selects Number of dependants as {string}")
	public void user_selects_number_of_dependants_as(String string) {
		hp.numOfbependent();
	    
	}

	@When("user selects Property you would like to buy as {string}")
	public void user_selects_property_you_would_like_to_buy_as(String string) {
		hp.chooseProperty();
	    
	}
	@When("user enter Your annual income before tax as {string}")
	public void user_enter_your_annual_income_before_tax_as(String amt) {
		hp.enterAnualIncome(amt);
		
	   
	}

	@When("user enter Your annual other income \\(optional) as {string}")
	public void user_enter_your_annual_other_income_optional_as(String amt) {
		hp.enterOtherIncome(amt);
	    
	}

	@When("user enter Monthly living expenses as {string}")
	public void user_enter_monthly_living_expenses_as(String amt) {
		hp.enterMonthlyEx(amt);
	    
	}

	@When("user enter Current home loan monthly repayments as {string}")
	public void user_enter_current_home_loan_monthly_repayments_as(String amt) {
		hp.enterCurrentRepayment(amt);
	    
	}

	@When("user enter Other loan monthly repayments {string}")
	public void user_enter_other_loan_monthly_repayments(String amt) {
		hp.otherMonthlyRepayment(amt);
	  
	}

	@When("user enter Other monthly commitments as {string}")
	public void user_enter_other_monthly_commitments_as(String amt) {
		hp.enterOtherCommitments(amt);
	   
	}

	@When("user enter Total credit card limits as {string}")
	public void user_enter_total_credit_card_limits_as(String amt) {
		hp.enterTotalcreditCardLimit(amt);
	    

}
	@When("user clicks on workout button")
	public void user_clicks_on_workout_button() {
		hp.clickOnWorkoutButton();
	   
	}

	@Then("user able to see the desire amount as {string}")
	public void user_able_to_see_the_desire_amount_as(String amt) {
		System.out.println(hp.getDesireAmount());
		assertEquals(amt, hp.getDesireAmount());
		
	   
	}

	@Then("user clicks on Startover button to clear the form")
	public void user_clicks_on_startover_button_to_clear_the_form() {
		hp.clickOnStartOverButton();
	    
	}

	

	@Then("user should validate the message as {string}")
	public void user_should_validate_the_message_as(String message) {
		System.out.println(hp.getmessage());
		assertEquals(message, hp.getmessage());
	   
	}
}
