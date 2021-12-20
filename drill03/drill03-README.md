# Drill03

You must use recursion for all methods.


## replaceAll

Write a recursive method named `replaceAll` that accepts three parameters: a string `s`, a char 
`from`, and a char `to` as parameters, and returns a new string that is the same as `s` but with 
any occurrences of `from` changed to `to`. For example, the call of 
`replaceAll("crazy raccoons", 'c', 'k')` should return `krazy rakkoons` and the call of 
`replaceAll("BANANA", 'A', 'O')` should return `BONONO`.

Your method is case-sensitive; if the character `from` is, for example, a lowercase `f`, your 
method should not replace uppercase `F` characters. In other words, you should not need to write 
code to handle case issues in this problem.

Constraints:

Do not call any of the following string member methods: `find`, `rfind`, `indexOf`, `contains`, 
`replace`, `split`. (The point of this problem is to solve it recursively; do not use a library
method to get around recursion.).

## digitsSorted

Write a recursive method named `digitsSorted` that takes an integer as a parameter and returns 
`true` if the digits of the integer are sorted and `false` otherwise. The digits must be sorted 
in non-decreasing order (i.e. increasing order with duplicate digits allowed) when read from 
left to right. An integer that consists of a single digit is sorted by definition. The method 
should be also able to handle negative numbers. Negative numbers are also considered sorted if 
their digits are in non-decreasing order.

The following table shows several calls to your method and their expected return values:

Call	| Value Returned
------|-----------------
`digitsSorted(0)` |	`true`
`digitsSorted(2345)` |	`true`
`digitsSorted(-2345)` |	`true`
`digitsSorted(22334455)` |	`true`
`digitsSorted(-5)` |	`true`
`digitsSorted(4321)` |	`false`
`digitsSorted(24378)` |	`false`
`digitsSorted(21)` |	`false`
`digitsSorted(-33331)` |	`false`

Constraints: 

Do not use any auxiliary data structures like `ArrayList`, `TreeMap`, `TreeSet`, array, etc. Also do 
not solve this problem using a string. You can declare as many primitive variables like ints as you like. 
In the other problems concerning strings, you made "decisions" based on one character at a time. Think
about how you can use a similar technique here on an integer. Can you get a single digit out of a larger
integer? Keep in mind that you don't always have to start from the front. I.e. for the number 2345, you
could start by comparing the '2' and the '3', but you could also start by comparing the '4' and the '5'.

## removeAdjacentDuplicateChars

Write a recursive function which returns the inputted string but with adjacent duplicate char- acters removed. Do not use any String functions other than .charAt(), .length(), .isEmpty() and .substring(). Do not use any loops. We recommend you use a helper function.

Examples:
tattle -> tatle
testt -> test
balloon -> balon


## countOccurrences

Write a recursive function that returns the number of occurrences of an integer ’n’ inside of an array of integers. You may not use loops or any array functions. You may use array.length to determine the length of the array. We recommend you use a helper function.

Example output:
int[] array = { 0, 25, 25, 6, 72, 25}; countOccurrences(array, 25) -> 3


