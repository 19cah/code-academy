Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

## Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of `10` alphabetic characters, and each integer will be in the inclusive range from to `999`.

## Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly `15` characters. 
The second column contains the integer, expressed in exactly `3` digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

## Sample Input

```
java 100
cpp 65
python 50
```

[See answer](JavaOutputFormatting.java).

## Output

```
================================
java           100 
cpp            065 
python         050 
================================
```
