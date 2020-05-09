/*
 * Class Name:    Triangle
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 25 2017, 21:51 
 * Last Modified: Thursday, April 27 2017, 18:52
 * 
 * Class Description:
 *
 */

public class Triangle extends Shape
{
   private int height;
   private int rowIncrement;
   private int colIncrement;
   private char drawingCharacter;

   public Triangle ( int rowBase, int colBase, int height, int rowIncrement, int colIncrement, char drawingCharacter)
   {
      super(rowBase, colBase);
      this.height = height;
      this.rowIncrement = rowIncrement;
      this.colIncrement = colIncrement;
      this.drawingCharacter = drawingCharacter;
   }

   public void draw(Window window)
   {
      int row = getRowBase();
      int col = getColBase();
      int leftCol = col;
      int rightCol = col;
      for (int i = 0; i <= height; i++)
      {
         if(i == height)
         {
            for (int j = leftCol; j <= rightCol; j++)
            {
               int index = ((row) * (((window.getNumberOfColumns() + 2) * 2) + 1)) + (j) * 2;
               window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
            }
            continue;
         }
         int index = ((row) * (((window.getNumberOfColumns() + 2) * 2) + 1)) + (leftCol) * 2;
         window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
         index = ((row) * (((window.getNumberOfColumns() + 2) * 2) + 1)) + (rightCol) * 2;
         window.stringTodraw.replace(index, index + 2, drawingCharacter + " ");
         leftCol -= 1;
         rightCol += 1;
         row += rowIncrement;
      }
   }
}

