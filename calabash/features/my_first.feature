Feature: Shoot from different positions
    As a player
    I want to be able to shoot from different positions
    So that i can hit the ball more easily

    Background: game start
		Given I wait for the "AndroidLauncher" screen to appear
        Given the game has started
        
	Scenario: Move bat up
		Then I click on screen 50% from the left and 25% from the top
		Then I wait
		
	Scenario: Wait
		Then I wait