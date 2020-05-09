/*
 * Class Name:    Line
 *
 * Author:        Your Name
 * Creation Date: Monday, April 24 2017, 22:45 
 * Last Modified: Thursday, April 27 2017, 16:25
 * 
 * Class Description:
 *
 */

public class Line extends Shape
{
   private int length;
   private int rowIncrement;
   private int colIncrement;
   private char drawingCharacter;

   public Line (int rowBase, int colBase, int length, int rowIncrement, int colIncrement, char drawingCharacter)
   {
      super(rowBase, colBase);
      this.length = length;
      this.rowIncrement = rowIncrement;
      this.colIncrement = colIncrement;
      this.drawingCharacter = drawingCharacter;
   }

   void draw(Window window)
   {
      int row = getRowBase();
      int col = getColBase();
      for(int i = 0; i <= length; i++)
      {
         int index = ((row) * (((window.getNumberOfColumns()+2)*2)+1)) + (col) * 2;
         window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
         row += rowIncrement;
         col += (colIncrement);
      }
   }
}

