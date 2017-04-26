@WIP
Feature: User submits guess, which is evaluated by the game.

  As a code-breaker player
  I want to have my guess evaluated
  So that I know whether I am heading in the right direction.

  Background: Game starts with hidden password '1234'
    Given The game starts with secret password "1234"
    And User skips welcome message

  Scenario: User guesses the correct password
    When User submits following guess: "1234"
    Then User receives following mark: "++++"

  Scenario: None of the number matches the secret password
    When User submits following guess: "5678"
    Then User receives following mark: ""

  Scenario: Submitted guess is in wrong order
    When User submits following guess: "4321"
    Then User receives following mark: "----"

  Scenario: Not all of the numbers matches the secret password
    When User submits following guess: "1235"
    Then User receives following mark: "+++"

  Scenario: Not all of the numbers are in correct order
    When User submits following guess: "2134"
    Then User receives following mark: "++--"