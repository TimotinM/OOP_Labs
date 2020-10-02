package com.company.SchoolMD;

public class User {
    String firstname;
    String lastname;
    int age;
    String email;
    String status;
    String timestamp;

   public User(String firstname, String lastname, int age,String  email, String timestamp)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.timestamp = timestamp;

    }
   public  User()
    {
    }

    public void setFirsname(String firsname){
        this.firstname = firsname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String toString() {
        return  '\n' + "User" + '\n' +
                "Firstname: " + firstname + '\n' +
                "Lastname: " + lastname + '\n' +
                "Age: " + age + '\n' +
                "Email: " + email + '\n' +
                "Status: " + status;
    }
}
