

  Feature: Test the " https://demoqa.com/login"

    @smoke
    Scenario:Create a new account
      Given Go to website
      When Click New User button
      Then Register to Book Store
      |FirstName  |  Kadir    |
      |Last Name  |  Atug     |
      |UserName   | KadirAtug |
      |Password   | kadirAtug |
      And Click to Register button