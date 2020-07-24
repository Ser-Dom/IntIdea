package by.epam.learn.main;

public class LearnMain {

   public static void main(String[] args) {
      hello("Иван");
      hello("User");

      Square s = new Square(5);
      System.out.println("площадь квадрата со стороной " + s.l + " = " + area(s));

      Rectangle r = new Rectangle(4, 6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

      Triangle h = new Triangle(8, 4);
      System.out.println("Площадь треугольника с основанием " + h.a + "и высотой " + h.b + " равна " + area(h));
   }
   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }
   public static double area(Square s) {
      return s.l * s.l;
   }
   public static double area(Rectangle r) {
      return r.a * r.b;
   }
   public  static double area(Triangle h){
      return h.a*0.5*h.b;
   }
}


