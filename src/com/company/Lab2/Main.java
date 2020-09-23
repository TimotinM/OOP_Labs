package com.company.Lab2;

public class Main {
    public static void main(String[] args){
       Box box1 = new Box();
       Box box2 = new Box(30);
       Box box3 = new Box(4,7,3);
       System.out.println("The area of the box is " + box3.area() + " cm2 \nThe volume of the box is " + box3.volume() + " cm3");
        Queue queue1 = new Queue();
        queue1.push(2);
        queue1.push(3);
        queue1.push(4);
        System.out.println("Last element in first queue is " + queue1.pop());

        Queue queue2 = new Queue(2);
        queue2.push(13);
        queue2.push(666);
        queue2.push(69);
        System.out.println("Last element in second queue is " + queue2.pop());

    }
}
