Feature: Uber Test Drive
  
  Scenario: Book Sedan cab
  Given User wants to select a car type "Sedan" from uber app
  When User selects car type as "Sedan" and pick up point "Bangalore" and Drop point "Pune"
  Then Driver Starts the journey
  And Driver ends the journey
  Then User pays 1000 rupees
