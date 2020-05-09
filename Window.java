/*
 * Class Name:    Window
 *
 * Author:        Your Name
 * Creation Date: Monday, April 24 2017, 23:03 
 * Last Modified: Thursday, April 27 2017, 16:26
 * 
 * Class Description:
 *
 */

import java.util.ArrayList;

public class Window
{
   private int numberOfRows;
   private int numberOfColumns;
   private char borderCharacter;
   private ArrayList<Shape> shapeList;
   StringBuilder stringTodraw;

   public Window(int numberOfRows, int numberOfColumns, char borderCharacter)
   {
      this.numberOfRows = numberOfRows;
      this.numberOfColumns = numberOfColumns;
      this.borderCharacter = borderCharacter;
      shapeList = new ArrayList<>();
   }

   void addShape(Shape shape)
   {
      shapeList.add(shape);
   }

   void removeShape(String id)
   {

   }
   public int getNumberOfRows()
   {
      return numberOfRows;
   }
   public void setNumberOfRows(int numberOfRows)
   {
      this.numberOfRows = numberOfRows;
   }
   public int getNumberOfColumns()
   {
      return numberOfColumns;
   }
   public void setNumberOfColumns(int numberOfColumns)
   {
      this.numberOfColumns = numberOfColumns;
   }
   public char getBorderCharacter()
   {
      return borderCharacter;
   }
   public void setBorderCharacter(char borderCharacter)
   {
      this.borderCharacter = borderCharacter;
   }
   public ArrayList<Shape> getShapeList()
   {
      return shapeList;
   }
   public void setShapeList(ArrayList<Shape> shapeList)
   {
      this.shapeList = shapeList;
   }

   void display()
   {
      stringTodraw = new StringBuilder();
      for(int row = 0; row <= numberOfRows + 1; row++)
      {
         for (int col = 0; col <= numberOfColumns + 1; col++ )
         {
            stringTodraw.append((row == 0 || col == 0 || row == numberOfRows + 1 || col == numberOfColumns + 1) ? borderCharacter + " " : "  ");
         }
         stringTodraw.append("\n");
      }
      for (int i = 0; i < shapeList.size(); i++)
      {
         shapeList.get(i).draw(this);
      }
      System.out.print(stringTodraw);
   }
}

