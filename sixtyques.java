         // 1)Binary,Octal,Hexadecimal

import java.util.Scanner;
public class sixtyques{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int decimal = scanner.nextInt();
        int temp = decimal;
        String binary = "";
        if (temp == 0) binary = "0";
        while (temp > 0) {
            int rem = temp % 2;
            binary = rem + binary;
            temp = temp / 2;
        }
        System.out.println("Binary : " + binary);
        temp = decimal;
        String octal = "";
        if (temp == 0) octal = "0";
        while (temp > 0) {
            int rem = temp % 8;
            octal = rem + octal;
            temp = temp / 8;
        }
        System.out.println("Octal       : " + octal);
        temp = decimal;
        String hex = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if (temp == 0) hex = "0";
        while (temp > 0) {
            int rem = temp % 16;
            hex = hexChars[rem] + hex;
            temp = temp / 16;
        }
        System.out.println("Hexadecimal : " + hex);
    }
}

                   // 2) to find the Circumference of the square
class square{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Area of the Square:");
        double area=scan.nextDouble();
        double side=4 * area;
        System.out.println("The Area of the Square:" + side);
    }
}

             // 3) To find the Circumference of the Rectangle
class rectangle{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of L:");
        double l=scan.nextDouble();
        System.out.println("Enter the value of B:");
        double b=scan.nextDouble();
        double circumference=2 * ( l + b );
        System.out.println("The Area of the Rectangle:" + circumference);
    }
}
 
         // 4) To find the Circumference of the Cylinder

class cylinder{
    public static void main(String[] args){
        double pi=3.1424;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of radius(r):");
        double r=scan.nextDouble();
        System.out.println("Enter the value of pi:" + pi);
        double cylinder=2 * pi * r;
               // Math.PI
        System.out.println("The Circumference of the Cylinder: " + cylinder);

    }
}

       // 5)  Addition and Multiplication table

class table{
    public static void main(String[] args){
        int n=5;
        System.out.println("Multiplication And Addition Table for n");
        for(int i=1; i<=10; i++){
            int product=i*n;
            int addition=i+n;
            System.out.println(i + " * " + n + " = " + product + "           " + i + " + " + n + " = " + addition);
        }
    }
}

      // 6)  Program to print the ASCII value of all Alphabets

class ascii{
    public static void main(String[] args){
        System.out.println("ASCII values of Alphabets A-Z and a-z:");
        int upperAscii = 65; 
        int lowerAscii = 97; 
        int i = 0;
        while (i < 26) {
            char upper = (char)(upperAscii + i);
            char lower = (char)(lowerAscii + i);
            System.out.println(upper + " = " + (upperAscii + i) + "     " + lower + " = " + (lowerAscii + i));
            i++;
        }
    }
}

      // 7)  Quotient and Remainder of a Given Number

class Quotient {
    public static void main(String[] args) {
        int x = 428;
        int y = 5;
        int quotient = x / y;
        int remainder = x % y;
        System.out.println("The Quotient of the two numbers is: " + quotient);
        System.out.println("The Remainder of the two numbers is: " + remainder);
    }
}
        // 8) Demonstrate the Keyword Long and Double

class keyword{
    public static void main(String[] args){
        long student=123456789;
        double ratio=457;
        System.out.println("The Student's Count is:" + student);
        System.out.println("The Ratio :"  + ratio);
    }
}

      // 9)  Program to Swap the two numbers

class swap{
    public static void main(String[] args){
        int a=10;
        int b=5;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap:" + " a = " + a + " b = " + b);
    }
}

      // 10) To check whether the Number is Even or Odd

class oddeven{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("This Number is Even");
        }else{
            System.out.println("This Number is Odd");
        }
    }
}

     // 11) To check whether a character is vowel or constant

class vowel{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char input=scan.next().charAt(0);
        if(input >= 'A' && input <= 'Z'){
            input=(char)(input+32);
        }
        if(input == 'a' || input =='e' || input =='i' || input == 'o' || input == 'u'){
            System.out.println("a Character is Vowel");
        }else if(input >= 'a' && input <= 'z'){
            System.out.println("a Character is Constant");
        }else{
            System.out.println("Please! Enter a valid character");
        }
    }
}

                  // 12) Find Largest Numbers

