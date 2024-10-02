package pushpak44ExceptionHandling;

import pushpak43ExceptionHandling.Nullpointexception;

import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }

}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}
public class ExceptionHandlingQuestion  {
    public static void vote(int age)throws InvalidAgeException{
        if(age<18){
            throw  new InvalidAgeException("Invalid age excepation");
        }else {
            System.out.println("Can vote");
        }
    }
    public static void checkNumber(int num) throws  NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException("Negative number Exception ");
        }else {
            System.out.println("Positive number .");
        }
    }
    public static void withdraw(int amount,int accountBalance)throws InsufficientFundsException{
        if(amount>accountBalance){
            throw new InsufficientFundsException("withdraw amout is more than account blance");
        }else {
            amount  =amount-accountBalance;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Problem 1: Try and Catch Block
        int a=100;
        System.out.println("Enter the number : ");
        int b =0;
        try {
            int c =a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("we Can Not Divide by Zero");
        }

        //Problem 2: Multiple Catch Blocks
        try{
            int d=10;
            System.out.println("Enter num :");
            int e= sc.nextInt();
            int f =d/e;
            System.out.println(f);

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (InputMismatchException d){
            System.out.println("InputMismatchException");
        }

        //Problem 3: Custom Checked Exception
        try{
            vote(12);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }

        //Problem 4: Custom Unchecked Exception
        try {
            int num =-7;
            checkNumber(num);
        }catch (NegativeNumberException g){
            System.out.println(g);
        }

        //Problem 5: Exception Hierarchy
        try {
            System.out.println(10/0);
        }catch (ArithmeticException p){
            System.out.println("can not divide by zero");
        }catch (NullPointerException q){
            System.out.println("NullPointerException");
        }catch (Exception r){
            System.out.println(r);
        }

        //Problem 6: Finally Block
        try {
            System.out.println(100/4);
        }catch (ArithmeticException s){
            System.out.println(s);
        }finally {
            System.out.println("division operation is complete, regardless of whether an exception occurred or not");
        }

        //Problem 7: Throwing Exceptions
        try{
            withdraw(2334,8);
        }catch (InsufficientFundsException v){
            System.out.println(v);
        }

        //Problem 8: Exception Chaining










    }
}
