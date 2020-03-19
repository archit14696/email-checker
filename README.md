# email-checker
# REST API Email Checker

A simple REST api which checks from a list of emails, the ones which are valid, and returns the number of valid unique emails.

Clone the repository:

```
git clone archit14696/email-checker

```

Install the pre-requisite libraries from:

```
requirements.txt
```

To use this API, we can do the following:-

```

Set the following environment variables:-
For windows
Check environment variable value e.g.
echo %JAVA_HOME% 
C:\Program Files\Java\jdk1.7.0_51
Adding to PATH: Add the unpacked distribution’s bin directory to your user PATH environment variable by opening up the system properties (WinKey + Pause), selecting the “Advanced” tab, and the “Environment Variables” button, then adding or selecting the PATH variable in the user variables with the value C:\Program Files\apache-maven-3.6.3\bin. The same dialog can be used to set JAVA_HOME to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_51

For Linux
Check environment variable value
echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home
Adding to PATH
export PATH=/opt/apache-maven-3.6.3/bin:$PATH

Run the app locally by running the command 
mvn spring-boot:run

Send a POST request to the following endpoint->
http://localhost:8080/emails

The body of the above request must contain json data with the following key-value fields:-
{

	"emailList":["ishan@gmail.com", "archit.malpure@gmail.com",
                "architmalpure@gmail.com",
                "saky+mahajan@gmail.com","sakymahajan@gmail.com"]
}

In the above json data, we have our emailIds which we want to verify.

The returned response for the above request should be the number of valid email ids from our List.

```

## Built With

* [Spring boot](https://start.spring.io)
* [Java](https://www.java.com/en/)

## Authors

* Archit Malpure - www.github.com/archit14696
