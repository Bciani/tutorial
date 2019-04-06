# tutorial
Basic attempt to learn and create a Spring boot app with Gradle. Just a playground for me to attempt to learn

<br>

Software used:
<ul>
	<li>Tomcat Server version 8.5.35</li>
	<li>gradle 4.10.2</li>
	<li>Intellij IDEA 2018.2.6 ultimate edition</li>
	<li>Java 11</li>
	<li>Sonarlint Qube -- community edition</li>
</ul>

<br>

Instructions:
Currently, once all software is installed and set up to start the server you will need to build a jar and then turn the server on in the command line. The code to do this is gradlew build followed by java -jar build/libs/tutorial-0.1.0.jar . Because this is not yet in a WAR file like traditional web applications it is not yet in an artifact that can be leveraged. 11/26


TO DO:
Finish WAR conversion so the application starts up and displays a web login page
