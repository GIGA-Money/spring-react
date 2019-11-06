# spring-react
this project is to demonstrate usage of spring boot and react within a spring boot framework java project.

When using the h2 db for local mem testing: jdbc:h2:mem:testdb

#To run local:
* spring tools 4 - 4.4.1 release (minimum).
* build-ship Gradle integration 3.0
* Gradle for your platform of choice
* Eclipse (any version compatible with the above tools)

#instructions:
1. import through eclipse as Gradle project (Be sure to run Gradle wrapper either in or external to eclipse)
2. refresh gradle project to include packages
3. use the spring tools Boot Dashboard to run.
4. while using the the h2 local test db, the default behavior is test in memory only.
5. while using the h2 local test db, the address ```http://localhost:8080/h2-console/login.do?jsessionid=11f40765c8a0888ee71afa953354d430```this is the test console.
6. while using the h2 db, after accessing the test console the default user name = sa, no password on the test console set. 

#branch notes:
* The develop branch maynot contian the current code.
* The car entity branch ends with the ability to view the h2 db. there is no implentation for the car controller - as we still use the h2 db for testing.
* There are many comment elements at the bottem of the car entity class, these methods are not used because of the implentation of project lombok.
* The owner entity branch is designed to exstend from the car entity branch, but still use the h2 db for testing.
* Under the car entity class the previous methods for owner are present, becasue of notes about how the code worked are left as notes. 

