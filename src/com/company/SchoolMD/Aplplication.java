package com.company.SchoolMD;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Aplplication {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User ion = new User("Ion", "Ambros", 20, "ion@email", "02/10/2020");
        users.add(ion);
        User dan = new User("Dan", "Nad", 30, "dan@email", "30/09/2020");
        users.add(dan);
        User ana = new User("Ana", "Rim", 22, "ana@email", "15/08/2020");
        users.add(ana);

        status(users);
       // block(users);
        System.out.println(users);

    }

   public static void status(ArrayList<User> users) {

        for (int i = 0; i < users.size(); i++)
        {
            try {
                long diffTime;
                SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
                Date nowTime = new Date(System.currentTimeMillis());
                Date d1 = formatter.parse(users.get(i).getTimestamp());
                diffTime =(nowTime.getTime() - d1.getTime())/(24*60*60*1000);

                if (diffTime > 30)
                    users.get(i).setStatus("INACTIVE");
                else
                  if (diffTime > 1)
                    users.get(i).setStatus("ACTIVE");
                  else
                      users.get(i).setStatus("NEW");

            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void block(ArrayList<User> users){
        for (int i = 0; i < users.size(); i++)
        {
            if (users.get(i).getStatus() == "INACTIVE")
                users.get(i).setStatus("BLOCKED");
        }
    }

}