class largest{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a Value of A:");
       int a=scan.nextInt();
       System.out.println("Enter a Value of B:");
       int b=scan.nextInt();
       System.out.println("Enter a Value of C:");
       int c=scan.nextInt();
       System.out.println("Enter a Value of D:");
       int d=scan.nextInt();
       int large=0;
       if( a > b && a > c && a > d){
        large=a;
       }else if(b > c && b > d){
        large=b;
       }else if(c > d){
        large=c;
       }else{
        large=d;
       }
       System.out.println("The Largest Number is: " + large);
    }
}

       // 13) Find the roots of Quadratic Equation

class quadratic{
    public static void main(String[] args){
        int a=2,b=5,c=-3;
        double withinroot = b * b - 4 * a * c; 
        System.out.println(withinroot);
        if(withinroot>0){
            double root1= (-b + Math.sqrt(withinroot))/ (2 * a);
            double root2= (-b - Math.sqrt(withinroot))/ (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
    }
}

      // 14) To check the number is Positive or Negative

class check{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        double number=scan.nextDouble();
        if(number<0){
            System.out.println("It's a Negative Number");
        }else if(number>0){
            System.out.println("It's a Possitive Number");
        }else{
            System.out.println("The Number is 0");
        }

    }
}

     // 15) To check whether a character is alphabet

class alpha{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch=scan.next().charAt(0);
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("The Character is Alphabet");
        }else{
            System.out.println("The Character is not Alphabet");
        }
    }
}

     // 16) Sum of Natural Numbers and find the Smallest Digit

class natural{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Value of N: ");
        int n=scan.nextInt();
        int sum=n * (n+1) / 2;
        System.out.println("The Sum of the Natural Number is: " + sum);
        int smallestDigit = 9;
        int temp = sum;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit < smallestDigit) {
                smallestDigit = digit;
            }
            temp /= 10;
        }
        System.out.println("The Smallest Digit in the Sum is: " + smallestDigit);
    }
}

     // 17) Functionality of conditional operators

class  condition{
    public static void main(String[] args){
        int num=30;
        String result=(num%2==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}

    // 18) Find the space between the Concentric Circles

class circle{
    public static void main(String[] args){
        double pi=3.1416;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Value For Outer Circle: ");
        double R=scan.nextDouble();
        System.out.println("Enter the Value for the Inner Circle: ");
        double r=scan.nextDouble();
        System.out.println("The value of PI is: " + pi);
        double sum=pi * (R*R - r*r);
        //double sum=Math.PI * (R*R - r*r);
        System.out.println("The Space Between two Circles: "+ sum);
    }
}
            // 19-24) Evaluate the Expressions

class expression{
    public static void main(String[] args){
        int a=5;
        int b=4;
        int x=69;
        int sum1=++a - --b;
        int sum2=a-- % b++;
        int sum3=a*=b+= 5;
        System.out.println("The Sum of (++a - --b) is : " + sum1);
        System.out.println("The Sum of (a-- % b++) is : " + sum2);
        System.out.println("The Sum of (a *= b += 5) is : " + sum3);
        int result=x>>>2;
        System.out.println("The Value of X is: " + result);
        int answer=a+=++a + ++a + -a+a--;
        System.out.println("The Sum of (a+=++a + ++a + -a+a--) is: " + answer);
        int sol=x=++x * 2 + 3 * - x;
        System.out.println("The Som of (x=++x * 2 + 3 * - x) is: " + sol);
        int y=10;
        int z= (++y * (y++ +5));
        System.out.println("The Sum of (z=(++y * (y + ++5))) : " + z); 
        int x0=5;
        int x1=++x0 - x0++ + -x0;
        System.out.println("The sum of ( x1= ++x - x++ + -x) is : " + x1);

    } 
}

             // 25) FINAL keyword

/*class finalkeyword{
    public static void main(String[] args){
        final int num=10;
        int result= ++num;
        System.out.println("The Value of Num is: " + result);
    }
} */

        // 26) Merged array and Repeated Elements

class merge{
    public static void main(String[] args){
        int[] arr1={2,4,5,6,7,9,10,13};
        int[] arr2={2,3,4,5,6,7,8,9,11,15};
        int n1=arr1.length;
        int n2=arr2.length;
        int[] merge=new int[n1+n2];
        System.out.println("The Merged Array: ");
        for(int i=0; i<merge.length; i++){
            if(i<n1){
                merge[i]=arr1[i];
            }else{
                merge[i]=arr2[i-n1];
            }
            System.out.print(merge[i] + " ");
        }
        System.out.println("\nThe Repeated Elements are: ");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] +  " ");
                }
            }
        }
    }
}

     // 27)  Right rotate the multi-dimensional array

