package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.TestBase;

public class HomeloanPage extends TestBase {
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));


	By applicationtype= By.xpath("//label[@for=\"application_type_single\"]");
	By dependants= By.xpath("//select[@title=\"Number of dependants\"]/option[1]");
	By property=By.xpath("//label[@for=\"borrow_type_home\"]");
	By annualIncome=By.xpath("//input[@aria-describedby=\"q2q1i1 q2q1i2\"]");
	By otherIncome=By.xpath("//input[@aria-labelledby=\"q2q2\"]");
	By monthlyExpences=By.cssSelector("input.required");
	By currentRepayments=By.xpath("//input[@id=\"homeloans\"]");
	By otherRepayments=By.xpath("//input[@id=\"otherloans\"]");
	By otherCommitments=By.xpath("//input[@aria-labelledby=\"q3q4\"]");
	By creditLimit=By.xpath("//input[@id=\"credit\"]");
	By workoutButton=By.xpath("//button[@id=\"btnBorrowCalculater\"]");
	By desireAmount=By.cssSelector("span#borrowResultTextAmount");
	By startOverButtton=By.xpath("//div[@class=\"result__restart\"]//button[@class=\"start-over\"]");
	By message=By.xpath("//div[@class=\"borrow__error__text\"]");


public void clickOnApplicationType() {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(applicationtype));
	driver.findElement(applicationtype).click();
	
}
public void numOfbependent() {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(dependants));
	driver.findElement(dependants).click();
}
public void chooseProperty() {
	driver.findElement(property).click();
}

public void enterAnualIncome(String amount) {
	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(annualIncome));
	driver.findElement(annualIncome).sendKeys(amount);
}
public void enterOtherIncome(String amount) {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(otherIncome));
	driver.findElement(otherIncome).sendKeys(amount);
}
public void enterMonthlyEx(String amount) {
	
	driver.findElement(monthlyExpences).sendKeys(amount);
}
public void enterCurrentRepayment(String amount) {
	driver.findElement(currentRepayments).sendKeys(amount);
}
public void otherMonthlyRepayment(String amount) {
	driver.findElement(otherRepayments).sendKeys(amount);
}
public void enterOtherCommitments(String amount) {
	driver.findElement(otherCommitments).sendKeys(amount);
}
public void enterTotalcreditCardLimit(String amount) {
	driver.findElement(creditLimit).sendKeys(amount);
}


public void clickOnWorkoutButton() {
	driver.findElement(workoutButton).click();
}
public String getDesireAmount() {
	return driver.findElement(desireAmount).getText();
}
public void clickOnStartOverButton() {
	driver.findElement(startOverButtton).click();
}
public void enterIncome(String amount) {
	driver.findElement(annualIncome).sendKeys(amount);
}
public String getmessage() {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(message));
	return driver.findElement(message).getText();
	
	
}






}