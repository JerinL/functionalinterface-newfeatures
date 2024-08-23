package com.functionalInterface.newfeatures.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Mobile implements Comparable<Mobile> {

    private int id;
    private String name;
    private int prize;
    private String manufacturePlace;
    private Date manufactureDate;



    public static void printMobile(Mobile mobile){
        System.out.println(mobile.toString());
    }


    public static List<Mobile> generateMobileData() {
        List<Mobile> mobileList = new ArrayList<>();
        // Sample data generation
        mobileList.add(new Mobile(1, "iPhone 12", 799, "USA", new Date(1609459200000L)));  // 01-01-2021
        mobileList.add(new Mobile(2, "Samsung Galaxy S21", 799, "South Korea", new Date(1612137600000L))); // 01-02-2021
        mobileList.add(new Mobile(3, "Google Pixel 5", 699, "USA", new Date(1606780800000L)));  // 01-12-2020
        mobileList.add(new Mobile(4, "OnePlus 9", 729, "China", new Date(1614556800000L)));  // 01-03-2021
        mobileList.add(new Mobile(5, "Xiaomi Mi 11", 749, "China", new Date(1617235200000L)));  // 01-04-2021
        mobileList.add(new Mobile(6, "Sony Xperia 1 II", 1199, "Japan", new Date(1593561600000L)));  // 01-07-2020
        mobileList.add(new Mobile(7, "Nokia 8.3 5G", 699, "Finland", new Date(1601510400000L)));  // 01-10-2020
        mobileList.add(new Mobile(8, "LG Wing", 999, "South Korea", new Date(1604188800000L)));  // 01-11-2020
        mobileList.add(new Mobile(9, "Huawei P40", 899, "China", new Date(1583020800000L)));  // 01-03-2020
        mobileList.add(new Mobile(10, "Motorola Edge+", 999, "USA", new Date(1596240000000L)));  // 01-08-2020
        mobileList.add(new Mobile(11, "Oppo Find X3 Pro", 1149, "China", new Date(1612137600000L)));  // 01-02-2021
        mobileList.add(new Mobile(12, "Vivo X60 Pro+", 849, "China", new Date(1614556800000L)));  // 01-03-2021
        mobileList.add(new Mobile(13, "Realme GT", 599, "China", new Date(1617235200000L)));  // 01-04-2021
        mobileList.add(new Mobile(14, "Asus ROG Phone 5", 999, "Taiwan", new Date(1619827200000L)));  // 01-05-2021
        mobileList.add(new Mobile(15, "ZTE Axon 30", 499, "China", new Date(1622505600000L)));  // 01-06-2021
        mobileList.add(new Mobile(16, "Lenovo Legion Phone Duel", 899, "China", new Date(1596240000000L)));  // 01-08-2020
        mobileList.add(new Mobile(17, "Honor 50", 699, "China", new Date(1625097600000L)));  // 01-07-2021
        mobileList.add(new Mobile(18, "BlackBerry Key2", 649, "Canada", new Date(1530403200000L)));  // 01-07-2018
        mobileList.add(new Mobile(19, "Alcatel 3L", 179, "France", new Date(1619827200000L)));  // 01-05-2021
        mobileList.add(new Mobile(20, "HTC U12+", 799, "Taiwan", new Date(1527811200000L)));  // 01-06-2018

        return mobileList;
    }

    @Override
    public int compareTo(Mobile o) {
        return Integer.compare(this.prize,o.prize);
    }
}
