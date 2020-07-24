package by.epam.learn.main;

public class LearnMain {

   public static void main(String[] args) {
      hello("Иван");
      hello("User");

      Point s = new Point(2, 2, 7, 5);
      System.out.println("Расстояние между точками x и y = " + s.area());

      Square t = new Square(5);
      System.out.println("площадь квадрата со стороной " + t.l + " = " + t.area());

      Rectangle r = new Rectangle(4, 6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

      Triangle h = new Triangle(8, 4);
      System.out.println("Площадь треугольника с основанием " + h.a + "и высотой " + h.b + " равна " + h.area());
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }

}


