Feature: 
  Verifiying Adactin website Cancel Booking webpage

  Scenario Outline: 
    Verifying Cancel booking

    Given User is on the Adactin page
    When User should login with "<userName>","<password>"
    And User enters "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>" and click Search
    And User select Hotel and click continue
    And User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<CVVNumber>" and clicks booknow
    And User clicks Booking Itenary and cancels booking
    Then User gets "The booking has been Cancelled." message

    Examples: 
      | userName | password | location | hotels      | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress | creditCardNo     | creditCardType | expiryMonth | expiryYear | CVVNumber |
      | clinton  | raj      | Sydney   | Hotel Creek | Double   | 1 - One       | 24/05/2023  | 26/05/2023   | 1- One        | 0 - None        | QWE       | RTY      | DFGH           | 1234567891234567 | VISA           | July        |       2026 |       123 |
