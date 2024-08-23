package com.functionalInterface.newfeatures.functionalinterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public  class User  {

    private String name;
    private int age;
    private String gender;
    private String mail;


    public static void printUser(User user){
        System.out.println(user.toString());
    }

    public boolean checkUserEligible(User user , int startAge , int endAge){
        if(user.getAge() <= startAge && user.getAge() >=endAge){
            return true;
        }else {
            return false;
        }
    }

    public static List<User> userList(){
        List<User> userList = Arrays.asList( new User("jerin",23,"male","test@gmail.com"),
                new User("sujith",3,"female","test@gmail.com"),
                new User("anto",14,"female","test@gmail.com"),
                new User("batrick",18,"male","test@gmail.com"),
                new User("ashwanth",12,"female","test@gmail.com"));
        return userList;
    }


}
