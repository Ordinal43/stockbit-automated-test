@Web @Login @Regression

Feature: Login

  @Positive @RegisteredUser @CorrectPassword
  Scenario: Login with registered user and correct password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "bryanr26"
    When User input password "password123"
    When User click login button
    Then User is on Stockbit dashboard page

  @Negative @RegisteredUser @WrongPassword
  Scenario: Login with registered user and wrong password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "bryanr26"
    When User input password "wrongpassword"
    When User click login button
    Then User gets error with the message "Username atau password salah. Mohon coba lagi."

  @Negative @UnregisteredUser
  Scenario: Login with unregistered user
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "wronguser"
    When User input password "password"
    When User click login button
    Then User gets error with the message "Username atau password salah. Mohon coba lagi."
