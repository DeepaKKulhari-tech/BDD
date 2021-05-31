Feature: Token Generation

  Scenario: To verify how to generate Access Token
    Given Encoded String for one particular Vendor Credentials
    And Library Name "demo"
    And Access token end point
    When Run the Post request
    Then access token is generated value 1234
    And expires time should be displayed

  Scenario: To verify Add to wishList
    Given Authorization present and token is present
    When Hit the get resquest
    Then Validate the reponse

 Scenario Outline: To verify Get wishList
    Given Get Wishlist Payload with "<libraryName>" "<patronName>"
    When Hit the get resquest
    Then Validate the reponse


  Examples:
  |PatronName |LibraryName |
  |BTDeepak| demo| 
  |mag99 | Magic Consortia|
  
  
   