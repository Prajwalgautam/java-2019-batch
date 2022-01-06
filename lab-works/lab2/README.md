## Due date jan 7 2022 Submitted date jan 6 2022.

# 1. WAP to demonstrate the use of user defined package in java.
We can use Different packages to aid our own codes to add more features.
Here we create a  package file  as :
```
package com.gces.prajwal;
public class PackageDemo{
    public void showMessage(){
        System.out.println("Simple package example.");
    }
    public static void main(String[] args) {
        System.out.println("This is package created by prajwal");
    }
}
```
* In order to compile this file in cmd we use javac PackageDemo.java -d . 
* javac PackageDemo.java -d . is very cruical to make the directory com\gces\prajwal while using cmd.

The following code uses the above mentioned package.
```
    import com.gces.prajwal.PackageDemo;
    public class Demo {
        public static void main(String[] args) {
            PackageDemo demo = new PackageDemo();
            demo.showMessage();
        }
        
    }
```

# 2. WAP to demonstrate Exception handling with all 5 keywords: try, catch, finally, throw and throws.
A Java exception is an object that describes an exceptional (that is, error) condition that has occurred 
in a piece of code.

* try-catch:
    In here we use some test code to check if it has exception or not.
    syntax:
    ```
    try{
        //text codes
    }catch(Exception e){
        //error message here!
    }
    ```
    code:
    ```
        public class TryCatchDemo {
            public static void main(String[] args) {
                int num1 = 30;
                int num2 = 0;
                int result = 0;
                try{
                    result = num1/num2;
                    System.out.println("The output is :"+result);
                }catch(ArithmeticException e){
                    System.out.println("Error message: "+ e.getMessage());
                }
            }
        }

    ```    
* finally:
    Inside this block the code must  run at least once .
        syntax:
        ```
        finally{
            //code must run at least once.
        }
        ``` 

        code:
        ```
        public class FinallyDemo {
            public static void main(String[] args) {
                int num1 = 30;
                int num2 = 0;
                int result = 0;
                try{
                    result = num1/num2;
                    System.out.println("The output is :"+result);
                }catch(ArithmeticException e){
                    System.out.println("Error message: "+ e.getMessage());
                }
                finally{
                    System.out.println("In finally all statements are bound to run at least once even if error occurs in try-catch or other Exceptions");
                }
            }
        }
        ```      
* Throw
    code:
    ```
    public class ThrowDemo {
        public void eligibility (int age)
            {
                if (age < 18) {
                    throw new ArithmeticException("Not eligible to drink or smoke or should not be able to purchase!!");
                }
                else{
                    System.out.println("Enjoy ruining your healthy body!!");
                }
            }
            public static void main(String[] args)
            {
                ThrowDemo demo = new ThrowDemo();
                try {
                    demo.eligibility(17);
                }catch(ArithmeticException error) {
                    System.out.println("Exception message : "+error.getMessage());
                }

            }
    }

    ```
* Throws
    code:
    ```
    import java.io.IOException;
    public class ThrowsExample {
        public void getFile(String file) throws IOException
        {
            throw new IOException("File not found in your current directory");
        } 
        public static void main(String[] args) throws IOException
        {
            ThrowsExample throwsExe = new ThrowsExample();
            try {
                throwsExe.getFile("java-tutorial.pdf"); 
            } catch (Exception e) {
                System.out.println("Error message:"+ e.getMessage());
            }
                
        }   
    }

    ```

# 3. Create your own exception class called InvalidAgeException which is thrown if the given age is less than 1 and greater than 100.
In java we can create our own Exceptions using various methods and Exception classes provided in java.
code:
```
public class InvalidAgeException
{

    public void validate(int age)
    {
        if(age < 1 || age > 100){
            throw new ArithmeticException("Invalid age : Age is not to be less than 1 nor exceeds 100");
        }
    }
    public static void main(String[] args) {
        InvalidAgeException exception = new InvalidAgeException();
        try{
            exception.validate(180);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

```

# 4. WAP to demonstrate the use of chained Exception.
```

public class ChainedException {
    public static void main (String args[])throws Exception { 
        int number = 20, result = 0;
        try { 
            result = number/0;
            System.out.println("The result is "+result);
        } catch(ArithmeticException error1) { 
            System.out.println ("Arithmetic exception occoured: "+error1);
            try { 
                throw new NumberFormatException();
            } catch(NumberFormatException error2) {
                System.out.println ("Chained exception thrown manually : "+error2);
            }
        }
    }
}

```

# 5. WAP to merge data from two files into third file.
```
import java.io.*;
  
public class FileMerge 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("file2.txt"));
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}
```

# 6. WAP to merge data from two files into third file where merging should be done line by line alternatively.
```
import java.io.*;
  
public class MergingFiles 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader bwriter1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bwriter2 = new BufferedReader(new FileReader("file2.txt")); 
        String line1 = bwriter1.readLine();
        String line2 = bwriter2.readLine();
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = bwriter1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = bwriter2.readLine();
            }
        }
        pw.flush();
        bwriter1.close();
        bwriter2.close();
        pw.close();  
        System.out.println("Merged into file3.txt");
    }
}
```
# 7. WAP to merge data from all files present in Desktop into output.txt
```
import java.io.*;
class MergeFromDesktop {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("C:\\Users\\ASUS\\Desktop");
        PrintWriter pw = new PrintWriter("output.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            pw.println(fileName);
            pw.flush();
        }
        System.out.println("Reading from all files"+" in directory " + dir.getName() + " Completed");
    }
}

```