class rotate{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6}};
        int rows=arr.length;
        int cols=arr[0].length;
        int[][] rotate=new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                rotate[j][rows-1-i]=arr[i][j];
            }
        }
        System.out.println("Rotated Array : ");
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(rotate[i][j] + " ");
            }
            System.out.println();
        }
    }
}

           // 28) Alternate Sorting
        
class altersort{
    public static void main(String[] args){
        int[] arr={2,1,3,7,5,6,4};
        int[] result=new int[arr.length];
        int min=0;
        int max=arr.length-1;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                result[i]=arr[min++];
            }else{
                result[i]=arr[max--];
            }
            System.out.print(result[i] + " ");
        }
    }
}

        // 29) Factorial and factorial numbers reverse

class fact{
    public static void main(String[] args){
        int fact=1;
        int num=5;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        System.out.println("the factorial of the number is:" + fact);
         int reversed = 0;
        int temp = fact;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("The reversed factorial number is: " + reversed);
    }
}

      // 30,31) Sum of elemnents of an Even index and Odd index

class evenodd{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int oddsum=0;
        int evensum=0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
               evensum+=arr[i];
            }else{
               oddsum+=arr[i];
            }
        }
        System.out.println("OddSum: " + oddsum);
        System.out.println("EvenSum: " + evensum);
    }
}

         // 32)  Second largest Element in an Array

class seclarge{
    public static void main(String[] args){
        int[] arr={20,40,50,10,30};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
            System.out.println(arr[i] + " ");
        }
        System.out.println("The Second Largest Number is:" + arr[1]);
    }
}

       // 33) Second Smallest Element 

class secsmall{
    public static void main(String[] args){
        int[] arr={20,40,50,10,30};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
            System.out.println(arr[i] + " ");
        }
        System.out.println("The Second Smallest Number is:" + arr[1]);
    }
}

               // 34) Count the Number of Elements

class numelement{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        int count=0;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            count++;
        }
        System.out.println("\nThe Number of Elements in Array : " + count);
    }
}

       // 35)Copy all elements of one to another

class copy{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int len=arr.length;
        int[] copy=new int[len];
        for(int i=0; i<len; i++){
            copy[i]=arr[i];
            System.out.println(copy[i] + " ");
        }
    }
}

                   // 36) Find the Frequency of the Array

class frequency{
    public static void main(String[] args){
        int[] arr = {2,3,2,5,3,5,4};
        int n = arr.length;
        boolean[] arr1 = new boolean[n];  
        for (int i = 0; i < n; i++) {
            if (arr1[i] == true) {
                continue;
            }
            int count = 1; 
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[j] = true; 
                }
            }
            System.out.print(arr[i] + " -> " + count + " ," );
        }
    }
}

       // 37)Program to reverse the elements of an array

class reverse{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        int len=arr.length;
        System.out.println("The Reversed Array:");
        for(int i=len-1; i>=0; i--){
            System.out.print( arr[i] + " ");
        }
    }
}

         // 38) Print the Delete an Elements of an Array

class delete{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to delete: ");
        int deleteVal = sc.nextInt();
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != deleteVal) {
                arr[j] = arr[i];
                j++;
            }
        }
        if(j == n) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Array after deleting all occurrences of " + deleteVal + ":");
            for(int i = 0; i < j; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

        

        // 39) To print average for all element in an Array

class average{
    public static void main(String[] args){
        int[] arr={5,10,15,20,25};
        int sum=0;
        int avg=0;
        int len=arr.length;
        for(int i=0; i<len; i++){
            sum+=arr[i];
        }
        avg=sum/len;
        System.out.println("The Average of the Array Element is: " + avg);
    }
}

          // 40) Inverse the elements

class inverse{
    public static void main(String[] args){
        int[] arr={2,0,4,1,3};
        int n=arr.length;
        int[] inverse=new int[n];
        System.out.print("Before Inverse: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            inverse[arr[i]]=i;
        }
        System.out.println("\nAfter Inverse : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(inverse[i] + " ");
        }
    }
}

         // 41) Pyramid - I Patterns using for-loop

class pattern{
    public static void main(String[] args){
        int row=9;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j <= row-i){
                    System.out.print(" ");
                }else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
 
       // 42) Pyramid pattern - II

class patternII{
    public static void main(String[] args){
        int row=9;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j <= row-i){
                    System.out.print(" ");
                }else{
                    System.out.print((j - (row-i)) + " ");
                }
            }
            System.out.println();
        }
    }
}

          // 43) Pattern III

