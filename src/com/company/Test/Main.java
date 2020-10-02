package com.company.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            String t1 = "01/10/2020";
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date nowTime = new Date(System.currentTimeMillis());
            Date d1 = formatter.parse(t1);
            long diffTime;
            diffTime = (nowTime.getTime() - d1.getTime())/(24*60*60*1000);
            System.out.println(diffTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
