Guesser.class: Guesser.java
	javac -g Guesser.java

clean:
	rm *.class

run: Guesser.class
	java Guesser

debug: Guesser.class
	jdb Guesser