class patternIII{
    public static void main(String[] args){
        int row=9;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j <= row-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}


          // 44) Alphabet pattern 

class alphapattern {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalCols = (i <= n) ? i : (2 * n - i);
            char ch = (char) ('A' + totalCols - 1);
            for (int j = 1; j <= n; j++) {
                if (j <= n - totalCols) {
                    System.out.print(" ");
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}

                     // 45) ODD pattern

class oddpattern {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            int totalCols = 2 * n - 1; 
            for (int j = 1; j <= totalCols; j++) {
                if (j == i || j == totalCols - i + 1) {
                    System.out.print(i); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }
}

            // 46) Find the odd number between the range 
class odd{
    public static void main(String[] args){
        int n=15;
        System.out.println("The ODD Numbers between 0 - 15 is :  ");
        for(int i=2; i<n; i++){
          if(i%2 != 0){
            System.out.print(i + " ");
          }
        }
    }
}

          // 47) Print a Letters 

class print{
    public static void main(String[] args){
        Scanner alpha = new Scanner(System.in);
        System.out.print("Enter an uppercase letter (A-Z): ");
        char end = alpha.next().charAt(0); 
        if (end >= 'A' && end <= 'Z') {
            for (char ch = 'A'; ch <= end; ch++) {
                System.out.print(ch + " ");
            }
        } else {
            System.out.println("Invalid input. Please enter an uppercase letter (A-Z).");
        }
    }
}

         // 48) Sum of given number and it's Reverse Number

class sumnumrev{
    public static void main(String[] args){
        int num=12345;
        int original=num;
        int reversed=0;
        while( num!=0 ){
            int digit=num%10;
            reversed=reversed * 10 + digit;
            num=num/10;
        }
        int sum=original + reversed;
        System.out.print(original + "+" + reversed + " = " + sum);
    }
}

            // 49) Recursion Reverse the String

class revwordrecurse{
    public static String reverseWords(String[] words, int index) {
        if (index < 0) {
            return "";
        }
        return words[index] + " " + reverseWords(words, index - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        String reversed = reverseWords(words, words.length - 1).trim();
        System.out.println("Reversed sentence: " + reversed);
    }
}

          // 50)  Numbers to Word

class numtoword{
    public static void main(String[] args) {   
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number :");  
       String[] one ={"" , " one " , " two " ," three " , " four " , " five " , " six " ," seven " ," eight " , " nine " , " ten " , " eleven " ," twelve " , " thirteen " , " fourteen " ,
                      " fivteen " , " sixteen " ," seventeen "," eigtheen ", " nineteen " };
        String[] ten = {"", "" ,"twenty "," thirty "," forty "," fifty "," sixty "," seventy "," eighty "," ninety "};
        int num = scan.nextInt();
        if(num == 0){
            System.out.println("zero");
        }
        else{
          if(num >= 100){
            System.out.print( one[num/100] + " hundered ");
            num = num %100;
        }
        if(num < 20){
            System.out.print(one[num]);
        }
        else{
            System.out.print(ten[num/10] + " " + one[num%10] );
        }    
    }
} 
 }

          // 51) Short the Elements in ODD position

class oddsort{
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        int oddCount = (arr.length + 1) / 2;
        int[] oddPos = new int[oddCount];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            oddPos[oddIndex++] = arr[i];
        }  
        int evenCount = arr.length / 2;
        int[] evenPos = new int[evenCount];
        int evenIndex = 0;
        for (int i = 1; i < arr.length; i += 2) {
            evenPos[evenIndex++] = arr[i];
        }
        for (int i = 0; i < oddPos.length - 1; i++) {
            for (int j = 0; j < oddPos.length - 1 - i; j++) {
                if (oddPos[j] < oddPos[j + 1]) {
                    int temp = oddPos[j];
                    oddPos[j] = oddPos[j + 1];
                    oddPos[j + 1] = temp;
                }
            }
        } 
        for (int i = 0; i < evenPos.length - 1; i++) {
            for (int j = 0; j < evenPos.length - 1 - i; j++) {
                if (evenPos[j] > evenPos[j + 1]) {
                    int temp = evenPos[j];
                    evenPos[j] = evenPos[j + 1];
                    evenPos[j + 1] = temp;
                }
            }
        }
        oddIndex = 0;
        evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 
                arr[i] = oddPos[oddIndex++];
            } else {
                arr[i] = evenPos[evenIndex++];
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i] + " ");
        }
    }
}

        // 52) Alphabet 'C' Pattern 

