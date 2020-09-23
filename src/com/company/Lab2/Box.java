package com.company.Lab2;

public class Box {
    int height;
    int wight;
    int depth;

    Box(){
        height = wight = depth = 1;
    }

    Box(int l){
        height = wight = depth = l;
    }

   Box(int h, int w, int d){
        height = h;
        wight = w;
        depth = d;
    }

    public int area(){
        return (2 * Box.this.height * Box.this.wight) +
                (2 * Box.this.height * Box.this.depth) +
                (2 * Box.this.wight * Box.this.depth);
    }

    public int volume(){
        return (Box.this.depth * Box.this.wight * Box.this.height);
    }


}
