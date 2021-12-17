Feature: Verifying the Adactin hotel details
Scenario Outline: Verifying adactin hotel login with valid credentials
Given User is on the adactin  Page
When User should enter "<username>" ,"<password>"
#And User should enter "<location>","<hotels>","<roomType>","<roomNum>","<checkInDate>","<checkOutDate>","<adults>","<children>" and click search
#And user should select the hotel  and click continue
#And user should enter the"<firstName>","<lastName>","<address>","<cardNum>","<cardType>","<expiryMonth>","<expiryYear>","<cvv>" and click BookNow.
Then User should verify success msg


Examples:
|username|password|

|deepthiy|@deepu@1|






