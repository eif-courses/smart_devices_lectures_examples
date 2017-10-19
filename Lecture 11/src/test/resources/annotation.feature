

Feature: search Wikipedia

  Scenario: direct search article
    Given Enter search term 'Cucumber'
    When Do search
    When Kitas veiksmas
    When Teorines paskaitos trukme
    Then Single result is shown for 'Cucumber'