package com.percholas.java_basics;

//import java.text.DecimalFormat;

public class JavaBasicsClass {
	public static void main(String[] args) {
    // 1: Write a program that declares two integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.
        int beckyAge = 10;
        int anaAge = 30;
        int sumIntegers = beckyAge + anaAge;
        System.out.println("Sum of ages is: " + sumIntegers);

    // 2: Write a program that declares two double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
        double num = 15.0;
        double num2 = 10.5;
        double sumDoubles = num + num2;      
        System.out.println("Total sum is: " + sumDoubles);

    // 3: Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int integer = 200;
        double doubleNum = 10.5;
        double sum = integer + doubleNum;        
        System.out.println("Sum of integer and double is: " + sum + " The sum variable type is double.");

    // 4: Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
        int luisAge = 20;
        int nelsonAge = 60;
        double result = nelsonAge / luisAge;      
        System.out.println("Division is: " + result);        
        double decimalnelsonAge = 60.5;
        result = decimalnelsonAge / luisAge;        
        System.out.println("Division of double by int is: " + result);

    // 5: Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number. Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
        double doublenum1 = 40.5;
        double doublenum2 = 15.5;
        double division = doublenum1 / doublenum2;        
        System.out.println("Division is: " + division);        
        int castedResult = (int) division;       
        System.out.println("Casted result to int: " + castedResult);

      // 6: Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
        int x = 5;
        int y = 6;
        int q = y / x;        
        System.out.println(q);        
        q = (int)((double)y);        
        System.out.println("Casted y to double: " + q);
        System.out.println(q);

     // 7: Write a program that declares a named constant and uses it in a calculation. Print the result.
        final double PI = 3.14159;
        // Use the constant in a calculation
        double radius = 5.0;
        double area = PI * radius * radius;
        // Print the result
        System.out.println("The area is: " + area);
        
    // 8: Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product, four items of the second product, and two items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.    
        double cappuccino = 5.00;
        double expresso = 6.10;
        double latte = 8.20;        
        int cappuccinoquant = 3;
        int expressoquant = 4;
        int lattequant = 2;       
        double subtotal = (cappuccino * cappuccinoquant) + (expresso * expressoquant) + (latte * lattequant);              
        System.out.println("Subtotal is: $" + subtotal);      
        final double SALES_TAX = 0.05;        
        double totalSale = subtotal + (subtotal * SALES_TAX); 
        String formatted = String.format("%.2f", totalSale);        
        //DecimalFormat df = new DecimalFormat("#.##");        
        //System.out.println("Total sale is: $" + df.format(totalSale));    
        System.out.println("Total sale is: $" +  formatted); 
        
	}
}
