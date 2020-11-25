package com.company.Lab8;

public class Parallelepiped implements GeometricBody{
        private double l;
        private double w;
        private double h;

        public Parallelepiped(){}

        public Parallelepiped(double l, double w, double h){
           this.l = l;
           this.w = w;
           this.h = h;
        }

        public double getSurface(){
            return 2 * (l*w + l*h + w*h);
        }

        public double getVolume(){
            return l*w*h;
        }
}
