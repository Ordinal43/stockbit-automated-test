@Web @Login @Regression

Feature: Stockbit.com Login

  @Positive @RegisteredUser @CorrectPassword
  Scenario: Login with registered user and correct password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "bryanr26"
    When User input password "password123"
    When User click login button
    When User wait for 2 seconds
    Then User is on Stockbit dashboard page

  @Negative @RegisteredUser @WrongPassword
  Scenario: Login with registered user and wrong password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "bryanr26"
    When User input password "wrongpassword"
    When User click login button
    When User wait for 2 seconds
    Then User gets error with the message "Username atau password salah. Mohon coba lagi."

  @Negative @UnregisteredUser
  Scenario: Login with unregistered user
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "wronguser"
    When User input password "password"
    When User click login button
    When User wait for 2 seconds
    Then User gets error with the message "Username atau password salah. Mohon coba lagi."

  @Negative @BlankUsername @BlankPassword
  Scenario: Login with blank username and filled password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User click login button
    Then User gets warning on username field with the message "Please fill out this field."
    Then Login button is still visible

  @Negative @BlankUsername @FilledPassword
  Scenario: Login with blank username and filled password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input password "password"
    When User click login button
    Then User gets warning on username field with the message "Please fill out this field."
    Then Login button is still visible

  @Negative @FilledUsername @BlankPassword
  Scenario: Login with filled username and blank password
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User input username "bryanr26"
    When User click login button
    Then User gets warning on password field with the message "Please fill out this field."
    Then Login button is still visible

  @Positive @Facebook
  Scenario: Login with Facebook account
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 3 seconds
    When User click login with Facebook button
    When User changes to other window
    When User input facebook email "lucas.hemms4444@gmail.com"
    When User input facebook password "stockbit123"
    When User click facebook login button
    When User wait for 5 seconds
    When User changes back to parent window
    Then User is on Stockbit dashboard page

  @Positive @Google
  Scenario: Login with Google Account
    Given User is on Stockbit home screen
    When User click login menu button
    When User wait for 5 seconds
    When User click login with Google button
    When User changes to other window
    When User input Google email "lucas.hemms4444@gmail.com"
    When User click Google next button
    When User wait for 2 seconds
    When User input Google password "stockbit123"
    When User click Google next button
    When User wait for 5 seconds
    When User changes back to parent window
    Then User is on Stockbit dashboard page
