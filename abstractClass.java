abstract class Shape{
abstract void numberOfSides();
}
class Rectangle extends Shape{
 void numberOfSides(){
  System.out.println("Number of sides of rectangle is 4");
 }
}
class Triangle extends Shape{
 void numberOfSides(){
  System.out.println("Number of sides of Triangle is 3");
 }
}
class Hexagon extends Shape{
 void numberOfSides(){
  System.out.println("Number of sides of Hexagon is 6");
 }
}
class ShapeSide{
 public static void main(String args[]){
 Shape r= new Rectangle();
 Shape t= new Triangle();
 Shape h= new Hexagon();
 r.numberOfSides();
 t.numberOfSides();
 h.numberOfSides();
 }
}
