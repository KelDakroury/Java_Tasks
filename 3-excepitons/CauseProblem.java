package week6;
import java.io.*;

/*
    Author: Karim ElDakroury - Group 06
*/

public class CauseProblem {
    public String m1(){
        String result = "";
        try{
            throw new Exception("question 1");
        }
        catch(Exception e){
            result = e.getMessage();
        }
        finally{
            result += "; with finally";
        }
        return result;
    }
    public String m2(){
        String result = "";
        try{
            throw new ProblemException("question 2");
        }
        catch(ProblemException pe){
            result = pe.message;
        }
        catch(Exception e){
            result = e.getMessage();
        }
        finally{
            result += "; with finally";
        }
        return result;
    }
    public static void m3() throws ProblemException{
        /*
            Error: it is trying to throw ProblemException
                without  using a try-catch block or
                using a throws keyword.
        */
        throw new ProblemException("question 3");
    }
    public static void m4(){
        Object ob = null;
        try{
            /*
                it is causing NullPointerException when we try
                    to access a proberty of an object that is not
                    created yet
            */
            System.out.println(ob.hashCode());
        }
        catch (NullPointerException e){
            
			System.out.println(ob.hashCode());
        }
    }
    public static void f() throws RuntimeException{
        try{
            g();
        }
        catch(ProblemException e){
            throw new RuntimeException();
        }
    }
    
    public static void g() throws ProblemException{
        throw new ProblemException("5");
    }
    
    public static void m6(){ 
        try{
            
            //ArithmeticException
            System.out.println(5/0);
            
            
            //ArrayIndexOutOfBoundsException
            int[] arr = {1};
            System.out.println(arr[1]); 
            
            //NullPointerException
            Object ob = null;
            ob.hashCode();
            
            //NumberFormatException
            String s = "Letters";
            System.out.println(Integer.parseInt(s)); 
            
            //FileNotFoundException
            FileInputStream fis = new FileInputStream(new File("file.txt")); 
           
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class ProblemException extends Exception {
    String message;
    ProblemException(String s){
        message = s;
    }
    
}