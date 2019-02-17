# SPOCodingChallenge
Task from Service Partner ONE (SPO )
Steps to Run the application
1- Clone https://github.com/aqibbutt/SPOCodingChallenge.git  by using command "git clone <link>"
2- confuigure whole project in eclipse IDE or your favorit IDE 
3- Run project. Main class is SPOStart.java. Before running this application make sure you have Spring boot plugin install in your IDE.
4- Run any http client for testing web services like Postman/RestClient
5-  Set the request type to post
6- set address to http://localhost:8080/solution for solution developed by me 
7- set address to http://localhost:8080/sposolution for SPO Code challenge

8- prepare body message for-example
{ 
	"rooms": [35, 21, 17], 
	"senior": 10,
	"junior": 6 
}
9- Set content-type to JSON(application/json)
10- press send and if response is coming then its mean application is running perfectly on your machine (because its already running perfect iny machine :D )
11- Run test cases for testing unit testing. 
	10.1 Execute CalculationTest.java it should pass .
	10.2 Execute CalculationAPITest.java make sure your application is running because it will test the response.

