@WIP
Feature: User wins game.

  As a code-breaker player
  I want to receive congratulations message
  So that I know I successfully broke the code.

  Scenario Outline: User is notified about winning the game
    Given The game starts with secret password "<secret>"
    And User skips welcome message
    When User submits following guess: "<guess>"
    Then User receives following mark: "++++"
    And Congratulations message is displayed:
    """
    Congratulations!
    You have successfully guessed the hidden password.
    """

    Examples:
    |secret|guess|
    | 1234 | 1234|
    | 2222 | 2222|
    | 4321 | 4321|