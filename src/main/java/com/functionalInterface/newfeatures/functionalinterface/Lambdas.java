package com.functionalInterface.newfeatures.functionalinterface;

public class Lambdas {


    public static void main(String[] args) {

        //FunctionalInterface
//        callMethod((int a, int b) ->{
//            int c = a+b;
//            System.out.println(c);
//        }   );

        FunctionalInterface functionalInterface = (a,b) -> a+b;
        callMethod(functionalInterface);



    }



    //FunctionalInterface

    public static void callMethod(FunctionalInterface functionalInterface){
        int details = functionalInterface.getDetails(2, 5);
        System.out.println(details);
    }



    //TestInterface

}
