import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Tester {
   public static void main(String args[]) {
      String[] exampleArray = {"a", "b", "c", "d", "e"};


    List<String> list = Arrays.asList(exampleArray);
    Tester MyTester = new Tester();
    
    System.out.println("Method 1: ");
    MyTester.reverseMethod1(exampleArray, list);
    
    System.out.println("\nMethod 2:");
    MyTester.reverseMethod2(exampleArray, list);

   }  
   
    void reverseMethod1(String array[], List<String> list) {
      
          System.out.println("Start: " + list); //before
          
          Collections.sort(list, Collections.reverseOrder());
          
          System.out.println("End  : " + list); //after
    }//reverseMethod1
    
     void reverseMethod2(String array[], List<String> list) {
        String[] newArray = new String[array.length];         
        list = Arrays.asList(array); 
        System.out.println("Start: " + list);
        
          int counter;
          counter=0;
          for (int each=array.length-1; each>=0; each--){
              newArray[counter]= array[each];
            counter++;
              
          }
          System.out.print("End  : " + Arrays.asList(newArray));
    
      }//reverseMethod2
}