package com.functionalInterface.newfeatures.functionalinterface;

import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class Lambdas {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length);
//        System.out.println(Arrays.stream(arr).sum());


        //FunctionalInterface
//        callMethod((int a, int b) ->{
//            int c = a+b;
//            System.out.println(c);
//        }   );

        FunctionalInterface functionalInterface = (a,b) -> a+b;
        callMethod(functionalInterface,null);


        //CheckUser  -> interfacename
        CheckUser checkUser = (user)-> user.getAge() >=18 ? true: false;

        for (User u :User.userList()){
            if(checkUser.test(u)){
                User.printUser(u);
            }
        }

        //checkEligibleUser(checkUser);


        //callMethod((a,b)-> a+b, null);

        //callMethod(null,u -> u.getAge() <20 ? true : false);



        checkPersonEligibleWithPredicate(User.userList(),u->u.getGender() == "male" && u.getAge()<20  ? true:false);
    }



    //FunctionalInterface  -> interface name

    public static void callMethod(FunctionalInterface functionalInterface , CheckUser  checkUser){
        if(functionalInterface != null){
            int details = functionalInterface.getDetails(2, 5);
            System.out.println(details +  "  im working dude ");
        }
        if(checkUser !=null){
            for (User u : User.userList()){
                if (checkUser.test(u)){
                    System.out.println(u);
                }
            }
        }
    }





    //CheckUser
    public static  void checkEligibleUser(CheckUser checkUser){
        for(User u:User.userList()){
            if (checkUser.test(u)){
                User.printUser(u);
            }
        }
    }





    public static void checkPersonEligibleWithPredicate(List<User> userList, Predicate<User> userPredicate){
        for (User u:userList){
            if(userPredicate.test(u)){
                User.printUser(u);
            }
        }
    }


}
