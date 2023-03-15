


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
public class shape {
    
    public String color="red";
    public boolean filled=true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
   public shape(String color,boolean filled){
       this.color=color;
       this.filled=filled;
   }

    public shape() {}

    @Override
    public String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    public class circle extends shape{
        public double radius =1.0;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public circle(String color, boolean filled,double radius) {
            super(color, filled);
            this.radius=radius;
        }
        public circle() {}
        public double getArea(){
            return radius*radius*Math.PI;
        }
        public double perimeter(){
            return radius*2*Math.PI;
        }

        @Override
        public String toString() {
            return "circle{" + "radius=" + radius + '}';
        }
    }
    public class rectangle extends shape {
        public double width =1.0;
        public double length=1.0;

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getlength() {
            return length;
        }

        public void setlength(double length) {
            this.length = length;
        } 

        public rectangle(String color, boolean filled, double width,double length ) {
            super(color, filled);
            this.length=length;
            this.width=width;
        }
          public rectangle( double width,double length ) {
            this.length=length;
            this.width=width;
      }
            public rectangle(){}
            public double getArea(){
                return width*length;
            }
            public double getpremeter(){
                return (width+length)*2;
            }
    
        @Override
        public String toString() {
            return "rectangle{" + "width=" + width + ", height=" + length + '}';
        }      
    }
    public class square extends rectangle{
      public double side;
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        public square(double side){
            this.side=side;
        }

        public square(double side, String color, boolean filled, double width, double length) {
            super(color, filled, width, length);
            this.side = side;
        }
        public square() {}
        public void setwidth(double side){
            this.width=side;
        }
        public void setlengtht(double side){
            this.length=side;
        }
        @Override
        public String toString() {
            return "square{" + "side=" + side + '}';
        }
    
    }
}



