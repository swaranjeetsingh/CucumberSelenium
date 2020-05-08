Feature: Login test
	Background: these are back ground steps
		Given open chorme browser
    	Then Enter valid url "http://demo.guru99.com/V4/" to open application

	Scenario: login with valid credentials
    	When After launching application enter username "mngr259062" and password "UsuhagY"
    	And After that enter click on login button
    	Then Get title of the current page "Guru99 Bank Manager HomePage"
    	Then Close the application and browser
	
  	Scenario Outline: Data driven test
	    When After launching application enter username "<username>" and password "<password>"
	    And After that enter click on login button
	    Then Get title of the current page "Guru99 Bank Manager HomePage"
	    Then Close the application and browser
	    Examples:
	      | username | password |
	      | mngr259062 | UsuhagY |
	      | mngr25906 | UsuhagY |