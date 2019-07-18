Feature: user login

Scenario Outline: valid user login

Given I am on the newtours homepage
When I enter "<user name>", "<password>"
And I click login
Then I find flight reservation page

Examples:
|user name	|password	|
|guest		|guest		|
|mahbub		|guest		|


