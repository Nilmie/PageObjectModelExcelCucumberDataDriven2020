Feature: Login Site
  Scenario Outline: Login to Guru with user names and passwords
    Given I'm in the guru bank login page
    When I enter "<userName>" and "<password>"
    Then I should able to navigate to the home page
    Examples:
    |userName|password|
    |mgr123|mgr!23|
    |mngr293586|sytuheq|
    