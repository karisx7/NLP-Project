# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String class** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

![UML Diagram for my project](UMLDiagram.png)

## Video

[![Thumbnail for my projet](demo.jpeg)][https://www.youtube.com/watch?v=l0Ak9-2LjJQ]

## Project Description

The goal of our application is to find the most frequent words within a user's inputted text. Word frequency programs are used for a multitude of purposes, spanning from identify core themes to searching for repetitive words. Therefore, since we didn't want to restrict what text the computer analyzes, we decided to use the text that the user inputs rather than a text file. When the application is run, the console asks the user for a sentence to put in. When it is put in, it is run through the program and it returns the frequency of each word in the sentence.

## NLP Techniques

The NLP technique that we implemented in our project was word frequency analysis. The countWords(String input) method uses the indexOf() and substring() method to separate the sentence into individual words. It then loops through the words and counts how many times each word appears using the foundWords and counts ArrayLists. We also use the sortByFrequency() and printSummary() methods to display the results so that the most frequently used words appear first.