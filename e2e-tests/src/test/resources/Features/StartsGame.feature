@Completed
Feature: User starts game.

  As a code-breaker player
  I want to see welcome message
  So that I know that game started successfully.

  Scenario: Welcome message is displayed whenever user runs the game.
    Given User starts the game
    Then Welcome message is displayed:
    """
    Welcome to code-breaker game.
    Please make a guess.
    """