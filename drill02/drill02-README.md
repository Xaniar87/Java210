# Drill02

You must use recursion for zigzag and moveToEnd.

## zigzag

Write a recursive method `zigzag` that accepts an integer parameter `n` and that returns a string composed of `n` characters as follows. The middle character of the output should always be an asterisk ("*"). If you are asked to return an even number of characters, then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should have less-than characters ("<"). After the asterisk(s) you should have greater-than characters (">"). For example, the following calls produce the following output:

Call  |	Return
------|----------
`zigzag(1);` | `*`
`zigzag(2);` | `**`
`zigzag(3);` | `<*>`
`zigzag(4);` | `<**>`
`zigzag(5);` | `<<*>>`
`zigzag(6);` | `<<**>>`
`zigzag(7);` | `<<<*>>>`
`zigzag(8);` | `<<<**>>>`


## moveToEnd

Write a recursive method named `moveToEnd` that accepts a string `s` and a character `c` 
as parameters, and returns a new string similar to `s` but with all instances of `c` moved 
to the end of the string. The relative order of the other characters should be unchanged 
from their order in the original string `s`. If the character is a letter of the alphabet, 
all occurrences of that letter in either upper or lowercase should be moved to the end and 
converted to uppercase. If `s` does not contain `c`, it should be returned unmodified.

