# My Notes
## Day 1
jdk consists of a compiler. converts your written code into byte code

In order to get your code running in java, you need a main method </br>
You need the function `public static void main(String[] args){}` for your program to run

Most statements will end with a semicolon

To console log in java, do `System.out.print();` </br>
To print with a new line, do `System.out.println();` adds a new line after printing to console </br>
You can also do `\n`, has the functionality. Ie. `“Hello world \n”`

Single line comments is // </br>
Multi line comments is /* */

Primitive data type - simple value directly in memory (stack) </br>
Reference data type - memory address (stack) that points to the (heap)
- Primitive - int, double, char, boolean
- Reference - array, object, string

Declaration of variable is `int age;` </br>
Assignment of variable is `int age = 28;`

Truthy falsy values still apply

Scanner is an object accepts user input in java </br>
To use this, we have to import it using `import java.util.Scanner;` (scanner is a class) </br>
To initialize the scanner object, use `Scanner scannerObjName = new Scanner(System.in);` </br>
To accept an input from a user, use the scanner object you initialized ie. `scannerObjName.nextLine();`

If you don’t want any spaces to be included from the input, use `scannerObjName.next();` instead. </br>
For example, if the user inputs hatsune miku, you will only receive hatsune

If you use `nextInt()`, `nextDouble()`, `nextBoolean()`, `next()`, and then `nextLine()` (note this does not apply to `next()`), you need to do `nextLine()` right after (if you do `next()`, you will receive an error). Otherwise it will not function as intended and it will ignore the next input.

Bad example:
```System.out.println("enter your age");
int age = scannerObjName.nextInt();
scannerObjName.next();

System.out.println("enter your name");
String name = scannerObjName.nextLine();
```

Bad example:
```
System.out.println("enter your age");
int age = scannerObjName.nextInt();
scannerObjName.nextLine();


System.out.println("enter your name");
String name = scannerObjName.next();
```

Good example:
```
System.out.println("enter your age");
int age = scannerObjName.nextInt();
scannerObjName.nextLine();

System.out.println("enter your name");
String name = scannerObjName.nextLine();
```