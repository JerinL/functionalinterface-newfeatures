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
    private String mail;


    public void printUser(User user){
        System.out.println(user.toString());
    }

    public boolean checkUserEligible(User user , int startAge , int endAge){
        if(user.getAge() <= startAge && user.getAge() >=endAge){
            return true;
        }else {
            return false;
        }
    }

    public List<User> userList(){
        List<User> userList = Arrays.asList( new User("jerin",23,"test@gmail.com"),
                new User("sujith",24,"test@gmail.com"),
                new User("anto",25,"test@gmail.com"),
                new User("batrick",20,"test@gmail.com"),
                new User("ashwanth",12,"test@gmail.com"));
        return userList;
    }


}
