# Zoo
Zoo is an application meant for management and maintenance of different animals in zoo.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.
### How to run
Run Solution.java as your main program :-

1)	To check sound of parrots living with Dogs, Cats and Roosters
2)	To count how many animals can swim, sing, walk and fly

Run Application.java as your main program :-

1)	To check Rooster sound in language other than English (French chosen as locale by default)
2)	To start REST API to query Animals Count by their type.

If your application is running at default port 8080, you can hit REST API using URL http://localhost:8080/animals/count

You will see the result in JSON format as shown below :-

	{"SWIMMER":7,"WALKER":4,"SINGER":7,"FLYER":2}
  
## Running the tests
The project consists of following Unit Test cases :-

1)	BirdTest.java
2)	ZooManagerServiceTest.java

And following Integration Test Cases (written using MockMVC) :-
1)	AnimalIntegrationTest.java



