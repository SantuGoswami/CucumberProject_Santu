Feature: verify the amount i could borrow

Scenario: calculate the home loan amount 
Given user is on ANZ application home page
When user clicks on calculators and tools entity page
Then  system should display calculators and tools entity page
When user selects Application type as "single"
And user selects Number of dependants as "0"
And user selects Property you would like to buy as "Home to live in"
And user enter Your annual income before tax as "80000"  
And user enter Your annual other income (optional) as "10000"
And user enter Monthly living expenses as "500"
And user enter Current home loan monthly repayments as "0"
And user enter Other loan monthly repayments "100"
And user enter Other monthly commitments as "0"
And user enter Total credit card limits as "10000"
And user clicks on workout button
Then user able to see the desire amount as "$479000"
And user clicks on Startover button to clear the form
 


Scenario: verify the validation message
Given user is on ANZ application home page
When user clicks on calculators and tools entity page
Then  system should display calculators and tools entity page
And user enter Monthly living expenses as "1" 
And user clicks on workout button
Then user should validate the message as "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."





