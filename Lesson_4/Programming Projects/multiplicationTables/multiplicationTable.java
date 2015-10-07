
/**
 * Prints a multiplication table featuring the values of 1-12, multiplied by the numbers 1-12.
 * 
 * @Andrew Smith 
 * @October 1, 2015
 */
public class multiplicationTable 
{
    public static void main (String[] args)
  {
      boolean firstRow = true; //Test for first row (Horizontal 1:12)
      boolean firstColumn = true; //Test for first column (Vertical 1:12)
      
      for (int row = 0; row < 13; row++)
      {
          firstColumn = true; //Resets firstColumn each time through, allows for vertical 1:12
          for (int column = 0; column < 13; column++) 
          {
              if (firstColumn) { //If first column, print row # with bar and space. See 'spacer'
                    System.out.print (row + spacer(row, 2) + "|" + spacer(row, 5));
                    firstColumn = false; //for the rest of the columns, this if is skipped
              }
              else if (firstRow) //If first row, print the column number (top vertical 1:12)
                    System.out.print (column + spacer(column, 5));
              else {
                  if ((row > 9) && (column == 1)) //See 'spacer'. Adds space to first column after row 9
                        System.out.print (" " + column * row + spacer(column * row, 5)); //See below
                  else
                        System.out.print (column * row + spacer(column * row, 5)); //Finds product of row and column
              }
              
        }
        firstRow = false; //After first for loop, there is no longer a first row
        System.out.println (""); //Starts new line
    }
}
    public static String spacer (Integer integer, Integer maxSpaces)
    /** 
       This method returns x number of spaces based upon the max allowed spaces and the 'length'
       of the integer given. For digits that have longer lengths, the number of 'cushion space'
       needed between each printed number is less. 
       
       For rows over 9, an extra space is added to the beginning second column (before the printed value).
       This is due to the fact that row numbers over 9 have an additional digit, making the spacer method 
       return a string with one less space (MaxSpaces - Digits). To correct this, a space is added to rows
       over the value of 9.
       */
    {
        int numDigits; //number of digits in the integer
        String space = ""; //Starting string length
        numDigits = String.valueOf(integer).length(); //Length of the string created from the integer
        
        for (int numSpaces = maxSpaces; numSpaces > numDigits; numSpaces--) 
        //Starts at max space, stops at number of digits. Overall spacing is equal to (Max spaces - digit number)
        {
            space += " ";
        }
        return space;
}
}