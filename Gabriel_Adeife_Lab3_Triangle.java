/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author TJ
 */
public final class Gabriel_Adeife_Lab3_Triangle extends GeometricObject {
    
    private double side1, side2, side3;
    
    public Gabriel_Adeife_Lab3_Triangle(){
        super("White", true);
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    
    public Gabriel_Adeife_Lab3_Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void setSide1(double side1){
        if(side1 <= 0) this.side1 = 1;
        else this.side1 = side1;
    }
    
    public void setSide2(double side2){
        if(side2 <= 0) this.side2 = 1;
        else this.side2 = side2;
    }
    
    public void setSide3(double side3){
        if(side1 <= 0) this.side3 = 1;
        else this.side3 = side3;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    
    public double getPerimeter(){
    return side1 + side2 + side3;
    }
    
    public double getArea(){
       double s = getPerimeter()/2;
       double area = Math.sqrt(s*(s - side1)*(s - side2)*(s-side3));
       return area;
    }
    
    @Override
    public String toString(){
        return "Triangle Properties\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nColor: " + getColor() + "\nFilled: " + isFilled() + "\nDate Created " + getDateCreated() + "\n";
    }
    
}
