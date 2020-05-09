/*
 * Class Name:    Shape
 *
 * Author:        Your Name
 * Creation Date: Monday, April 24 2017, 22:38 
 * Last Modified: Thursday, April 27 2017, 16:29
 * 
 * Class Description:
 *
 */

public abstract class Shape
{
   private int rowBase;
   public int getRowBase()
   {
      return rowBase;
   }
   public int getColBase()
   {
      return colBase;
   }
   private int colBase;
   public Shape (int rowBase, int colBase)
   {
      this.rowBase = rowBase;
      this.colBase = colBase;
   }
   abstract void draw(Window window);
}

