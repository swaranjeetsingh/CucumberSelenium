Feature: Manager login options
	Background: login steps
		Given Open chorme browser
    	Then Enter valid url "http://demo.guru99.com/V4/" to open application
		When After launching application enter username "mngr259062" and password "UsuhagY"
    	And After that enter click on login button
    	
   	@skip
	Scenario: Add new account
		Then Click on new account link
    	Then fill new account form
    	And Click on submit button
    	And Verify success message with "Account Generated Successfully!!!"
    	When After test is complete capture screenshot
    	Then Close the application and browser
    
    @execute
    Scenario: Deposit into account
    	When Click on deposit link
    	Then Add details of amount to be submitted
    	And Click on deposit submit button
    	When After test is complete capture screenshot
    	Then Close the application and browser
    	