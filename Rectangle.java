/*
 * Class Name:    Rectangle
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 25 2017, 20:23 
 * Last Modified: Thursday, April 27 2017, 16:27
 * 
 * Class Description:
 *
 */

public class Rectangle extends Shape
{
   private int height;
   private int width;
   private char drawingCharacter;

   public Rectangle(int rowBase, int colBase, int height, int width, char drawingCharacter)
   {
      super(rowBase, colBase);
      this.height= height;
      this.width = width;
      this.drawingCharacter = drawingCharacter;
   }

   void draw(Window window)
   {
      int row = getRowBase();
      int col = getColBase();
      for (int rowIncrement = 0; rowIncrement <= height; rowIncrement++)
      {
         for (int colIncrement = 0; colIncrement <= width; colIncrement++)
         {
            if (rowIncrement==0||rowIncrement==height||colIncrement == 0 || colIncrement == width)
            {
               int index = ((row + rowIncrement) * (((window.getNumberOfColumns() +2) *2) +1)) + (col + colIncrement) * 2;
               window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
            }
         }
      }
   }
}

