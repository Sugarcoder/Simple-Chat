# SimpleChat
This is a chat application that utilizes Parse.
<br> 

<img src="http://i1369.photobucket.com/albums/ag238/sugarcoder/ChatParse_zpsqmtsvt6e.png" border="0" alt=" photo ChatParse_zpsqmtsvt6e.png"/>


### Features: 
- Register and login as an anonymous user on each device to log into our simple chat app.
- On click of 'Send' button, save the message object to Parse. This is done by constructing a new ParseObject and then calling saveInBackground() to persist data to the database.
- UI built to retrieve messages.
- Fetch the saved messages to load the ListView using ParseQuery.
- Handler created, and will call a runnable to fetch new messages every few seconds.



## Acknowledgements: 
- <a href="http://www.codepath.com>CodePath</a>
- CodePath Android Observer Group February 2015

