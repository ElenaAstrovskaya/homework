package hw4.Figures;

public class Celinder extends SolidOfRevolution {
   private double heigth;

   public Celinder(double volume, double radius, double heigth) {
      super(volume, radius);
      this.heigth = heigth;
   }

   public double getHeigth() {
      return heigth;
   }
}