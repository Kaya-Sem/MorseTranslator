# A *kotlin* CLI morse translator.
### It translates morsecode into plain text, and plain text into morsecode!

**How to use**
1. You can download the latest package in the packages section (TODO, Github Actions not yet in working order.
2. Alternatively, you can build the project either in an IDE, like Jetbrains IDEA, or compile it yourself with the kotlin CLI compiler (kotlinc). To do this, clone the repo and enter the downloaded folder. From there, enter this command:

`kotlinc MorseTranslator/src/main/kotlin/Main.kt -include-runtime -d MorseTranslator.jar`
Having kotlin on your system is a prerequisite.

You can run the .jar file with 
`java -jar MorseTranslator.jar`
