/**
 * Demonstates the use of Scanner to read file input and parse it using alternate delimiters.
 * 
 * @Cockling 
 * @September 
 **/
 import java.util.Scanner;
 import java.io.*;
 
 public class URL
 {
   public static void main (String[] args) throws IOException
   {
       String url;
       Scanner fileScan, urlScan;
       
       fileScan = new Scanner (new File("urls.inp"));
       
       while (fileScan.hasNext() )
       {
           url = fileScan.nextLine();
           System.out.println ("URL:" + url);
           
           urlScan = new Scanner (url);
           urlScan.useDelimiter("/");
           
           while (urlScan.hasNext())
            System.out.println ("    " + urlScan.next());
            
            System.out.println();
        }
    }
 }