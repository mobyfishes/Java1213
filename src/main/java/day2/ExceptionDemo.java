package day2;

public class ExceptionDemo {

    public static void main(String[] args) {
        try{
            //business logic
            method();
        }
        catch(Exception ex){
            // handle the exception right here
        }finally {
            // close all the connection, free up the resources
        }


    }

    // doesn't handle the exception here, handle it in the caller.
    public static void method() throws Exception{
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        throw new Exception();
    }

}
