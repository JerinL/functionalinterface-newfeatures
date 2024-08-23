package com.functionalInterface.newfeatures.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExecute {

    public static void main(String[] args) {
        sortTheMobileByuList();
    }



    public static void sortTheMobileByuList(){
        List<Mobile> mobiles = Mobile.generateMobileData();
        List<Mobile> sorted = mobiles.stream().sorted().collect(Collectors.toList());
        for(Mobile m :sorted){
            Mobile.printMobile(m);
        }
    }
}
