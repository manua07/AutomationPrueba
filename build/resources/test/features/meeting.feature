Feature: Meeting
As a user I need create a meeting

Scenario Outline: Create meeting correctly
Given i am create meeting unit in the application
And i enter login meeting username <username> and the password <password>
When i enter the meeting name <meetingname> and the meeting type <meetingtype> and the meeting number <meetingnumber> and the location <location> and the unit <unit> and the organized by fist name <organizedfist> and organized by last name <organizedlast> and organized by email1 <organizedemail1> and organized by email2 <organizedemail2> and the reporter <reporter> and the attendee list <attendeelist>
Then user view modal <message> in the application

Examples:
|username       | password       |  meetingname           |  meetingtype        |  meetingnumber        |      location   |  unit                   |  organizedfist      |  organizedlast  |  organizedemail1   |  organizedemail2    |  reporter                 |  attendeelist               |message          |
|admin          |   serenity     |  prueba name meeting   |  edicion            |  312466829            |  nombre location|  prueba automatica      |  Manuela            |  Acevedo        |  emailprueba       |  gmail.com          |  Manuela                  |  Manuela                    | Save success    |