class Cpattern{
    public static void main(String[] args){
        int n=4;
        for(int i=0; i<n; i++){
            System.out.println((i==0 || i==n-1)? "***" : "*");
        }
    }
}

      // 53) Pattern Pyramid with Numbers

class pyramidnum{
    public static void main(String[] args){
        int row=4;
        int num=1;
        for(int i=1; i<=row; i++){
            for(int j=i; j<=row; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

         // 54) Print X pattern

class Xpattern {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            int left=i+1;
            int right=n-i;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(left);
                } else if(j==n-1-i) {
                    System.out.print(right);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

          
           // 55) Print the Pattern Using Input Number

class numPattern {
    public static void main(String[] args) {
        int n = 7; 
        int center = n / 2; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(4 - min);
            }
            System.out.println();
        }
    }
}

        // 56) Substring without String

class substring {
    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c'}; 
        int n = input.length;
        int start = 0;
        int end = 0;
        while (start < n) {
            if (end < n) {
                for (int i = start; i <= end; i++) {
                    System.out.print(input[i]);
                }
                System.out.println();
                end++;
            } else {
                start++;
                end = start;
            }
        }
    }
}

                     // 57) Missmatched from Two-Array

class mismatch{
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        String[] arr2 = {"a", "b", "", "d", "e", "e", "g", "g", "i"};

        System.out.println("Mismatched elements:");
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                System.out.println("Index " + i + ": arr1 = " + arr1[i] + ", arr2 = " + arr2[i]);
            }
        }
    }
}

           // 58) Sum of two nums & result stored in Result Aray

class hugeadd{
    public static void main(String[] args) {
        int[] num1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};  // length = 12
        int[] num2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};          // length = 9
        int len1 = num1.length;
        int len2 = num2.length;
        int maxLen = Math.max(len1, len2);
        int[] result = new int[maxLen + 1]; // +1 for possible carry
        int i = len1 - 1;
        int j = len2 - 1;
        int k = result.length - 1; // result index
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1[i] : 0;
            int digit2 = (j >= 0) ? num2[j] : 0;
            int sum = digit1 + digit2 + carry;
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        boolean leadingZero = (result[0] == 0);
        for (int index = (leadingZero ? 1 : 0); index < result.length; index++) {
            System.out.print(result[index] + " ");
        }
    }
}

          // 59) Print the Format

class format{
  public static void main(String[] args) {
        int rows = 2;   
        int height = 3; 
        for (int i = 0; i < rows; i++) {
            System.out.println("+===+===+");
            for (int j = 0; j< height; j++) {
                System.out.println("|  |  |");
            }
        }
        System.out.println("+===+===+"); 
    }
}

               // 60) WELCOMETOZOHOCORPARATION

class strpattern
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = java.nextLine();
        str = str.replaceAll(" ", "");
        int ind = 0;
        int size = (int)Math.ceil(Math.sqrt(str.length()));
        char[][]mat = new char[size][size];
        for(int i = 0;i<mat.length && ind<str.length();i++)
        {
            for(int j = 0;j<mat[0].length && ind<str.length();j++)
            {
                mat[i][j] = str.charAt(ind++);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the word to search: ");
        String word = java.nextLine();
        for(int i = 0;i<mat.length;i++)
        {
            StringBuilder rowchk = new StringBuilder();
            for(int j = 0;j<mat[0].length;j++)
            {
                rowchk.append(mat[i][j]);
            }
            if(rowchk.toString().contains(word))
            {
                int pos = rowchk.indexOf(word);
                System.out.println("The word present from ("+ i + ", " + pos +") to ("+ i + ", " + (pos + word.length() -1) + ") in the row");
                break;
            }
        }
        for(int j = 0;j<mat[0].length;j++)
        {
            StringBuilder colchk = new StringBuilder();
            for(int i = 0;i<mat.length;i++)
            {
                colchk.append(mat[i][j]);
            }
            if(colchk.toString().contains(word))
            {
                int pos = colchk.indexOf(word);
                System.out.println("The word present from (" + pos + ", " + j +") to (" + (pos + word.length() -1) + ", " + j + ") in the column");
                break;
            }
        }
    }
}