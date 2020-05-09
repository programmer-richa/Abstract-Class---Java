/*
 * Class Name:    Circle
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 25 2017, 19:40 
 * Last Modified: Thursday, April 27 2017, 19:09
 * 
 * Class Description:
 *
 */

public class Circle extends Shape
{
   private int radius;
   private char drawingCharacter;

   public Circle(int rowBase, int colBase, int radius, char drawingCharacter)
   {
      super(rowBase, colBase);
      this.radius = radius;
      this.drawingCharacter = drawingCharacter;
   }

   void draw(Window window)
   {
      int row = getRowBase();
      int col = getColBase();
      int numpoints = 20;
      float angleinc = 2 * ((float) 3.14 / numpoints);
      for (int i = 1; i <= numpoints; i++)
      {
         int x = (int) (Math.cos(angleinc *i) * (radius+1));
         int y = (int) (Math.sin(angleinc * i) * (radius+1));
         int index = ((row + x) * (((window.getNumberOfColumns() + 2) * 2) + 1)) + (col + y)*2;
         window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
      }
   }
}

