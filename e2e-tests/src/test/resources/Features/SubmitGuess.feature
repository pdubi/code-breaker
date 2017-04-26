@WIP
Feature: User submits guess, which is evaluated by the game.

  As a code-breaker player
  I want to have my guess evaluated
  So that I know whether I am heading in the right direction.

  Scenario: User guesses the correct password
    Given The secret password is "1234"
    When User submits following guess: "1234"
    Then User receives following mark: "++++"

  Scenario: None of the number matches the secret password
    Given The secret password is "1234"
    When User submits following guess: "5678"
    Then User receives following mark: ""

  Scenario: Submitted guess is in wrong order
    Given The secret password is "1234"
    When User submits following guess: "4321"
    Then User receives following mark: "----"

  Scenario: Not all of the numbers matches the secret password
    Given The secret password is "1234"
    When User submits following guess: "1235"
    Then User receives following mark: "+++"

  Scenario: Not all of the numbers are in correct order
    Given The secret password is "1234"
    When User submits following guess: "2134"
    Then User receives following mark: "++--"
