Feature: moodle_login

#Scenario with AND
Scenario:
   When I enter course as "2018"
   And I hit enter button as "enter"
   And I enter username
   And I enter password
   Then Login should fail

