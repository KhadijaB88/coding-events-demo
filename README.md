You need to add a Person class to hold necessary info about users of our app. What fields and methods would this class hold? 
	id(int)(getter only), firstName, lastName, email, password == getter and setters for all
	
	
Would you need to add any additional classes to Person to make the app work? If so, what classes would be necessary?
	PersonData = stores all the data collected about the person
	eventsCreated = events created by user
	eventsAttend = events that the user wants to attend
	
What kinds of relationships would Person have to the other classes you already created, such as the Event class?
	a many to many realtionship with Event through eventsAttend
	a one to many realtionship with Event through eventsCreated

List<Events> eventsCreated
List<Events> eventsAttend

