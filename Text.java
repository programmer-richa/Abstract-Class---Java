/*
 * Class Name:    Text
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 25 2017, 19:26 
 * Last Modified: Thursday, April 27 2017, 16:27
 * 
 * Class Description:
 *
 */

public class Text extends Shape
{
   private String text;
   private int rowIncrement;
   private int colIncrement;

   public Text(int rowBase, int colBase, String text, int rowIncrement, int colIncrement)
   {
      super(rowBase, colBase);
      this.text = text;
      this.rowIncrement = rowIncrement;
      this.colIncrement = colIncrement;
   }

   public void draw(Window window)
   {
      int row = getRowBase();
      int col = getColBase();
      for (int i = 0; i < text.length(); i++)
      {
         int index = ((row) * (((window.getNumberOfColumns() + 2) * 2) +1)) + (col) * 2;
         window.stringTodraw.replace(index, index + 2, text.charAt(i) + " ");
         row += rowIncrement;
         col += colIncrement;
      }
   }
}

