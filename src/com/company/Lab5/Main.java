package com.company.Lab5;


public class Main {
    public static void main(String[] args) {

        X x = new X("xx1");
        A a = new A("aa", x);
        B b = new B("bb");
        C c = new C("cc");
        D d = new D("dd");
        E e = new E("ee");
        F f = new F("ff");
        G g = new G("gg");
        H h = new H("hh");
        I i = new I("ii");
        J j = new J("jj");

        A[] arr = {a, b, c, d, e, f, g, h, i, j};
        for (A value : arr) {
            value.printState();
        }
        a.x.printState();
        j.getAX().printState();
        h.getHX().printState();
    }
}

