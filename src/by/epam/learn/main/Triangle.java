package by.epam.learn.main;

public class Triangle {

   public double a;
   public double b;

   public Triangle(double a, double b){
      this.a=a;
      this.b=b;
   }
   public  double area(){
      return this.a*0.5*this.b;
   }
}
