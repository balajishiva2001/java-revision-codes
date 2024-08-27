package com.mavenproject.app;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Basic Maven Project|");
		System.out.println(".m2/repository contains all dependency packages");
		String instructions = 
				"""
				1. mvn help:describe
				2. mvn help:effective-pom
				3. mvn clean install
				4. mvn dependency:tree
				5. mvn dependency:analyze
				6. mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5
				7. -DskipTests=true
				8. mvn package
				9. mvn clean
				10. mvn install
				11. mvn test
				12. java -cp target/mavenproject.jar com.mavenproject.app
				13. java -jar target/mavenproject.jar -DskipTests=true 
				""";
		System.out.println(instructions);
	}
}
