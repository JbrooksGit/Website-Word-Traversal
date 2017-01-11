
package urlcount;
import java.util.Scanner;
import java.net.URL;
import java.util.*;

public class UrlCount {

    
    public static void main(String[] args) {
       

 System.out.print("Enter a URL: ");
 String URLString = new Scanner(System.in).next();

try {
     URL url = new URL(URLString);
     int count = 0;
     String line;
     boolean check;
     Scanner input = new Scanner(url.openStream());
    while (input.hasNext()) {
    line = input.nextLine();
    if(input.hasNext("Ankur") )
    count += 1;
    
 }

 System.out.println("'Ankur' appears'" + count + " times"); 
}
 catch (java.net.MalformedURLException ex) {
     System.out.println("Invalid URL");

  } 
catch (java.io.IOException ex){
    System.out.print("I/O errors. No such file");
 } 
    }
  
    }

