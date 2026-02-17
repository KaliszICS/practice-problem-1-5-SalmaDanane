/**
	* File: Lesson 1.5: Characters
	* Author: Mr. Kalisz
	* Date Created: February 10, 2023
	* Date Last Modified: February 10, 2023
	*/

class Notes {
	public static void main(String[] args) {

		//characters

		//declare a character
		char c;

		//assigning to a character
		//There can only be one character in a char variable.

		c = '3';
		c = 'a';
		c = ' ';
		c = '!';

		System.out.println(c);

		//Indexes - Location of something in a data structure

		//Location of a character in a String

		String word;
		word = "Hello World";
		//Indexes start at 0 and they go to one less than the length of the string
		
		// Hello World
		// 012345678910

		//getting characters using charAt()

		//variable.charAt(index)
		
		c = word.charAt(9); //gets the character at location 4 of the string word.  Saves it to our variable c

		System.out.println(c);

		//Adding characters

		char a;
		char b;

		a = 'a';
		b = 'b';

		System.out.println(a + b); //when characters are added together, it uses their ASCII value and adds that together instead.

		System.out.println(a + word); //when character are added to strings, they get concatenated and use their character value.
		
		
	}
}