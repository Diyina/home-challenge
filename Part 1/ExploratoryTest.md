# Part 1: Exploratory testing

Notes:
- In this page there is no "hotel" option, all the results are related to apartments options.
- The account user@phptravels.com pass: demouser, it's not working for login purposes.



**Scenario: Booking a stay**


- **Functionality: select check in/out dates**

    **Expected Behave** : The user is able to selected nights/dates for the stay.

    **Actual Behave**: The user is not able to add night or check-out dates for the selected option. [***Bug***]


- **Functionality: Calculate correct value per reservation**

    **Expected Behave** : The final value for the booking is calculated using the individual rates, and the nights selected.

    **Actual Behave**: The final value is only calculated for the numbers of adults/child/infant. [***Bug***]


- **Functionality: Get current availability**

  **Expected Behave** : The user has information about the availability of this option.

  **Actual Behave**: The user can create more than one booking for the same option. There is no alert to the availability for this option, this could create a double reservations for the same date/time for different users. [***Bug***]


- **Functionality: Set minimum nights per option**

    **Expected Behave** : Some options has minimum nights, the page show clearly this.
  
    **Actual Behave**: Considering the option selected has minimum nights, this information it's not displayed in the "booking options" section after clicks on "Book now"

    > This can be improved using the check out date, avoiding the user could select a date before to the minimum nights.

- **Functionality: Get information about guests**

    **Expected Behave** : Guest information sections, at least one guest information is required.
  
    **Actual Behave**: The user can confirm the booking without provide any information about the guests.

    > This can be improved, at least get one guest information could be required

