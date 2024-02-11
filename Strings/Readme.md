# Concepts used in this section 

### Strings 
- Strings in Java are immutable, meaning their values cannot be changed after they are created. Once a String object is created, you cannot modify its content.
- If you need a mutable sequence of characters, you can use StringBuilder or StringBuffer in Java, which provide a mutable buffer for constructing strings. These classes allow you to append, insert, or modify the content of the sequence.
- **indexOf()** : The indexOf() method returns the position of the first occurrence of specified character(s) in a string. There are 4 indexOf() methods:

                public int indexOf(String str)
                public int indexOf(String str, int fromIndex)
                public int indexOf(int char)
                public int indexOf(int char, int fromIndex)


### StringBuilder 
- StringBuilder is mutable, meaning you can modify its contents without creating a new object.
- **constructors in Java StringBuilder Class**: 

        StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
        StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
        StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
        StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string. 

### Convert String to Array 
- The toCharArray() method is a built-in function in Java that allows you to convert a string into a character array. This method is available in the String class and provides a convenient way to convert each character in a string into an element of an array.
- Since strings in Java are immutable, converting them to a character array can be useful when you need to modify individual characters.
- The toCharArray() method creates a new character array, which requires additional memory. This can be a concern if you are working with large strings.

### subString 
- In Java, Substring is a part of a String or can be said subset of the String. There are two variants of the substring() method.

                public String substring(int startIndex)
                public String substring(int startIndex, int endIndex)

- for example, 

                String s = 'abcde'
                // then substring of string s will be: 
                System.out.print(s.substring(0, 4)); 
                
In the example, we have put the `0th index`, and `last index` i.e `4`, from `a to e`, but it will print : `abcd`. it won't include last index.


### Stack 
- In Java, a stack is a data structure that follows the **Last In, First Out (LIFO) principle**, where the last element added is the first one to be removed. The java.util package provides a Stack class that implements a stack.

### Character to Integer Conversion
Character to Integer Conversion refers to the process of converting a character representation to its corresponding integer value, typically based on the ASCII or Unicode encoding standards.

                int intValue = (int) 'a'; // Converts the character 'a' to its ASCII integer value (97).

                String s = '5';
                int intValue = (int) s.charAt(0); // Converts the character '5' to its ASCII integer value (53).


### What is Anagram ? 
- An anagram is a word or phrase formed by rearranging the letters of another word or phrase. In other words, if you can rearrange the letters of one word or phrase to spell another word or phrase, they are considered anagrams of each other.

### Characters in Unicode Values 
-  In Java, characters are represented as Unicode values.
- Unicode is a universal character encoding standard that assigns a unique code point (numeric value) to each character in most of the world's writing systems.
- for example, The character 'A' has a Unicode value of 65, 'B' has 66, 'C' has 67, and so on. So, when we do C - A, it effectively calculates the offset of the character 'C' from 'A'.
- Here's how it works:

                'C' - 'A' = 67 - 65 = 2
                'A' - 'A' = 65 - 65 = 0
                'T' - 'A' = 84 - 65 = 19
